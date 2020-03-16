CREATE TABLE `sport` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(256) NOT NULL,
  `url_icon` VARCHAR(2048) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sport_name_unique` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO `sport` (`name`, `url_icon`) VALUES ('Mergulho', 'diving');
INSERT INTO `sport` (`name`, `url_icon`) VALUES ('Futebol', 'soccer');
INSERT INTO `sport` (`name`, `url_icon`) VALUES ('Basquete', 'basketball');
INSERT INTO `sport` (`name`, `url_icon`) VALUES ('Judo', 'judo');
INSERT INTO `sport` (`name`, `url_icon`) VALUES ('Vôlei', 'volleyball');