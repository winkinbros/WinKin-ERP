

DROP TABLE IF EXISTS `WKM_COMPANY`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `WKM_COMPANY` (
  `WKMC_ID` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `WKMC_NAME` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`WKMC_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `WKM_OPTION`
--

DROP TABLE IF EXISTS `WKM_OPTION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `WKM_OPTION` (
  `WKO_ID` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `WKO_FLAG` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `WKO_NAME` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`WKO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `WKM_ROLE`
--

DROP TABLE IF EXISTS `WKM_ROLE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `WKM_ROLE` (
  `WKMR_ID` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `WKMR_NAME` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`WKMR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `WKM_USER`
--

DROP TABLE IF EXISTS `WKM_USER`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `WKM_USER` (
  `WKU_ID` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `WKU_LOCKED_YN` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `WKU_OTP` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `WKU_OTP_HASH` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `WKU_REG_EMAIL` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `WKU_REG_MOBILE` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `WKU_STATUS_YN` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`WKU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `WKR_ROLE_OPTION`
--

DROP TABLE IF EXISTS `WKR_ROLE_OPTION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `WKR_ROLE_OPTION` (
  `WKRRO_ID` int(11) NOT NULL AUTO_INCREMENT,
  `WKRRO_WKM_OPTION` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `WKRRO_WKM_ROLE` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`WKRRO_ID`),
  KEY `FK_WKRRO_WKM_OPTION` (`WKRRO_WKM_OPTION`),
  KEY `FK_WKRRO_WKM_ROLE` (`WKRRO_WKM_ROLE`),
  CONSTRAINT `FK_WKRRO_WKM_OPTION` FOREIGN KEY (`WKRRO_WKM_OPTION`) REFERENCES `WKM_OPTION` (`WKO_ID`),
  CONSTRAINT `FK_WKRRO_WKM_ROLE` FOREIGN KEY (`WKRRO_WKM_ROLE`) REFERENCES `WKM_ROLE` (`WKMR_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `WKR_USER_ROLE`
--

DROP TABLE IF EXISTS `WKR_USER_ROLE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `WKR_USER_ROLE` (
  `WKRUR_ID` int(11) NOT NULL AUTO_INCREMENT,
  `WKRUR_WKM_COMPANY` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `WKRUR_WKM_ROLE` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `WKRUR_WKM_USER` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `WKRUR_DEFAULT_YN` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`WKRUR_ID`),
  KEY `FK_WKRUR_WKM_COMPANY` (`WKRUR_WKM_COMPANY`),
  KEY `FK_WKRUR_WKM_ROLE` (`WKRUR_WKM_ROLE`),
  KEY `FK_WKRUR_WKM_USER` (`WKRUR_WKM_USER`),
  CONSTRAINT `FK_WKRUR_WKM_COMPANY` FOREIGN KEY (`WKRUR_WKM_COMPANY`) REFERENCES `WKM_COMPANY` (`WKMC_ID`),
  CONSTRAINT `FK_WKRUR_WKM_ROLE` FOREIGN KEY (`WKRUR_WKM_ROLE`) REFERENCES `WKM_ROLE` (`WKMR_ID`),
  CONSTRAINT `FK_WKRUR_WKM_USER` FOREIGN KEY (`WKRUR_WKM_USER`) REFERENCES `WKM_USER` (`WKU_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
