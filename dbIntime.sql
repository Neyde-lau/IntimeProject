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
  `codigo` INT(255) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `credito` INT(255) DEFAULT NULL,
  `cargaHoraria` INT(255) DEFAULT NULL,
  `regente` VARCHAR(255) DEFAULT NULL,
  `assistente` VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Data for the table `disciplina` */

/*Table structure for table `docente` */

DROP TABLE IF EXISTS `docente`;

CREATE TABLE `docente` (
  `codigo` INT(20) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `categoria` VARCHAR(255) DEFAULT NULL,
  `email` VARCHAR(255) DEFAULT NULL,
  `senha` VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Data for the table `docente` */

/*Table structure for table `horario` */

DROP TABLE IF EXISTS `horario`;

CREATE TABLE `horario` (
  `id` INT(255) NOT NULL AUTO_INCREMENT,
  `codigoTurma` INT(255) NOT NULL,
  `segunda` VARCHAR(255) DEFAULT NULL,
  `terca` VARCHAR(255) DEFAULT NULL,
  `quarta` VARCHAR(255) DEFAULT NULL,
  `quinta` VARCHAR(255) DEFAULT NULL,
  `sexta` VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Data for the table `horario` */

/*Table structure for table `turma` */

DROP TABLE IF EXISTS `turma`;

CREATE TABLE `turma` (
  `codigo` INT(255) NOT NULL AUTO_INCREMENT,
  `curso` VARCHAR(255) NOT NULL,
  `tutor` VARCHAR(255) DEFAULT NULL,
  `nivel` INT(255) DEFAULT NULL,
  `email` VARCHAR(255) DEFAULT NULL,
  `senha` VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Data for the table `turma` */

/*Table structure for table `utilizador` */

DROP TABLE IF EXISTS `utilizador`;

CREATE TABLE `utilizador` (
  `codigo` INT(255) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) DEFAULT NULL,
  `entidade` VARCHAR(255) DEFAULT NULL,
  `senha` VARCHAR(255) DEFAULT NULL,
  `email` VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=INNODB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `utilizador` */

INSERT  INTO `utilizador`(`codigo`,`nome`,`entidade`,`senha`,`email`) VALUES (1,'Ada','Administrador','ada111',NULL),(2,'lua','Docente','lua111',NULL),(3,'Teste','Docente','01',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
