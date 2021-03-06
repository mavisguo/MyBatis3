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

 Date: 17/03/2018 16:38:39
*/

SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`
(
    `tid`   int(5) NOT NULL AUTO_INCREMENT,
    `tname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `tage`  int(3) NULL DEFAULT NULL,
    `score` double NULL DEFAULT NULL,
    PRIMARY KEY (`tid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student`
VALUES (1, '张三', 23, 93.5);
INSERT INTO `student`
VALUES (2, '李四', 24, 94.5);
INSERT INTO `student`
VALUES (3, '王五', 25, 95.5);

SET
FOREIGN_KEY_CHECKS = 1;
