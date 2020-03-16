CREATE TABLE `users_sports` (
  `user_id` BIGINT(20) NOT NULL,
  `sport_id` BIGINT(20) NOT NULL,
  `level` VARCHAR(256) NOT NULL,
  `months` INT(10) NOT NULL,
  PRIMARY KEY (`user_id`,`sport_id`),
  CONSTRAINT `fk_users_sports_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `fk_users_sports_sports` FOREIGN KEY (`sport_id`) REFERENCES `sport` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `users_sports` (`user_id`, `sport_id`, `level`, `months`) VALUES (1, 1, 'AMATEUR', 20);
INSERT INTO `users_sports` (`user_id`, `sport_id`, `level`, `months`) VALUES (1, 2, 'PROFESSIONAL', 32);