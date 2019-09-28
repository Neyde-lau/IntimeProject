/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.5.5-10.4.6-MariaDB : Database - dbintime
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
  `nome` varchar(255) NOT NULL,
  `categoria` varchar(255) DEFAULT NULL,
  `codigoUtilizador` int(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `fk_codUti` (`codigoUtilizador`),
  CONSTRAINT `fk_codUti` FOREIGN KEY (`codigoUtilizador`) REFERENCES `utilizador` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `docente` */

/*Table structure for table `docentedisciplina` */

DROP TABLE IF EXISTS `docentedisciplina`;

CREATE TABLE `docentedisciplina` (
  `id` int(255) NOT NULL,
  `codigoDocente` int(255) DEFAULT NULL,
  `codigoDisciplina` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_codDisc` (`codigoDisciplina`),
  KEY `fk_codDoc1` (`codigoDocente`),
  CONSTRAINT `fk_codDisc` FOREIGN KEY (`codigoDisciplina`) REFERENCES `disciplina` (`codigo`),
  CONSTRAINT `fk_codDoc1` FOREIGN KEY (`codigoDocente`) REFERENCES `docente` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `docentedisciplina` */

/*Table structure for table `docenteturma` */

DROP TABLE IF EXISTS `docenteturma`;

CREATE TABLE `docenteturma` (
  `id` int(255) NOT NULL,
  `codigoDocente` int(255) DEFAULT NULL,
  `codigoTurma` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_codDoc` (`codigoDocente`),
  KEY `fk_codTurma` (`codigoTurma`),
  CONSTRAINT `fk_codDoc` FOREIGN KEY (`codigoDocente`) REFERENCES `docente` (`codigo`),
  CONSTRAINT `fk_codTurma` FOREIGN KEY (`codigoTurma`) REFERENCES `turma` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `docenteturma` */

/*Table structure for table `horario` */

DROP TABLE IF EXISTS `horario`;

CREATE TABLE `horario` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `codigoTurma` int(255) NOT NULL,
  `segunda` varchar(255) DEFAULT NULL,
  `terca` varchar(255) DEFAULT NULL,
  `quarta` varchar(255) DEFAULT NULL,
  `quinta` varchar(255) DEFAULT NULL,
  `sexta` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `horario` */

/*Table structure for table `turma` */

DROP TABLE IF EXISTS `turma`;

CREATE TABLE `turma` (
  `codigo` int(255) NOT NULL AUTO_INCREMENT,
  `curso` varchar(255) NOT NULL,
  `tutor` varchar(255) DEFAULT NULL,
  `nivel` int(255) DEFAULT NULL,
  `codigoUtilizador` int(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `fk_codUt` (`codigoUtilizador`),
  CONSTRAINT `fk_codUt` FOREIGN KEY (`codigoUtilizador`) REFERENCES `utilizador` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `turma` */

/*Table structure for table `utilizador` */

DROP TABLE IF EXISTS `utilizador`;

CREATE TABLE `utilizador` (
  `codigo` int(255) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `entidade` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `utilizador` */

insert  into `utilizador`(`codigo`,`nome`,`entidade`,`senha`,`email`) values (1,'Ada','Administrador','ada111',NULL),(2,'lua','Docente','lua111',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
