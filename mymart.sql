-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 10 Agu 2020 pada 09.19
-- Versi Server: 10.1.30-MariaDB
-- PHP Version: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mymart`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `kode_barang` varchar(10) NOT NULL,
  `username` varchar(10) NOT NULL,
  `nama_barang` varchar(20) NOT NULL,
  `stok` int(11) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`kode_barang`, `username`, `nama_barang`, `stok`, `harga`) VALUES
('BGBG', 'penjual', 'Beng Beng', 15, 1500),
('CLTS', 'penjual', 'Chocolatos', 11, 500),
('CMRY', 'penjual', 'Cimory Yougurt', 8, 6000),
('DJDI', 'penjual', 'Daia', 8, 10000),
('DJRS', 'penjual', 'Rinso', 9, 15000),
('OKJD', 'penjual', 'Okky Jelly Drink', 18, 1000),
('PGPD', 'penjual', 'Pepsodent', 19, 3000),
('SBLF', 'penjual', 'Lifebuoy', 18, 2500),
('SBNV', 'penjual', 'Nuvo', 19, 2000),
('SRRT', 'penjual', 'Sari Roti', 13, 4500),
('SSSN', 'penjual', 'Sosis So Nice', 17, 5000),
('THBS', 'penjual', 'Teh Botol Sosro', 18, 3000),
('THKT', 'penjual', 'Teh Kotak', 20, 5500);

-- --------------------------------------------------------

--
-- Struktur dari tabel `beli_barang`
--

CREATE TABLE `beli_barang` (
  `nomor_transaksi` int(10) NOT NULL,
  `kode_barang` varchar(10) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `beli_barang`
--

INSERT INTO `beli_barang` (`nomor_transaksi`, `kode_barang`, `jumlah`, `total`) VALUES
(2, 'SBNV', 5, 10000),
(3, 'PGPD', 2, 6000),
(4, 'PGPD', 1, 3000),
(4, 'SSSN', 2, 10000),
(5, 'SBLF', 4, 10000),
(6, 'OKJD', 2, 2000),
(6, 'PGPD', 2, 6000),
(6, 'SBNV', 2, 4000),
(6, 'SSSN', 3, 15000),
(7, 'CLTS', 2, 1000),
(8, 'DJDI', 2, 20000),
(10, 'DJDI', 1, 10000),
(11, 'SRRT', 2, 9000),
(1, 'DJDI', 1, 10000),
(13, 'CMRY', 1, 6000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `customer`
--

CREATE TABLE `customer` (
  `id_customer` int(10) NOT NULL,
  `nama_customer` varchar(20) NOT NULL,
  `alamat_customer` varchar(30) NOT NULL,
  `telepon_customer` varchar(15) NOT NULL,
  `kategori` varchar(10) NOT NULL,
  `poin` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `customer`
--

INSERT INTO `customer` (`id_customer`, `nama_customer`, `alamat_customer`, `telepon_customer`, `kategori`, `poin`) VALUES
(1, 'Yulianto', 'Tawangsari, Taman', '081234621231', 'Non Member', 0),
(2, 'Juwita', 'Karangpilang, Surabaya', '081123456789', 'Non Member', 0),
(3, 'Niken ', 'Wage, Taman', '085567890345', 'Member', 270),
(4, 'Gitya', 'Wage, Taman', '087789098456', 'Member', 300),
(5, 'Putri', 'Bungah, Gresik', '089123567345', 'Non Member', 0),
(6, 'Rosita', 'Jepara', '085456345123', 'Member', 60),
(7, 'Devi ', 'Kenjeran, Surabaya', '087345158075', 'Member', 100);

-- --------------------------------------------------------

--
-- Struktur dari tabel `seller`
--

CREATE TABLE `seller` (
  `username` varchar(10) NOT NULL,
  `password` varchar(15) NOT NULL,
  `nama_penjual` varchar(20) NOT NULL,
  `alamat_penjual` varchar(30) NOT NULL,
  `telepon_penjual` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `seller`
--

INSERT INTO `seller` (`username`, `password`, `nama_penjual`, `alamat_penjual`, `telepon_penjual`) VALUES
('penjual', '12345', 'Rodein', 'Surabaya', '081234621232');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `nomor_transaksi` int(10) NOT NULL,
  `id_customer` int(10) NOT NULL,
  `tanggal` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `total_transaksi` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`nomor_transaksi`, `id_customer`, `tanggal`, `total_transaksi`) VALUES
(1, 2, '2019-01-08 14:16:32', 13000),
(2, 7, '2019-01-09 00:32:35', 9000),
(3, 6, '2019-01-09 00:47:19', 5400),
(4, 1, '2019-01-09 00:52:26', 13000),
(5, 2, '2019-01-09 01:00:12', 10000),
(6, 3, '2019-01-09 12:01:56', 24300),
(7, 4, '2019-01-09 12:06:57', 900),
(8, 4, '2019-01-09 12:36:13', 18000),
(9, 2, '2019-01-09 12:37:32', 0),
(10, 2, '2019-01-09 12:37:57', 10000),
(11, 4, '2019-01-09 12:46:20', 8100),
(13, 5, '2019-01-09 15:55:50', 6000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kode_barang`),
  ADD KEY `barang_ibfk_1` (`username`);

--
-- Indexes for table `beli_barang`
--
ALTER TABLE `beli_barang`
  ADD KEY `beli_barang_ibfk_1` (`nomor_transaksi`),
  ADD KEY `beli_barang_ibfk_2` (`kode_barang`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id_customer`);

--
-- Indexes for table `seller`
--
ALTER TABLE `seller`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`nomor_transaksi`),
  ADD KEY `transaksi_ibfk_1` (`id_customer`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `nomor_transaksi` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD CONSTRAINT `barang_ibfk_1` FOREIGN KEY (`username`) REFERENCES `seller` (`username`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `beli_barang`
--
ALTER TABLE `beli_barang`
  ADD CONSTRAINT `beli_barang_ibfk_1` FOREIGN KEY (`nomor_transaksi`) REFERENCES `transaksi` (`nomor_transaksi`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `beli_barang_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id_customer`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
