/*
SQLyog Community v8.53 
MySQL - 5.5.36 : Database - bdrencontre
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bdrencontre` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bdrencontre`;

/*Table structure for table `categorie` */

DROP TABLE IF EXISTS `categorie`;

CREATE TABLE `categorie` (
  `categorieId` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`categorieId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `categorie` */

insert  into `categorie`(`categorieId`,`description`) values (1,'homme cherche femme'),(2,'femme cherche homme'),(3,'homme cherche homme'),(4,'femme cherche femme'),(5,'homme cherche couple'),(6,'femme cherche couple'),(7,'couple cherche couple'),(8,'tous'),(9,'autre');

/*Table structure for table `city` */

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `city` */

insert  into `city`(`id`,`nom`) values (1,'Montréal'),(2,'Québec'),(3,'Vancouver'),(4,'Ottawa'),(5,'Toronto'),(6,'Laval'),(7,'Sherbrooke'),(8,'Longueil');

/*Table structure for table `clinsdoeil` */

DROP TABLE IF EXISTS `clinsdoeil`;

CREATE TABLE `clinsdoeil` (
  `clindoeilid` bigint(20) NOT NULL AUTO_INCREMENT,
  `from` bigint(20) NOT NULL,
  `to` bigint(20) NOT NULL,
  `dateEnvoi` datetime DEFAULT NULL,
  PRIMARY KEY (`clindoeilid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `clinsdoeil` */

insert  into `clinsdoeil`(`clindoeilid`,`from`,`to`,`dateEnvoi`) values (4,13,9,'2009-09-30 14:11:59'),(5,1,10,'2011-02-15 00:00:00'),(6,1,6,'2011-02-17 16:22:25');

/*Table structure for table `eye_color` */

DROP TABLE IF EXISTS `eye_color`;

CREATE TABLE `eye_color` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `eye_color` */

insert  into `eye_color`(`id`,`description`) values (1,'bleu'),(2,'vert'),(3,'brun');

/*Table structure for table `favoris` */

DROP TABLE IF EXISTS `favoris`;

CREATE TABLE `favoris` (
  `favorisID` bigint(20) NOT NULL AUTO_INCREMENT,
  `dateAjout` datetime DEFAULT NULL,
  `membreFavorisant` bigint(20) NOT NULL COMMENT 'le propriétaire de ce favori',
  `membreFavorise` bigint(20) NOT NULL COMMENT 'le membre ayant été ajouté comme favori',
  PRIMARY KEY (`favorisID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `favoris` */

insert  into `favoris`(`favorisID`,`dateAjout`,`membreFavorisant`,`membreFavorise`) values (1,'2009-09-30 14:12:07',13,9),(2,'2011-02-15 00:00:00',1,10);

/*Table structure for table `hair_color` */

DROP TABLE IF EXISTS `hair_color`;

CREATE TABLE `hair_color` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `hair_color` */

insert  into `hair_color`(`id`,`description`) values (1,'noir'),(2,'rouge'),(3,'blond'),(4,'blanc'),(5,'chauve'),(6,'brun'),(7,'girs');

/*Table structure for table `height_range` */

DROP TABLE IF EXISTS `height_range`;

CREATE TABLE `height_range` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `start_range` int(11) NOT NULL,
  `end_range` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `height_range` */

insert  into `height_range`(`id`,`start_range`,`end_range`) values (1,130,150),(2,151,170),(3,171,190),(4,191,250);

/*Table structure for table `hobby` */

DROP TABLE IF EXISTS `hobby`;

CREATE TABLE `hobby` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `hobby` */

/*Table structure for table `membre` */

DROP TABLE IF EXISTS `membre`;

CREATE TABLE `membre` (
  `membreId` bigint(20) NOT NULL AUTO_INCREMENT,
  `nom` varchar(40) NOT NULL,
  `prenom` varchar(40) NOT NULL,
  `age` int(3) NOT NULL,
  `description` varchar(3000) DEFAULT NULL,
  `categorieId` bigint(20) NOT NULL,
  `isOnline` tinyint(1) DEFAULT '0',
  `niveauMembreId` bigint(20) NOT NULL,
  `lastVisit` datetime DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(15) NOT NULL,
  `pseudo` varchar(15) NOT NULL,
  `sexe` char(1) DEFAULT NULL,
  `notification` bit(1) DEFAULT NULL,
  `hair_color_id` int(11) NOT NULL,
  `skin_color_id` int(11) NOT NULL,
  `eye_color_id` int(11) NOT NULL,
  `height` int(11) NOT NULL,
  `weight_range_id` int(11) NOT NULL,
  `city_id` int(11) NOT NULL,
  `smoke` tinyint(1) NOT NULL,
  `status_id` int(11) NOT NULL,
  PRIMARY KEY (`membreId`,`pseudo`),
  KEY `fk_membre_categorie` (`categorieId`),
  KEY `fk_membre_niveauxMembres` (`niveauMembreId`),
  CONSTRAINT `fk_membre_categorie` FOREIGN KEY (`categorieId`) REFERENCES `categorie` (`categorieId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_membre_niveauxMembres` FOREIGN KEY (`niveauMembreId`) REFERENCES `niveaumembres` (`niveauMembreId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `membre` */

insert  into `membre`(`membreId`,`nom`,`prenom`,`age`,`description`,`categorieId`,`isOnline`,`niveauMembreId`,`lastVisit`,`email`,`password`,`pseudo`,`sexe`,`notification`,`hair_color_id`,`skin_color_id`,`eye_color_id`,`height`,`weight_range_id`,`city_id`,`smoke`,`status_id`) values (1,'LeBob','bob',30,'une desc de bob',1,1,3,'2011-02-17 16:20:16','bob@gmail.com','123456','beaubob',NULL,NULL,0,0,0,0,0,0,0,0),(2,'drolet','dominic',40,'une desc de dom',2,0,3,NULL,'dominic@dominic.com','12345','',NULL,NULL,0,0,0,0,0,0,0,0),(3,'proulx','daniel',20,'une desc de dan',3,0,2,NULL,'daniel@daniel.com','12345','',NULL,NULL,0,0,0,0,0,0,0,0),(4,'marchildon','rock',30,'une desc de rock',4,0,2,NULL,'rock@rock.com','12345','',NULL,NULL,0,0,0,0,0,0,0,0),(5,'Magnagna','albert',30,'une desc de albert',1,0,2,NULL,'albert@albert.com','2','',NULL,NULL,0,0,0,0,0,0,0,0),(6,'Hajj','Toufic',30,'une desc de toufic',2,0,3,NULL,'toufic@toufic.com','3','',NULL,NULL,0,0,0,0,0,0,0,0),(7,'proulx','daniel',30,'une desc de dan',3,0,2,NULL,'4','4','',NULL,NULL,0,0,0,0,0,0,0,0),(8,'hajj','toufic',30,'une desc de toufic',1,0,2,NULL,'5','2','',NULL,NULL,0,0,0,0,0,0,0,0),(9,'drolet','dominic',30,'une desc de dom',2,0,3,NULL,'6','3','',NULL,NULL,0,0,0,0,0,0,0,0),(10,'proulx','daniel',30,'une desc de dan',3,0,2,NULL,'7','4','',NULL,NULL,0,0,0,0,0,0,0,0),(11,'hajj','toufic',30,'une desc de toufic',1,0,2,NULL,'8','2','',NULL,NULL,0,0,0,0,0,0,0,0),(12,'drolet','dominic',30,'une desc de dom',2,0,3,NULL,'9','3','',NULL,NULL,0,0,0,0,0,0,0,0),(13,'marchildon','rock',40,'<p>bel &eacute;talon</p>',1,0,3,'2009-10-02 09:18:14','rockmarch@gmail.com','123456','',NULL,NULL,0,0,0,0,0,0,0,0),(14,'march','rock',55,'jhkjhkjhjkhjkh kjhkhk kh<b>aaaa</b> knkn',1,1,3,'2010-11-17 11:03:31','rockmarch@gamil.com','','rock',NULL,NULL,0,0,0,0,0,0,0,0);

/*Table structure for table `messages` */

DROP TABLE IF EXISTS `messages`;

CREATE TABLE `messages` (
  `messageid` bigint(20) NOT NULL AUTO_INCREMENT,
  `msgFrom` bigint(20) NOT NULL,
  `msgTo` bigint(20) NOT NULL,
  `replyToMsgId` bigint(20) DEFAULT NULL COMMENT 'le msg auquel ce msg est une réponse',
  `sendDate` datetime NOT NULL,
  `message` varchar(5000) DEFAULT NULL,
  `dejaLu` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`messageid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `messages` */

insert  into `messages`(`messageid`,`msgFrom`,`msgTo`,`replyToMsgId`,`sendDate`,`message`,`dejaLu`) values (1,3,1,3,'2012-07-09 00:00:00','un message envoye',0),(2,4,1,3,'2015-05-09 00:00:00','un second messages envoye',1),(3,3,1,3,'2017-07-09 00:00:00','un 3eme messages envoye',0),(4,2,1,3,'2020-08-09 00:00:00','un 4eme messages envoye',1),(5,13,3,-1,'2010-11-17 11:08:48','BMBMNBMNB',0),(6,13,3,-1,'2010-11-17 11:08:53','BMBMNBMNB',0),(7,13,3,-1,'2010-11-17 11:08:55','BMBMNBMNB',0);

/*Table structure for table `niveaumembres` */

DROP TABLE IF EXISTS `niveaumembres`;

CREATE TABLE `niveaumembres` (
  `niveauMembreId` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(100) DEFAULT NULL,
  `nbPhotosMax` int(11) NOT NULL,
  `nbFavorisMax` int(11) NOT NULL,
  `droitEnvoyerMsg` tinyint(1) NOT NULL,
  PRIMARY KEY (`niveauMembreId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `niveaumembres` */

insert  into `niveaumembres`(`niveauMembreId`,`description`,`nbPhotosMax`,`nbFavorisMax`,`droitEnvoyerMsg`) values (1,'visiteur',1,5,0),(2,'membre régulier',5,25,1),(3,'membre privilège',15,100,1);

/*Table structure for table `photos` */

DROP TABLE IF EXISTS `photos`;

CREATE TABLE `photos` (
  `photoid` bigint(11) NOT NULL AUTO_INCREMENT,
  `membreId` bigint(20) NOT NULL,
  `chemin` varchar(255) NOT NULL,
  `isprofil` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`photoid`),
  KEY `fk_photos_membre` (`membreId`),
  CONSTRAINT `fk_photos_membre` FOREIGN KEY (`membreId`) REFERENCES `membre` (`membreId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

/*Data for the table `photos` */

insert  into `photos`(`photoid`,`membreId`,`chemin`,`isprofil`) values (1,1,'/images/members/pic1.jpg',1),(2,1,'/images/members/pic13.jpg',0),(3,1,'/images/members/pic14.jpg',0),(4,1,'/images/members/pic15.jpg',0),(5,1,'/images/members/pic19.jpg',0),(6,1,'/images/members/pic20.jpg',0),(7,2,'/images/members/pic2.jpg',1),(8,2,'/images/members/pic16.jpg',0),(9,2,'/images/members/pic17.jpg',0),(10,2,'/images/members/pic18.jpg',0),(11,3,'/images/members/pic3.jpg',1),(12,4,'/images/members/pic4.jpg',1),(13,5,'/images/members/pic5.jpg',1),(14,6,'/images/members/pic6.jpg',1),(15,7,'/images/members/pic7.jpg',1),(16,8,'/images/members/pic8.jpg',1),(17,9,'/images/members/pic9.jpg',1),(18,10,'/images/members/pic10.jpg',1),(19,11,'/images/members/pic11.jpg',1),(20,12,'/images/members/pic12.jpg',1),(21,13,'/images/members/7127697Winter.jpg',1),(22,13,'/images/members/2951132Water lilies.jpg',0),(23,14,'images/bart.jpg',1);

/*Table structure for table `skin_color` */

DROP TABLE IF EXISTS `skin_color`;

CREATE TABLE `skin_color` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `skin_color` */

insert  into `skin_color`(`id`,`description`) values (1,'blanc'),(2,'noir'),(3,'asian');

/*Table structure for table `status` */

DROP TABLE IF EXISTS `status`;

CREATE TABLE `status` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `status` */

insert  into `status`(`id`,`description`) values (1,'celibataire'),(2,'marié(e)'),(3,'divorcé'),(4,'veuf(ve)');

/*Table structure for table `user_hobby_link` */

DROP TABLE IF EXISTS `user_hobby_link`;

CREATE TABLE `user_hobby_link` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `hobby_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_hobby_link` */

/*Table structure for table `weight_range` */

DROP TABLE IF EXISTS `weight_range`;

CREATE TABLE `weight_range` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `weight_range` */

insert  into `weight_range`(`id`,`description`) values (1,'mince'),(2,'normal'),(3,'musculé');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
