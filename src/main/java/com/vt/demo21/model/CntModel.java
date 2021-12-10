package com.vt.demo21.model;

import java.math.BigDecimal;
import java.util.Date;

import com.ejlchina.searcher.bean.DbField;
import com.ejlchina.searcher.bean.SearchBean;

@SearchBean(tables = "cntm010 a, cntm015 b, psnm110 c, basm060 d", joinCond = "a.item=b.item and a.ct_no=b.ct_no"
		+ " and a.sale_no=c.emp_no and a.cust_no=d.cust_no and a.item not in ('BS','ST','TT')")

public class CntModel {

	@DbField("a.pro_ctr")
	private String proCtr;

	@DbField("a.item")
	private String item;

	@DbField("a.ct_no")
	private Integer ctNo;

	@DbField("a.buld_name")
	private String buldName;

	@DbField("a.ct_date")
	private Date ctDate;

	@DbField("a.sale_no")
	private Integer saleNo;

	@DbField("a.sal_ctr")
	private String salCtr;

	@DbField("a.cust_no")
	private Integer custNo;

	@DbField("a.nt_amnt")
	private BigDecimal ntAmnt;

	@DbField("b.comp_2")
	private String comp2;

	@DbField("b.sal_beg_cost")
	private BigDecimal salBegCost;

	@DbField("c.emp_name")
	private String empName;

	@DbField("d.cust_name")
	private String custName;

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

	public String getBuldName() {
		return buldName;
	}

	public void setBuldName(String buldName) {
		this.buldName = buldName;
	}

	public Date getCtDate() {
		return ctDate;
	}

	public void setCtDate(Date ctDate) {
		this.ctDate = ctDate;
	}

	public Integer getSaleNo() {
		return saleNo;
	}

	public void setSaleNo(Integer saleNo) {
		this.saleNo = saleNo;
	}

	public String getSalCtr() {
		return salCtr;
	}

	public void setSalCtr(String salCtr) {
		this.salCtr = salCtr;
	}

	public Integer getCustNo() {
		return custNo;
	}

	public void setCustNo(Integer custNo) {
		this.custNo = custNo;
	}

	public BigDecimal getNtAmnt() {
		return ntAmnt;
	}

	public void setNtAmnt(BigDecimal ntAmnt) {
		this.ntAmnt = ntAmnt;
	}

	public String getComp2() {
		return comp2;
	}

	public void setComp2(String comp2) {
		this.comp2 = comp2;
	}

	public BigDecimal getSalBegCost() {
		return salBegCost;
	}

	public void setSalBegCost(BigDecimal salBegCost) {
		this.salBegCost = salBegCost;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

}
