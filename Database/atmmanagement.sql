-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 22, 2020 at 05:52 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `atmmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `bank`
--

CREATE TABLE `bank` (
  `pin` varchar(10) NOT NULL,
  `deposit` varchar(10) NOT NULL,
  `widhdraw` varchar(10) NOT NULL,
  `balance` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `form1`
--

CREATE TABLE `form1` (
  `name` varchar(15) NOT NULL,
  `fname` varchar(15) NOT NULL,
  `date` varchar(3) NOT NULL,
  `month` varchar(20) NOT NULL,
  `year` varchar(5) NOT NULL,
  `gender` varchar(7) NOT NULL,
  `email` varchar(22) NOT NULL,
  `marital` varchar(10) NOT NULL,
  `address` varchar(30) NOT NULL,
  `city` varchar(20) NOT NULL,
  `pincode` varchar(6) NOT NULL,
  `state` varchar(20) NOT NULL,
  `fno` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `form1`
--

INSERT INTO `form1` (`name`, `fname`, `date`, `month`, `year`, `gender`, `email`, `marital`, `address`, `city`, `pincode`, `state`, `fno`) VALUES
('Rahul Jha', 'MK Jha', '1', 'January', '2020', 'Male', 'rag@gmail.com', 'Unmarried', 'ssdsds', 'czvcv', 'cvcvc', 'nvbv', '4265'),
('Rahul Jha', 'Mati Kant Jha', '1', 'January', '2020', 'Male', 'rahuljha3246@gmail.com', 'Married', 'Banarhat Dhramsala Road', 'Jalpaiguri', '735202', 'West Bengal', '7326'),
('Rahul Jha', 'Mati K Jha', '4', 'November', '2005', 'Male', 'rahuljha3246@gmail.com', 'Unmarried', 'Jalpaiguri Banarhat', 'Jalpaiguri', '735202', 'West Bengal', '5745'),
('Rahul Jha', 'Mata K Jha', '4', 'November', '2005', 'Male', 'klrahul3246@gmail.com', 'Unmarried', 'Banarhat', 'Jalpaiguri', '735202', 'West Bengal', '1276'),
('Rahul Jha', 'Mati K Jha', '4', 'November', '2005', 'Male', 'kl@gmail.com', 'Married', 'Banarhat', 'Jalpaiguri', '735202', 'West Bengal', '272');

-- --------------------------------------------------------

--
-- Table structure for table `form2`
--

CREATE TABLE `form2` (
  `fno` varchar(4) NOT NULL,
  `religion` varchar(20) NOT NULL,
  `category` varchar(20) NOT NULL,
  `income` varchar(20) NOT NULL,
  `qualification` varchar(20) NOT NULL,
  `ocupation` varchar(20) NOT NULL,
  `nationality` varchar(20) NOT NULL,
  `pan` varchar(20) NOT NULL,
  `adhar` varchar(20) NOT NULL,
  `citizen` varchar(20) NOT NULL,
  `account` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `form2`
--

INSERT INTO `form2` (`fno`, `religion`, `category`, `income`, `qualification`, `ocupation`, `nationality`, `pan`, `adhar`, `citizen`, `account`) VALUES
('12', 'Hindu', 'General', 'Null', 'Graduate', 'Student', 'Migrate', 'SDA', 'DSAD', 'No', 'No'),
('1276', 'Hindu', 'General', '0-10000', 'Non-Graduate', 'Student', 'Indian', 'BSIPJ7155C', '3322 9652 3698', 'Yes', 'Yes'),
('272', 'Hindu', 'General', '0-10000', 'Non-Graduate', 'Student', 'Indian', 'LKJHG67U', '4135 2587 3698', 'Yes', 'Yes');

-- --------------------------------------------------------

--
-- Table structure for table `form3`
--

CREATE TABLE `form3` (
  `AccountType` varchar(20) NOT NULL,
  `CardNo` varchar(20) NOT NULL,
  `PIN` varchar(20) NOT NULL,
  `Service` varchar(20) NOT NULL,
  `fno` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `form3`
--

INSERT INTO `form3` (`AccountType`, `CardNo`, `PIN`, `Service`, `fno`) VALUES
('null', '45678988139922', '1000', 'ATM CARD', ''),
('Savings Account', '45678893726350', '240', 'ATM CARD', '1276'),
('Savings Account', '45678989931163', '1004', 'MOBILE BANKING', '');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `cardno` varchar(16) NOT NULL,
  `pin` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`cardno`, `pin`) VALUES
('45678988139922', '1000'),
('45678893726350', '240'),
('45678989931163', '1004');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
