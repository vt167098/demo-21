package com.vt.demo21.model;

import java.math.BigDecimal;
import java.util.Date;

import com.ejlchina.searcher.bean.DbField;
import com.ejlchina.searcher.bean.SearchBean;

@SearchBean(tables = "cntm010 a join cntm120 b on a.item=b.item and a.ct_no=b.ct_no"
		+ " left join test2@informix:tablec: c on b.item=c.item and b.ct_no=c.ct_no and b.elev_no=c.elev_no")

public class Join01Model {

	@DbField("a.pro_ctr")
	private String proCtr;

	@DbField("a.item")
	private String item;
	
	@DbField("a.ct_no")
	private Integer ctNo;
	
	@DbField("b.elev_no")
	private short elevNo;
	
	@DbField("b.s104")
	private String s104;
	
	@DbField("b.s105")
	private short s105;
	
	@DbField("b.s106")
	private Integer s106;
	
	@DbField("b.s107")
	private String s107;
	
	@DbField("b.s108")
	private short s108;

	@DbField("b.s109")
	private short s109;
	
	@DbField("b.s110")
	private String s110;
	
	@DbField("b.s01")
	private short s01;

	@DbField("b.elv_amnt")
	private BigDecimal elvAmnt;
	
	@DbField("b.eng_amnt")
	private BigDecimal engAmnt;
	
	@DbField("c.team_1_emp_no")
	private Integer team1EmpNo;
	
	@DbField("c.team_2_emp_no")
	private Integer team2EmpNo;
	
	@DbField("c.team_3_emp_no")
	private Integer team3EmpNo;
	
	@DbField("c.team_1_grade")
	private String team1Grade;
	
	@DbField("c.team_2_grade")
	private String team2Grade;
	
	@DbField("c.team_3_grade")
	private String team3Grade;

	public String getProCtr() {
		return proCtr;
	}

	public void setProCtr(String proCtr) {
		this.proCtr = proCtr;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getCtNo() {
		return ctNo;
	}

	public void setCtNo(Integer ctNo) {
		this.ctNo = ctNo;
	}

	public short getElevNo() {
		return elevNo;
	}

	public void setElevNo(short elevNo) {
		this.elevNo = elevNo;
	}

	public String getS104() {
		return s104;
	}

	public void setS104(String s104) {
		this.s104 = s104;
	}

	public short getS105() {
		return s105;
	}

	public void setS105(short s105) {
		this.s105 = s105;
	}

	public Integer getS106() {
		return s106;
	}

	public void setS106(Integer s106) {
		this.s106 = s106;
	}

	public String getS107() {
		return s107;
	}

	public void setS107(String s107) {
		this.s107 = s107;
	}

	public short getS108() {
		return s108;
	}

	public void setS108(short s108) {
		this.s108 = s108;
	}

	public short getS109() {
		return s109;
	}

	public void setS109(short s109) {
		this.s109 = s109;
	}

	public String getS110() {
		return s110;
	}

	public void setS110(String s110) {
		this.s110 = s110;
	}

	public short getS01() {
		return s01;
	}

	public void setS01(short s01) {
		this.s01 = s01;
	}

	public BigDecimal getElvAmnt() {
		return elvAmnt;
	}

	public void setElvAmnt(BigDecimal elvAmnt) {
		this.elvAmnt = elvAmnt;
	}

	public BigDecimal getEngAmnt() {
		return engAmnt;
	}

	public void setEngAmnt(BigDecimal engAmnt) {
		this.engAmnt = engAmnt;
	}

	public Integer getTeam1EmpNo() {
		return team1EmpNo;
	}

	public void setTeam1EmpNo(Integer team1EmpNo) {
		this.team1EmpNo = team1EmpNo;
	}

	public Integer getTeam2EmpNo() {
		return team2EmpNo;
	}

	public void setTeam2EmpNo(Integer team2EmpNo) {
		this.team2EmpNo = team2EmpNo;
	}

	public Integer getTeam3EmpNo() {
		return team3EmpNo;
	}

	public void setTeam3EmpNo(Integer team3EmpNo) {
		this.team3EmpNo = team3EmpNo;
	}

	public String getTeam1Grade() {
		return team1Grade;
	}

	public void setTeam1Grade(String team1Grade) {
		this.team1Grade = team1Grade;
	}

	public String getTeam2Grade() {
		return team2Grade;
	}

	public void setTeam2Grade(String team2Grade) {
		this.team2Grade = team2Grade;
	}

	public String getTeam3Grade() {
		return team3Grade;
	}

	public void setTeam3Grade(String team3Grade) {
		this.team3Grade = team3Grade;
	}

}
