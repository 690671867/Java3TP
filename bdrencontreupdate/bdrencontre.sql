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

insert  into `categorie`(`categorieId`,`description`) values (1,'homme '),(2,'femme '),(3,'couple'),(4,'bisexuel'),(5,'transexuel');

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
  `fromId` bigint(20) NOT NULL,
  `toId` bigint(20) NOT NULL,
  `dateEnvoi` datetime DEFAULT NULL,
  PRIMARY KEY (`clindoeilid`),
  KEY `fromId` (`fromId`),
  KEY `toId` (`toId`),
  CONSTRAINT `clinsdoeil_ibfk_2` FOREIGN KEY (`toId`) REFERENCES `membre` (`membreId`),
  CONSTRAINT `clinsdoeil_ibfk_1` FOREIGN KEY (`fromId`) REFERENCES `membre` (`membreId`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

/*Data for the table `clinsdoeil` */

insert  into `clinsdoeil`(`clindoeilid`,`fromId`,`toId`,`dateEnvoi`) values (1,1,2,'2014-06-11 03:11:14'),(2,2,5,'2014-07-01 04:18:31'),(3,3,5,'2014-07-08 04:16:17'),(4,5,6,'2014-07-05 09:20:06'),(5,1,6,'2014-07-02 00:00:00'),(6,1,6,'2011-02-17 16:22:25'),(7,4,1,'2014-07-04 12:09:35'),(8,6,3,'2014-06-04 05:20:00'),(9,6,4,'2014-07-01 03:07:15'),(10,4,5,'2014-07-10 05:13:15'),(11,7,8,'2014-07-02 07:14:12'),(12,9,10,'2014-07-10 06:00:00'),(13,11,12,'2014-07-05 00:19:12'),(14,8,2,'2014-07-11 04:00:13'),(15,10,7,'2014-07-09 03:00:13'),(16,12,9,'2014-07-03 00:18:00'),(17,9,11,'2014-07-02 00:13:00');

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
  PRIMARY KEY (`favorisID`),
  KEY `membreFavorisant` (`membreFavorisant`),
  KEY `membreFavorise` (`membreFavorise`),
  CONSTRAINT `favoris_ibfk_2` FOREIGN KEY (`membreFavorise`) REFERENCES `membre` (`membreId`),
  CONSTRAINT `favoris_ibfk_1` FOREIGN KEY (`membreFavorisant`) REFERENCES `membre` (`membreId`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;

/*Data for the table `favoris` */

insert  into `favoris`(`favorisID`,`dateAjout`,`membreFavorisant`,`membreFavorise`) values (1,'2014-07-01 04:08:08',1,2),(2,'2014-07-03 04:09:08',2,3),(3,'2014-07-04 02:11:07',4,5),(4,'2014-07-09 01:07:13',6,1),(5,'2014-07-07 10:15:16',3,4),(6,'2014-07-09 06:11:00',5,6),(7,'2014-07-02 17:40:30',1,3),(8,'2014-07-03 03:07:36',2,6),(9,'2014-07-10 10:11:18',4,1),(10,'2014-07-04 00:00:00',3,2),(11,'2014-07-02 04:11:23',7,8),(12,'2014-07-05 04:16:11',9,10),(13,'2014-07-10 06:16:16',11,12),(14,'2014-07-02 08:00:20',8,11),(15,'2014-07-03 06:00:12',12,11),(16,'2014-07-07 06:15:00',8,9);

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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `hobby` */

insert  into `hobby`(`id`,`description`) values (1,'Musique'),(2,'Films'),(3,'Théâtre'),(4,'Art'),(5,'Ordinateur'),(6,'Sport'),(7,'Photographie'),(8,'Animaux'),(9,'Danse'),(10,'Livres');

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
  `sexe` tinyint(1) DEFAULT NULL,
  `notification` bit(1) DEFAULT NULL,
  `hair_color_id` int(11) NOT NULL,
  `skin_color_id` int(11) NOT NULL,
  `eye_color_id` int(11) NOT NULL,
  `height` int(11) NOT NULL,
  `weight_range_id` int(11) NOT NULL,
  `city_id` int(11) NOT NULL,
  `smoke` tinyint(1) NOT NULL,
  `status_id` int(11) NOT NULL,
  `informed_message_received` tinyint(4) NOT NULL,
  `informed_added_by_others` tinyint(4) NOT NULL,
  `informed_removed_by_others` tinyint(4) NOT NULL,
  PRIMARY KEY (`membreId`,`pseudo`),
  KEY `fk_membre_categorie` (`categorieId`),
  KEY `fk_membre_niveauxMembres` (`niveauMembreId`),
  KEY `hair_color_id` (`hair_color_id`),
  KEY `skin_color_id` (`skin_color_id`),
  KEY `eye_color_id` (`eye_color_id`),
  KEY `weight_range_id` (`weight_range_id`),
  KEY `city_id` (`city_id`),
  KEY `status_id` (`status_id`),
  CONSTRAINT `fk_membre_categorie` FOREIGN KEY (`categorieId`) REFERENCES `categorie` (`categorieId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_membre_niveauxMembres` FOREIGN KEY (`niveauMembreId`) REFERENCES `niveaumembres` (`niveauMembreId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `membre_ibfk_1` FOREIGN KEY (`hair_color_id`) REFERENCES `hair_color` (`id`),
  CONSTRAINT `membre_ibfk_2` FOREIGN KEY (`skin_color_id`) REFERENCES `skin_color` (`id`),
  CONSTRAINT `membre_ibfk_3` FOREIGN KEY (`eye_color_id`) REFERENCES `eye_color` (`id`),
  CONSTRAINT `membre_ibfk_4` FOREIGN KEY (`weight_range_id`) REFERENCES `weight_range` (`id`),
  CONSTRAINT `membre_ibfk_5` FOREIGN KEY (`city_id`) REFERENCES `city` (`id`),
  CONSTRAINT `membre_ibfk_6` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `membre` */

insert  into `membre`(`membreId`,`nom`,`prenom`,`age`,`description`,`categorieId`,`isOnline`,`niveauMembreId`,`lastVisit`,`email`,`password`,`pseudo`,`sexe`,`notification`,`hair_color_id`,`skin_color_id`,`eye_color_id`,`height`,`weight_range_id`,`city_id`,`smoke`,`status_id`,`informed_message_received`,`informed_added_by_others`,`informed_removed_by_others`) values (1,'LeBob','bob',30,'une desc de bob',1,1,3,'2011-02-17 16:20:16','bob@gmail.com','12345','beaubob',NULL,NULL,1,1,1,170,1,2,0,1,0,0,0),(2,'drolet','dominic',40,'une desc de dom',1,0,3,NULL,'dominic@dominic.com','12345','Dom',NULL,NULL,5,2,2,168,2,2,1,2,0,0,0),(3,'proulx','daniel',20,'une desc de dan',1,0,2,NULL,'daniel@daniel.com','12345','Dany',NULL,NULL,3,3,3,180,3,3,0,3,0,0,0),(4,'marchildon','rock',30,'une desc de rock',1,0,2,NULL,'rock@rock.com','12345','Rocky',NULL,NULL,7,3,3,179,1,1,1,4,0,0,0),(5,'Magnagna','albert',30,'une desc de albert',1,0,2,NULL,'albert@albert.com','12345','Albert',NULL,NULL,2,1,1,167,2,4,0,1,0,0,0),(6,'Hajj','Toufic',30,'une desc de toufic',1,0,3,NULL,'toufic@toufic.com','12345','Hajj',NULL,NULL,6,4,3,180,3,5,1,2,0,0,0),(7,'Tremblay','Lea',25,'ajouter un description de Lea',2,0,2,NULL,'LeaTremblay@hotmail.com','12345','Lea',NULL,NULL,3,1,2,170,2,8,0,1,0,0,0),(8,'Lavoie','Florence',31,'ajouter un description de Florence',4,0,3,NULL,'FlorenceLavoie@msn.com','12345','Flor',NULL,NULL,2,4,3,171,3,7,1,3,0,0,0),(9,'Pelletier','Alice',28,'ajouter un description de Alice',2,0,1,NULL,'AlicePeltier@gmail.com','12345','Alice',NULL,NULL,6,3,3,160,1,6,0,4,0,0,0),(10,'Bergeron','Emma',21,'ajouter un description de Emma',2,0,1,NULL,'EmmaBergeron@yahoo.com','12345','Emma',NULL,NULL,1,2,3,180,2,7,1,2,0,0,0),(11,'Paquette','Olivia',35,'ajouter un description de Olivia',2,0,2,NULL,'OliviaPaquete@hotmail.ca','12345','Oli',NULL,NULL,6,2,2,159,2,2,1,2,0,0,0),(12,'Girard','Adèle',27,'ajouter un description de Adele',4,0,3,NULL,'AdeleGirard@gmail.com','12345','Adele',NULL,NULL,1,1,3,155,2,1,0,2,0,0,0);

/*Table structure for table `messages` */

DROP TABLE IF EXISTS `messages`;

CREATE TABLE `messages` (
  `messageid` bigint(20) NOT NULL AUTO_INCREMENT,
  `msgFrom` bigint(20) NOT NULL,
  `msgTo` bigint(20) NOT NULL,
  `replyToMsgId` bigint(20) DEFAULT NULL COMMENT 'le msg auquel ce msg est une réponse',
  `sendDate` datetime NOT NULL,
  `contenu` varchar(5000) DEFAULT NULL,
  `dejaLu` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`messageid`),
  KEY `msgFrom` (`msgFrom`),
  KEY `msgTo` (`msgTo`),
  CONSTRAINT `messages_ibfk_2` FOREIGN KEY (`msgTo`) REFERENCES `membre` (`membreId`),
  CONSTRAINT `messages_ibfk_1` FOREIGN KEY (`msgFrom`) REFERENCES `membre` (`membreId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `messages` */

insert  into `messages`(`messageid`,`msgFrom`,`msgTo`,`replyToMsgId`,`sendDate`,`contenu`,`dejaLu`) values (1,3,1,3,'2012-07-09 00:00:00','un message envoye',0),(2,4,1,3,'2015-05-09 00:00:00','un second messages envoye',1),(3,3,1,3,'2017-07-09 00:00:00','un 3eme messages envoye',0),(4,2,1,3,'2020-08-09 00:00:00','un 4eme messages envoye',1);

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

insert  into `photos`(`photoid`,`membreId`,`chemin`,`isprofil`) values (1,1,'/images/members/pic1.jpg',1),(2,1,'/images/members/pic13.jpg',0),(3,1,'/images/members/pic14.jpg',0),(4,1,'/images/members/pic15.jpg',0),(5,1,'/images/members/pic19.jpg',0),(6,1,'/images/members/pic20.jpg',0),(7,2,'/images/members/pic2.jpg',1),(8,2,'/images/members/pic16.jpg',0),(9,2,'/images/members/pic17.jpg',0),(10,2,'/images/members/pic18.jpg',0),(11,3,'/images/members/pic3.jpg',1),(12,4,'/images/members/pic4.jpg',1),(13,5,'/images/members/pic5.jpg',1),(14,6,'/images/members/pic6.jpg',1),(15,7,'/images/members/pic7.jpg',1),(16,8,'/images/members/pic8.jpg',1),(17,9,'/images/members/pic9.jpg',1),(18,10,'/images/members/pic10.jpg',1),(19,11,'/images/members/pic11.jpg',1),(20,12,'/images/members/pic12.jpg',1);

/*Table structure for table `skin_color` */

DROP TABLE IF EXISTS `skin_color`;

CREATE TABLE `skin_color` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `skin_color` */

insert  into `skin_color`(`id`,`description`) values (1,'blanc'),(2,'noir'),(3,'asian'),(4,'Latino');

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
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) NOT NULL,
  `hobby_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `hobby_id` (`hobby_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `user_hobby_link_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `membre` (`membreId`),
  CONSTRAINT `user_hobby_link_ibfk_1` FOREIGN KEY (`hobby_id`) REFERENCES `hobby` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

/*Data for the table `user_hobby_link` */

insert  into `user_hobby_link`(`id`,`user_id`,`hobby_id`) values (1,1,1),(2,1,5),(3,2,2),(4,2,10),(5,3,3),(6,3,6),(7,4,4),(8,4,7),(9,5,8),(10,5,9),(11,6,2),(12,6,10),(13,7,5),(14,7,3),(15,8,1),(16,8,2),(17,9,4),(18,9,10),(19,10,6),(20,10,9),(21,11,7),(22,11,8),(23,12,2),(24,12,6);

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
