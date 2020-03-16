CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(256) NOT NULL,
  `email` VARCHAR(512) NOT NULL,
  `phone` VARCHAR(20) NULL,
  `password` VARCHAR(256) NOT NULL,
  `birthday` DATE NOT NULL,
  `status` VARCHAR(256) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name_unique` (`name`),
  UNIQUE KEY `user_email_unique` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO `user` (`name`, `email`, `phone`, `password`, `birthday`, `status`)
VALUES ('flavio', 'flavio@fiap.com', '11999999999', '$2a$12$BFGgbf.8mJAxsI6jFlm/CeggMD/VpSqUj0xTSj.e0btI6XJijmCnm', '1988-04-29', 'ACTIVE');