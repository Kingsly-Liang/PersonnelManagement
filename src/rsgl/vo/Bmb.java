package rsgl.vo;

/**
 * Bmb entity. @author MyEclipse Persistence Tools
 */

public class Bmb implements java.io.Serializable {

	// Fields

	private String bmbh;
	private String bmmc;

	// Constructors

	/** default constructor */
	public Bmb() {
	}

	/** full constructor */
	public Bmb(String bmbh, String bmmc) {
		this.bmbh = bmbh;
		this.bmmc = bmmc;
	}

	// Property accessors

	public String getBmbh() {
		return this.bmbh;
	}

	public void setBmbh(String bmbh) {
		this.bmbh = bmbh;
	}

	public String getBmmc() {
		return this.bmmc;
	}

	public void setBmmc(String bmmc) {
		this.bmmc = bmmc;
	}

}