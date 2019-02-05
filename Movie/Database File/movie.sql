-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 05, 2019 at 04:08 PM
-- Server version: 5.7.24
-- PHP Version: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `movie`
--

-- --------------------------------------------------------

--
-- Table structure for table `addmovie`
--

DROP TABLE IF EXISTS `addmovie`;
CREATE TABLE IF NOT EXISTS `addmovie` (
  `movie_name` varchar(100) NOT NULL,
  `type` varchar(100) NOT NULL,
  `artist` varchar(100) NOT NULL,
  `movie_description` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `addmovie`
--

INSERT INTO `addmovie` (`movie_name`, `type`, `artist`, `movie_description`) VALUES
('Overloaded(2018)', 'Hollywood', 'various', 'A small group of American soldiers find horror behind enemy lines on the eve of D-Day.');

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `User` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  PRIMARY KEY (`User`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`User`, `Password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee` (
  `employee_Name` varchar(100) NOT NULL,
  `email_Id` varchar(100) NOT NULL,
  `mobile_No` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `position` varchar(100) NOT NULL,
  `marital_Status` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `dOB` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  `salary` varchar(100) NOT NULL,
  `aadhar_No` varchar(100) NOT NULL,
  PRIMARY KEY (`employee_Name`,`aadhar_No`,`email_Id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`employee_Name`, `email_Id`, `mobile_No`, `address`, `position`, `marital_Status`, `gender`, `password`, `dOB`, `state`, `salary`, `aadhar_No`) VALUES
('Diljot Singh', 'diljots99@gmail.com', '123456789', 'sirhind', 'Marketing', 'Single', 'Male', 'password', '24 Jun, 1999', 'Punjab (PB)', '12345', '111122223333');

-- --------------------------------------------------------

--
-- Table structure for table `price`
--

DROP TABLE IF EXISTS `price`;
CREATE TABLE IF NOT EXISTS `price` (
  `movie_Name` varchar(100) NOT NULL,
  `movie_Type` varchar(100) NOT NULL,
  `price_Gold` varchar(100) NOT NULL,
  `price_Silver` varchar(100) NOT NULL,
  `price_Eco` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `price`
--

INSERT INTO `price` (`movie_Name`, `movie_Type`, `price_Gold`, `price_Silver`, `price_Eco`) VALUES
('Overloaded(2018)', 'Hollywood', '300', '200', '100');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
