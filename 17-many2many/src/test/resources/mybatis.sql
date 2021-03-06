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

 Date: 18/03/2018 15:36:10
*/

SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`
(
    `cid`   int(5) NOT NULL AUTO_INCREMENT,
    `cname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course`
VALUES (1, 'JavaSE');
INSERT INTO `course`
VALUES (2, 'JavaEE');
INSERT INTO `course`
VALUES (3, 'Android');

-- ----------------------------
-- Table structure for middle
-- ----------------------------
DROP TABLE IF EXISTS `middle`;
CREATE TABLE `middle`
(
    `id`         int(5) NOT NULL AUTO_INCREMENT,
    `student_id` int(5) NULL DEFAULT NULL,
    `course_id`  int(5) NULL DEFAULT NULL,
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of middle
-- ----------------------------
INSERT INTO `middle`
VALUES (1, 1, 1);
INSERT INTO `middle`
VALUES (2, 1, 2);
INSERT INTO `middle`
VALUES (3, 2, 1);
INSERT INTO `middle`
VALUES (4, 2, 3);
INSERT INTO `middle`
VALUES (5, 3, 2);
INSERT INTO `middle`
VALUES (6, 3, 3);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`
(
    `sid`   int(5) NOT NULL AUTO_INCREMENT,
    `sname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student`
VALUES (1, '张三');
INSERT INTO `student`
VALUES (2, '李四');
INSERT INTO `student`
VALUES (3, '王五');

SET
FOREIGN_KEY_CHECKS = 1;
