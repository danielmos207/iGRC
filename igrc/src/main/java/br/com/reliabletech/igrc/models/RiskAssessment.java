package br.com.reliabletech.igrc.models;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class RiskAssessment {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String name;
	
	@Lob
	private String description;

	private BigDecimal qtPotDamage;

	private String qlPotDamage;
	
	private Integer qtOccFreq;
	
	private Integer qloccfreq;
	
	@ManyToOne(targetEntity = Risk.class, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	private Risk risk;
	

	public Integer getQloccfreq() {
		return qloccfreq;
	}

	public void setQloccfreq(Integer qloccfreq) {
		this.qloccfreq = qloccfreq;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Risk getRisk() {
		return risk;
	}

	public void setRisk(Risk risk) {
		this.risk = risk;
	}

	public BigDecimal getQtPotDamage() {
		return qtPotDamage;
	}

	public void setQtPotDamage(BigDecimal qtPotDamage) {
		this.qtPotDamage = qtPotDamage;
	}

	public String getQlPotDamage() {
		return qlPotDamage;
	}

	public void setQlPotDamage(String qlPotDamage) {
		this.qlPotDamage = qlPotDamage;
	}

	public Integer getQtOccFreq() {
		return qtOccFreq;
	}

	public void setQtOccFreq(Integer qtOccFreq) {
		this.qtOccFreq = qtOccFreq;
	}


}
