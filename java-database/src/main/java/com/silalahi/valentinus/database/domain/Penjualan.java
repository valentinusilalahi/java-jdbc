package com.silalahi.valentinus.database.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Penjualan {
	private Integer id;
	private Date waktuTransaksi;
	private List<PenjualanDetail> listPenjualan = new ArrayList<PenjualanDetail>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getWaktuTransaksi() {
		return waktuTransaksi;
	}

	public void setWaktuTransaksi(Date waktuTransaksi) {
		this.waktuTransaksi = waktuTransaksi;
	}

	public List<PenjualanDetail> getListPenjualan() {
		return listPenjualan;
	}

	public void setListPenjualan(List<PenjualanDetail> listPenjualan) {
		this.listPenjualan = listPenjualan;
	}

}