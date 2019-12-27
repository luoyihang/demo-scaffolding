CREATE TABLE `t_person_0` (
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

------------------------------------------------------------------------------------------------

CREATE TABLE `t_person_range_0` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `userName` varchar(50) DEFAULT NULL COMMENT '用户名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `personName` varchar(255) DEFAULT NULL COMMENT '用户名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

CREATE TABLE `t_person_range_1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `userName` varchar(50) DEFAULT NULL COMMENT '用户名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `personName` varchar(255) DEFAULT NULL COMMENT '用户名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';