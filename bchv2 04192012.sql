-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 19, 2012 at 06:10 AM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `bchv2`
--

-- --------------------------------------------------------

--
-- Table structure for table `account_types`
--

CREATE TABLE IF NOT EXISTS `account_types` (
  `account_type_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `account_type_name` varchar(45) NOT NULL,
  `account_type_description` text NOT NULL,
  PRIMARY KEY (`account_type_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC AUTO_INCREMENT=6 ;

--
-- Dumping data for table `account_types`
--

INSERT INTO `account_types` (`account_type_id`, `account_type_name`, `account_type_description`) VALUES
(1, 'Account Owner', 'Has the control and full access of all modules'),
(2, 'Administrative Contact', 'Almost the same with Account owner but has limit with some specific modules'),
(3, 'Technical Contact', ''),
(4, 'Billing Contact', ''),
(5, 'Recruiter', '');

-- --------------------------------------------------------

--
-- Table structure for table `account_type_rights`
--

CREATE TABLE IF NOT EXISTS `account_type_rights` (
  `account_type_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `module_id` int(10) unsigned NOT NULL,
  `module_rights_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`account_type_id`,`module_id`,`module_rights_id`) USING BTREE
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `account_type_rights`
--

INSERT INTO `account_type_rights` (`account_type_id`, `module_id`, `module_rights_id`) VALUES
(1, 2, 1),
(1, 3, 1),
(1, 4, 2),
(1, 4, 3),
(1, 4, 4),
(1, 4, 5),
(1, 4, 6),
(1, 4, 7),
(1, 4, 8),
(1, 4, 9),
(1, 4, 10),
(1, 6, 1),
(1, 6, 2),
(1, 6, 3),
(1, 6, 4),
(1, 6, 5),
(1, 6, 6),
(1, 6, 7),
(1, 6, 8),
(1, 8, 1),
(1, 8, 2),
(1, 8, 3),
(1, 8, 4),
(1, 8, 5),
(1, 8, 6),
(1, 9, 1),
(1, 9, 2),
(1, 9, 3),
(1, 9, 4),
(1, 9, 5),
(1, 9, 6),
(1, 9, 7),
(1, 9, 8),
(1, 9, 9),
(1, 9, 10),
(1, 9, 11),
(1, 9, 12),
(1, 10, 1),
(1, 10, 2),
(1, 10, 3),
(1, 10, 4),
(1, 11, 1),
(1, 11, 2),
(1, 11, 3),
(1, 11, 4),
(1, 11, 5),
(1, 11, 6),
(1, 11, 7),
(1, 11, 8),
(1, 11, 9),
(1, 11, 10),
(1, 13, 1),
(1, 16, 1),
(1, 16, 2),
(1, 17, 1),
(1, 17, 2),
(2, 2, 1),
(2, 3, 1),
(2, 13, 1),
(2, 16, 1),
(2, 16, 2),
(3, 2, 1),
(3, 3, 1),
(3, 16, 1),
(3, 16, 2),
(4, 2, 1),
(4, 3, 1),
(4, 13, 1),
(4, 16, 1),
(4, 16, 2),
(5, 2, 1),
(5, 3, 1),
(5, 16, 1),
(5, 16, 2);

-- --------------------------------------------------------

--
-- Table structure for table `assessments`
--

CREATE TABLE IF NOT EXISTS `assessments` (
  `assessment_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `description` text NOT NULL,
  `exam_ids` varchar(45) NOT NULL COMMENT 'Comma-delimited exam_id',
  `time_limit` int(10) unsigned NOT NULL COMMENT 'Time limit by minutes',
  `retake_interval_days` int(10) unsigned NOT NULL COMMENT 'Interval Retake by days',
  `random_exam` tinyint(1) NOT NULL DEFAULT '0',
  `created_by_user_id` int(10) unsigned NOT NULL,
  `date_created` datetime NOT NULL,
  `date_updated` datetime NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `flag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`assessment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `assessments`
--


-- --------------------------------------------------------

--
-- Table structure for table `assessment_exams`
--

CREATE TABLE IF NOT EXISTS `assessment_exams` (
  `exam_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `exam_title` varchar(45) NOT NULL,
  `instruction` text NOT NULL,
  `created_by_user_id` int(10) unsigned NOT NULL,
  `exam_type_id` int(10) unsigned NOT NULL,
  `random_question` tinyint(1) NOT NULL DEFAULT '0',
  `maximum_question` int(10) unsigned NOT NULL,
  `date_created` datetime NOT NULL,
  `date_updated` datetime NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `flag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`exam_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `assessment_exams`
--


-- --------------------------------------------------------

--
-- Table structure for table `assessment_exams_qa`
--

CREATE TABLE IF NOT EXISTS `assessment_exams_qa` (
  `qa_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `exam_id` int(10) unsigned NOT NULL,
  `question` text NOT NULL,
  `choices` text NOT NULL COMMENT 'serialized array',
  `answers` int(10) unsigned NOT NULL,
  `created_by_user_id` varchar(45) NOT NULL,
  `date_created` datetime NOT NULL,
  `date_updated` datetime NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `flag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`qa_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `assessment_exams_qa`
--


-- --------------------------------------------------------

--
-- Table structure for table `assessment_user_answers`
--

CREATE TABLE IF NOT EXISTS `assessment_user_answers` (
  `user_answer_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `assessment_id` int(10) unsigned NOT NULL,
  `exam_id` int(10) unsigned NOT NULL,
  `user_answers` text NOT NULL COMMENT 'serialized array',
  `score` int(10) unsigned NOT NULL,
  `total_items` int(10) unsigned NOT NULL,
  `correct_items` int(10) unsigned NOT NULL,
  `submitted` int(11) NOT NULL DEFAULT '0',
  `date_started` datetime NOT NULL,
  `date_end` datetime NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `flag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`user_answer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `assessment_user_answers`
--


-- --------------------------------------------------------

--
-- Table structure for table `banners`
--

CREATE TABLE IF NOT EXISTS `banners` (
  `banner_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `posted_by_user_id` int(10) unsigned NOT NULL,
  `title` varchar(100) NOT NULL,
  `banner_picture` varchar(100) NOT NULL,
  `banner_type` enum('TOP','SIDE') NOT NULL,
  `url_link` varchar(50) NOT NULL,
  `date_created` datetime NOT NULL,
  `date_modified` datetime NOT NULL,
  `date_expiry` datetime NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `flag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`banner_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `banners`
--

INSERT INTO `banners` (`banner_id`, `posted_by_user_id`, `title`, `banner_picture`, `banner_type`, `url_link`, `date_created`, `date_modified`, `date_expiry`, `active`, `flag`) VALUES
(1, 0, 'Test Banner', 'SIDE-c81e7-truste.gif', 'SIDE', 'http://bpocareerhub.com', '2012-03-23 06:40:17', '0000-00-00 00:00:00', '2012-05-23 00:00:00', 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `career_applications`
--

CREATE TABLE IF NOT EXISTS `career_applications` (
  `application_id` int(11) NOT NULL AUTO_INCREMENT,
  `career_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `created_date` datetime NOT NULL,
  `modified_date` datetime NOT NULL,
  PRIMARY KEY (`application_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `career_applications`
--


-- --------------------------------------------------------

--
-- Table structure for table `career_posts`
--

CREATE TABLE IF NOT EXISTS `career_posts` (
  `career_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `employer_id` int(10) unsigned NOT NULL,
  `posted_by_user_id` int(10) unsigned NOT NULL,
  `career_title` varchar(100) NOT NULL,
  `hide_company_details` tinyint(1) NOT NULL DEFAULT '0',
  `industry_id` int(11) NOT NULL,
  `industry_sector_id` int(11) NOT NULL,
  `position_level_id` int(10) unsigned NOT NULL,
  `employment_type_id` int(11) NOT NULL,
  `specialization_id` varchar(10) NOT NULL,
  `career_description` text NOT NULL,
  `region_city_code` varchar(10) NOT NULL,
  `salary_code` varchar(10) NOT NULL,
  `year_of_experience_code` varchar(10) NOT NULL,
  `fresh_graduate` tinyint(1) NOT NULL DEFAULT '0',
  `academic_code` varchar(10) NOT NULL,
  `career_post_status_id` int(11) NOT NULL,
  `date_created` datetime NOT NULL,
  `date_post` datetime NOT NULL,
  `date_expire` datetime NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `flag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`career_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `career_posts`
--

INSERT INTO `career_posts` (`career_id`, `employer_id`, `posted_by_user_id`, `career_title`, `hide_company_details`, `industry_id`, `industry_sector_id`, `position_level_id`, `employment_type_id`, `specialization_id`, `career_description`, `region_city_code`, `salary_code`, `year_of_experience_code`, `fresh_graduate`, `academic_code`, `career_post_status_id`, `date_created`, `date_post`, `date_expire`, `active`, `flag`) VALUES
(1, 1, 0, 'asdsadadada', 0, 1, 2, 1, 0, '103', 'asdadadadad', 'NCR', '1', '5', 1, 'HSU', 0, '2012-03-14 05:05:33', '2012-03-14 05:05:33', '2012-04-14 00:00:00', 1, 0),
(2, 1, 0, 'Software Analyst', 0, 1, 3, 1, 0, '101', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc pharetra tellus adipiscing diam euismod id semper arcu aliquam. Etiam porta tellus laoreet felis imperdiet nec egestas risus pretium. Donec vel lacus et lectus lobortis eleifend id sit amet arcu. Donec accumsan ligula eget justo vestibulum volutpat. Praesent eget augue non turpis pretium tempus sit amet sit amet nulla. Cras interdum, arcu vel fermentum pretium, nisi felis fermentum nisi, sed ultrices nulla magna quis dui. In interdum, magna ut malesuada mollis, tellus ipsum consectetur libero, vehicula cursus quam ipsum quis elit. In adipiscing, arcu vitae sodales auctor, urna ipsum ultrices ipsum, vitae commodo enim tellus ac ligula. Aenean elementum facilisis bibendum. Nullam id tortor ligula. Donec auctor adipiscing justo, nec volutpat elit placerat ac. Ut elementum sem et massa porttitor iaculis. Integer sapien ipsum, sollicitudin sit amet tincidunt pulvinar, posuere ac ipsum. Proin ultricies, metus non dignissim tincidunt, sem odio vestibulum orci, sed egestas nibh dolor quis risus. Morbi pretium lorem vitae urna interdum aliquet.\r\n\r\nPhasellus placerat congue malesuada. Aenean sit amet arcu lectus, ac sagittis dolor. Sed varius ante nec enim consectetur ut posuere est aliquet. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Vivamus eget justo neque, ac aliquam magna. Cras vitae dolor et arcu hendrerit facilisis. Vivamus eget sapien ac neque suscipit fermentum.', 'NCR', '1', '5', 1, 'HSU', 0, '0000-00-00 00:00:00', '0000-00-00 00:00:00', '0000-00-00 00:00:00', 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `employers`
--

CREATE TABLE IF NOT EXISTS `employers` (
  `employer_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(100) NOT NULL,
  `tin_number` varchar(45) NOT NULL,
  `sec_number` varchar(45) NOT NULL,
  `account_owner_user_id` int(11) NOT NULL,
  `industry_id` int(11) NOT NULL,
  `industry_sector_id` int(11) NOT NULL,
  `country_code` varchar(10) NOT NULL,
  `office_phone_number` varchar(20) NOT NULL,
  `fax_number` varchar(20) NOT NULL,
  `url_website` varchar(100) NOT NULL,
  `profile_picture` varchar(100) NOT NULL,
  `date_created` datetime NOT NULL,
  `date_modified` datetime NOT NULL,
  `active` int(11) NOT NULL DEFAULT '1',
  `flag` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`employer_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `employers`
--

INSERT INTO `employers` (`employer_id`, `name`, `description`, `tin_number`, `sec_number`, `account_owner_user_id`, `industry_id`, `industry_sector_id`, `country_code`, `office_phone_number`, `fax_number`, `url_website`, `profile_picture`, `date_created`, `date_modified`, `active`, `flag`) VALUES
(1, 'HGS', 'HGS desc', '123456', '123456', 3, 1, 0, '', '', '', 'HGS.com', '', '2012-03-13 02:40:39', '2012-03-13 02:40:39', 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `employer_credits`
--

CREATE TABLE IF NOT EXISTS `employer_credits` (
  `credit_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `employer_id` int(10) unsigned NOT NULL,
  `download_credits` int(10) unsigned NOT NULL,
  `careerpost_credits` int(10) unsigned NOT NULL,
  `date_created` datetime NOT NULL,
  `date_modified` datetime NOT NULL,
  PRIMARY KEY (`credit_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `employer_credits`
--

INSERT INTO `employer_credits` (`credit_id`, `employer_id`, `download_credits`, `careerpost_credits`, `date_created`, `date_modified`) VALUES
(1, 1, 100, 100, '2012-03-13 02:41:20', '2012-03-13 02:41:20');

-- --------------------------------------------------------

--
-- Table structure for table `employer_purchased_profiles`
--

CREATE TABLE IF NOT EXISTS `employer_purchased_profiles` (
  `purchase_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `employer_id` int(10) unsigned NOT NULL,
  `purchased_by_user_id` int(10) unsigned NOT NULL,
  `transaction_id` int(10) unsigned NOT NULL,
  `profile_user_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`purchase_id`,`profile_user_id`,`transaction_id`,`purchased_by_user_id`,`employer_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `employer_purchased_profiles`
--

INSERT INTO `employer_purchased_profiles` (`purchase_id`, `employer_id`, `purchased_by_user_id`, `transaction_id`, `profile_user_id`) VALUES
(1, 1, 3, 0, 5);

-- --------------------------------------------------------

--
-- Table structure for table `groups`
--

CREATE TABLE IF NOT EXISTS `groups` (
  `group_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(45) NOT NULL,
  `flag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `groups`
--

INSERT INTO `groups` (`group_id`, `name`, `description`, `flag`) VALUES
(1, 'Administrator', 'BPO Career Hub Main Administrator Accounts', 0),
(2, 'Career Seeker', 'Formerly known as Job Seekers', 0),
(3, 'Employer Staff', 'Employer accounts', 0),
(4, 'Partner Staff', 'Partners accounts', 0);

-- --------------------------------------------------------

--
-- Table structure for table `group_rights`
--

CREATE TABLE IF NOT EXISTS `group_rights` (
  `group_id` int(10) unsigned NOT NULL,
  `module_id` int(10) unsigned NOT NULL,
  `module_rights_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`group_id`,`module_id`,`module_rights_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `group_rights`
--

INSERT INTO `group_rights` (`group_id`, `module_id`, `module_rights_id`) VALUES
(1, 2, 1),
(1, 3, 1),
(1, 4, 1),
(1, 4, 2),
(1, 4, 3),
(1, 4, 4),
(1, 4, 5),
(1, 4, 6),
(1, 4, 7),
(1, 4, 8),
(1, 4, 9),
(1, 4, 10),
(1, 5, 1),
(1, 5, 2),
(1, 5, 3),
(1, 5, 4),
(1, 5, 5),
(1, 5, 6),
(1, 5, 7),
(1, 5, 8),
(1, 6, 1),
(1, 6, 2),
(1, 6, 3),
(1, 6, 4),
(1, 6, 5),
(1, 6, 6),
(1, 6, 7),
(1, 6, 8),
(1, 8, 1),
(1, 8, 2),
(1, 8, 3),
(1, 8, 4),
(1, 8, 5),
(1, 8, 6),
(1, 9, 1),
(1, 9, 2),
(1, 9, 3),
(1, 9, 4),
(1, 9, 5),
(1, 9, 6),
(1, 9, 7),
(1, 9, 8),
(1, 9, 9),
(1, 9, 10),
(1, 9, 11),
(1, 9, 12),
(1, 9, 13),
(1, 10, 1),
(1, 10, 2),
(1, 10, 3),
(1, 10, 4),
(1, 11, 1),
(1, 11, 2),
(1, 11, 3),
(1, 11, 4),
(1, 11, 5),
(1, 11, 6),
(1, 11, 7),
(1, 11, 8),
(1, 11, 9),
(1, 11, 10),
(1, 12, 1),
(1, 12, 2),
(1, 13, 1),
(1, 16, 1),
(1, 16, 2),
(1, 17, 1),
(1, 17, 2),
(2, 2, 1),
(2, 3, 1),
(2, 6, 1),
(2, 6, 2),
(2, 6, 3),
(2, 6, 4),
(2, 6, 5),
(2, 6, 6),
(2, 6, 7),
(2, 6, 8),
(2, 6, 9),
(2, 6, 10),
(2, 6, 11),
(2, 6, 12),
(2, 6, 13),
(2, 6, 14),
(2, 6, 15),
(2, 10, 1),
(2, 10, 2),
(2, 10, 6);

-- --------------------------------------------------------

--
-- Table structure for table `partners`
--

CREATE TABLE IF NOT EXISTS `partners` (
  `partner_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `reference_code` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `description` varchar(100) NOT NULL,
  `logo` varchar(45) NOT NULL,
  `account_owner_user_id` int(11) NOT NULL,
  `industry_id` int(11) NOT NULL,
  `industry_sector_id` int(11) NOT NULL,
  `profile_picture` varchar(100) NOT NULL,
  `date_created` datetime NOT NULL,
  `date_modified` datetime NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `flag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`partner_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `partners`
--

INSERT INTO `partners` (`partner_id`, `reference_code`, `name`, `description`, `logo`, `account_owner_user_id`, `industry_id`, `industry_sector_id`, `profile_picture`, `date_created`, `date_modified`, `active`, `flag`) VALUES
(1, 'sad', 'asd', 'Lorem Ipsum Dolor', '', 0, 0, 0, '', '2012-03-08 06:17:05', '2012-03-08 06:28:00', 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `partner_registrations`
--

CREATE TABLE IF NOT EXISTS `partner_registrations` (
  `registration_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `partner_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`registration_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `partner_registrations`
--


-- --------------------------------------------------------

--
-- Table structure for table `requisitions`
--

CREATE TABLE IF NOT EXISTS `requisitions` (
  `requisition_id` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `message` varchar(45) NOT NULL,
  `requisition_type` int(11) NOT NULL,
  `posted_by_user_id` int(11) NOT NULL,
  `reply_to_requisition_id` int(11) NOT NULL DEFAULT '0',
  `date_created` datetime NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `flag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`requisition_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `requisitions`
--


-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

CREATE TABLE IF NOT EXISTS `transactions` (
  `transaction_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `transaction_type_id` int(10) unsigned NOT NULL,
  `transaction_by_user_id` int(11) NOT NULL,
  `original_value` int(11) NOT NULL,
  `transaction_value` int(11) NOT NULL,
  `new_value` int(11) NOT NULL,
  `transaction_with` int(11) NOT NULL,
  `date_created` datetime NOT NULL,
  PRIMARY KEY (`transaction_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `transactions`
--


-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `group_id` int(10) unsigned NOT NULL,
  `parent_user_id` int(10) unsigned NOT NULL DEFAULT '0',
  `account_type_id` int(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(50) NOT NULL,
  `date_created` datetime NOT NULL,
  `date_last_login` datetime DEFAULT NULL,
  `activation_code` varchar(45) NOT NULL,
  `activated` tinyint(1) NOT NULL DEFAULT '0',
  `date_activated` datetime DEFAULT NULL,
  `registration_id` int(10) unsigned NOT NULL DEFAULT '0',
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `flag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC AUTO_INCREMENT=71 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `group_id`, `parent_user_id`, `account_type_id`, `email`, `password`, `date_created`, `date_last_login`, `activation_code`, `activated`, `date_activated`, `registration_id`, `active`, `flag`) VALUES
(1, 1, 0, 0, 'admin', 'e10adc3949ba59abbe56e057f20f883e', '2012-03-27 18:20:47', '2012-04-12 17:02:26', '', 0, '0000-00-00 00:00:00', 0, 1, 0),
(2, 2, 0, 0, 'cs', 'e10adc3949ba59abbe56e057f20f883e', '2012-03-27 18:20:47', '2012-04-12 13:03:12', '', 0, '0000-00-00 00:00:00', 0, 1, 0),
(3, 3, 1, 1, 'es', 'e10adc3949ba59abbe56e057f20f883e', '2012-03-27 18:20:47', '2012-04-12 17:29:52', '', 0, '0000-00-00 00:00:00', 0, 1, 0),
(4, 4, 2, 1, 'ps', 'e10adc3949ba59abbe56e057f20f883e', '2012-03-27 18:20:47', '2012-04-12 17:08:43', '', 0, '0000-00-00 00:00:00', 0, 1, 0),
(5, 2, 0, 0, 'cs2', 'e10adc3949ba59abbe56e057f20f883e', '2012-03-27 18:20:47', '0000-00-00 00:00:00', '', 0, '0000-00-00 00:00:00', 0, 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `user_educational_backgrounds`
--

CREATE TABLE IF NOT EXISTS `user_educational_backgrounds` (
  `educational_background_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `institution_name` varchar(45) NOT NULL,
  `field_of_study_code` varchar(45) NOT NULL,
  `academic_id` int(10) unsigned NOT NULL,
  `course` varchar(45) NOT NULL,
  `period_from` date NOT NULL,
  `period_to` date NOT NULL,
  `date_created` datetime NOT NULL,
  `date_modified` datetime NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `flag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`educational_background_id`) USING BTREE
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC AUTO_INCREMENT=4 ;

--
-- Dumping data for table `user_educational_backgrounds`
--

INSERT INTO `user_educational_backgrounds` (`educational_background_id`, `user_id`, `institution_name`, `field_of_study_code`, `academic_id`, `course`, `period_from`, `period_to`, `date_created`, `date_modified`, `active`, `flag`) VALUES
(1, 2, 'UP Diliman', '', 3, 'BCSC', '2002-04-01', '2006-10-01', '0000-00-00 00:00:00', '0000-00-00 00:00:00', 1, 0),
(2, 2, 'De la Salle', '', 2, 'Architect', '1998-04-01', '2002-04-01', '0000-00-00 00:00:00', '0000-00-00 00:00:00', 1, 0),
(3, 3, 'LIPA UNIVERSITY', '', 6, 'Arts', '1998-04-01', '2006-10-01', '0000-00-00 00:00:00', '0000-00-00 00:00:00', 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `user_profile`
--

CREATE TABLE IF NOT EXISTS `user_profile` (
  `user_id` int(10) unsigned NOT NULL,
  `alternate_email` varchar(45) DEFAULT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `middlename` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `date_modified` datetime DEFAULT NULL,
  `gender_code` char(1) DEFAULT NULL,
  `profile_picture` varchar(100) DEFAULT NULL,
  `nationality_code` varchar(45) DEFAULT NULL,
  `phone_number` varchar(40) DEFAULT NULL,
  `mobile_number` varchar(40) DEFAULT NULL,
  `address_details` text,
  `address_city_code` varchar(10) DEFAULT NULL,
  `address_region_code` varchar(10) DEFAULT NULL,
  `address_country_code` varchar(10) DEFAULT NULL,
  `marital_status_code` varchar(10) DEFAULT NULL,
  `source_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_profile`
--

INSERT INTO `user_profile` (`user_id`, `alternate_email`, `firstname`, `middlename`, `lastname`, `date_of_birth`, `date_modified`, `gender_code`, `profile_picture`, `nationality_code`, `phone_number`, `mobile_number`, `address_details`, `address_city_code`, `address_region_code`, `address_country_code`, `marital_status_code`, `source_id`) VALUES
(1, NULL, 'Administrator', 'trator', 'Bartolay', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(2, NULL, 'Career', 'Seeker', 'Bartolay', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(3, NULL, 'Employer', 'Staff', 'Bartolay', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(4, NULL, 'Partners', 'Staff', 'Bartolay', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(5, NULL, 'Ryan', 'Loyola', 'Bartolay', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);

-- --------------------------------------------------------

--
-- Table structure for table `user_profile_detail`
--

CREATE TABLE IF NOT EXISTS `user_profile_detail` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `willing_to_shifting_schedules` tinyint(1) NOT NULL,
  `willing_to_relocate` tinyint(1) NOT NULL,
  `possess_passport` tinyint(1) NOT NULL,
  `willing_to_work_overseas` tinyint(1) NOT NULL,
  `willing_to_holidays_weekends` tinyint(1) NOT NULL,
  `background_check` tinyint(1) NOT NULL,
  `resume_filename` varchar(100) DEFAULT NULL,
  `resume_date_upload` datetime DEFAULT NULL,
  `resume_date_modified` datetime DEFAULT NULL,
  `languages` text,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC AUTO_INCREMENT=71 ;

--
-- Dumping data for table `user_profile_detail`
--


-- --------------------------------------------------------

--
-- Table structure for table `user_profile_summary`
--

CREATE TABLE IF NOT EXISTS `user_profile_summary` (
  `user_id` int(10) unsigned NOT NULL,
  `current_employment_status_id` int(10) unsigned NOT NULL,
  `expected_salary_currency_id` int(10) unsigned NOT NULL,
  `expected_salary` int(10) unsigned NOT NULL,
  `preferred_employment_type_id` int(10) unsigned NOT NULL,
  `preferred_work_location_region_city_id` int(10) unsigned NOT NULL,
  `industry_id` int(11) NOT NULL,
  `industry_sector_id` int(11) NOT NULL,
  `availability_id` int(10) unsigned NOT NULL,
  `years_of_experience_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `user_profile_summary`
--

INSERT INTO `user_profile_summary` (`user_id`, `current_employment_status_id`, `expected_salary_currency_id`, `expected_salary`, `preferred_employment_type_id`, `preferred_work_location_region_city_id`, `industry_id`, `industry_sector_id`, `availability_id`, `years_of_experience_id`) VALUES
(2, 0, 1, 20000, 0, 0, 1, 2, 0, 2),
(5, 0, 1, 0, 0, 0, 1, 1, 0, 3);

-- --------------------------------------------------------

--
-- Table structure for table `user_references`
--

CREATE TABLE IF NOT EXISTS `user_references` (
  `reference_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `firstname` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `position_title` varchar(45) NOT NULL,
  `company_name` varchar(100) NOT NULL,
  `relationship` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `phone_number` varchar(45) NOT NULL,
  `mobile_number` varchar(45) NOT NULL,
  `skype_id` varchar(45) NOT NULL,
  `date_created` datetime NOT NULL,
  `date_modified` datetime NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `flag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`reference_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC AUTO_INCREMENT=1 ;

--
-- Dumping data for table `user_references`
--


-- --------------------------------------------------------

--
-- Table structure for table `user_settings`
--

CREATE TABLE IF NOT EXISTS `user_settings` (
  `user_id` int(10) unsigned NOT NULL,
  `subscribe_newsletter` tinyint(1) NOT NULL DEFAULT '0',
  `profile_visible` tinyint(1) NOT NULL DEFAULT '1',
  `profile_searchable` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `user_settings`
--


-- --------------------------------------------------------

--
-- Table structure for table `user_technical_skills`
--

CREATE TABLE IF NOT EXISTS `user_technical_skills` (
  `technical_skills_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `skill_name` varchar(50) NOT NULL,
  `skill_description` varchar(45) NOT NULL,
  `proficiency_level_id` int(10) unsigned NOT NULL,
  `date_created` datetime NOT NULL,
  `date_modified` datetime NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `flag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`technical_skills_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC AUTO_INCREMENT=1 ;

--
-- Dumping data for table `user_technical_skills`
--


-- --------------------------------------------------------

--
-- Table structure for table `user_work_experiences`
--

CREATE TABLE IF NOT EXISTS `user_work_experiences` (
  `work_experience_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `job_title` varchar(45) NOT NULL,
  `company_name` varchar(100) NOT NULL,
  `position_level_code` varchar(45) NOT NULL,
  `industry_id` int(11) NOT NULL,
  `industry_sector_id` varchar(11) NOT NULL,
  `specialization_code` varchar(45) NOT NULL,
  `salary_code` varchar(45) NOT NULL,
  `job_description` text NOT NULL,
  `present_employment` tinyint(1) NOT NULL,
  `date_employment_from` date NOT NULL,
  `date_employment_to` date NOT NULL,
  `reason_for_leaving` text NOT NULL,
  `date_created` datetime NOT NULL,
  `date_modified` datetime NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `flag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`work_experience_id`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `user_work_experiences`
--

