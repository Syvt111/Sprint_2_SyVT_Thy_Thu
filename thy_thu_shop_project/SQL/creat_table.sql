CREATE DATABASE `thy_thu`;

USE `thy_thu`;

CREATE TABLE `thy_thu`.`account` (
  `id_account` INT auto_increment NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `encrypt_password` VARCHAR(45) NOT NULL,
  `usename` VARCHAR(45) NOT NULL,
  `flag_delete` TINYINT NOT NULL,
  `avatar` VARCHAR(255) NOT NULL,
 `name` VARCHAR(45) NOT NULL,
  `gender` VARCHAR(255) , 
  `phone` VARCHAR(255) NOT NULL,
  `address` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_account`));
  
  CREATE TABLE `thy_thu`.`role` (
  `id_role` INT auto_increment NOT NULL,
  `name_role` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_role`));

CREATE TABLE  `thy_thu`.`account_role` (
  `id_account_role` INT auto_increment NOT NULL,
  `id_role` INT,
  `id_account` INT,
  FOREIGN KEY(id_role) REFERENCES `role`(id_role),
  FOREIGN KEY(id_account) REFERENCES `account`(id_account),
  PRIMARY KEY (`id_account_role`));

  
  CREATE TABLE `thy_thu`.`category` (
  `id_category` INT  auto_increment NOT NULL,
  `name_category` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_category`));


  CREATE TABLE `thy_thu`.`origin` (
  `id_origin` INT  auto_increment NOT NULL,
  `name_origin` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_origin`));
  
  CREATE TABLE `thy_thu`.`product` (
  `id_product` INT  auto_increment NOT NULL,
    `code` VARCHAR(45) NOT NULL,
  `name_product` VARCHAR(45) NOT NULL,
   `price` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NOT NULL,
   `image` longtext,
  `flag_delete` BIT,
  `id_category` int,
  `id_origin` int ,
  foreign key(`id_category`) references category(`id_category`),
  PRIMARY KEY (`id_product`));
  
  CREATE TABLE `thy_thu`.`order_product` (
  id_order INT auto_increment NOT NULL PRIMARY KEY,
  code_order varchar(45),
  day_order varchar(45),
  flag_delete BIT,
  time_order datetime,
  total_price int,
  delivery_status varchar(45),
   `id_account` INT,
    foreign key(id_account) references `account`(id_account)
  );
  
  CREATE TABLE `thy_thu`.`order_detail`(
  id_order_detail int auto_increment primary key,
  quantity int,
  id_order int,
  id_product int,
  foreign key(`id_product`) references product(`id_product`),
  foreign key(`id_order`) references `order_product`(`id_order`)
  );
  CREATE TABLE thy_thu.cart (
id_cart INT auto_increment NOT NULL,
id_account INT,
id_product INT,
quantity INT,
FOREIGN KEY(id_account) REFERENCES account(id_account),
FOREIGN KEY(id_product) REFERENCES product(id_product),
PRIMARY KEY (id_cart)
);