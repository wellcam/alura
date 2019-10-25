-- MySQL dump 10.13  Distrib 5.7.27, for Linux (x86_64)
--
-- Host: localhost    Database: financas
-- ------------------------------------------------------
-- Server version	5.7.27-0ubuntu0.18.04.1

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
-- Table structure for table `Categoria`
--

DROP TABLE IF EXISTS `Categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Categoria` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Categoria`
--

LOCK TABLES `Categoria` WRITE;
/*!40000 ALTER TABLE `Categoria` DISABLE KEYS */;
INSERT INTO `Categoria` VALUES (1,'VIAGEM'),(2,'NEGÓCIOS'),(3,'SALÁRIO'),(4,'ALUGUEL');
/*!40000 ALTER TABLE `Categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Cliente`
--

DROP TABLE IF EXISTS `Cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `endereco` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `profissao` varchar(255) DEFAULT NULL,
  `conta_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_a8p0pxvka1kuwy5y09omepofx` (`conta_id`),
  CONSTRAINT `FKajhxkga86ursgptf0lm09qpj0` FOREIGN KEY (`conta_id`) REFERENCES `Conta` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cliente`
--

LOCK TABLES `Cliente` WRITE;
/*!40000 ALTER TABLE `Cliente` DISABLE KEYS */;
INSERT INTO `Cliente` VALUES (1,'Rua Manoel Francisco Sa, 5','André Camilo','Fotografo',2);
/*!40000 ALTER TABLE `Cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Conta`
--

DROP TABLE IF EXISTS `Conta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Conta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `agencia` varchar(255) DEFAULT NULL,
  `banco` varchar(255) DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `titular` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Conta`
--

LOCK TABLES `Conta` WRITE;
/*!40000 ALTER TABLE `Conta` DISABLE KEYS */;
INSERT INTO `Conta` VALUES (1,'6543','001 - BANCO DO BRASIL','16987-8','Maria dos Santos'),(2,'1745','237 - BANCO BRADESCO','86759-1','Paulo Roberto Souza'),(3,'4606','341 - BANCO ITAU UNIBANCO','46346-3','Antonio Duraes'),(4,'9876','033 - BANCO SANTANDER','12345-6','Leandra Marques'),(5,'1234','104 - CAIXA ECONOMICA FEDERAL','98654-3','Alexandre Duarte');
/*!40000 ALTER TABLE `Conta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Conta_Movimentacao`
--

DROP TABLE IF EXISTS `Conta_Movimentacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Conta_Movimentacao` (
  `Conta_id` int(11) NOT NULL,
  `movimentacoes_id` int(11) NOT NULL,
  UNIQUE KEY `UK_leffgcyr526csjv4iloathpk` (`movimentacoes_id`),
  KEY `FKp4a9vjc3g3djv8bnv1l4iu1x7` (`Conta_id`),
  CONSTRAINT `FKajkfxahotd0eks6q099b88k9j` FOREIGN KEY (`movimentacoes_id`) REFERENCES `Movimentacao` (`id`),
  CONSTRAINT `FKp4a9vjc3g3djv8bnv1l4iu1x7` FOREIGN KEY (`Conta_id`) REFERENCES `Conta` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Conta_Movimentacao`
--

LOCK TABLES `Conta_Movimentacao` WRITE;
/*!40000 ALTER TABLE `Conta_Movimentacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `Conta_Movimentacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Movimentacao`
--

DROP TABLE IF EXISTS `Movimentacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Movimentacao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` datetime DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `valor` decimal(19,2) DEFAULT NULL,
  `conta_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKthcy44mjtg87orpl9a3nfso7b` (`conta_id`),
  CONSTRAINT `FKthcy44mjtg87orpl9a3nfso7b` FOREIGN KEY (`conta_id`) REFERENCES `Conta` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Movimentacao`
--

LOCK TABLES `Movimentacao` WRITE;
/*!40000 ALTER TABLE `Movimentacao` DISABLE KEYS */;
INSERT INTO `Movimentacao` VALUES (1,'2019-10-13 12:01:26','Pagamento de Aluguel','ENTRADA',1000.00,4),(2,'2019-10-13 12:01:26','Saláro Mês Outubro','ENTRADA',3698.00,2),(5,'2019-10-13 12:04:39','Pagamento de Aluguel','ENTRADA',10700.00,1),(6,'2019-10-13 12:04:39','Saláro Mês Outubro','ENTRADA',2500.00,5),(15,'2019-10-13 12:24:40','Pagamento de Aluguel','ENTRADA',2874.00,3),(19,'2019-10-13 12:29:38','Pagamento de Aluguel','ENTRADA',2874.00,3),(20,'2019-10-13 12:30:14','Saláro Mês Setembro','ENTRADA',9874.00,4),(22,'2019-10-13 12:31:36','Pagamento de Aluguel','ENTRADA',1243.00,3),(25,'2019-10-13 12:42:40','Pagamento de Aluguel','ENTRADA',234.00,1),(26,'2019-10-13 12:42:40','Saláro Mês Agosto','ENTRADA',9874.00,5),(27,'2019-10-13 12:42:40','Pagamento de Aluguel','ENTRADA',123322.00,3),(28,'2019-10-13 12:42:40','Saláro Mês Dezembro','ENTRADA',123123.00,4),(29,'2019-10-25 16:40:43','Saláro Mês Agosto','ENTRADA',9874.00,5),(30,'2019-10-24 16:41:49','Pagamento de Aluguel','ENTRADA',234.00,1);
/*!40000 ALTER TABLE `Movimentacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Movimentacao_Categoria`
--

DROP TABLE IF EXISTS `Movimentacao_Categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Movimentacao_Categoria` (
  `Movimentacao_id` int(11) NOT NULL,
  `categoria_id` int(11) NOT NULL,
  KEY `FK9qjlgh7a96gx1ks359va1na9a` (`categoria_id`),
  KEY `FK8c4hm7qt4jdk4xcglplf5dyy7` (`Movimentacao_id`),
  CONSTRAINT `FK8c4hm7qt4jdk4xcglplf5dyy7` FOREIGN KEY (`Movimentacao_id`) REFERENCES `Movimentacao` (`id`),
  CONSTRAINT `FK9qjlgh7a96gx1ks359va1na9a` FOREIGN KEY (`categoria_id`) REFERENCES `Categoria` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Movimentacao_Categoria`
--

LOCK TABLES `Movimentacao_Categoria` WRITE;
/*!40000 ALTER TABLE `Movimentacao_Categoria` DISABLE KEYS */;
INSERT INTO `Movimentacao_Categoria` VALUES (1,4),(2,3),(5,3),(6,4),(15,3),(19,3),(20,4),(22,1),(25,3),(26,4),(27,1),(28,2),(29,4),(30,3);
/*!40000 ALTER TABLE `Movimentacao_Categoria` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-25 14:54:38
