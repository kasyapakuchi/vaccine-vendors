create schema vaccinevendor;

CREATE TABLE `vendor` (
  `vendor_id` varchar(256) NOT NULL,
  `vendor_name` varchar(256) DEFAULT NULL,
  `location` varchar(256) DEFAULT NULL,
  `city` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`vendor_id`)
) ENGINE=InnoDB;


CREATE TABLE `vaccines` (
  `vaccine_id` varchar(256) NOT NULL,
  `vendor_id` varchar(256) DEFAULT NULL,
  `vaccine_name` varchar(256) DEFAULT NULL,
  `available_count` bigint DEFAULT NULL,
  `exp_date` datetime DEFAULT NULL,
  PRIMARY KEY (`vaccine_id`),
  KEY `vendor_id` (`vendor_id`),
  CONSTRAINT `vaccines_ibfk_1` FOREIGN KEY (`vendor_id`) REFERENCES `vendor` (`vendor_id`)
) ENGINE=InnoDB;

