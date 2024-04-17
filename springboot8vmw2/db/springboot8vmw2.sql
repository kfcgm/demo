-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springboot8vmw2
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `address` varchar(200) NOT NULL COMMENT '地址',
  `name` varchar(200) NOT NULL COMMENT '收货人',
  `phone` varchar(200) NOT NULL COMMENT '电话',
  `isdefault` varchar(200) NOT NULL COMMENT '是否默认地址[是/否]',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='地址';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'2021-02-27 13:08:25',1,'宇宙银河系金星1号','金某','13823888881','是'),(2,'2021-02-27 13:08:25',2,'宇宙银河系木星1号','木某','13823888882','是'),(3,'2021-02-27 13:08:25',3,'宇宙银河系水星1号','水某','13823888883','是'),(4,'2021-02-27 13:08:25',4,'宇宙银河系火星1号','火某','13823888884','是'),(5,'2021-02-27 13:08:25',5,'宇宙银河系土星1号','土某','13823888885','是'),(6,'2021-02-27 13:08:25',6,'宇宙银河系月球1号','月某','13823888886','是');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tablename` varchar(200) DEFAULT 'jiancaishangpin' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `picture` varchar(200) DEFAULT NULL COMMENT '图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` float DEFAULT NULL COMMENT '单价',
  `discountprice` float DEFAULT NULL COMMENT '会员价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购物车表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/springboot8vmw2/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/springboot8vmw2/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/springboot8vmw2/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussjiancaishangpin`
--

DROP TABLE IF EXISTS `discussjiancaishangpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussjiancaishangpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8 COMMENT='建材商品评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussjiancaishangpin`
--

