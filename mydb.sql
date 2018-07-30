-- MySQL dump 10.13  Distrib 5.7.22, for Linux (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	5.7.22-0ubuntu18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `antena`
--

DROP TABLE IF EXISTS `antena`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `antena` (
  `idantena` int(25) NOT NULL,
  `model` varchar(45) NOT NULL,
  `inventary_number` int(25) NOT NULL,
  `get_number` int(25) NOT NULL,
  `brand_id` int(25) NOT NULL,
  `user_id` int(25) NOT NULL,
  PRIMARY KEY (`idantena`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `antena`
--

LOCK TABLES `antena` WRITE;
/*!40000 ALTER TABLE `antena` DISABLE KEYS */;
/*!40000 ALTER TABLE `antena` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `battary`
--

DROP TABLE IF EXISTS `battary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `battary` (
  `id` int(25) NOT NULL,
  `model` varchar(45) NOT NULL,
  `inventary_number` int(25) NOT NULL,
  `get_number` int(25) NOT NULL,
  `brand_id` int(25) NOT NULL,
  `user_id` int(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `battary`
--

LOCK TABLES `battary` WRITE;
/*!40000 ALTER TABLE `battary` DISABLE KEYS */;
/*!40000 ALTER TABLE `battary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `brand`
--

DROP TABLE IF EXISTS `brand`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `brand` (
  `id` int(25) NOT NULL,
  `brand` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `brand`
--

LOCK TABLES `brand` WRITE;
/*!40000 ALTER TABLE `brand` DISABLE KEYS */;
INSERT INTO `brand` VALUES (1,'intel'),(2,'lg'),(3,'samsung'),(4,'hp'),(5,'aoc'),(6,'commutator');
/*!40000 ALTER TABLE `brand` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `commutator`
--

DROP TABLE IF EXISTS `commutator`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `commutator` (
  `id` int(25) NOT NULL,
  `model` varchar(45) NOT NULL,
  `inventary_number` int(25) NOT NULL,
  `get_number` int(25) NOT NULL,
  `user_id` int(25) NOT NULL,
  `brand_id` int(25) NOT NULL,
  `port_quantity` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `commutator`
--

LOCK TABLES `commutator` WRITE;
/*!40000 ALTER TABLE `commutator` DISABLE KEYS */;
/*!40000 ALTER TABLE `commutator` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `computer`
--

DROP TABLE IF EXISTS `computer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `computer` (
  `id` int(25) NOT NULL,
  `model` varchar(45) NOT NULL,
  `inventary_number` int(25) NOT NULL,
  `get_number` int(25) NOT NULL,
  `hdd` int(25) DEFAULT NULL,
  `ssd` int(25) DEFAULT NULL,
  `cpu_id` int(25) NOT NULL,
  `brand_id` int(25) NOT NULL,
  `ram_id` int(25) NOT NULL,
  `user_id` int(25) NOT NULL,
  `gpu` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `computer`
--

LOCK TABLES `computer` WRITE;
/*!40000 ALTER TABLE `computer` DISABLE KEYS */;
/*!40000 ALTER TABLE `computer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cpu`
--

DROP TABLE IF EXISTS `cpu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cpu` (
  `id` int(25) NOT NULL,
  `model` varchar(45) NOT NULL,
  `brand_id` int(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cpu`
--

LOCK TABLES `cpu` WRITE;
/*!40000 ALTER TABLE `cpu` DISABLE KEYS */;
/*!40000 ALTER TABLE `cpu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diagonal`
--

DROP TABLE IF EXISTS `diagonal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `diagonal` (
  `id` int(25) NOT NULL,
  `diagonal` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diagonal`
--

LOCK TABLES `diagonal` WRITE;
/*!40000 ALTER TABLE `diagonal` DISABLE KEYS */;
INSERT INTO `diagonal` VALUES (1,12),(2,15),(3,17),(4,19),(5,21),(6,22),(7,24),(8,27);
/*!40000 ALTER TABLE `diagonal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laptop`
--

DROP TABLE IF EXISTS `laptop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `laptop` (
  `id` int(25) NOT NULL,
  `model` varchar(45) NOT NULL,
  `inventary_number` int(25) NOT NULL,
  `get_number` int(25) NOT NULL,
  `hdd` int(25) DEFAULT NULL,
  `ssd` int(25) DEFAULT NULL,
  `diagonal_id` int(25) NOT NULL,
  `cpu_id` int(25) NOT NULL,
  `brand_id` int(25) NOT NULL,
  `ram_id` int(25) NOT NULL,
  `user_id` int(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laptop`
--

LOCK TABLES `laptop` WRITE;
/*!40000 ALTER TABLE `laptop` DISABLE KEYS */;
/*!40000 ALTER TABLE `laptop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monitor`
--

DROP TABLE IF EXISTS `monitor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `monitor` (
  `id` int(25) NOT NULL,
  `model` varchar(45) NOT NULL,
  `inventary_number` varchar(45) NOT NULL,
  `get_number` varchar(45) NOT NULL,
  `diagonal_id` int(25) NOT NULL,
  `brand_id` int(25) NOT NULL,
  `user_id` int(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monitor`
--

LOCK TABLES `monitor` WRITE;
/*!40000 ALTER TABLE `monitor` DISABLE KEYS */;
/*!40000 ALTER TABLE `monitor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `netCard`
--

DROP TABLE IF EXISTS `netCard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `netCard` (
  `id` int(25) NOT NULL,
  `model` varchar(45) NOT NULL,
  `inventary_number` int(25) NOT NULL,
  `get_number` int(25) NOT NULL,
  `brand_id` int(25) NOT NULL,
  `user_id` int(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `netCard`
--

LOCK TABLES `netCard` WRITE;
/*!40000 ALTER TABLE `netCard` DISABLE KEYS */;
/*!40000 ALTER TABLE `netCard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `os`
--

DROP TABLE IF EXISTS `os`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `os` (
  `id` int(25) NOT NULL,
  `os_number` int(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `os`
--

LOCK TABLES `os` WRITE;
/*!40000 ALTER TABLE `os` DISABLE KEYS */;
/*!40000 ALTER TABLE `os` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `printer`
--

DROP TABLE IF EXISTS `printer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `printer` (
  `id` int(25) NOT NULL,
  `model` varchar(45) NOT NULL,
  `inventary_number` int(25) NOT NULL,
  `get_number` int(25) NOT NULL,
  `type` varchar(45) NOT NULL,
  `color_quantity` int(1) NOT NULL,
  `brand_id` int(25) NOT NULL,
  `user_id` int(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `printer`
--

LOCK TABLES `printer` WRITE;
/*!40000 ALTER TABLE `printer` DISABLE KEYS */;
/*!40000 ALTER TABLE `printer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ram`
--

DROP TABLE IF EXISTS `ram`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ram` (
  `id` int(25) NOT NULL,
  `model` varchar(45) NOT NULL,
  `inventary_number` varchar(45) NOT NULL,
  `get_number` int(25) NOT NULL,
  `brand_id` int(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ram`
--

LOCK TABLES `ram` WRITE;
/*!40000 ALTER TABLE `ram` DISABLE KEYS */;
/*!40000 ALTER TABLE `ram` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `server`
--

DROP TABLE IF EXISTS `server`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `server` (
  `id` int(25) NOT NULL,
  `model` varchar(45) NOT NULL,
  `inventary_number` int(25) NOT NULL,
  `get_number` int(25) NOT NULL,
  `hdd` int(25) DEFAULT NULL,
  `ssd` int(25) DEFAULT NULL,
  `cpu_quantity` int(1) NOT NULL,
  `cpu_id` int(25) NOT NULL,
  `brand_id` int(25) NOT NULL,
  `ram_id` int(25) NOT NULL,
  `user_id` int(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `server`
--

LOCK TABLES `server` WRITE;
/*!40000 ALTER TABLE `server` DISABLE KEYS */;
/*!40000 ALTER TABLE `server` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telephone`
--

DROP TABLE IF EXISTS `telephone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `telephone` (
  `id` int(25) NOT NULL,
  `model` varchar(45) NOT NULL,
  `inventary_number` int(25) NOT NULL,
  `get_number` int(25) NOT NULL,
  `brand_id` int(25) NOT NULL,
  `user_id` int(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telephone`
--

LOCK TABLES `telephone` WRITE;
/*!40000 ALTER TABLE `telephone` DISABLE KEYS */;
/*!40000 ALTER TABLE `telephone` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `terminal`
--

DROP TABLE IF EXISTS `terminal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `terminal` (
  `id` int(25) NOT NULL,
  `model` varchar(45) NOT NULL,
  `inventary_number` int(25) NOT NULL,
  `get_number` varchar(45) NOT NULL,
  `brand_id` int(25) NOT NULL,
  `user_id` int(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `terminal`
--

LOCK TABLES `terminal` WRITE;
/*!40000 ALTER TABLE `terminal` DISABLE KEYS */;
/*!40000 ALTER TABLE `terminal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `terminalDot`
--

DROP TABLE IF EXISTS `terminalDot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `terminalDot` (
  `id` int(25) NOT NULL,
  `model` varchar(45) NOT NULL,
  `inventary_number` int(25) NOT NULL,
  `get_number` varchar(45) NOT NULL,
  `brand_id` int(25) NOT NULL,
  `user_id` int(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `terminalDot`
--

LOCK TABLES `terminalDot` WRITE;
/*!40000 ALTER TABLE `terminalDot` DISABLE KEYS */;
/*!40000 ALTER TABLE `terminalDot` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ups`
--

DROP TABLE IF EXISTS `ups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ups` (
  `id` int(25) NOT NULL,
  `model` varchar(45) NOT NULL,
  `inventary_number` int(25) NOT NULL,
  `get_number` int(25) NOT NULL,
  `brand_id` int(25) NOT NULL,
  `user_id` int(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ups`
--

LOCK TABLES `ups` WRITE;
/*!40000 ALTER TABLE `ups` DISABLE KEYS */;
/*!40000 ALTER TABLE `ups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(25) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wifiCard`
--

DROP TABLE IF EXISTS `wifiCard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wifiCard` (
  `id` int(25) NOT NULL,
  `model` varchar(45) NOT NULL,
  `inventary_number` int(25) NOT NULL,
  `get_number` int(25) NOT NULL,
  `brand_id` int(25) NOT NULL,
  `user_id` int(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wifiCard`
--

LOCK TABLES `wifiCard` WRITE;
/*!40000 ALTER TABLE `wifiCard` DISABLE KEYS */;
/*!40000 ALTER TABLE `wifiCard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wifiDot`
--

DROP TABLE IF EXISTS `wifiDot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wifiDot` (
  `id` int(25) NOT NULL,
  `model` varchar(45) NOT NULL,
  `inventary_number` int(25) NOT NULL,
  `get_number` varchar(45) NOT NULL,
  `user_id` int(25) NOT NULL,
  `brand_id` int(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wifiDot`
--

LOCK TABLES `wifiDot` WRITE;
/*!40000 ALTER TABLE `wifiDot` DISABLE KEYS */;
/*!40000 ALTER TABLE `wifiDot` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-30  7:05:56
