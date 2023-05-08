package com.vt.demo21.dao.db1;

import static com.vt.demo21.dao.db1.Cntm120DynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.vt.demo21.entity.db1.Cntm120;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface Cntm120Mapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(item, ctNo, elevNo, proCtr, salCtr, seriNo, type, s102, s104, s105, s106, s107, s108, s01, s109, s110, s1111, s1112, s112, s114, s115, chkCd2, createId, createDate, updateId, updateDate, s1122, iptCode, memo1, memo2, elvAmnt, txCode, purYyyymm, purNo, molCtrl, outCtrl, cntDelvDate, estHallDate, estAllDate, estCarDate, molExplDate, outExplDate, actHallDate, actAllDate, actEndDate, costEndDate, insCode, grade1, grade2, mafDate, hwDate, lpDate, clDate, specDate, estCostDate, m001, m002, m003, m004, m005, m006, m007, m008, m009, engAmnt);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Cntm120> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Cntm120> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Cntm120Result")
    Optional<Cntm120> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Cntm120Result", value = {
        @Result(column="item", property="item", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="ct_no", property="ctNo", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="elev_no", property="elevNo", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="pro_ctr", property="proCtr", jdbcType=JdbcType.CHAR),
        @Result(column="sal_ctr", property="salCtr", jdbcType=JdbcType.CHAR),
        @Result(column="seri_no", property="seriNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="type", property="type", jdbcType=JdbcType.CHAR),
        @Result(column="s102", property="s102", jdbcType=JdbcType.CHAR),
        @Result(column="s104", property="s104", jdbcType=JdbcType.CHAR),
        @Result(column="s105", property="s105", jdbcType=JdbcType.DECIMAL),
        @Result(column="s106", property="s106", jdbcType=JdbcType.DECIMAL),
        @Result(column="s107", property="s107", jdbcType=JdbcType.CHAR),
        @Result(column="s108", property="s108", jdbcType=JdbcType.DECIMAL),
        @Result(column="s01", property="s01", jdbcType=JdbcType.DECIMAL),
        @Result(column="s109", property="s109", jdbcType=JdbcType.DECIMAL),
        @Result(column="s110", property="s110", jdbcType=JdbcType.CHAR),
        @Result(column="s111_1", property="s1111", jdbcType=JdbcType.CHAR),
        @Result(column="s111_2", property="s1112", jdbcType=JdbcType.CHAR),
        @Result(column="s112", property="s112", jdbcType=JdbcType.CHAR),
        @Result(column="s114", property="s114", jdbcType=JdbcType.DECIMAL),
        @Result(column="s115", property="s115", jdbcType=JdbcType.DECIMAL),
        @Result(column="chk_cd2", property="chkCd2", jdbcType=JdbcType.CHAR),
        @Result(column="create_id", property="createId", jdbcType=JdbcType.CHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.DATE),
        @Result(column="update_id", property="updateId", jdbcType=JdbcType.CHAR),
        @Result(column="update_date", property="updateDate", jdbcType=JdbcType.DATE),
        @Result(column="s112_2", property="s1122", jdbcType=JdbcType.CHAR),
        @Result(column="ipt_code", property="iptCode", jdbcType=JdbcType.CHAR),
        @Result(column="memo1", property="memo1", jdbcType=JdbcType.VARCHAR),
        @Result(column="memo2", property="memo2", jdbcType=JdbcType.VARCHAR),
        @Result(column="elv_amnt", property="elvAmnt", jdbcType=JdbcType.DECIMAL),
        @Result(column="tx_code", property="txCode", jdbcType=JdbcType.CHAR),
        @Result(column="pur_yyyymm", property="purYyyymm", jdbcType=JdbcType.DECIMAL),
        @Result(column="pur_no", property="purNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="mol_ctrl", property="molCtrl", jdbcType=JdbcType.CHAR),
        @Result(column="out_ctrl", property="outCtrl", jdbcType=JdbcType.CHAR),
        @Result(column="cnt_delv_date", property="cntDelvDate", jdbcType=JdbcType.DATE),
        @Result(column="est_hall_date", property="estHallDate", jdbcType=JdbcType.DATE),
        @Result(column="est_all_date", property="estAllDate", jdbcType=JdbcType.DATE),
        @Result(column="est_car_date", property="estCarDate", jdbcType=JdbcType.DATE),
        @Result(column="mol_expl_date", property="molExplDate", jdbcType=JdbcType.DATE),
        @Result(column="out_expl_date", property="outExplDate", jdbcType=JdbcType.DATE),
        @Result(column="act_hall_date", property="actHallDate", jdbcType=JdbcType.DATE),
        @Result(column="act_all_date", property="actAllDate", jdbcType=JdbcType.DATE),
        @Result(column="act_end_date", property="actEndDate", jdbcType=JdbcType.DATE),
        @Result(column="cost_end_date", property="costEndDate", jdbcType=JdbcType.DATE),
        @Result(column="ins_code", property="insCode", jdbcType=JdbcType.CHAR),
        @Result(column="grade_1", property="grade1", jdbcType=JdbcType.CHAR),
        @Result(column="grade_2", property="grade2", jdbcType=JdbcType.CHAR),
        @Result(column="maf_date", property="mafDate", jdbcType=JdbcType.DATE),
        @Result(column="hw_date", property="hwDate", jdbcType=JdbcType.DATE),
        @Result(column="lp_date", property="lpDate", jdbcType=JdbcType.DATE),
        @Result(column="cl_date", property="clDate", jdbcType=JdbcType.DATE),
        @Result(column="spec_date", property="specDate", jdbcType=JdbcType.DATE),
        @Result(column="est_cost_date", property="estCostDate", jdbcType=JdbcType.DATE),
        @Result(column="m001", property="m001", jdbcType=JdbcType.DECIMAL),
        @Result(column="m002", property="m002", jdbcType=JdbcType.DECIMAL),
        @Result(column="m003", property="m003", jdbcType=JdbcType.DECIMAL),
        @Result(column="m004", property="m004", jdbcType=JdbcType.CHAR),
        @Result(column="m005", property="m005", jdbcType=JdbcType.CHAR),
        @Result(column="m006", property="m006", jdbcType=JdbcType.CHAR),
        @Result(column="m007", property="m007", jdbcType=JdbcType.CHAR),
        @Result(column="m008", property="m008", jdbcType=JdbcType.CHAR),
        @Result(column="m009", property="m009", jdbcType=JdbcType.CHAR),
        @Result(column="eng_amnt", property="engAmnt", jdbcType=JdbcType.DECIMAL)
    })
    List<Cntm120> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cntm120, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cntm120, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(String item_, Integer ctNo_, Short elevNo_) {
        return delete(c -> 
            c.where(item, isEqualTo(item_))
            .and(ctNo, isEqualTo(ctNo_))
            .and(elevNo, isEqualTo(elevNo_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Cntm120 record) {
        return MyBatis3Utils.insert(this::insert, record, cntm120, c ->
            c.map(item).toProperty("item")
            .map(ctNo).toProperty("ctNo")
            .map(elevNo).toProperty("elevNo")
            .map(proCtr).toProperty("proCtr")
            .map(salCtr).toProperty("salCtr")
            .map(seriNo).toProperty("seriNo")
            .map(type).toProperty("type")
            .map(s102).toProperty("s102")
            .map(s104).toProperty("s104")
            .map(s105).toProperty("s105")
            .map(s106).toProperty("s106")
            .map(s107).toProperty("s107")
            .map(s108).toProperty("s108")
            .map(s01).toProperty("s01")
            .map(s109).toProperty("s109")
            .map(s110).toProperty("s110")
            .map(s1111).toProperty("s1111")
            .map(s1112).toProperty("s1112")
            .map(s112).toProperty("s112")
            .map(s114).toProperty("s114")
            .map(s115).toProperty("s115")
            .map(chkCd2).toProperty("chkCd2")
            .map(createId).toProperty("createId")
            .map(createDate).toProperty("createDate")
            .map(updateId).toProperty("updateId")
            .map(updateDate).toProperty("updateDate")
            .map(s1122).toProperty("s1122")
            .map(iptCode).toProperty("iptCode")
            .map(memo1).toProperty("memo1")
            .map(memo2).toProperty("memo2")
            .map(elvAmnt).toProperty("elvAmnt")
            .map(txCode).toProperty("txCode")
            .map(purYyyymm).toProperty("purYyyymm")
            .map(purNo).toProperty("purNo")
            .map(molCtrl).toProperty("molCtrl")
            .map(outCtrl).toProperty("outCtrl")
            .map(cntDelvDate).toProperty("cntDelvDate")
            .map(estHallDate).toProperty("estHallDate")
            .map(estAllDate).toProperty("estAllDate")
            .map(estCarDate).toProperty("estCarDate")
            .map(molExplDate).toProperty("molExplDate")
            .map(outExplDate).toProperty("outExplDate")
            .map(actHallDate).toProperty("actHallDate")
            .map(actAllDate).toProperty("actAllDate")
            .map(actEndDate).toProperty("actEndDate")
            .map(costEndDate).toProperty("costEndDate")
            .map(insCode).toProperty("insCode")
            .map(grade1).toProperty("grade1")
            .map(grade2).toProperty("grade2")
            .map(mafDate).toProperty("mafDate")
            .map(hwDate).toProperty("hwDate")
            .map(lpDate).toProperty("lpDate")
            .map(clDate).toProperty("clDate")
            .map(specDate).toProperty("specDate")
            .map(estCostDate).toProperty("estCostDate")
            .map(m001).toProperty("m001")
            .map(m002).toProperty("m002")
            .map(m003).toProperty("m003")
            .map(m004).toProperty("m004")
            .map(m005).toProperty("m005")
            .map(m006).toProperty("m006")
            .map(m007).toProperty("m007")
            .map(m008).toProperty("m008")
            .map(m009).toProperty("m009")
            .map(engAmnt).toProperty("engAmnt")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Cntm120> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, cntm120, c ->
            c.map(item).toProperty("item")
            .map(ctNo).toProperty("ctNo")
            .map(elevNo).toProperty("elevNo")
            .map(proCtr).toProperty("proCtr")
            .map(salCtr).toProperty("salCtr")
            .map(seriNo).toProperty("seriNo")
            .map(type).toProperty("type")
            .map(s102).toProperty("s102")
            .map(s104).toProperty("s104")
            .map(s105).toProperty("s105")
            .map(s106).toProperty("s106")
            .map(s107).toProperty("s107")
            .map(s108).toProperty("s108")
            .map(s01).toProperty("s01")
            .map(s109).toProperty("s109")
            .map(s110).toProperty("s110")
            .map(s1111).toProperty("s1111")
            .map(s1112).toProperty("s1112")
            .map(s112).toProperty("s112")
            .map(s114).toProperty("s114")
            .map(s115).toProperty("s115")
            .map(chkCd2).toProperty("chkCd2")
            .map(createId).toProperty("createId")
            .map(createDate).toProperty("createDate")
            .map(updateId).toProperty("updateId")
            .map(updateDate).toProperty("updateDate")
            .map(s1122).toProperty("s1122")
            .map(iptCode).toProperty("iptCode")
            .map(memo1).toProperty("memo1")
            .map(memo2).toProperty("memo2")
            .map(elvAmnt).toProperty("elvAmnt")
            .map(txCode).toProperty("txCode")
            .map(purYyyymm).toProperty("purYyyymm")
            .map(purNo).toProperty("purNo")
            .map(molCtrl).toProperty("molCtrl")
            .map(outCtrl).toProperty("outCtrl")
            .map(cntDelvDate).toProperty("cntDelvDate")
            .map(estHallDate).toProperty("estHallDate")
            .map(estAllDate).toProperty("estAllDate")
            .map(estCarDate).toProperty("estCarDate")
            .map(molExplDate).toProperty("molExplDate")
            .map(outExplDate).toProperty("outExplDate")
            .map(actHallDate).toProperty("actHallDate")
            .map(actAllDate).toProperty("actAllDate")
            .map(actEndDate).toProperty("actEndDate")
            .map(costEndDate).toProperty("costEndDate")
            .map(insCode).toProperty("insCode")
            .map(grade1).toProperty("grade1")
            .map(grade2).toProperty("grade2")
            .map(mafDate).toProperty("mafDate")
            .map(hwDate).toProperty("hwDate")
            .map(lpDate).toProperty("lpDate")
            .map(clDate).toProperty("clDate")
            .map(specDate).toProperty("specDate")
            .map(estCostDate).toProperty("estCostDate")
            .map(m001).toProperty("m001")
            .map(m002).toProperty("m002")
            .map(m003).toProperty("m003")
            .map(m004).toProperty("m004")
            .map(m005).toProperty("m005")
            .map(m006).toProperty("m006")
            .map(m007).toProperty("m007")
            .map(m008).toProperty("m008")
            .map(m009).toProperty("m009")
            .map(engAmnt).toProperty("engAmnt")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Cntm120 record) {
        return MyBatis3Utils.insert(this::insert, record, cntm120, c ->
            c.map(item).toPropertyWhenPresent("item", record::getItem)
            .map(ctNo).toPropertyWhenPresent("ctNo", record::getCtNo)
            .map(elevNo).toPropertyWhenPresent("elevNo", record::getElevNo)
            .map(proCtr).toPropertyWhenPresent("proCtr", record::getProCtr)
            .map(salCtr).toPropertyWhenPresent("salCtr", record::getSalCtr)
            .map(seriNo).toPropertyWhenPresent("seriNo", record::getSeriNo)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(s102).toPropertyWhenPresent("s102", record::getS102)
            .map(s104).toPropertyWhenPresent("s104", record::getS104)
            .map(s105).toPropertyWhenPresent("s105", record::getS105)
            .map(s106).toPropertyWhenPresent("s106", record::getS106)
            .map(s107).toPropertyWhenPresent("s107", record::getS107)
            .map(s108).toPropertyWhenPresent("s108", record::getS108)
            .map(s01).toPropertyWhenPresent("s01", record::getS01)
            .map(s109).toPropertyWhenPresent("s109", record::getS109)
            .map(s110).toPropertyWhenPresent("s110", record::getS110)
            .map(s1111).toPropertyWhenPresent("s1111", record::getS1111)
            .map(s1112).toPropertyWhenPresent("s1112", record::getS1112)
            .map(s112).toPropertyWhenPresent("s112", record::getS112)
            .map(s114).toPropertyWhenPresent("s114", record::getS114)
            .map(s115).toPropertyWhenPresent("s115", record::getS115)
            .map(chkCd2).toPropertyWhenPresent("chkCd2", record::getChkCd2)
            .map(createId).toPropertyWhenPresent("createId", record::getCreateId)
            .map(createDate).toPropertyWhenPresent("createDate", record::getCreateDate)
            .map(updateId).toPropertyWhenPresent("updateId", record::getUpdateId)
            .map(updateDate).toPropertyWhenPresent("updateDate", record::getUpdateDate)
            .map(s1122).toPropertyWhenPresent("s1122", record::getS1122)
            .map(iptCode).toPropertyWhenPresent("iptCode", record::getIptCode)
            .map(memo1).toPropertyWhenPresent("memo1", record::getMemo1)
            .map(memo2).toPropertyWhenPresent("memo2", record::getMemo2)
            .map(elvAmnt).toPropertyWhenPresent("elvAmnt", record::getElvAmnt)
            .map(txCode).toPropertyWhenPresent("txCode", record::getTxCode)
            .map(purYyyymm).toPropertyWhenPresent("purYyyymm", record::getPurYyyymm)
            .map(purNo).toPropertyWhenPresent("purNo", record::getPurNo)
            .map(molCtrl).toPropertyWhenPresent("molCtrl", record::getMolCtrl)
            .map(outCtrl).toPropertyWhenPresent("outCtrl", record::getOutCtrl)
            .map(cntDelvDate).toPropertyWhenPresent("cntDelvDate", record::getCntDelvDate)
            .map(estHallDate).toPropertyWhenPresent("estHallDate", record::getEstHallDate)
            .map(estAllDate).toPropertyWhenPresent("estAllDate", record::getEstAllDate)
            .map(estCarDate).toPropertyWhenPresent("estCarDate", record::getEstCarDate)
            .map(molExplDate).toPropertyWhenPresent("molExplDate", record::getMolExplDate)
            .map(outExplDate).toPropertyWhenPresent("outExplDate", record::getOutExplDate)
            .map(actHallDate).toPropertyWhenPresent("actHallDate", record::getActHallDate)
            .map(actAllDate).toPropertyWhenPresent("actAllDate", record::getActAllDate)
            .map(actEndDate).toPropertyWhenPresent("actEndDate", record::getActEndDate)
            .map(costEndDate).toPropertyWhenPresent("costEndDate", record::getCostEndDate)
            .map(insCode).toPropertyWhenPresent("insCode", record::getInsCode)
            .map(grade1).toPropertyWhenPresent("grade1", record::getGrade1)
            .map(grade2).toPropertyWhenPresent("grade2", record::getGrade2)
            .map(mafDate).toPropertyWhenPresent("mafDate", record::getMafDate)
            .map(hwDate).toPropertyWhenPresent("hwDate", record::getHwDate)
            .map(lpDate).toPropertyWhenPresent("lpDate", record::getLpDate)
            .map(clDate).toPropertyWhenPresent("clDate", record::getClDate)
            .map(specDate).toPropertyWhenPresent("specDate", record::getSpecDate)
            .map(estCostDate).toPropertyWhenPresent("estCostDate", record::getEstCostDate)
            .map(m001).toPropertyWhenPresent("m001", record::getM001)
            .map(m002).toPropertyWhenPresent("m002", record::getM002)
            .map(m003).toPropertyWhenPresent("m003", record::getM003)
            .map(m004).toPropertyWhenPresent("m004", record::getM004)
            .map(m005).toPropertyWhenPresent("m005", record::getM005)
            .map(m006).toPropertyWhenPresent("m006", record::getM006)
            .map(m007).toPropertyWhenPresent("m007", record::getM007)
            .map(m008).toPropertyWhenPresent("m008", record::getM008)
            .map(m009).toPropertyWhenPresent("m009", record::getM009)
            .map(engAmnt).toPropertyWhenPresent("engAmnt", record::getEngAmnt)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cntm120> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, cntm120, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cntm120> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, cntm120, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cntm120> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, cntm120, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cntm120> selectByPrimaryKey(String item_, Integer ctNo_, Short elevNo_) {
        return selectOne(c ->
            c.where(item, isEqualTo(item_))
            .and(ctNo, isEqualTo(ctNo_))
            .and(elevNo, isEqualTo(elevNo_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cntm120, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Cntm120 record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(item).equalTo(record::getItem)
                .set(ctNo).equalTo(record::getCtNo)
                .set(elevNo).equalTo(record::getElevNo)
                .set(proCtr).equalTo(record::getProCtr)
                .set(salCtr).equalTo(record::getSalCtr)
                .set(seriNo).equalTo(record::getSeriNo)
                .set(type).equalTo(record::getType)
                .set(s102).equalTo(record::getS102)
                .set(s104).equalTo(record::getS104)
                .set(s105).equalTo(record::getS105)
                .set(s106).equalTo(record::getS106)
                .set(s107).equalTo(record::getS107)
                .set(s108).equalTo(record::getS108)
                .set(s01).equalTo(record::getS01)
                .set(s109).equalTo(record::getS109)
                .set(s110).equalTo(record::getS110)
                .set(s1111).equalTo(record::getS1111)
                .set(s1112).equalTo(record::getS1112)
                .set(s112).equalTo(record::getS112)
                .set(s114).equalTo(record::getS114)
                .set(s115).equalTo(record::getS115)
                .set(chkCd2).equalTo(record::getChkCd2)
                .set(createId).equalTo(record::getCreateId)
                .set(createDate).equalTo(record::getCreateDate)
                .set(updateId).equalTo(record::getUpdateId)
                .set(updateDate).equalTo(record::getUpdateDate)
                .set(s1122).equalTo(record::getS1122)
                .set(iptCode).equalTo(record::getIptCode)
                .set(memo1).equalTo(record::getMemo1)
                .set(memo2).equalTo(record::getMemo2)
                .set(elvAmnt).equalTo(record::getElvAmnt)
                .set(txCode).equalTo(record::getTxCode)
                .set(purYyyymm).equalTo(record::getPurYyyymm)
                .set(purNo).equalTo(record::getPurNo)
                .set(molCtrl).equalTo(record::getMolCtrl)
                .set(outCtrl).equalTo(record::getOutCtrl)
                .set(cntDelvDate).equalTo(record::getCntDelvDate)
                .set(estHallDate).equalTo(record::getEstHallDate)
                .set(estAllDate).equalTo(record::getEstAllDate)
                .set(estCarDate).equalTo(record::getEstCarDate)
                .set(molExplDate).equalTo(record::getMolExplDate)
                .set(outExplDate).equalTo(record::getOutExplDate)
                .set(actHallDate).equalTo(record::getActHallDate)
                .set(actAllDate).equalTo(record::getActAllDate)
                .set(actEndDate).equalTo(record::getActEndDate)
                .set(costEndDate).equalTo(record::getCostEndDate)
                .set(insCode).equalTo(record::getInsCode)
                .set(grade1).equalTo(record::getGrade1)
                .set(grade2).equalTo(record::getGrade2)
                .set(mafDate).equalTo(record::getMafDate)
                .set(hwDate).equalTo(record::getHwDate)
                .set(lpDate).equalTo(record::getLpDate)
                .set(clDate).equalTo(record::getClDate)
                .set(specDate).equalTo(record::getSpecDate)
                .set(estCostDate).equalTo(record::getEstCostDate)
                .set(m001).equalTo(record::getM001)
                .set(m002).equalTo(record::getM002)
                .set(m003).equalTo(record::getM003)
                .set(m004).equalTo(record::getM004)
                .set(m005).equalTo(record::getM005)
                .set(m006).equalTo(record::getM006)
                .set(m007).equalTo(record::getM007)
                .set(m008).equalTo(record::getM008)
                .set(m009).equalTo(record::getM009)
                .set(engAmnt).equalTo(record::getEngAmnt);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Cntm120 record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(item).equalToWhenPresent(record::getItem)
                .set(ctNo).equalToWhenPresent(record::getCtNo)
                .set(elevNo).equalToWhenPresent(record::getElevNo)
                .set(proCtr).equalToWhenPresent(record::getProCtr)
                .set(salCtr).equalToWhenPresent(record::getSalCtr)
                .set(seriNo).equalToWhenPresent(record::getSeriNo)
                .set(type).equalToWhenPresent(record::getType)
                .set(s102).equalToWhenPresent(record::getS102)
                .set(s104).equalToWhenPresent(record::getS104)
                .set(s105).equalToWhenPresent(record::getS105)
                .set(s106).equalToWhenPresent(record::getS106)
                .set(s107).equalToWhenPresent(record::getS107)
                .set(s108).equalToWhenPresent(record::getS108)
                .set(s01).equalToWhenPresent(record::getS01)
                .set(s109).equalToWhenPresent(record::getS109)
                .set(s110).equalToWhenPresent(record::getS110)
                .set(s1111).equalToWhenPresent(record::getS1111)
                .set(s1112).equalToWhenPresent(record::getS1112)
                .set(s112).equalToWhenPresent(record::getS112)
                .set(s114).equalToWhenPresent(record::getS114)
                .set(s115).equalToWhenPresent(record::getS115)
                .set(chkCd2).equalToWhenPresent(record::getChkCd2)
                .set(createId).equalToWhenPresent(record::getCreateId)
                .set(createDate).equalToWhenPresent(record::getCreateDate)
                .set(updateId).equalToWhenPresent(record::getUpdateId)
                .set(updateDate).equalToWhenPresent(record::getUpdateDate)
                .set(s1122).equalToWhenPresent(record::getS1122)
                .set(iptCode).equalToWhenPresent(record::getIptCode)
                .set(memo1).equalToWhenPresent(record::getMemo1)
                .set(memo2).equalToWhenPresent(record::getMemo2)
                .set(elvAmnt).equalToWhenPresent(record::getElvAmnt)
                .set(txCode).equalToWhenPresent(record::getTxCode)
                .set(purYyyymm).equalToWhenPresent(record::getPurYyyymm)
                .set(purNo).equalToWhenPresent(record::getPurNo)
                .set(molCtrl).equalToWhenPresent(record::getMolCtrl)
                .set(outCtrl).equalToWhenPresent(record::getOutCtrl)
                .set(cntDelvDate).equalToWhenPresent(record::getCntDelvDate)
                .set(estHallDate).equalToWhenPresent(record::getEstHallDate)
                .set(estAllDate).equalToWhenPresent(record::getEstAllDate)
                .set(estCarDate).equalToWhenPresent(record::getEstCarDate)
                .set(molExplDate).equalToWhenPresent(record::getMolExplDate)
                .set(outExplDate).equalToWhenPresent(record::getOutExplDate)
                .set(actHallDate).equalToWhenPresent(record::getActHallDate)
                .set(actAllDate).equalToWhenPresent(record::getActAllDate)
                .set(actEndDate).equalToWhenPresent(record::getActEndDate)
                .set(costEndDate).equalToWhenPresent(record::getCostEndDate)
                .set(insCode).equalToWhenPresent(record::getInsCode)
                .set(grade1).equalToWhenPresent(record::getGrade1)
                .set(grade2).equalToWhenPresent(record::getGrade2)
                .set(mafDate).equalToWhenPresent(record::getMafDate)
                .set(hwDate).equalToWhenPresent(record::getHwDate)
                .set(lpDate).equalToWhenPresent(record::getLpDate)
                .set(clDate).equalToWhenPresent(record::getClDate)
                .set(specDate).equalToWhenPresent(record::getSpecDate)
                .set(estCostDate).equalToWhenPresent(record::getEstCostDate)
                .set(m001).equalToWhenPresent(record::getM001)
                .set(m002).equalToWhenPresent(record::getM002)
                .set(m003).equalToWhenPresent(record::getM003)
                .set(m004).equalToWhenPresent(record::getM004)
                .set(m005).equalToWhenPresent(record::getM005)
                .set(m006).equalToWhenPresent(record::getM006)
                .set(m007).equalToWhenPresent(record::getM007)
                .set(m008).equalToWhenPresent(record::getM008)
                .set(m009).equalToWhenPresent(record::getM009)
                .set(engAmnt).equalToWhenPresent(record::getEngAmnt);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Cntm120 record) {
        return update(c ->
            c.set(proCtr).equalTo(record::getProCtr)
            .set(salCtr).equalTo(record::getSalCtr)
            .set(seriNo).equalTo(record::getSeriNo)
            .set(type).equalTo(record::getType)
            .set(s102).equalTo(record::getS102)
            .set(s104).equalTo(record::getS104)
            .set(s105).equalTo(record::getS105)
            .set(s106).equalTo(record::getS106)
            .set(s107).equalTo(record::getS107)
            .set(s108).equalTo(record::getS108)
            .set(s01).equalTo(record::getS01)
            .set(s109).equalTo(record::getS109)
            .set(s110).equalTo(record::getS110)
            .set(s1111).equalTo(record::getS1111)
            .set(s1112).equalTo(record::getS1112)
            .set(s112).equalTo(record::getS112)
            .set(s114).equalTo(record::getS114)
            .set(s115).equalTo(record::getS115)
            .set(chkCd2).equalTo(record::getChkCd2)
            .set(createId).equalTo(record::getCreateId)
            .set(createDate).equalTo(record::getCreateDate)
            .set(updateId).equalTo(record::getUpdateId)
            .set(updateDate).equalTo(record::getUpdateDate)
            .set(s1122).equalTo(record::getS1122)
            .set(iptCode).equalTo(record::getIptCode)
            .set(memo1).equalTo(record::getMemo1)
            .set(memo2).equalTo(record::getMemo2)
            .set(elvAmnt).equalTo(record::getElvAmnt)
            .set(txCode).equalTo(record::getTxCode)
            .set(purYyyymm).equalTo(record::getPurYyyymm)
            .set(purNo).equalTo(record::getPurNo)
            .set(molCtrl).equalTo(record::getMolCtrl)
            .set(outCtrl).equalTo(record::getOutCtrl)
            .set(cntDelvDate).equalTo(record::getCntDelvDate)
            .set(estHallDate).equalTo(record::getEstHallDate)
            .set(estAllDate).equalTo(record::getEstAllDate)
            .set(estCarDate).equalTo(record::getEstCarDate)
            .set(molExplDate).equalTo(record::getMolExplDate)
            .set(outExplDate).equalTo(record::getOutExplDate)
            .set(actHallDate).equalTo(record::getActHallDate)
            .set(actAllDate).equalTo(record::getActAllDate)
            .set(actEndDate).equalTo(record::getActEndDate)
            .set(costEndDate).equalTo(record::getCostEndDate)
            .set(insCode).equalTo(record::getInsCode)
            .set(grade1).equalTo(record::getGrade1)
            .set(grade2).equalTo(record::getGrade2)
            .set(mafDate).equalTo(record::getMafDate)
            .set(hwDate).equalTo(record::getHwDate)
            .set(lpDate).equalTo(record::getLpDate)
            .set(clDate).equalTo(record::getClDate)
            .set(specDate).equalTo(record::getSpecDate)
            .set(estCostDate).equalTo(record::getEstCostDate)
            .set(m001).equalTo(record::getM001)
            .set(m002).equalTo(record::getM002)
            .set(m003).equalTo(record::getM003)
            .set(m004).equalTo(record::getM004)
            .set(m005).equalTo(record::getM005)
            .set(m006).equalTo(record::getM006)
            .set(m007).equalTo(record::getM007)
            .set(m008).equalTo(record::getM008)
            .set(m009).equalTo(record::getM009)
            .set(engAmnt).equalTo(record::getEngAmnt)
            .where(item, isEqualTo(record::getItem))
            .and(ctNo, isEqualTo(record::getCtNo))
            .and(elevNo, isEqualTo(record::getElevNo))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Cntm120 record) {
        return update(c ->
            c.set(proCtr).equalToWhenPresent(record::getProCtr)
            .set(salCtr).equalToWhenPresent(record::getSalCtr)
            .set(seriNo).equalToWhenPresent(record::getSeriNo)
            .set(type).equalToWhenPresent(record::getType)
            .set(s102).equalToWhenPresent(record::getS102)
            .set(s104).equalToWhenPresent(record::getS104)
            .set(s105).equalToWhenPresent(record::getS105)
            .set(s106).equalToWhenPresent(record::getS106)
            .set(s107).equalToWhenPresent(record::getS107)
            .set(s108).equalToWhenPresent(record::getS108)
            .set(s01).equalToWhenPresent(record::getS01)
            .set(s109).equalToWhenPresent(record::getS109)
            .set(s110).equalToWhenPresent(record::getS110)
            .set(s1111).equalToWhenPresent(record::getS1111)
            .set(s1112).equalToWhenPresent(record::getS1112)
            .set(s112).equalToWhenPresent(record::getS112)
            .set(s114).equalToWhenPresent(record::getS114)
            .set(s115).equalToWhenPresent(record::getS115)
            .set(chkCd2).equalToWhenPresent(record::getChkCd2)
            .set(createId).equalToWhenPresent(record::getCreateId)
            .set(createDate).equalToWhenPresent(record::getCreateDate)
            .set(updateId).equalToWhenPresent(record::getUpdateId)
            .set(updateDate).equalToWhenPresent(record::getUpdateDate)
            .set(s1122).equalToWhenPresent(record::getS1122)
            .set(iptCode).equalToWhenPresent(record::getIptCode)
            .set(memo1).equalToWhenPresent(record::getMemo1)
            .set(memo2).equalToWhenPresent(record::getMemo2)
            .set(elvAmnt).equalToWhenPresent(record::getElvAmnt)
            .set(txCode).equalToWhenPresent(record::getTxCode)
            .set(purYyyymm).equalToWhenPresent(record::getPurYyyymm)
            .set(purNo).equalToWhenPresent(record::getPurNo)
            .set(molCtrl).equalToWhenPresent(record::getMolCtrl)
            .set(outCtrl).equalToWhenPresent(record::getOutCtrl)
            .set(cntDelvDate).equalToWhenPresent(record::getCntDelvDate)
            .set(estHallDate).equalToWhenPresent(record::getEstHallDate)
            .set(estAllDate).equalToWhenPresent(record::getEstAllDate)
            .set(estCarDate).equalToWhenPresent(record::getEstCarDate)
            .set(molExplDate).equalToWhenPresent(record::getMolExplDate)
            .set(outExplDate).equalToWhenPresent(record::getOutExplDate)
            .set(actHallDate).equalToWhenPresent(record::getActHallDate)
            .set(actAllDate).equalToWhenPresent(record::getActAllDate)
            .set(actEndDate).equalToWhenPresent(record::getActEndDate)
            .set(costEndDate).equalToWhenPresent(record::getCostEndDate)
            .set(insCode).equalToWhenPresent(record::getInsCode)
            .set(grade1).equalToWhenPresent(record::getGrade1)
            .set(grade2).equalToWhenPresent(record::getGrade2)
            .set(mafDate).equalToWhenPresent(record::getMafDate)
            .set(hwDate).equalToWhenPresent(record::getHwDate)
            .set(lpDate).equalToWhenPresent(record::getLpDate)
            .set(clDate).equalToWhenPresent(record::getClDate)
            .set(specDate).equalToWhenPresent(record::getSpecDate)
            .set(estCostDate).equalToWhenPresent(record::getEstCostDate)
            .set(m001).equalToWhenPresent(record::getM001)
            .set(m002).equalToWhenPresent(record::getM002)
            .set(m003).equalToWhenPresent(record::getM003)
            .set(m004).equalToWhenPresent(record::getM004)
            .set(m005).equalToWhenPresent(record::getM005)
            .set(m006).equalToWhenPresent(record::getM006)
            .set(m007).equalToWhenPresent(record::getM007)
            .set(m008).equalToWhenPresent(record::getM008)
            .set(m009).equalToWhenPresent(record::getM009)
            .set(engAmnt).equalToWhenPresent(record::getEngAmnt)
            .where(item, isEqualTo(record::getItem))
            .and(ctNo, isEqualTo(record::getCtNo))
            .and(elevNo, isEqualTo(record::getElevNo))
        );
    }
}