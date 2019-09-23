/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.7.14 : Database - dbintime
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dbintime` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `dbintime`;

/*Table structure for table `disciplina` */

DROP TABLE IF EXISTS `disciplina`;

CREATE TABLE `disciplina` (
  `codigo` int(20) NOT NULL AUTO_INCREMENT,
  `nomeDisciplina` varchar(255) NOT NULL,
  `credito` int(20) DEFAULT NULL,
  `cargaHoraria` int(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `disciplina` */

/*Table structure for table `docente` */

DROP TABLE IF EXISTS `docente`;

CREATE TABLE `docente` (
  `codigo` int(20) NOT NULL AUTO_INCREMENT,
  `nomeDocente` varchar(255) NOT NULL,
  `categoria` varchar(255) DEFAULT NULL,
  `nivel` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `docente` */

/*Table structure for table `turma` */

DROP TABLE IF EXISTS `turma`;

CREATE TABLE `turma` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nomeTurma` varchar(255) NOT NULL,
  `nivel` int(3) DEFAULT NULL,
  `tutor` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `turma` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
