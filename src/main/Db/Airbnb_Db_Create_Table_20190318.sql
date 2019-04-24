USE airbnb_db;

USE airbnb_db;


CREATE TABLE `properties` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` longtext COLLATE utf8_unicode_ci,
  `user_id` int(11) DEFAULT NULL,
  `house_type` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` text COLLATE utf8_unicode_ci,
  `bedrooms` int(11) DEFAULT NULL,
  `bathrooms` int(11) DEFAULT NULL,
  `price` decimal(10,0) DEFAULT NULL,
  `status` tinyint(2) NOT NULL DEFAULT '1',
  `image_default` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


CREATE TABLE `property_img` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `property_id` int(11) NOT NULL,
  `image_path` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `last_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` text COLLATE utf8_unicode_ci,
  `date_of_birth` date DEFAULT NULL,
  `facebook_id` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` tinyint(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


CREATE TABLE booking(
	id int auto_increment primary key,
    property_id int NOT NULL,
    user_id int NOT NULL,
    check_in_date datetime NOT NULL,
    check_out_date datetime NOT NULL,
    amount_paid decimal(10),
    cancel_date datetime NOT NULL,
    transaction_id int NOT NULL,
    booking_date datetime NOT NULL,
    created datetime NOT NULL,
    modified datetime NOT NULL,
    status tinyint(2) NOT NULL
);


CREATE TABLE transactions(
	id int auto_increment primary key,
    property_id int NOT NULL, 
    booking_id int NOT NULL, 
    amount decimal(10) NOT NULL,
    created datetime NOT NULL,
    modified datetime NOT NULL,
    status tinyint(2) NOT NULL
);


CREATE TABLE reviews(
	id int auto_increment primary key,
    property_id int NOT NULL,
    review_by_user int NOT NULL,
    booking_id int NOT NULL,
    comment text NOT NULL,
    created datetime NOT NULL,
    modified datetime NOT NULL,
    status tinyint(2) NOT NULL
);


