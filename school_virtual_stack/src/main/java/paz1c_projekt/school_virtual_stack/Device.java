package paz1c_projekt.school_virtual_stack;

import java.time.LocalDateTime;

public class Device {
	
	// Zakladne informacie
	private Long id;
	private Double cena;
	private int pocet;
	private String nazov;
	private String tip;
	private String ucebna;
	private String zodpovednaOsoba;
	private String poznamka;
	
	// Nadobudnutie
	private LocalDateTime datumNadobudnutia;
	private String vyrobneCislo;
	private String sposobNadobudnutia;
	private String ucet;
	private int cisloFaktury;
	
	// Vyradenie
	private LocalDateTime datumVyradenia;
	private String dovodVyradenia;
	private String sposobVyradenia;
	
	@Override
	public String toString() {
		return "Device [nazov=" + nazov + ", ucebna=" + ucebna + ", zodpovednaOsoba=" + zodpovednaOsoba + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getCena() {
		return cena;
	}
	public void setCena(Double cena) {
		this.cena = cena;
	}
	public int getPocet() {
		return pocet;
	}
	public void setPocet(int pocet) {
		this.pocet = pocet;
	}
	public String getNazov() {
		return nazov;
	}
	public void setNazov(String nazov) {
		this.nazov = nazov;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getUcebna() {
		return ucebna;
	}
	public void setUcebna(String ucebna) {
		this.ucebna = ucebna;
	}
	public String getZodpovednaOsoba() {
		return zodpovednaOsoba;
	}
	public void setZodpovednaOsoba(String zodpovednaOsoba) {
		this.zodpovednaOsoba = zodpovednaOsoba;
	}
	public String getPoznamka() {
		return poznamka;
	}
	public void setPoznamka(String poznamka) {
		this.poznamka = poznamka;
	}
	public LocalDateTime getDatumNadobudnutia() {
		return datumNadobudnutia;
	}
	public void setDatumNadobudnutia(LocalDateTime datumNadobudnutia) {
		this.datumNadobudnutia = datumNadobudnutia;
	}
	public String getVyrobneCislo() {
		return vyrobneCislo;
	}
	public void setVyrobneCislo(String vyrobneCislo) {
		this.vyrobneCislo = vyrobneCislo;
	}
	public String getSposobNadobudnutia() {
		return sposobNadobudnutia;
	}
	public void setSposobNadobudnutia(String sposobNadobudnutia) {
		this.sposobNadobudnutia = sposobNadobudnutia;
	}
	public String getUcet() {
		return ucet;
	}
	public void setUcet(String ucet) {
		this.ucet = ucet;
	}
	public int getCisloFaktury() {
		return cisloFaktury;
	}
	public void setCisloFaktury(int cisloFaktury) {
		this.cisloFaktury = cisloFaktury;
	}
	public LocalDateTime getDatumVyradenia() {
		return datumVyradenia;
	}
	public void setDatumVyradenia(LocalDateTime datumVyradenia) {
		this.datumVyradenia = datumVyradenia;
	}
	public String getDovodVyradenia() {
		return dovodVyradenia;
	}
	public void setDovodVyradenia(String dovodVyradenia) {
		this.dovodVyradenia = dovodVyradenia;
	}
	public String getSposobVyradenia() {
		return sposobVyradenia;
	}
	public void setSposobVyradenia(String sposobVyradenia) {
		this.sposobVyradenia = sposobVyradenia;
	}
}
