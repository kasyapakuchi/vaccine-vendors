//schema
create schema vaccinevendor;

//DDL
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

//DML

INSERT INTO `vaccinevendor`.`vaccines`
(`vaccine_id`,
`vendor_id`,
`vaccine_name`,
`available_count`,
`exp_date`)
VALUES
("Covid4",
"V126",
"CovidVaccine",
1000,
now()+100);


INSERT INTO `vaccinevendor`.`vendor`
(`vendor_id`,
`vendor_name`,
`location`,
`city`)
VALUES
("V126",
"Reddys",
"Telangana",
"Hyderabad");

