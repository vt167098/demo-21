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
import com.ejlchina.searcher.SqlWrapper;
import com.ejlchina.searcher.dialect.Dialect;
import com.ejlchina.searcher.param.Paging;

@Configuration
public class InformixDialect implements Dialect {

  @Override
  public void toUpperCase(StringBuilder builder, String dbField) {
      builder.append("upper").append("(").append(dbField).append(")");
  }

  @Override
  public SqlWrapper<Object> forPaginate(String fieldSelectSql, String fromWhereSql, Paging paging) {
      SqlWrapper<Object> wrapper = new SqlWrapper<>();
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
      wrapper.setSql(ret.toString());
      return wrapper;
  }

}