LOCK TABLES `discussjiancaishangpin` WRITE;
/*!40000 ALTER TABLE `discussjiancaishangpin` DISABLE KEYS */;
INSERT INTO `discussjiancaishangpin` VALUES (151,'2021-02-27 13:08:25',1,1,'评论内容1','回复内容1'),(152,'2021-02-27 13:08:25',2,2,'评论内容2','回复内容2'),(153,'2021-02-27 13:08:25',3,3,'评论内容3','回复内容3'),(154,'2021-02-27 13:08:25',4,4,'评论内容4','回复内容4'),(155,'2021-02-27 13:08:25',5,5,'评论内容5','回复内容5'),(156,'2021-02-27 13:08:25',6,6,'评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussjiancaishangpin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusszhuangxiutaocan`
--

DROP TABLE IF EXISTS `discusszhuangxiutaocan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusszhuangxiutaocan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8 COMMENT='装修套餐评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusszhuangxiutaocan`
--

LOCK TABLES `discusszhuangxiutaocan` WRITE;
/*!40000 ALTER TABLE `discusszhuangxiutaocan` DISABLE KEYS */;
INSERT INTO `discusszhuangxiutaocan` VALUES (161,'2021-02-27 13:08:25',1,1,'评论内容1','回复内容1'),(162,'2021-02-27 13:08:25',2,2,'评论内容2','回复内容2'),(163,'2021-02-27 13:08:25',3,3,'评论内容3','回复内容3'),(164,'2021-02-27 13:08:25',4,4,'评论内容4','回复内容4'),(165,'2021-02-27 13:08:25',5,5,'评论内容5','回复内容5'),(166,'2021-02-27 13:08:25',6,6,'评论内容6','回复内容6');
/*!40000 ALTER TABLE `discusszhuangxiutaocan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forum`
--

DROP TABLE IF EXISTS `forum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) DEFAULT NULL COMMENT '帖子标题',
  `content` longtext NOT NULL COMMENT '帖子内容',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `isdone` varchar(200) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='交流论坛';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forum`
--

LOCK TABLES `forum` WRITE;
/*!40000 ALTER TABLE `forum` DISABLE KEYS */;
INSERT INTO `forum` VALUES (91,'2021-02-27 13:08:25','帖子标题1','帖子内容1',1,1,'用户名1','开放'),(92,'2021-02-27 13:08:25','帖子标题2','帖子内容2',2,2,'用户名2','开放'),(93,'2021-02-27 13:08:25','帖子标题3','帖子内容3',3,3,'用户名3','开放'),(94,'2021-02-27 13:08:25','帖子标题4','帖子内容4',4,4,'用户名4','开放'),(95,'2021-02-27 13:08:25','帖子标题5','帖子内容5',5,5,'用户名5','开放'),(96,'2021-02-27 13:08:25','帖子标题6','帖子内容6',6,6,'用户名6','开放');
/*!40000 ALTER TABLE `forum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gongjiang`
--

DROP TABLE IF EXISTS `gongjiang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gongjiang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `gongzhong` varchar(200) DEFAULT NULL COMMENT '工种',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `money` float DEFAULT '0' COMMENT '余额',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='工匠';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gongjiang`
--

LOCK TABLES `gongjiang` WRITE;
/*!40000 ALTER TABLE `gongjiang` DISABLE KEYS */;
INSERT INTO `gongjiang` VALUES (21,'2021-02-27 13:08:25','1','1','姓名1','男','http://localhost:8080/springboot8vmw2/upload/gongjiang_touxiang1.jpg','工种1','440300199101010001','13823888881',100),(22,'2021-02-27 13:08:25','工匠2','123456','姓名2','男','http://localhost:8080/springboot8vmw2/upload/gongjiang_touxiang2.jpg','工种2','440300199202020002','13823888882',100),(23,'2021-02-27 13:08:25','工匠3','123456','姓名3','男','http://localhost:8080/springboot8vmw2/upload/gongjiang_touxiang3.jpg','工种3','440300199303030003','13823888883',100),(24,'2021-02-27 13:08:25','工匠4','123456','姓名4','男','http://localhost:8080/springboot8vmw2/upload/gongjiang_touxiang4.jpg','工种4','440300199404040004','13823888884',100),(25,'2021-02-27 13:08:25','工匠5','123456','姓名5','男','http://localhost:8080/springboot8vmw2/upload/gongjiang_touxiang5.jpg','工种5','440300199505050005','13823888885',100),(26,'2021-02-27 13:08:25','工匠6','123456','姓名6','男','http://localhost:8080/springboot8vmw2/upload/gongjiang_touxiang6.jpg','工种6','440300199606060006','13823888886',100);
/*!40000 ALTER TABLE `gongjiang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huifuxinxi`
--

DROP TABLE IF EXISTS `huifuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huifuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `liaotianhuifu` longtext COMMENT '聊天回复',
  `huifuriqi` date DEFAULT NULL COMMENT '回复日期',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='回复信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huifuxinxi`
--

LOCK TABLES `huifuxinxi` WRITE;
/*!40000 ALTER TABLE `huifuxinxi` DISABLE KEYS */;
INSERT INTO `huifuxinxi` VALUES (81,'2021-02-27 13:08:25','编号1','标题1','用户名1','用户姓名1','聊天回复1','2021-02-27','账号1','姓名1',1),(82,'2021-02-27 13:08:25','编号2','标题2','用户名2','用户姓名2','聊天回复2','2021-02-27','账号2','姓名2',2),(83,'2021-02-27 13:08:25','编号3','标题3','用户名3','用户姓名3','聊天回复3','2021-02-27','账号3','姓名3',3),(84,'2021-02-27 13:08:25','编号4','标题4','用户名4','用户姓名4','聊天回复4','2021-02-27','账号4','姓名4',4),(85,'2021-02-27 13:08:25','编号5','标题5','用户名5','用户姓名5','聊天回复5','2021-02-27','账号5','姓名5',5),(86,'2021-02-27 13:08:25','编号6','标题6','用户名6','用户姓名6','聊天回复6','2021-02-27','账号6','姓名6',6);
/*!40000 ALTER TABLE `huifuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiancaileixing`
--

DROP TABLE IF EXISTS `jiancaileixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiancaileixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiancaileixing` varchar(200) NOT NULL COMMENT '建材类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='建材类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiancaileixing`
--

LOCK TABLES `jiancaileixing` WRITE;
/*!40000 ALTER TABLE `jiancaileixing` DISABLE KEYS */;
INSERT INTO `jiancaileixing` VALUES (31,'2021-02-27 13:08:25','建材类型1'),(32,'2021-02-27 13:08:25','建材类型2'),(33,'2021-02-27 13:08:25','建材类型3'),(34,'2021-02-27 13:08:25','建材类型4'),(35,'2021-02-27 13:08:25','建材类型5'),(36,'2021-02-27 13:08:25','建材类型6');
/*!40000 ALTER TABLE `jiancaileixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiancaishangpin`
--

DROP TABLE IF EXISTS `jiancaishangpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiancaishangpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiancaimingcheng` varchar(200) NOT NULL COMMENT '建材名称',
  `jiancaileixing` varchar(200) DEFAULT NULL COMMENT '建材类型',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `danwei` varchar(200) DEFAULT NULL COMMENT '单位',
  `zhongliang` varchar(200) DEFAULT NULL COMMENT '重量',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  `shangpinxiangqing` longtext COMMENT '商品详情',
  `price` float NOT NULL COMMENT '价格',
  `onelimittimes` int(11) DEFAULT '-1' COMMENT '单限',
  `alllimittimes` int(11) DEFAULT '-1' COMMENT '库存',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='建材商品';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiancaishangpin`
--

LOCK TABLES `jiancaishangpin` WRITE;
/*!40000 ALTER TABLE `jiancaishangpin` DISABLE KEYS */;
INSERT INTO `jiancaishangpin` VALUES (41,'2021-02-27 13:08:25','建材名称1','建材类型1','http://localhost:8080/springboot8vmw2/upload/jiancaishangpin_tupian1.jpg','单位1','重量1','2021-02-27','商品详情1',99.9,1,99),(42,'2021-02-27 13:08:25','建材名称2','建材类型2','http://localhost:8080/springboot8vmw2/upload/jiancaishangpin_tupian2.jpg','单位2','重量2','2021-02-27','商品详情2',99.9,2,99),(43,'2021-02-27 13:08:25','建材名称3','建材类型3','http://localhost:8080/springboot8vmw2/upload/jiancaishangpin_tupian3.jpg','单位3','重量3','2021-02-27','商品详情3',99.9,3,99),(44,'2021-02-27 13:08:25','建材名称4','建材类型4','http://localhost:8080/springboot8vmw2/upload/jiancaishangpin_tupian4.jpg','单位4','重量4','2021-02-27','商品详情4',99.9,4,99),(45,'2021-02-27 13:08:25','建材名称5','建材类型5','http://localhost:8080/springboot8vmw2/upload/jiancaishangpin_tupian5.jpg','单位5','重量5','2021-02-27','商品详情5',99.9,5,99),(46,'2021-02-27 13:08:25','建材名称6','建材类型6','http://localhost:8080/springboot8vmw2/upload/jiancaishangpin_tupian6.jpg','单位6','重量6','2021-02-27','商品详情6',99.9,6,99);
/*!40000 ALTER TABLE `jiancaishangpin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lianxixinxi`
--

DROP TABLE IF EXISTS `lianxixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lianxixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `liaotianneirong` longtext COMMENT '聊天内容',
  `riqi` date DEFAULT NULL COMMENT '日期',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bianhao` (`bianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='联系信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lianxixinxi`
--

LOCK TABLES `lianxixinxi` WRITE;
/*!40000 ALTER TABLE `lianxixinxi` DISABLE KEYS */;
INSERT INTO `lianxixinxi` VALUES (71,'2021-02-27 13:08:25','编号1','标题1','账号1','聊天内容1','2021-02-27','用户名1','用户姓名1',1),(72,'2021-02-27 13:08:25','编号2','标题2','账号2','聊天内容2','2021-02-27','用户名2','用户姓名2',2),(73,'2021-02-27 13:08:25','编号3','标题3','账号3','聊天内容3','2021-02-27','用户名3','用户姓名3',3),(74,'2021-02-27 13:08:25','编号4','标题4','账号4','聊天内容4','2021-02-27','用户名4','用户姓名4',4),(75,'2021-02-27 13:08:25','编号5','标题5','账号5','聊天内容5','2021-02-27','用户名5','用户姓名5',5),(76,'2021-02-27 13:08:25','编号6','标题6','账号6','聊天内容6','2021-02-27','用户名6','用户姓名6',6);
/*!40000 ALTER TABLE `lianxixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='资讯信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (141,'2021-02-27 13:08:25','标题1','简介1','http://localhost:8080/springboot8vmw2/upload/news_picture1.jpg','内容1'),(142,'2021-02-27 13:08:25','标题2','简介2','http://localhost:8080/springboot8vmw2/upload/news_picture2.jpg','内容2'),(143,'2021-02-27 13:08:25','标题3','简介3','http://localhost:8080/springboot8vmw2/upload/news_picture3.jpg','内容3'),(144,'2021-02-27 13:08:25','标题4','简介4','http://localhost:8080/springboot8vmw2/upload/news_picture4.jpg','内容4'),(145,'2021-02-27 13:08:25','标题5','简介5','http://localhost:8080/springboot8vmw2/upload/news_picture5.jpg','内容5'),(146,'2021-02-27 13:08:25','标题6','简介6','http://localhost:8080/springboot8vmw2/upload/news_picture6.jpg','内容6');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `orderid` varchar(200) NOT NULL COMMENT '订单编号',
  `tablename` varchar(200) DEFAULT 'jiancaishangpin' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `picture` varchar(200) DEFAULT NULL COMMENT '商品图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` float NOT NULL DEFAULT '0' COMMENT '价格/积分',
  `discountprice` float DEFAULT '0' COMMENT '折扣价格',
  `total` float NOT NULL DEFAULT '0' COMMENT '总价格/总积分',
  `discounttotal` float DEFAULT '0' COMMENT '折扣总价格',
  `type` int(11) DEFAULT '1' COMMENT '支付类型',
  `status` varchar(200) DEFAULT NULL COMMENT '状态',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `orderid` (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','cgldew1142m3lm54n6efle9g0rygs43a','2021-02-27 13:19:37','2021-02-27 06:19:38');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-02-27 13:08:25');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuangouxinxi`
--

DROP TABLE IF EXISTS `xuangouxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xuangouxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dingdanbianhao` varchar(200) DEFAULT NULL COMMENT '订单编号',
  `taocanmingcheng` varchar(200) DEFAULT NULL COMMENT '套餐名称',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `jiage` varchar(200) DEFAULT NULL COMMENT '价格',
  `yuyueneirong` longtext COMMENT '预约内容',
  `yuyueriqi` date DEFAULT NULL COMMENT '预约日期',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `dingdanbianhao` (`dingdanbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='选购信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuangouxinxi`
--

LOCK TABLES `xuangouxinxi` WRITE;
/*!40000 ALTER TABLE `xuangouxinxi` DISABLE KEYS */;
INSERT INTO `xuangouxinxi` VALUES (61,'2021-02-27 13:08:25','订单编号1','套餐名称1','账号1','姓名1','http://localhost:8080/springboot8vmw2/upload/xuangouxinxi_tupian1.jpg','价格1','预约内容1','2021-02-27','用户名1','用户姓名1','未支付',1),(62,'2021-02-27 13:08:25','订单编号2','套餐名称2','账号2','姓名2','http://localhost:8080/springboot8vmw2/upload/xuangouxinxi_tupian2.jpg','价格2','预约内容2','2021-02-27','用户名2','用户姓名2','未支付',2),(63,'2021-02-27 13:08:25','订单编号3','套餐名称3','账号3','姓名3','http://localhost:8080/springboot8vmw2/upload/xuangouxinxi_tupian3.jpg','价格3','预约内容3','2021-02-27','用户名3','用户姓名3','未支付',3),(64,'2021-02-27 13:08:25','订单编号4','套餐名称4','账号4','姓名4','http://localhost:8080/springboot8vmw2/upload/xuangouxinxi_tupian4.jpg','价格4','预约内容4','2021-02-27','用户名4','用户姓名4','未支付',4),(65,'2021-02-27 13:08:25','订单编号5','套餐名称5','账号5','姓名5','http://localhost:8080/springboot8vmw2/upload/xuangouxinxi_tupian5.jpg','价格5','预约内容5','2021-02-27','用户名5','用户姓名5','未支付',5),(66,'2021-02-27 13:08:25','订单编号6','套餐名称6','账号6','姓名6','http://localhost:8080/springboot8vmw2/upload/xuangouxinxi_tupian6.jpg','价格6','预约内容6','2021-02-27','用户名6','用户姓名6','未支付',6);
/*!40000 ALTER TABLE `xuangouxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuming` varchar(200) NOT NULL COMMENT '用户名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `money` float DEFAULT '0' COMMENT '余额',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuming` (`yonghuming`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2021-02-27 13:08:25','1','1','用户姓名1','男','http://localhost:8080/springboot8vmw2/upload/yonghu_touxiang1.jpg','440300199101010001','13823888881',100),(12,'2021-02-27 13:08:25','用户2','123456','用户姓名2','男','http://localhost:8080/springboot8vmw2/upload/yonghu_touxiang2.jpg','440300199202020002','13823888882',100),(13,'2021-02-27 13:08:25','用户3','123456','用户姓名3','男','http://localhost:8080/springboot8vmw2/upload/yonghu_touxiang3.jpg','440300199303030003','13823888883',100),(14,'2021-02-27 13:08:25','用户4','123456','用户姓名4','男','http://localhost:8080/springboot8vmw2/upload/yonghu_touxiang4.jpg','440300199404040004','13823888884',100),(15,'2021-02-27 13:08:25','用户5','123456','用户姓名5','男','http://localhost:8080/springboot8vmw2/upload/yonghu_touxiang5.jpg','440300199505050005','13823888885',100),(16,'2021-02-27 13:08:25','用户6','123456','用户姓名6','男','http://localhost:8080/springboot8vmw2/upload/yonghu_touxiang6.jpg','440300199606060006','13823888886',100);
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhuangxiutaocan`
--

DROP TABLE IF EXISTS `zhuangxiutaocan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhuangxiutaocan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `taocanmingcheng` varchar(200) NOT NULL COMMENT '套餐名称',
  `zhuangxiuleixing` varchar(200) DEFAULT NULL COMMENT '装修类型',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `jiage` int(11) NOT NULL COMMENT '价格',
  `zhuangxiucailiao` longtext COMMENT '装修材料',
  `wangongshijian` varchar(200) DEFAULT NULL COMMENT '完工时间',
  `zhuangxiuxiangqing` longtext COMMENT '装修详情',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='装修套餐';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhuangxiutaocan`
--

LOCK TABLES `zhuangxiutaocan` WRITE;
/*!40000 ALTER TABLE `zhuangxiutaocan` DISABLE KEYS */;
INSERT INTO `zhuangxiutaocan` VALUES (51,'2021-02-27 13:08:25','套餐名称1','精装','http://localhost:8080/springboot8vmw2/upload/zhuangxiutaocan_tupian1.jpg',1,'装修材料1','完工时间1','装修详情1','联系电话1','2021-02-27','账号1','姓名1'),(52,'2021-02-27 13:08:25','套餐名称2','精装','http://localhost:8080/springboot8vmw2/upload/zhuangxiutaocan_tupian2.jpg',2,'装修材料2','完工时间2','装修详情2','联系电话2','2021-02-27','账号2','姓名2'),(53,'2021-02-27 13:08:25','套餐名称3','精装','http://localhost:8080/springboot8vmw2/upload/zhuangxiutaocan_tupian3.jpg',3,'装修材料3','完工时间3','装修详情3','联系电话3','2021-02-27','账号3','姓名3'),(54,'2021-02-27 13:08:25','套餐名称4','精装','http://localhost:8080/springboot8vmw2/upload/zhuangxiutaocan_tupian4.jpg',4,'装修材料4','完工时间4','装修详情4','联系电话4','2021-02-27','账号4','姓名4'),(55,'2021-02-27 13:08:25','套餐名称5','精装','http://localhost:8080/springboot8vmw2/upload/zhuangxiutaocan_tupian5.jpg',5,'装修材料5','完工时间5','装修详情5','联系电话5','2021-02-27','账号5','姓名5'),(56,'2021-02-27 13:08:25','套餐名称6','精装','http://localhost:8080/springboot8vmw2/upload/zhuangxiutaocan_tupian6.jpg',6,'装修材料6','完工时间6','装修详情6','联系电话6','2021-02-27','账号6','姓名6');
/*!40000 ALTER TABLE `zhuangxiutaocan` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-02 16:07:12
