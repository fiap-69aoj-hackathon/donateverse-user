CREATE TABLE `users_authorities` (
  `user_id` BIGINT(20) NOT NULL,
  `authority_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`user_id`,`authority_id`),
  CONSTRAINT `fk_authorities_authority` FOREIGN KEY (`authority_id`) REFERENCES `authority` (`id`),
  CONSTRAINT `fk_authorities_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `users_authorities` (`user_id`, `authority_id`) VALUES (1, 1);
INSERT INTO `users_authorities` (`user_id`, `authority_id`) VALUES (1, 2);