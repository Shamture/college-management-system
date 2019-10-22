-- MariaDB dump 10.17  Distrib 10.4.7-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: db_college_management_system
-- ------------------------------------------------------
-- Server version	10.4.7-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `instructor_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `title_UNIQUE` (`title`),
  CONSTRAINT `FK_instructor_id` FOREIGN KEY (`id`) REFERENCES `instructor` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,'Algorithmen und Datenstrukturen',6),(2,'Programmieren (Java)',1),(3,'Programmieren (C++)',4),(4,'Analysis I',4),(5,'Softwaretechnik',9);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `instructor`
--

DROP TABLE IF EXISTS `instructor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `instructor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(80) COLLATE utf8mb4_unicode_ci NOT NULL,
  `last_name` varchar(80) COLLATE utf8mb4_unicode_ci NOT NULL,
  `degree` varchar(80) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `instructor`
--

LOCK TABLES `instructor` WRITE;
/*!40000 ALTER TABLE `instructor` DISABLE KEYS */;
INSERT INTO `instructor` VALUES (1,'Vere','Vasyatkin','Dr.'),(2,'Jedediah','Grix','Dr.'),(3,'Colver','Harber','M.Sc.'),(4,'Randy','Liddington','Dr.'),(5,'Piper','Jacobowicz','Dr.'),(6,'Artur','Defty','M.Sc.'),(7,'Thorndike','Gogin','Dr.'),(8,'Corrie','Le Teve','Dr.'),(9,'Hilton','Urwin','M.Sc.'),(10,'Lucie','Lawlie','Dr.');
/*!40000 ALTER TABLE `instructor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(80) COLLATE utf8mb4_unicode_ci NOT NULL,
  `last_name` varchar(80) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(80) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Trixy','Jervoise','tjervoise0@t-online.de'),(2,'Helyn','Rosenstengel','hrosenstengel1@slate.com'),(3,'Irvin','Peacher','ipeacher2@ycombinator.com'),(4,'Mark','MacAlroy','mmacalroy3@yahoo.co.jp'),(5,'Alfie','Plummer','aplummer4@kickstarter.com'),(6,'Honey','Prendergast','hprendergast5@4shared.com'),(7,'Bertram','Goldin','bgoldin6@squarespace.com'),(8,'Tadeas','Myhill','tmyhill7@hud.gov'),(9,'Carmelita','Rowlin','crowlin8@thetimes.co.uk'),(10,'Karyl','Dummer','kdummer9@npr.org'),(11,'Chandra','Goscar','cgoscara@cargocollective.com'),(12,'Phylis','Blannin','pblanninb@seesaa.net'),(13,'Tommy','Skeech','tskeechc@psu.edu'),(14,'Debby','Kelland','dkellandd@icq.com'),(15,'Mandel','Farriar','mfarriare@mapy.cz'),(16,'Fredek','Goulborne','fgoulbornef@behance.net'),(17,'Odella','Cluer','ocluerg@squarespace.com'),(18,'Auguste','Spittall','aspittallh@sourceforge.net'),(19,'Hymie','Hazael','hhazaeli@walmart.com'),(20,'Nealon','Leaver','nleaverj@thetimes.co.uk'),(21,'Mandie','Coumbe','mcoumbek@hibu.com'),(22,'Daryl','Hallahan','dhallahanl@behance.net'),(23,'Jesselyn','Shilstone','jshilstonem@epa.gov'),(24,'Faunie','Lowthian','flowthiann@howstuffworks.com'),(25,'Roderigo','Beddo','rbeddoo@statcounter.com'),(26,'Casi','Ollett','collettp@princeton.edu'),(27,'Molli','Loosmore','mloosmoreq@state.tx.us'),(28,'Celeste','Nulty','cnultyr@issuu.com'),(29,'Neilla','Goulder','ngoulders@sfgate.com'),(30,'Prentiss','Osmar','posmart@livejournal.com');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_course`
--

DROP TABLE IF EXISTS `student_course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_course` (
  `student_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  PRIMARY KEY (`student_id`,`course_id`),
  KEY `FK_course_id_idx` (`course_id`),
  CONSTRAINT `FK_course_id` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_student_id` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_course`
--

LOCK TABLES `student_course` WRITE;
/*!40000 ALTER TABLE `student_course` DISABLE KEYS */;
INSERT INTO `student_course` VALUES (1,1),(1,2),(1,3),(1,4),(1,5),(2,1),(2,4),(2,5),(3,1),(3,2),(3,3),(3,4),(3,5),(4,1),(4,2),(4,3),(4,4),(4,5),(5,1),(5,2),(5,4),(5,5),(6,2),(6,3),(6,4),(7,1),(7,2),(7,3),(7,4),(7,5),(8,1),(8,2),(8,3),(8,4),(9,1),(9,2),(9,4),(9,5),(10,3),(10,4),(10,5),(11,1),(11,2),(11,3),(11,4),(11,5),(12,1),(12,2),(12,3),(12,4),(12,5),(13,1),(13,3),(13,4),(13,5),(14,1),(14,2),(14,3),(14,4),(14,5),(15,1),(15,2),(15,3),(15,4),(16,1),(16,2),(16,3),(16,4),(16,5),(17,1),(17,2),(17,3),(17,4),(17,5),(18,1),(18,2),(18,3),(18,4),(18,5),(19,1),(19,3),(19,4),(19,5),(20,1),(20,2),(20,3),(20,4),(20,5),(21,1),(21,4),(21,5),(22,1),(22,3),(22,4),(22,5),(23,1),(23,2),(23,3),(23,5),(24,1),(24,2),(24,3),(24,4),(24,5),(25,1),(25,2),(25,3),(25,4),(25,5),(26,1),(26,2),(26,3),(26,4),(26,5),(27,1),(27,2),(27,3),(27,4),(27,5),(28,2),(28,3),(28,4),(28,5),(29,1),(29,2),(29,4),(29,5),(30,1),(30,3),(30,4),(30,5);
/*!40000 ALTER TABLE `student_course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'db_college_management_system'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-22 14:46:01
