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
  `regente` varchar(100) DEFAULT NULL,
  `assistente` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  CONSTRAINT `docente` FOREIGN KEY (`codigo`) REFERENCES `docente` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `disciplina` */

/*Table structure for table `docente` */

DROP TABLE IF EXISTS `docente`;

CREATE TABLE `docente` (
  `codigo` int(20) NOT NULL AUTO_INCREMENT,
  `nomeDocente` varchar(255) NOT NULL,
  `categoria` varchar(255) DEFAULT NULL,
  `nivel` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `docente` */

insert  into `docente`(`codigo`,`nomeDocente`,`categoria`,`nivel`) values (8,'Ada','Assistente',NULL),(9,'Paula','Regelnte',NULL),(10,'Eddie','Regelnte',NULL),(12,' mm','Regelnte',NULL),(13,' ll','Assistente',NULL),(14,' kk','Assistente','Licenciado');

/*Table structure for table `horario` */

DROP TABLE IF EXISTS `horario`;

CREATE TABLE `horario` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `semestre` varchar(2) NOT NULL,
  `ano` int(4) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  CONSTRAINT `codigoTurma` FOREIGN KEY (`codigo`) REFERENCES `turma` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `horario` */

/*Table structure for table `turma` */

DROP TABLE IF EXISTS `turma`;

CREATE TABLE `turma` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `curso` varchar(255) NOT NULL,
  `regime` varchar(255) DEFAULT NULL,
  `nivel` int(20) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `turma` */

/*Table structure for table `utilizador` */

DROP TABLE IF EXISTS `utilizador`;

CREATE TABLE `utilizador` (
  `codigo` int(200) NOT NULL AUTO_INCREMENT,
  `nomeUser` varchar(200) DEFAULT NULL,
  `entidade` varchar(200) DEFAULT NULL,
  `senha` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `utilizador` */

insert  into `utilizador`(`codigo`,`nomeUser`,`entidade`,`senha`) values (1,'Ada','Administrador','ada111'),(2,'lua','Docente','lua111');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
