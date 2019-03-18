
INSERT INTO `WKM_COMPANY` VALUES ('RWS','Right Weighing Systems');


INSERT INTO `WKM_OPTION` VALUES ('accounting','MAIN','Accounting',1),('buying','MAIN','Buying',2),('news','MAIN','News',5),('notes','MAIN','Notes',4),('selling','MAIN','Selling',3),('todo','MAIN','To-Do List',6),('users','MAIN','Users',7);



INSERT INTO `WKM_ROLE` VALUES ('ACCOUNTANT','Accountant'),('ADMIN','Administrator');
INSERT INTO `WKM_USER` VALUES ('WK001','',NULL,NULL,NULL,NULL,'');
INSERT INTO `WKR_ROLE_OPTION` VALUES (1,'accounting','ADMIN'),(2,'buying','ADMIN'),(3,'notes','ADMIN'),(4,'selling','ADMIN'),(5,'todo','ADMIN'),(6,'news','ADMIN'),(7,'users','ADMIN');
INSERT INTO `WKR_USER_ROLE` VALUES (1,'RWS','ACCOUNTANT','WK001','Y'),(2,'RWS','ADMIN','WK001',NULL);