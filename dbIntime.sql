DROP TABLE IF EXISTS `utilizador`;

CREATE TABLE `utilizador` (
  `codigo` INT(200) NOT NULL AUTO_INCREMENT,
  `nomeUser` VARCHAR(200) DEFAULT NULL,
  `entidade` VARCHAR(200) DEFAULT NULL,
  `senha` VARCHAR(200) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=INNODB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `utilizador` */

INSERT  INTO `utilizador`(`codigo`,`nomeUser`,`entidade`,`senha`) VALUES (1,'Ada','Administrador','ada111'),(2,'lua','Docente','lua111');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
