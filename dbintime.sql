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
) ENGINE=INNODB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `disciplina` */

INSERT  INTO `disciplina`(`codigo`,`nome`,`credito`,`cargaHoraria`,`regente`,`assistente`) VALUES (1,'EGO',5,90,'Emilio Mosse','Emilio Mosse'),(3,'FG',6,90,'Ida Alvarinho','Clarinda'),(4,'ADS I',4,120,'Cinquenta','Carlos Cumbana'),(5,'EDA',6,60,'Osvaldo Cossa','Osvaldo Cossa');

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

/*Table structure for table `horariopresencas` */

DROP TABLE IF EXISTS `horariopresencas`;

CREATE TABLE `horariopresencas` (
  `id` INT(255) NOT NULL,
  `codigoTurma` VARCHAR(255) NOT NULL,
  `segunda` VARCHAR(255) DEFAULT NULL,
  `terca` VARCHAR(255) DEFAULT NULL,
  `quarta` VARCHAR(255) DEFAULT NULL,
  `quinta` varchar(255) DEFAULT NULL,
  `sexta` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `horariopresencas` */

/*Table structure for table `notificacoes` */

DROP TABLE IF EXISTS `notificacoes`;

CREATE TABLE `notificacoes` (
  `codigo` int(255) NOT NULL,
  `destinatario` varchar(255) DEFAULT NULL,
  `assunto` varchar(500) DEFAULT NULL,
  `corpo` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `notificacoes` */

/*Table structure for table `turma` */

DROP TABLE IF EXISTS `turma`;

CREATE TABLE `turma` (
  `codigo` int(255) NOT NULL AUTO_INCREMENT,
  `curso` varchar(255) NOT NULL,
  `tutor` varchar(255) DEFAULT NULL,
  `regime` varchar(255) DEFAULT NULL,
  `nivel` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `turma` */

insert  into `turma`(`codigo`,`curso`,`tutor`,`regime`,`nivel`,`email`) values (1,'CIG','Paula','Laboral','I','Paula@gmail.com');

/*Table structure for table `utilizador` */

DROP TABLE IF EXISTS `utilizador`;

CREATE TABLE `utilizador` (
  `codigo` int(255) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `entidade` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `utilizador` */

insert  into `utilizador`(`codigo`,`nome`,`entidade`,`senha`,`email`) values (1,'Ada','Administrador','ada111',NULL),(2,'lua','Docente','lua111',NULL),(3,'Teste','Docente','01',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
