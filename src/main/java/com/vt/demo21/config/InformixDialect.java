package com.vt.demo21.config;

import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ejlchina.searcher.BeanMeta;
import com.ejlchina.searcher.FieldMeta;
import com.ejlchina.searcher.SearchSql;
import com.ejlchina.searcher.SqlInterceptor;
import com.ejlchina.searcher.dialect.Dialect;
import com.ejlchina.searcher.param.Paging;

@Configuration
public class InformixDialect implements Dialect {

	@Override
	public void toUpperCase(StringBuilder builder, String dbField) {
		builder.append("upper").append("(").append(dbField).append(")");
	}

	@Override
	public void truncateToDateStr(StringBuilder builder, String dbField) {
		builder.append("date_format(").append(dbField).append(", '%Y-%m-%d')");
	}

	@Override
	public void truncateToDateMinuteStr(StringBuilder builder, String dbField) {
		builder.append("date_format(").append(dbField).append(", '%Y-%m-%d %H:%i')");
	}

	@Override
	public void truncateToDateSecondStr(StringBuilder builder, String dbField) {
		builder.append("date_format(").append(dbField).append(", '%Y-%m-%d %H:%i:%s')");
	}

	@Override
	public PaginateSql forPaginate(String fieldSelectSql, String fromWhereSql, Paging paging) {
		PaginateSql paginateSql = new PaginateSql();
		StringBuilder ret = new StringBuilder();
		if (paging != null) {
			if (paging.getOffset() == 0) {
				fieldSelectSql = fieldSelectSql.replaceFirst("select", "");
				ret.append("select first " + paging.getSize() + " ");
				// paginateSql.addParam(paging.getSize());
			} else {
				fieldSelectSql = fieldSelectSql.replaceFirst("select", "");
				ret.append("select skip " + paging.getOffset() + " first " + paging.getSize() + " ");
				// paginateSql.addParam(paging.getOffset());
				// paginateSql.addParam(paging.getSize());
			}
		}
		ret.append(fieldSelectSql).append(fromWhereSql);
		paginateSql.setSql(ret.toString());
		return paginateSql;
	}

	@Bean
	public SqlInterceptor sqlInterceptor() {
		return new SqlInterceptor() {

			@Override
			public <T> SearchSql<T> intercept(SearchSql<T> searchSql, Map<String, Object> paraMap) {
				if (searchSql.isShouldQueryList()) {
					String listSql = searchSql.getListSqlString();
					// TODO: 1、从 paraMap 中取出其它排序参数
					TreeMap<String, Object> sortTM = new TreeMap<>();
					TreeMap<String, Object> orderTM = new TreeMap<>();
					for (String s : paraMap.keySet()) {
						if (s.startsWith("sort")) {
							sortTM.put(s, paraMap.get(s));
						}
						if (s.startsWith("order")) {
							orderTM.put(s, paraMap.get(s));
						}
					}
					// TODO: 2、对 listSql 的 order by 部分进行修改
					String newOrderBy = "";
					for (String s : sortTM.keySet()) {
						BeanMeta<T> beanMeta = searchSql.getBeanMeta();
						FieldMeta meta = beanMeta.requireFieldMeta(sortTM.get(s).toString());
						String alias = s.replaceAll("sort", "");
						newOrderBy += (newOrderBy.length() == 0 ? "" : ",") + meta.getDbAlias() + " ";
						if (orderTM.get("order" + alias) != null) {
							newOrderBy += orderTM.get("order" + alias).toString() + " ";
						}
					}
					newOrderBy = " order by " + newOrderBy;
					// TODO: 3、再把修改后的 listSql 放进 searchSql
					Pattern regex = Pattern.compile("order(\\s|\\S)+");
					listSql = regex.matcher(listSql).replaceAll(newOrderBy);
					searchSql.setListSqlString(listSql);
				}
				return searchSql;
			}

		};
	}

}
