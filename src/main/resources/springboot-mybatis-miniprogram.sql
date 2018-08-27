/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : springboot-mybatis-miniprogram

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 27/08/2018 15:29:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_area
-- ----------------------------
DROP TABLE IF EXISTS `tb_area`;
CREATE TABLE `tb_area`  (
  `area_id` int(2) NOT NULL AUTO_INCREMENT,
  `area_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `priority` int(2) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `last_edit_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`area_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_area
-- ----------------------------
INSERT INTO `tb_area` VALUES (1, '东湖', 1, NULL, NULL);
INSERT INTO `tb_area` VALUES (2, '西湖', 2, NULL, NULL);
INSERT INTO `tb_area` VALUES (8, '南湖', 3, '2018-08-27 14:50:03', '2018-08-27 14:57:29');
INSERT INTO `tb_area` VALUES (9, '北湖', 4, '2018-08-27 14:57:14', '2018-08-27 14:58:14');
INSERT INTO `tb_area` VALUES (10, '中湖', 456, '2018-08-27 14:59:17', '2018-08-27 15:03:45');

SET FOREIGN_KEY_CHECKS = 1;
