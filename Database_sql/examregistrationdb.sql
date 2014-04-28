-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 26, 2014 at 08:04 PM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `examregistrationdb`
--
CREATE DATABASE IF NOT EXISTS `examregistrationdb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `examregistrationdb`;

-- --------------------------------------------------------

--
-- Table structure for table `enroll`
--

CREATE TABLE IF NOT EXISTS `enroll` (
  `student_id` varchar(20) NOT NULL,
  `section_id` int(20) NOT NULL,
  `desk_no` int(10) NOT NULL DEFAULT '-1',
  KEY `student_id` (`student_id`,`section_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `exam`
--

CREATE TABLE IF NOT EXISTS `exam` (
  `exam_id` int(20) NOT NULL AUTO_INCREMENT,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  PRIMARY KEY (`exam_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `session`
--

CREATE TABLE IF NOT EXISTS `session` (
  `session_id` int(20) NOT NULL AUTO_INCREMENT,
  `class_info` varchar(20) NOT NULL DEFAULT '?',
  `dateandtime` date DEFAULT NULL,
  `exam_id` int(20) NOT NULL,
  PRIMARY KEY (`session_id`),
  KEY `exam_id` (`exam_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `SSN` varchar(15) NOT NULL,
  `first_name` varchar(20) NOT NULL DEFAULT '?',
  `last_name` varchar(20) NOT NULL DEFAULT '?',
  `term` varchar(3) NOT NULL DEFAULT '?',
  `email` varchar(20) NOT NULL DEFAULT '?',
  `phone_number` varchar(20) NOT NULL DEFAULT '?',
  `school` varchar(20) NOT NULL DEFAULT '?',
  PRIMARY KEY (`SSN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE IF NOT EXISTS `teacher` (
  `ssn` varchar(20) NOT NULL,
  `first_name` varchar(20) NOT NULL DEFAULT '?',
  `last_name` varchar(20) NOT NULL DEFAULT '?',
  `phone_number` varchar(20) NOT NULL DEFAULT '?',
  `department` varchar(20) NOT NULL DEFAULT '?',
  `hasjob` int(1) NOT NULL DEFAULT '0',
  `session_id` int(20) NOT NULL,
  PRIMARY KEY (`ssn`),
  KEY `session_id` (`session_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `session`
--
ALTER TABLE `session`
  ADD CONSTRAINT `exam_id_cons` FOREIGN KEY (`exam_id`) REFERENCES `exam` (`exam_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `teacher`
--
ALTER TABLE `teacher`
  ADD CONSTRAINT `session_id_cons` FOREIGN KEY (`session_id`) REFERENCES `session` (`session_id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
