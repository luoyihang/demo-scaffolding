CREATE TABLE `t_person` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `userName` varchar(50) DEFAULT NULL COMMENT '用户名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `personName` varchar(255) DEFAULT NULL COMMENT '用户名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='用户表';



