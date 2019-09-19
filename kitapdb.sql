-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 22, 2019 at 08:56 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kitapdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `adminID` int(11) NOT NULL,
  `adminBilgi` varchar(100) NOT NULL,
  `adminAd` varchar(10) NOT NULL,
  `adminSifre` varchar(10) NOT NULL,
  `adminMail` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`adminID`, `adminBilgi`, `adminAd`, `adminSifre`, `adminMail`) VALUES
(1, 'Demir Kaya', 'admin1', '1111', 'admin1@kitap.com'),
(2, 'Aycan Berber', 'admin2', '2222', 'admin2@kitap.com'),
(4, 'Ya Ko', 'admin4', '4444', 'admin4@kitap.com');

-- --------------------------------------------------------

--
-- Table structure for table `kitaplar`
--

CREATE TABLE `kitaplar` (
  `kitapID` int(11) NOT NULL,
  `KitapAdi` varchar(50) NOT NULL,
  `YazarAdi` varchar(100) NOT NULL,
  `YayinEvi` varchar(100) NOT NULL,
  `BasimYili` year(4) NOT NULL,
  `Yer` varchar(10) NOT NULL,
  `RaftaMi` tinyint(1) NOT NULL,
  `AdminID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kitaplar`
--

INSERT INTO `kitaplar` (`kitapID`, `KitapAdi`, `YazarAdi`, `YayinEvi`, `BasimYili`, `Yer`, `RaftaMi`, `AdminID`) VALUES
(1, 'Siyah Göl', 'Deniz Budak', 'Ahtapot Kitap', 2002, '332.22 BUD', 1, 1),
(4, 'Kara Günler', 'Cemil Mehmet Duran', 'Bilgi Yayinlari', 1978, '122.07 DUR', 1, 1),
(7, 'Gelecek', 'Drew Ade', 'Fox Books', 2000, '333.33 ADE', 1, 2),
(8, 'World ', 'D. Jam', 'Fox Books', 1998, '223.76 JAM', 0, 2),
(9, 'Dene', 'Fa', 'lol', 2000, '333.33 FA', 0, 2),
(10, 'Metal Dam', 'Melike Gölge', 'Korkut Kitap', 1988, '312.32 GOL', 1, 2),
(11, 'Dene', 'Sa Sa', 'Sabun', 1988, '112.45 SA', 0, 2);

-- --------------------------------------------------------

--
-- Table structure for table `odunc`
--

CREATE TABLE `odunc` (
  `oduncId` int(11) NOT NULL,
  `kitapID` int(11) NOT NULL,
  `uyeID` int(11) NOT NULL,
  `adminID` int(11) NOT NULL,
  `oduncTarih` date NOT NULL,
  `IadeTarih` date NOT NULL,
  `iadeMi` tinyint(1) NOT NULL,
  `uzatMi` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `odunc`
--

INSERT INTO `odunc` (`oduncId`, `kitapID`, `uyeID`, `adminID`, `oduncTarih`, `IadeTarih`, `iadeMi`, `uzatMi`) VALUES
(1, 1, 2, 2, '2019-02-11', '2019-02-25', 1, 0),
(2, 4, 2, 2, '2019-04-04', '2019-04-18', 1, 0),
(3, 8, 2, 2, '2019-04-11', '2019-04-18', 1, 0),
(5, 8, 4, 2, '2019-04-16', '2019-05-14', 0, 1),
(6, 9, 1, 2, '2019-04-02', '2019-04-16', 1, 0),
(7, 4, 1, 2, '2019-04-24', '2019-05-22', 1, 1),
(8, 10, 1, 2, '2019-04-05', '2019-04-19', 1, 0),
(9, 7, 4, 2, '2019-04-26', '2019-05-10', 1, 0),
(10, 9, 6, 2, '2019-05-04', '2019-06-01', 0, 1),
(11, 11, 2, 1, '2019-05-13', '2019-05-27', 1, 0),
(12, 7, 6, 2, '2019-05-21', '2019-06-04', 1, 0),
(13, 11, 2, 2, '2019-05-21', '2019-06-04', 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `uyeler`
--

CREATE TABLE `uyeler` (
  `uyeID` int(11) NOT NULL,
  `Ad` varchar(50) NOT NULL,
  `Soyad` varchar(50) NOT NULL,
  `UyeAdi` varchar(50) NOT NULL,
  `Mail` varchar(50) NOT NULL,
  `Sifre` varchar(8) NOT NULL,
  `borcGun` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `uyeler`
--

INSERT INTO `uyeler` (`uyeID`, `Ad`, `Soyad`, `UyeAdi`, `Mail`, `Sifre`, `borcGun`) VALUES
(1, 'ayse', 'kaya', 'ayska', 'akaya@kitap.com', '5544', 0),
(2, 'ahmet', 'yilmaz', 'ahmett', 'yilmaza@kitap.com', '1423', 0),
(4, 'demir', 'demir', 'demirrr', 'demir@kitap.com', '333', 18),
(6, 'yam', 'ur', 'ya', 'ya', 'ya', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`adminID`);

--
-- Indexes for table `kitaplar`
--
ALTER TABLE `kitaplar`
  ADD PRIMARY KEY (`kitapID`),
  ADD KEY `AdminID` (`AdminID`);

--
-- Indexes for table `odunc`
--
ALTER TABLE `odunc`
  ADD PRIMARY KEY (`oduncId`),
  ADD KEY `uyeID` (`uyeID`),
  ADD KEY `kitapID` (`kitapID`),
  ADD KEY `adminID` (`adminID`);

--
-- Indexes for table `uyeler`
--
ALTER TABLE `uyeler`
  ADD PRIMARY KEY (`uyeID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `adminID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `kitaplar`
--
ALTER TABLE `kitaplar`
  MODIFY `kitapID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `odunc`
--
ALTER TABLE `odunc`
  MODIFY `oduncId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `uyeler`
--
ALTER TABLE `uyeler`
  MODIFY `uyeID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `kitaplar`
--
ALTER TABLE `kitaplar`
  ADD CONSTRAINT `kitaplar_ibfk_1` FOREIGN KEY (`AdminID`) REFERENCES `admin` (`adminID`);

--
-- Constraints for table `odunc`
--
ALTER TABLE `odunc`
  ADD CONSTRAINT `odunc_ibfk_1` FOREIGN KEY (`uyeID`) REFERENCES `uyeler` (`uyeID`),
  ADD CONSTRAINT `odunc_ibfk_3` FOREIGN KEY (`kitapID`) REFERENCES `kitaplar` (`kitapID`),
  ADD CONSTRAINT `odunc_ibfk_4` FOREIGN KEY (`adminID`) REFERENCES `admin` (`adminID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
