package com.silalahi.valentinus.database.service;

import java.util.Date;
import java.util.List;

import com.silalahi.valentinus.database.domain.Penjualan;
import com.silalahi.valentinus.database.domain.PenjualanDetail;
import com.silalahi.valentinus.database.domain.Produk;

public interface PenjualanService {
	// service yang berkaitan dengan produk
	void simpan(Produk p);

	Produk searchProdukById(Integer id);

	Produk searchProdukByKode(String kode);

	Long hitungSemuaProduk();

	List<Produk> searchAllProduk(Integer halaman, Integer baris);

	Long hitungProdukByNama(String nama);

	List<Produk> cariProdukByNama(String nama, Integer halaman, Integer baris);

	// service yang berkaitan dengan transaksi
	void simpan(Penjualan penj);
	Penjualan cariPenjualanById(Integer id);
	Long hitungPenjualanByPeriode(Date mulai, Date sampai);
	List<Penjualan> cariPenjualanByPeriode(Date mulai, Date sampai, Integer halaman, Integer baris);
	Long hitungPenjualanDetailByProdukDanPeriode(Produk p, Date mulai, Date sampai);
	List<PenjualanDetail> cariPenjualanDetailByProdukDanPeriode(Produk p, Date mulai, Date sampai, Integer halaman, Integer baris);
}
