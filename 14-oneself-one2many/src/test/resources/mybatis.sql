/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 18/03/2018 14:45:06
*/

SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for newslabel
-- ----------------------------
DROP TABLE IF EXISTS `newslabel`;
CREATE TABLE `newslabel`
(
    `id`   int(5) NOT NULL AUTO_INCREMENT,
    `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `pid`  int(5) NULL DEFAULT NULL,
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of newslabel
-- ----------------------------
INSERT INTO `newslabel`
VALUES (1, '娱乐新闻', 0);
INSERT INTO `newslabel`
VALUES (2, '体育新闻', 0);
INSERT INTO `newslabel`
VALUES (3, 'NBA', 2);
INSERT INTO `newslabel`
VALUES (4, 'CBA', 2);
INSERT INTO `newslabel`
VALUES (5, '火箭', 3);
INSERT INTO `newslabel`
VALUES (6, '湖人', 3);
INSERT INTO `newslabel`
VALUES (7, '北京金隅', 4);
INSERT INTO `newslabel`
VALUES (8, '浙江广厦', 4);
INSERT INTO `newslabel`
VALUES (9, '青岛双星', 4);
INSERT INTO `newslabel`
VALUES (10, '港台明星', 1);
INSERT INTO `newslabel`
VALUES (11, '内地影视', 1);

SET
FOREIGN_KEY_CHECKS = 1;
