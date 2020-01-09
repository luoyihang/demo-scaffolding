1. 执行 SQL
```mysql
CREATE TABLE `t_storage` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '更新时间',
  `skuCode` varchar(50) DEFAULT NULL COMMENT '商品编码',
  `storageNum` int(11) DEFAULT NULL COMMENT '库存数量',
  PRIMARY KEY (`id`),
  KEY `idx_skuCode` (`skuCode`) USING BTREE 
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='库存表';

CREATE TABLE `t_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '更新时间',
  `orderCode` varchar(50) DEFAULT NULL COMMENT '单据号',
  `skuCode` varchar(50) DEFAULT NULL COMMENT '商品编码',
  `purchaseNum` int(11) DEFAULT NULL COMMENT '购买数量',
  PRIMARY KEY (`id`),
  KEY `idx_skuCode` (`skuCode`) USING BTREE 
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='库存表';

```