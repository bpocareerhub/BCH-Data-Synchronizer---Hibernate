-- phpMyAdmin SQL Dump
-- version 3.3.3
-- http://www.phpmyadmin.net
--
-- Host: localhost:3306
-- Generation Time: Mar 22, 2012 at 10:10 PM
-- Server version: 5.1.54
-- PHP Version: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Database: `bch_prod`
--

-- --------------------------------------------------------

--
-- Table structure for table `academic`
--

CREATE TABLE IF NOT EXISTS `academic` (
  `ACAD_CODE` char(5) NOT NULL,
  `ACAD_DESC` varchar(50) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  `SORT` tinyint(2) NOT NULL,
  PRIMARY KEY (`ACAD_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `applicant_career`
--

CREATE TABLE IF NOT EXISTS `applicant_career` (
  `PERSON_ID` int(11) NOT NULL,
  `INDSTRY_SCTR_CODE` varchar(255) NOT NULL,
  `JOB_TYPE_CODE` varchar(255) NOT NULL,
  `REGION_CITY_CODE` varchar(255) NOT NULL,
  `RELOCATE` tinyint(1) NOT NULL,
  `EXP_SLRY_CODE` varchar(5) NOT NULL,
  `TRAVEL` tinyint(1) NOT NULL,
  `AVAIL` tinyint(1) NOT NULL,
  `AVAIL_DATE` tinyint(1) NOT NULL,
  `EXP_LVL_CODE` char(1) NOT NULL,
  `EXP_YR` tinyint(2) DEFAULT NULL,
  `ACHIEVEMENTS` longtext,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`PERSON_ID`,`REGION_CITY_CODE`,`EXP_LVL_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `applicant_company_resume_download`
--

CREATE TABLE IF NOT EXISTS `applicant_company_resume_download` (
  `PERSON_ID` int(11) NOT NULL,
  `COMPANY_ID` int(11) NOT NULL,
  `DATE_VIEWED` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `applicant_educational_background`
--

CREATE TABLE IF NOT EXISTS `applicant_educational_background` (
  `applicant_educational_background_id` int(11) NOT NULL AUTO_INCREMENT,
  `PERSON_ID` int(11) NOT NULL,
  `ACAD_CODE` char(5) NOT NULL,
  `SCHOOL_NAME` varchar(50) NOT NULL,
  `COURSE` varchar(100) NOT NULL,
  `PERIOD_FROM` smallint(4) NOT NULL,
  `PERIOD_TO` smallint(4) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `education_level` char(3) DEFAULT NULL,
  `status` char(3) DEFAULT NULL,
  PRIMARY KEY (`applicant_educational_background_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6576 ;

-- --------------------------------------------------------

--
-- Table structure for table `applicant_job_alert`
--

CREATE TABLE IF NOT EXISTS `applicant_job_alert` (
  `PERSON_ID` int(11) NOT NULL,
  `LAST_RUN` date NOT NULL,
  `NEXT_RUN` date NOT NULL,
  PRIMARY KEY (`PERSON_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `applicant_professional_background`
--

CREATE TABLE IF NOT EXISTS `applicant_professional_background` (
  `applicant_professional_background_id` int(11) NOT NULL AUTO_INCREMENT,
  `PERSON_ID` int(11) NOT NULL,
  `APP_PROF_ID` tinyint(1) NOT NULL DEFAULT '1',
  `JOB_POS` varchar(50) NOT NULL,
  `INDSTRY_SCTR_CODE` char(5) NOT NULL,
  `INDSTRY_SCTR_OTHR` varchar(50) DEFAULT NULL,
  `ACCT_TYPE` varchar(255) DEFAULT NULL,
  `NONVOICE` tinyint(1) NOT NULL,
  `VOICE` tinyint(1) NOT NULL,
  `CMPNY_NAME` varchar(50) NOT NULL,
  `SLRY_CODE` varchar(5) NOT NULL,
  `JOB_DESC` longtext NOT NULL,
  `EMP_PRD_FROM_MONTH` char(3) NOT NULL,
  `EMP_PRD_TO_MONTH` char(3) NOT NULL,
  `EMP_PRD_FROM_YEAR` smallint(4) NOT NULL,
  `EMP_PRD_TO_YEAR` smallint(4) NOT NULL,
  `EMP_PRD_PRESENT` tinyint(1) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`applicant_professional_background_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4227 ;

-- --------------------------------------------------------

--
-- Table structure for table `applicant_resume`
--

CREATE TABLE IF NOT EXISTS `applicant_resume` (
  `RESUME_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PERSON_ID` int(11) NOT NULL,
  `RESUME_FILE` varchar(255) DEFAULT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`RESUME_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3231 ;

-- --------------------------------------------------------

--
-- Table structure for table `applicant_resume_update`
--

CREATE TABLE IF NOT EXISTS `applicant_resume_update` (
  `PERSON_ID` int(11) NOT NULL,
  `MODIFIED_DATE` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `applicant_skills`
--

CREATE TABLE IF NOT EXISTS `applicant_skills` (
  `PERSON_ID` int(11) NOT NULL,
  `LANG_SPOKEN` varchar(255) NOT NULL,
  `LANG_WRITTEN` varchar(255) NOT NULL,
  `SKILLS` longtext,
  `TRAININGS` longtext,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `assessment`
--

CREATE TABLE IF NOT EXISTS `assessment` (
  `ASSESSMENT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PERSON_ID` int(11) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `CONTINUE_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`ASSESSMENT_ID`,`PERSON_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1728 ;

-- --------------------------------------------------------

--
-- Table structure for table `assessments`
--

CREATE TABLE IF NOT EXISTS `assessments` (
  `assessment_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `instruction` text NOT NULL,
  `author_user_id` int(10) unsigned NOT NULL,
  `time_limit` int(10) unsigned NOT NULL,
  `assessment_type_id` varchar(10) NOT NULL,
  `random_question` tinyint(1) NOT NULL,
  `maximum_questions` int(11) NOT NULL,
  `show_results` tinyint(1) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  `date_created` datetime NOT NULL,
  `date_updated` datetime NOT NULL,
  `flag` int(10) unsigned NOT NULL,
  PRIMARY KEY (`assessment_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

-- --------------------------------------------------------

--
-- Table structure for table `assessments_answer_key`
--

CREATE TABLE IF NOT EXISTS `assessments_answer_key` (
  `assessments_answer_key_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `assessment_question_id` int(10) unsigned NOT NULL,
  `answer` int(10) unsigned NOT NULL,
  `answer_description` varchar(45) NOT NULL,
  `created_by_user_id` int(11) NOT NULL,
  `date_created` datetime NOT NULL,
  `date_updated` datetime NOT NULL,
  PRIMARY KEY (`assessments_answer_key_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=251 ;

-- --------------------------------------------------------

--
-- Table structure for table `assessments_qa`
--

CREATE TABLE IF NOT EXISTS `assessments_qa` (
  `assessment_question_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `assessment_id` int(10) unsigned NOT NULL,
  `question` text NOT NULL,
  `choices` text NOT NULL,
  `created_by_user_id` int(11) NOT NULL,
  `date_created` datetime NOT NULL,
  `date_updated` datetime NOT NULL,
  PRIMARY KEY (`assessment_question_id`) USING BTREE
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=251 ;

-- --------------------------------------------------------

--
-- Table structure for table `assessments_series`
--

CREATE TABLE IF NOT EXISTS `assessments_series` (
  `assessments_series_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `description` text NOT NULL,
  `assessments_id` text NOT NULL,
  `assessment_taking_type` varchar(10) NOT NULL,
  `time_limit` int(11) NOT NULL DEFAULT '0',
  `retake_interval` int(11) NOT NULL,
  `number_of_items` int(11) NOT NULL DEFAULT '0',
  `standard_assessment` tinyint(1) NOT NULL DEFAULT '0',
  `random_items` tinyint(1) NOT NULL DEFAULT '0',
  `date_created` datetime NOT NULL,
  `date_updated` datetime NOT NULL,
  `created_by_user_id` int(10) unsigned NOT NULL,
  `flag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`assessments_series_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

-- --------------------------------------------------------

--
-- Table structure for table `assessments_user_answers`
--

CREATE TABLE IF NOT EXISTS `assessments_user_answers` (
  `assessment_user_answers_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `assessments_series_id` int(10) unsigned NOT NULL,
  `assessment_id` int(11) NOT NULL,
  `user_answers` text NOT NULL,
  `score` int(10) unsigned NOT NULL,
  `total_items` int(10) unsigned NOT NULL,
  `correct_items` int(10) unsigned NOT NULL,
  `detailed_score` varchar(250) NOT NULL,
  `number_of_takes` int(11) NOT NULL,
  `submitted` tinyint(1) NOT NULL DEFAULT '0',
  `date_started` datetime NOT NULL,
  `date_end` datetime NOT NULL,
  PRIMARY KEY (`assessment_user_answers_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=98 ;

-- --------------------------------------------------------

--
-- Table structure for table `assessment_answer`
--

CREATE TABLE IF NOT EXISTS `assessment_answer` (
  `ASSESSMENT_ID` int(11) NOT NULL,
  `ASSESSMENT_SET` char(2) NOT NULL,
  `PERSON_ID` int(11) NOT NULL,
  `QUESTION_ID` int(11) NOT NULL,
  `CHOICE_ID` varchar(2) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`PERSON_ID`,`ASSESSMENT_ID`,`QUESTION_ID`,`ASSESSMENT_SET`,`CHOICE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `assessment_answerkey`
--

CREATE TABLE IF NOT EXISTS `assessment_answerkey` (
  `QUESTION_ID` int(11) NOT NULL,
  `CHOICE_ID` varchar(2) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `INACTIVE` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`QUESTION_ID`,`CHOICE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `assessment_choice`
--

CREATE TABLE IF NOT EXISTS `assessment_choice` (
  `QUESTION_ID` int(11) NOT NULL,
  `CHOICE_ID` varchar(2) NOT NULL,
  `DESC` text NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `INACTIVE` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`QUESTION_ID`,`CHOICE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `assessment_question`
--

CREATE TABLE IF NOT EXISTS `assessment_question` (
  `QUESTION_ID` int(11) NOT NULL AUTO_INCREMENT,
  `QUESTION` text NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `INACTIVE` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`QUESTION_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=366 ;

-- --------------------------------------------------------

--
-- Table structure for table `assessment_session`
--

CREATE TABLE IF NOT EXISTS `assessment_session` (
  `ASSESSMENT_SET` char(1) NOT NULL,
  `ASSESSMENT_ID` int(11) NOT NULL,
  `PERSON_ID` int(11) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  PRIMARY KEY (`ASSESSMENT_SET`,`ASSESSMENT_ID`,`PERSON_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `a_job_fairs`
--

CREATE TABLE IF NOT EXISTS `a_job_fairs` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `existing` int(11) NOT NULL DEFAULT '0',
  `FIRST_NAME` varchar(50) NOT NULL,
  `LAST_NAME` varchar(50) NOT NULL,
  `AGE` int(2) NOT NULL,
  `ADDRESS` char(100) NOT NULL,
  `MOBILE_NUM` varchar(25) NOT NULL,
  `PHONE_NUM` varchar(25) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `SCHOOL` varchar(100) NOT NULL,
  `ACAD_CODE` char(5) NOT NULL,
  `COURSE_CODE` char(5) NOT NULL,
  `INDSTRY_CODE` varchar(255) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `EVENT` varchar(50) NOT NULL,
  `GENDER_CODE` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1609 ;

-- --------------------------------------------------------

--
-- Table structure for table `banner_ads`
--

CREATE TABLE IF NOT EXISTS `banner_ads` (
  `ID` int(6) NOT NULL AUTO_INCREMENT,
  `IMAGE_NAME` varchar(255) NOT NULL,
  `LOCATION` varchar(25) DEFAULT NULL,
  `URL` varchar(1255) DEFAULT NULL,
  `INACTIVE` tinyint(1) NOT NULL DEFAULT '0',
  `START_DATE` datetime NOT NULL,
  `EXPIRE_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `IMAGE_NAME` (`IMAGE_NAME`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=22 ;

-- --------------------------------------------------------

--
-- Table structure for table `calendar_months`
--

CREATE TABLE IF NOT EXISTS `calendar_months` (
  `MONTH_CODE` char(3) NOT NULL,
  `MONTH_DESC` varchar(20) NOT NULL,
  `SORT` tinyint(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`MONTH_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `career_counseling`
--

CREATE TABLE IF NOT EXISTS `career_counseling` (
  `CAREER_COUNSELING_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CMPNY_ID` int(11) NOT NULL,
  `COUNSELING_TITLE` varchar(255) NOT NULL,
  `COUNSELING_CONTENT` longtext NOT NULL,
  `PIC` varchar(255) DEFAULT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`CAREER_COUNSELING_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

-- --------------------------------------------------------

--
-- Table structure for table `company_address`
--

CREATE TABLE IF NOT EXISTS `company_address` (
  `CMPNY_ID` int(11) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `COUNTRY_CODE` char(2) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`CMPNY_ID`,`COUNTRY_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `company_contact`
--

CREATE TABLE IF NOT EXISTS `company_contact` (
  `CMPNY_ID` int(11) NOT NULL,
  `PERSON_ID` int(11) NOT NULL,
  `DESIGNATION` varchar(50) NOT NULL,
  `PHONE` varchar(20) NOT NULL,
  `FAX` varchar(20) NOT NULL,
  `C_EMAIL` varchar(125) NOT NULL,
  `CREATED_DATE` datetime DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`CMPNY_ID`,`PERSON_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `company_credits`
--

CREATE TABLE IF NOT EXISTS `company_credits` (
  `CMPNY_ID` int(11) NOT NULL,
  `CREDIT_ID` varchar(255) NOT NULL,
  `ACCOUNT_NUM` varchar(50) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  UNIQUE KEY `CREDIT_ID` (`CREDIT_ID`,`ACCOUNT_NUM`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `company_credits_post`
--

CREATE TABLE IF NOT EXISTS `company_credits_post` (
  `CMPNY_ID` int(11) NOT NULL,
  `CREDIT_ID` varchar(255) NOT NULL,
  `CREDITS` int(4) NOT NULL DEFAULT '0',
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`CREDIT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `company_credits_resume`
--

CREATE TABLE IF NOT EXISTS `company_credits_resume` (
  `CREDIT_RESUME_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CMPNY_ID` int(11) NOT NULL,
  `CREDIT_ID` varchar(255) NOT NULL,
  `CREDITS` smallint(3) unsigned NOT NULL DEFAULT '0',
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`CREDIT_RESUME_ID`,`CMPNY_ID`,`CREDIT_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=371 ;

-- --------------------------------------------------------

--
-- Table structure for table `company_profile`
--

CREATE TABLE IF NOT EXISTS `company_profile` (
  `CMPNY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) NOT NULL,
  `CMPNY_NAME` varchar(100) NOT NULL,
  `CMPNY_DESC` longtext,
  `LOGO` varchar(255) DEFAULT NULL,
  `TIN_NUM` varchar(15) NOT NULL,
  `SEC_NUM` varchar(15) NOT NULL,
  `INDSTRY_SCTR_CODE` char(5) NOT NULL,
  `AUTOSEND_NEWS` tinyint(1) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `WEBSITE` varchar(100) DEFAULT NULL,
  `ALLOW_SOCIAL_SITE` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`CMPNY_ID`,`USER_ID`,`INDSTRY_SCTR_CODE`),
  UNIQUE KEY `CMPNY_NAME` (`CMPNY_NAME`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=521 ;

-- --------------------------------------------------------

--
-- Table structure for table `company_resume_download`
--

CREATE TABLE IF NOT EXISTS `company_resume_download` (
  `RESUME_DL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CMPNY_ID` int(11) NOT NULL,
  `CREDIT_ID` varchar(255) NOT NULL,
  `PERSON_ID` int(11) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  PRIMARY KEY (`RESUME_DL_ID`,`CMPNY_ID`,`CREDIT_ID`,`PERSON_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=590 ;

-- --------------------------------------------------------

--
-- Table structure for table `country`
--

CREATE TABLE IF NOT EXISTS `country` (
  `COUNTRY_CODE` char(2) NOT NULL,
  `COUNTRY_DESC` varchar(50) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  PRIMARY KEY (`COUNTRY_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `employer_hiring`
--

CREATE TABLE IF NOT EXISTS `employer_hiring` (
  `CMPNY_ID` int(11) NOT NULL,
  `CMPNY_NAME` varchar(255) NOT NULL,
  `IMG_FILE` varchar(255) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`CMPNY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `employer_top`
--

CREATE TABLE IF NOT EXISTS `employer_top` (
  `CMPNY_ID` int(11) NOT NULL,
  `CMPNY_NAME` varchar(255) NOT NULL,
  `IMG_FILE` varchar(255) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`CMPNY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `experience_level`
--

CREATE TABLE IF NOT EXISTS `experience_level` (
  `EXP_LVL_CODE` char(1) NOT NULL,
  `EXP_LVL_DESC` varchar(50) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  `SORT` tinyint(2) NOT NULL,
  PRIMARY KEY (`EXP_LVL_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Stand-in structure for view `EXTRACT_FOR_PHPLIST`
--
CREATE TABLE IF NOT EXISTS `EXTRACT_FOR_PHPLIST` (
`Name_exp_1` longtext
);
-- --------------------------------------------------------

--
-- Table structure for table `fb_promo`
--

CREATE TABLE IF NOT EXISTS `fb_promo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(200) NOT NULL,
  `first_name` varchar(200) NOT NULL,
  `last_name` varchar(200) NOT NULL,
  `mobile_number` varchar(50) NOT NULL,
  `date_created` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE IF NOT EXISTS `feedback` (
  `FEEDBACK_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) NOT NULL,
  `MSG` text NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  PRIMARY KEY (`FEEDBACK_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=37 ;

-- --------------------------------------------------------

--
-- Table structure for table `gender`
--

CREATE TABLE IF NOT EXISTS `gender` (
  `GENDER_CODE` char(1) NOT NULL,
  `GENDER_DESC` varchar(25) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  `SORT` tinyint(2) NOT NULL,
  PRIMARY KEY (`GENDER_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `industry`
--

CREATE TABLE IF NOT EXISTS `industry` (
  `INDSTRY_CODE` char(5) NOT NULL,
  `INDSTRY_DESC` varchar(100) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  PRIMARY KEY (`INDSTRY_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `industry_sector`
--

CREATE TABLE IF NOT EXISTS `industry_sector` (
  `INDSTRY_SCTR_CODE` char(5) NOT NULL,
  `INDSTRY_SCTR_DESC` varchar(100) NOT NULL,
  `INDSTRY_CODE` char(5) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  `SORT` tinyint(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`INDSTRY_SCTR_CODE`,`INDSTRY_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `job_level`
--

CREATE TABLE IF NOT EXISTS `job_level` (
  `JOB_LVL_CODE` char(5) NOT NULL,
  `JOB_LVL_DESC` varchar(25) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  `SORT` tinyint(2) NOT NULL,
  PRIMARY KEY (`JOB_LVL_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `job_post`
--

CREATE TABLE IF NOT EXISTS `job_post` (
  `JOB_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CMPNY_ID` int(11) NOT NULL,
  `CMPNY_DESC` longtext,
  `HIDE_CMPNY_DTL` tinyint(1) NOT NULL,
  `JOB_TITLE` varchar(150) NOT NULL,
  `INDSTRY_SCTR_CODE` char(5) NOT NULL,
  `JOB_LVL_CODE` char(5) NOT NULL,
  `JOB_TYPE_CODE` char(5) NOT NULL,
  `JOB_DESC` longtext NOT NULL,
  `REGION_CITY_CODE` char(5) NOT NULL,
  `VACANT_NUM` tinyint(2) DEFAULT NULL,
  `SLRY_CODE` tinyint(2) NOT NULL,
  `SLRY_NEG` tinyint(1) NOT NULL,
  `YR_EXP_CODE` tinyint(2) NOT NULL,
  `FRESH_GRAD` tinyint(1) NOT NULL,
  `ACAD_CODE` char(5) NOT NULL,
  `EMAIL_ALERT` tinyint(1) NOT NULL,
  `EMAIL_TO` varchar(255) DEFAULT NULL,
  `STAT_CODE` char(5) NOT NULL,
  `AUTO_REPOST_INTERVAL` smallint(2) DEFAULT NULL,
  `MAX_REPOST` tinyint(1) DEFAULT NULL,
  `CURRENT_REPOST` tinyint(1) NOT NULL DEFAULT '0',
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `POST_DATE` date DEFAULT NULL,
  `EXPIRE_DATE` date DEFAULT NULL,
  `CREDIT_ID` varchar(255) NOT NULL DEFAULT '',
  `TEMPLATE` char(1) NOT NULL DEFAULT 'A',
  `QUESTIONNAIRE_ID` int(11) NOT NULL,
  `FEATURED` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`JOB_ID`,`CMPNY_ID`,`INDSTRY_SCTR_CODE`,`JOB_LVL_CODE`,`JOB_TYPE_CODE`,`REGION_CITY_CODE`,`SLRY_CODE`,`YR_EXP_CODE`,`STAT_CODE`,`CREDIT_ID`,`TEMPLATE`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1507 ;

-- --------------------------------------------------------

--
-- Table structure for table `job_post_folders`
--

CREATE TABLE IF NOT EXISTS `job_post_folders` (
  `JOB_ID` int(11) NOT NULL,
  `PERSON_ID` int(11) NOT NULL,
  `STAT_CODE` char(5) NOT NULL,
  `READ_STAT` int(1) NOT NULL DEFAULT '0',
  `READ_TIMES` int(2) NOT NULL DEFAULT '0',
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`JOB_ID`,`PERSON_ID`,`STAT_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `job_post_tracklist`
--

CREATE TABLE IF NOT EXISTS `job_post_tracklist` (
  `IP_ADDRESS` varchar(20) NOT NULL,
  `PERSON_ID` int(11) DEFAULT NULL,
  `STAT_CODE` char(50) NOT NULL,
  `JOB_ID` int(11) NOT NULL,
  `EXAM_ID` int(11) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `job_type`
--

CREATE TABLE IF NOT EXISTS `job_type` (
  `JOB_TYPE_CODE` char(5) NOT NULL,
  `JOB_TYPE_DESC` varchar(25) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  `SORT` tinyint(2) NOT NULL,
  PRIMARY KEY (`JOB_TYPE_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marital_status`
--

CREATE TABLE IF NOT EXISTS `marital_status` (
  `MARITAL_STAT_CODE` char(2) NOT NULL,
  `MARITAL_STAT_DESC` varchar(25) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  `SORT` tinyint(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`MARITAL_STAT_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `nationality`
--

CREATE TABLE IF NOT EXISTS `nationality` (
  `NATL_CODE` char(2) NOT NULL,
  `NATL_DESC` varchar(50) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  PRIMARY KEY (`NATL_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `news`
--

CREATE TABLE IF NOT EXISTS `news` (
  `NEWS_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CMPNY_ID` int(11) NOT NULL,
  `NEWS_TITLE` varchar(255) NOT NULL,
  `NEWS_CONTENT` longtext NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `PIC` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`NEWS_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=24 ;

-- --------------------------------------------------------

--
-- Table structure for table `offline_event`
--

CREATE TABLE IF NOT EXISTS `offline_event` (
  `EVENT` varchar(50) NOT NULL,
  `EVENT_DATE` date DEFAULT NULL,
  `EVENT_DESC` varchar(255) DEFAULT NULL,
  `EVENT_LOC` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`EVENT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `offline_reg`
--

CREATE TABLE IF NOT EXISTS `offline_reg` (
  `FIRST_NAME` varchar(50) NOT NULL,
  `MIDDLE_NAME` varchar(50) DEFAULT NULL,
  `LAST_NAME` varchar(50) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `GENDER_CODE` char(1) NOT NULL,
  `BIRTH_DATE` date NOT NULL,
  `PHONE_NUM` varchar(25) NOT NULL,
  `MOBILE_NUM` varchar(25) NOT NULL,
  `INDSTRY_SCTR_CODE` varchar(255) NOT NULL,
  `EXP_LVL_CODE` char(1) NOT NULL,
  `ACAD_CODE` char(5) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `SRCE_CODE` char(5) NOT NULL,
  `EVENT` varchar(50) NOT NULL,
  `PERSON_ID` int(11) DEFAULT NULL COMMENT 'Not empty means that\nthis person has already\ncompleted registration',
  `NOTIFIED` int(11) NOT NULL DEFAULT '0' COMMENT '0 = Not Emailed\n!0 = Emailed N times\n',
  `NOTIFY_DATE` date DEFAULT NULL,
  `INVALID_EMAIL` tinyint(1) NOT NULL DEFAULT '0',
  KEY `fk_offline_reg_1` (`EVENT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE IF NOT EXISTS `person` (
  `PERSON_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) NOT NULL,
  `FIRST_NAME` varchar(50) NOT NULL,
  `MIDDLE_NAME` varchar(50) DEFAULT NULL,
  `LAST_NAME` varchar(50) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SHIFTING_SCHEDULES` tinyint(1) NOT NULL,
  `HOLIDAYS_WEEKENDS` tinyint(1) NOT NULL,
  `WILLING_TO_RELOCATE` tinyint(1) NOT NULL,
  `BACKGROUND_CHECK` tinyint(1) NOT NULL,
  `HIGHEST_EDUCATIONAL_ATTAINMENT` varchar(5) NOT NULL,
  `profile_picture` varchar(50) DEFAULT NULL,
  `send_newsletter` tinyint(1) NOT NULL DEFAULT '0',
  `privacy` tinyint(1) DEFAULT NULL,
  `job_alerts` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`PERSON_ID`,`USER_ID`,`FIRST_NAME`,`LAST_NAME`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21454 ;

-- --------------------------------------------------------

--
-- Table structure for table `person_address`
--

CREATE TABLE IF NOT EXISTS `person_address` (
  `PERSON_ID` int(11) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `COUNTRY_CODE` char(2) NOT NULL,
  `REGION_CITY_CODE` char(5) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`PERSON_ID`,`COUNTRY_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `person_details`
--

CREATE TABLE IF NOT EXISTS `person_details` (
  `PERSON_ID` int(11) NOT NULL,
  `GENDER_CODE` char(1) NOT NULL,
  `HIDE_GENDER` tinyint(1) NOT NULL,
  `BIRTH_DATE` date NOT NULL,
  `HIDE_BIRTH_DATE` tinyint(1) NOT NULL,
  `NATL_CODE` char(2) NOT NULL,
  `MARITAL_STAT_CODE` char(5) NOT NULL,
  `PIC` varchar(255) DEFAULT NULL,
  `VIDEO_FILE` varchar(255) DEFAULT NULL,
  `PRIVATE` tinyint(1) NOT NULL,
  `SEND_MESSAGE` tinyint(1) NOT NULL,
  `SEND_EMAIL_DAILY` tinyint(1) NOT NULL DEFAULT '1',
  `SEND_EMAIL_WEEKLY` tinyint(1) NOT NULL,
  `SEND_NEWS` tinyint(1) NOT NULL DEFAULT '1',
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`PERSON_ID`,`GENDER_CODE`,`NATL_CODE`,`MARITAL_STAT_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `person_phone`
--

CREATE TABLE IF NOT EXISTS `person_phone` (
  `PERSON_ID` int(11) NOT NULL,
  `PHONE_NUM` varchar(25) NOT NULL,
  `MOBILE_NUM` varchar(25) DEFAULT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `questionnaire_choice`
--

CREATE TABLE IF NOT EXISTS `questionnaire_choice` (
  `QC_ID` int(11) NOT NULL AUTO_INCREMENT,
  `QQ_ID` int(11) NOT NULL,
  `CHOICES` text NOT NULL,
  `ANSWERKEY` int(1) NOT NULL,
  PRIMARY KEY (`QC_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

-- --------------------------------------------------------

--
-- Table structure for table `questionnaire_details`
--

CREATE TABLE IF NOT EXISTS `questionnaire_details` (
  `QD_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) NOT NULL,
  `JOBS_ID` int(11) NOT NULL,
  `QD_NAME` varchar(25) NOT NULL,
  `QD_DESC` text NOT NULL,
  `TIME_LIMIT` int(2) NOT NULL,
  `QUESTION_NUMBER` int(3) NOT NULL,
  `QUESTION_TYPE` varchar(6) NOT NULL,
  `QUESTION_CATEGORY` varchar(10) NOT NULL,
  `MODIFIED_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `CREATED_DATE` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `STATUS` int(1) NOT NULL,
  PRIMARY KEY (`QD_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

-- --------------------------------------------------------

--
-- Table structure for table `questionnaire_exam`
--

CREATE TABLE IF NOT EXISTS `questionnaire_exam` (
  `QE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `SESSION_ID` text NOT NULL,
  `QQ_ID` int(11) NOT NULL,
  `APPLICANT_ID` int(11) NOT NULL,
  `JOB_ID` int(11) NOT NULL,
  `DATETIME_EXPIRY` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `DATETIME_ENDED` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `EXAM_DETAILS` text NOT NULL,
  `SESSION_DETAILS` text NOT NULL,
  `ANSWERS` text NOT NULL,
  `STATUS` varchar(5) NOT NULL,
  `SCORE` int(3) NOT NULL,
  PRIMARY KEY (`QE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `questionnaire_question`
--

CREATE TABLE IF NOT EXISTS `questionnaire_question` (
  `QQ_ID` int(11) NOT NULL AUTO_INCREMENT,
  `QD_ID` int(11) NOT NULL,
  `QUESTIONS` text NOT NULL,
  `CREATED_DATE` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`QQ_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

-- --------------------------------------------------------

--
-- Table structure for table `raffle`
--

CREATE TABLE IF NOT EXISTS `raffle` (
  `RAF_CODE` varchar(11) NOT NULL,
  `DESC` varchar(255) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime NOT NULL,
  PRIMARY KEY (`RAF_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `raffle_winner`
--

CREATE TABLE IF NOT EXISTS `raffle_winner` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `RAF_CODE` varchar(11) NOT NULL,
  `USER_ID` int(11) NOT NULL,
  `RAFFLE_ENTRY` varchar(10) NOT NULL,
  `TOP_WINNER` int(11) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1686 ;

-- --------------------------------------------------------

--
-- Table structure for table `referral`
--

CREATE TABLE IF NOT EXISTS `referral` (
  `referral_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `REF_CODE` varchar(255) NOT NULL,
  `REF_LINK` varchar(255) DEFAULT NULL,
  `REF_DESC` varchar(255) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL DEFAULT '0',
  `CREATED_DATE` datetime NOT NULL,
  PRIMARY KEY (`referral_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=136 ;

-- --------------------------------------------------------

--
-- Table structure for table `region`
--

CREATE TABLE IF NOT EXISTS `region` (
  `REGION_CODE` char(5) NOT NULL,
  `REGION_DESC` varchar(50) NOT NULL,
  `SORT` smallint(2) NOT NULL DEFAULT '0',
  `INACTIVE` tinyint(1) NOT NULL,
  PRIMARY KEY (`REGION_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `region_city`
--

CREATE TABLE IF NOT EXISTS `region_city` (
  `REGION_CITY_CODE` char(5) NOT NULL,
  `REGION_CITY_DESC` varchar(50) NOT NULL,
  `REGION_CODE` char(5) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  PRIMARY KEY (`REGION_CITY_CODE`,`REGION_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `remarks`
--

CREATE TABLE IF NOT EXISTS `remarks` (
  `remarks_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `other_status` varchar(50) NOT NULL,
  `remarks` text,
  `created_date` datetime DEFAULT NULL,
  PRIMARY KEY (`remarks_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

CREATE TABLE IF NOT EXISTS `salary` (
  `SLRY_CODE` tinyint(2) NOT NULL,
  `SLRY_DESC` varchar(100) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  `SORT` tinyint(2) NOT NULL,
  PRIMARY KEY (`SLRY_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `security_groups`
--

CREATE TABLE IF NOT EXISTS `security_groups` (
  `GRP_CODE` char(5) NOT NULL,
  `GRP_DESC` varchar(25) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  PRIMARY KEY (`GRP_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `security_menu`
--

CREATE TABLE IF NOT EXISTS `security_menu` (
  `MENU_CODE` varchar(10) NOT NULL,
  `MENU_DESC` varchar(255) NOT NULL,
  `SCREEN_CODE` varchar(10) NOT NULL,
  `GRP_CODE` char(5) NOT NULL,
  `MENU_ACCESS_CODE` char(1) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  `SORT` tinyint(2) NOT NULL DEFAULT '0',
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`MENU_CODE`,`SCREEN_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `security_menu_access`
--

CREATE TABLE IF NOT EXISTS `security_menu_access` (
  `MENU_ACCESS_CODE` char(1) NOT NULL,
  `MENU_ACCESS_DESC` varchar(25) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  PRIMARY KEY (`MENU_ACCESS_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `security_screen`
--

CREATE TABLE IF NOT EXISTS `security_screen` (
  `SCREEN_CODE` varchar(10) NOT NULL,
  `SCREEN_DESC` varchar(255) NOT NULL,
  `MENU_CODE` varchar(10) NOT NULL,
  `SUBMENU_CODE` varchar(10) NOT NULL,
  `PAGE_URL` varchar(255) NOT NULL,
  `GRP_CODE` char(5) NOT NULL,
  `MENU_ACCESS_CODE` char(1) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  `SORT` tinyint(2) NOT NULL DEFAULT '0',
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`SCREEN_CODE`,`MENU_CODE`,`SUBMENU_CODE`,`GRP_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `security_submenu`
--

CREATE TABLE IF NOT EXISTS `security_submenu` (
  `SUBMENU_CODE` varchar(10) NOT NULL,
  `SUBMENU_DESC` varchar(255) NOT NULL,
  `MENU_CODE` varchar(10) NOT NULL,
  `SCREEN_CODE` varchar(10) NOT NULL,
  `GRP_CODE` char(5) NOT NULL,
  `MENU_ACCESS_CODE` char(1) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  `SORT` tinyint(2) NOT NULL DEFAULT '0',
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`SUBMENU_CODE`,`MENU_CODE`,`SCREEN_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `security_users`
--

CREATE TABLE IF NOT EXISTS `security_users` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `GRP_CODE` char(5) NOT NULL,
  `USERNAME` varchar(25) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `ACTIVATION_CODE` varchar(25) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `LAST_UPDATE_DATE` datetime DEFAULT NULL,
  `LAST_LOGIN` datetime DEFAULT NULL,
  `LOGIN_ATTEMPTS` tinyint(1) NOT NULL DEFAULT '5',
  `REF_CODE` varchar(255) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL DEFAULT '1',
  `ACTIVATED` tinyint(1) NOT NULL,
  `INVALID_EMAIL` tinyint(1) NOT NULL DEFAULT '0',
  `ACTIVATION_DATE` datetime DEFAULT NULL,
  `NEW_PASSWORD_FLG` tinyint(1) NOT NULL DEFAULT '0',
  `SRC_CODE` varchar(5) DEFAULT NULL,
  `SRC_SPECIFIC` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`,`GRP_CODE`,`USERNAME`,`EMAIL`,`REF_CODE`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21514 ;

-- --------------------------------------------------------

--
-- Table structure for table `social_networks`
--

CREATE TABLE IF NOT EXISTS `social_networks` (
  `ID` int(12) NOT NULL AUTO_INCREMENT,
  `CODE` varchar(15) NOT NULL,
  `CMPNY_ID` int(11) NOT NULL,
  `URL` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

-- --------------------------------------------------------

--
-- Table structure for table `source`
--

CREATE TABLE IF NOT EXISTS `source` (
  `SRC_CODE` varchar(5) NOT NULL,
  `SRC_DESC` varchar(50) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`SRC_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `status`
--

CREATE TABLE IF NOT EXISTS `status` (
  `STAT_CODE` char(5) NOT NULL,
  `STAT_DESC` varchar(15) NOT NULL,
  PRIMARY KEY (`STAT_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `year_experience`
--

CREATE TABLE IF NOT EXISTS `year_experience` (
  `YR_EXP_CODE` tinyint(2) NOT NULL DEFAULT '0',
  `YR_EXP_DESC` varchar(25) NOT NULL,
  `INACTIVE` tinyint(1) NOT NULL,
  `SORT` tinyint(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`YR_EXP_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure for view `EXTRACT_FOR_PHPLIST`
--
DROP TABLE IF EXISTS `EXTRACT_FOR_PHPLIST`;

CREATE ALGORITHM=UNDEFINED DEFINER=`vlachenal`@`192.168.1.%` SQL SECURITY DEFINER VIEW `EXTRACT_FOR_PHPLIST` AS select concat('INSERT INTO phplist.phplist_user_user (`email`,`confirmed`,`entered`,`modified`,`uniqid`,`htmlemail`,`bouncecount`,`subscribepage`,`rssfrequency`,`password`,`passwordchanged`,`disabled`,`extradata`,`foreignkey`,`blacklisted`) values (\'',`su`.`EMAIL`,'\',1,NOW(),NOW(),`phplist`.`CREATE_UNIQID`(),1,0,0,NULL,NULL,NOW(),0,NULL,NULL,0);') AS `Name_exp_1` from ((`security_users` `su` join `person` `p`) join `person_details` `pd` on(((`su`.`USER_ID` = `p`.`USER_ID`) and (`p`.`PERSON_ID` = `pd`.`PERSON_ID`)))) where ((`su`.`GRP_CODE` = 'EMP') and (`su`.`INVALID_EMAIL` = 0) and (`su`.`ACTIVATED` = 1) and (`su`.`INACTIVE` = 0) and (`pd`.`SEND_NEWS` = 1));

--
-- Constraints for dumped tables
--

--
-- Constraints for table `offline_reg`
--
ALTER TABLE `offline_reg`
  ADD CONSTRAINT `fk_offline_reg_1` FOREIGN KEY (`EVENT`) REFERENCES `offline_event` (`EVENT`) ON DELETE NO ACTION ON UPDATE NO ACTION;
