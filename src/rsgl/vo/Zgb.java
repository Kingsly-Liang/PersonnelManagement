package rsgl.vo;

import java.sql.Timestamp;

/**
 * Zgb entity. @author MyEclipse Persistence Tools
 */

public class Zgb implements java.io.Serializable {

	// Fields

	private String bh;
	private String xm;
	private String xb;
	private String bm;
	private Timestamp csrq;
	private Integer jbgz;
	private Integer gwjt;

	// Constructors

	/** default constructor */
	public Zgb() {
	}

	/** full constructor */
	public Zgb(String bh, String xm, String xb, String bm, Timestamp csrq,
			Integer jbgz, Integer gwjt) {
		this.bh = bh;
		this.xm = xm;
		this.xb = xb;
		this.bm = bm;
		this.csrq = csrq;
		this.jbgz = jbgz;
		this.gwjt = gwjt;
	}

	// Property accessors

	public String getBh() {
		return this.bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public String getXm() {
		return this.xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getXb() {
		return this.xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public String getBm() {
		return this.bm;
	}

	public void setBm(String bm) {
		this.bm = bm;
	}

	public Timestamp getCsrq() {
		return this.csrq;
	}

	public void setCsrq(Timestamp csrq) {
		this.csrq = csrq;
	}

	public Integer getJbgz() {
		return this.jbgz;
	}

	public void setJbgz(Integer jbgz) {
		this.jbgz = jbgz;
	}

	public Integer getGwjt() {
		return this.gwjt;
	}

	public void setGwjt(Integer gwjt) {
		this.gwjt = gwjt;
	}

}