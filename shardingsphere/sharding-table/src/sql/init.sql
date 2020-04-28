-- 如果是分库，则0库是0 2 表，1库是1 2表

CREATE TABLE `t_person_0` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `userName` varchar(50) DEFAULT NULL COMMENT '用户名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `personName` varchar(255) DEFAULT NULL COMMENT '用户名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

CREATE TABLE `t_person_2` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `userName` varchar(50) DEFAULT NULL COMMENT '用户名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `personName` varchar(255) DEFAULT NULL COMMENT '用户名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

CREATE TABLE `t_person_range_0_201912` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `userName` varchar(50) DEFAULT NULL COMMENT '用户名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `personName` varchar(255) DEFAULT NULL COMMENT '用户名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

CREATE TABLE `t_person_range_2_201912` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `userName` varchar(50) DEFAULT NULL COMMENT '用户名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `personName` varchar(255) DEFAULT NULL COMMENT '用户名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';




CREATE TABLE `t_person_1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `userName` varchar(50) DEFAULT NULL COMMENT '用户名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `personName` varchar(255) DEFAULT NULL COMMENT '用户名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

CREATE TABLE `t_person_3` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `userName` varchar(50) DEFAULT NULL COMMENT '用户名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `personName` varchar(255) DEFAULT NULL COMMENT '用户名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';


CREATE TABLE `t_person_range_1_201912` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `userName` varchar(50) DEFAULT NULL COMMENT '用户名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `personName` varchar(255) DEFAULT NULL COMMENT '用户名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

CREATE TABLE `t_person_range_3_201912` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `userName` varchar(50) DEFAULT NULL COMMENT '用户名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `personName` varchar(255) DEFAULT NULL COMMENT '用户名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

