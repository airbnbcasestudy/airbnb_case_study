USE airbnb_db;

CREATE TABLE users(
	id int auto_increment primary key,
    first_name varchar(255) NOT NULL,
    last_name varchar(255) NOT NULL,
    email varchar(255),
    password text,
    date_of_birth date,
    facebook_id varchar(255),
    status tinyint(2) NOT NULL
);

CREATE TABLE house_type(
	id int auto_increment primary key,
    name varchar(255) NOT NULL,
    created datetime NOT NULL,
    modified datetime NOT NULL,
    status tinyint(2) NOT NULL
);

CREATE TABLE room_type(
	id int auto_increment primary key,
    name varchar(255) NOT NULL,
	created datetime NOT NULL,
    modified datetime NOT NULL,
    status tinyint(2) NOT NULL
);

CREATE TABLE province(
	id int auto_increment primary key,
    name varchar(255) NOT NULL,
    code varchar(255) NOT NULL,
    status tinyint(2) NOT NULL
);

CREATE TABLE county(
	id int auto_increment primary key,
    province_id int NOT NULL,
    name varchar(255) NOT NULL,
    code varchar(255) NOT NULL,
    status tinyint(2) NOT NULL
);

CREATE TABLE properties(
	id int auto_increment primary key,
    name varchar(255),
    description text NOT NULL,
	user_id int NOT NULL,
    house_type_id int NOT NULL,
    room_type_id int NOT NULL, 
    province_id int NOT NULL,
    country_id int NOT NULL, 
    address text NOT NULL,
    bedroom_count int NOT NULL,
    bathroom_count int NOT NULL,
    price decimal(10),
    status tinyint(2) NOT NULL
);

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

CREATE TABLE property_img(
	id int auto_increment primary key,
    property_id int NOT NULL,
    image_path varchar(255) NOT NULL
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

select p.*, pi.* from properties p join property_img pi on p.id = pi.property_id where p.id = 1

