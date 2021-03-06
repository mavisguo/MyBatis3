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

 Date: 18/03/2018 12:13:14
*/

SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for country
-- ----------------------------
DROP TABLE IF EXISTS `country`;
CREATE TABLE `country`
(
    `cid`   int(5) NOT NULL AUTO_INCREMENT,
    `cname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of country
-- ----------------------------
INSERT INTO `country`
VALUES (1, 'USA');
INSERT INTO `country`
VALUES (2, 'UK');

-- ----------------------------
-- Table structure for minister
-- ----------------------------
DROP TABLE IF EXISTS `minister`;
CREATE TABLE `minister`
(
    `mid`        int(5) NOT NULL AUTO_INCREMENT,
    `mname`      varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `country_id` int(5) NULL DEFAULT NULL,
    PRIMARY KEY (`mid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of minister
-- ----------------------------
INSERT INTO `minister`
VALUES (1, 'AAA', 1);
INSERT INTO `minister`
VALUES (2, 'BBB', 1);
INSERT INTO `minister`
VALUES (3, 'CCC', 1);
INSERT INTO `minister`
VALUES (4, 'DDD', 2);
INSERT INTO `minister`
VALUES (5, 'EEE', 2);

SET
FOREIGN_KEY_CHECKS = 1;
