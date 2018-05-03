
DROP TABLE IF EXISTS `tb_cu_price`;
CREATE TABLE `tb_cu_price` (
  `t_id` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `dateStr` varchar(16) DEFAULT NULL,
  `priceRange` varchar(255) DEFAULT NULL,
  `avgPrice` varchar(255) DEFAULT NULL,
  `rollPrice` varchar(11) DEFAULT NULL,
  `unit` varchar(11) DEFAULT NULL,
`CURRENT_TIME` timestamp not null default current_timestamp,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

