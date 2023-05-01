use thy_thu_project;
INSERT INTO `thy_thu_project`.`account_role` (`account_id`,`role_id`) VALUES 
('1','1'),
 ('2','2'), 
 ('3','2');

INSERT INTO `thy_thu_project`.`role` (`role_name`) VALUES
 ('ROLE_USER '),
 ('ROLE_ADMIN');


INSERT INTO `thy_thu_project`.`order_detail` (`quantity`, `order_id`, `product_id`) VALUES 
(2, 1, 3),
 (1, 2, 3),
 (3, 3, 2),
 (2, 1, 2), 
 (4, 4, 1);

INSERT INTO `thy_thu_project`.`image` (`img`,`product_id`) VALUES
 ('https://scontent.fdad3-1.fna.fbcdn.net/v/t39.30808-6/343422970_103874696026507_8052583952701839957_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=ZHriHakCHvAAX89PwG3&_nc_ht=scontent.fdad3-1.fna&oh=00_AfA6rrRm9bFMqw5BDqxIanMqg-fuqGa8xNMf0gP3lm22YA&oe=64516C3B',1),
 ('https://scontent.fdad3-6.fna.fbcdn.net/v/t39.30808-6/343439557_172957745312672_5500304281341748031_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=jjwqsFHa2xQAX-qzQjh&_nc_ht=scontent.fdad3-6.fna&oh=00_AfAvpLraFiYlwW09MdRCGlKtK7kzrTKcPlDtLZA7tZH5LA&oe=64518BD7',1),
 ('https://scontent.fdad3-6.fna.fbcdn.net/v/t39.30808-6/343466930_624671289524608_8178035985586693146_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=uUf0r0cHXDkAX_uEkYL&_nc_ht=scontent.fdad3-6.fna&oh=00_AfAvKoLZTlm-QGhazGXtjmzLrfMnEZKSiLJ_uqfsXDF9cw&oe=64522819',1),
 ('https://scontent.fdad3-5.fna.fbcdn.net/v/t39.30808-6/343440548_1613998022411376_4186132771133230555_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=swVkBa_ZnAMAX9UfboV&_nc_oc=AQl8ihn-acuKVh9aayTscw2b5UdsUnzT-eJqqVShBb1cR432oBWxlIPv23_2YkkUerU&_nc_ht=scontent.fdad3-5.fna&oh=00_AfAX_hyZE8wRRBYNCBcxAnpLtJchh8yyFHZJbouiWetAlQ&oe=645248CA',1), 
 ('https://scontent.fdad3-4.fna.fbcdn.net/v/t39.30808-6/343414909_220606763931726_4878736514318079013_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=sNdbCmGfxgcAX-g0SSw&_nc_ht=scontent.fdad3-4.fna&oh=00_AfAbaRGMggVmjbu-kcJPx9lToUyPZnFEbJKw8xGo6XXjEA&oe=64523E5D',2), 
 ('https://scontent.fdad3-1.fna.fbcdn.net/v/t39.30808-6/343506960_222986810338068_7823860559614648254_n.jpg?stp=dst-jpg_p600x600&_nc_cat=110&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=C2-LZkqb9g0AX9w2Ce7&_nc_ht=scontent.fdad3-1.fna&oh=00_AfDbNEZIf67X-KcjTN4eQ69zGdmzGbFpQFvwcupgrmm3gw&oe=645124A2',2), 
 ('https://scontent.fdad3-1.fna.fbcdn.net/v/t39.30808-6/343506960_222986810338068_7823860559614648254_n.jpg?stp=dst-jpg_p600x600&_nc_cat=110&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=C2-LZkqb9g0AX9w2Ce7&_nc_ht=scontent.fdad3-1.fna&oh=00_AfDbNEZIf67X-KcjTN4eQ69zGdmzGbFpQFvwcupgrmm3gw&oe=645124A2',2), 
 ('https://scontent.fdad3-5.fna.fbcdn.net/v/t39.30808-6/343418795_943413280183776_5512327287540288287_n.jpg?stp=dst-jpg_p600x600&_nc_cat=102&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=04_P-Jy2HxcAX_LTgrY&_nc_ht=scontent.fdad3-5.fna&oh=00_AfAm3hWOEKOgV8lwW7r6LuzqN75fniKjaVMm1gswvlqSPA&oe=64524D46',2),
 ('https://scontent.fdad3-1.fna.fbcdn.net/v/t39.30808-6/301285112_570915137976009_2766275044305895550_n.jpg?stp=dst-jpg_p600x600&_nc_cat=108&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=gy7u9o91kWAAX_uOwye&_nc_ht=scontent.fdad3-1.fna&oh=00_AfCqH6aODbGt4CTmPlhVuemW3n_H6IxY1NEsAomvZFpSWw&oe=6451752A',3), 
 ('https://scontent.fdad3-6.fna.fbcdn.net/v/t39.30808-6/301149486_570915164642673_3018687423877653974_n.jpg?stp=dst-jpg_p600x600&_nc_cat=104&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=h3awy4NWcBAAX_2KZ_M&_nc_ht=scontent.fdad3-6.fna&oh=00_AfDf-_1e53Gs9slnjRSW4Sb6jQ5UeFcoz_jVD_qG0s8gyQ&oe=6451FB7A',3), 
 ('https://scontent.fdad3-1.fna.fbcdn.net/v/t39.30808-6/301068763_570915174642672_3671274077072471074_n.jpg?stp=dst-jpg_p600x600&_nc_cat=103&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=W3eAeXuntKEAX_rKnP1&_nc_ht=scontent.fdad3-1.fna&oh=00_AfAc7e-vXY9x0OHj4VYN5bt-ctCWQqbVV-UFV-Q2rQSu4w&oe=645225EE',3),
 ('https://scontent.fdad3-6.fna.fbcdn.net/v/t39.30808-6/301401152_570915207976002_1688024756910295172_n.jpg?stp=dst-jpg_p600x600&_nc_cat=109&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=AFbG9vvjnzsAX_DffM_&_nc_ht=scontent.fdad3-6.fna&oh=00_AfDtUvKVNnXlGT1G4Tb3lX4chnRWxPYCmz5EBkNSd8mtrQ&oe=6450F699',3),
 ('https://scontent.fdad3-4.fna.fbcdn.net/v/t39.30808-6/301382587_571781064556083_8653467509568970373_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=NkAhh_jrJEsAX-95sIn&_nc_ht=scontent.fdad3-4.fna&oh=00_AfAdy0KDDytVLzUOXAj7yvrT_WPwZbbRawgz_dgJEQ1VJA&oe=64512ADF',4),
 ('https://scontent.fdad3-6.fna.fbcdn.net/v/t39.30808-6/342385423_605734451470288_3919026216395974453_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=KhoD5flIiXkAX_P3b8I&_nc_ht=scontent.fdad3-6.fna&oh=00_AfCFmtCxApMeg-1KibWXUsdaq_tjzmk5X8hz_tJXiOnTUw&oe=6451A1FF',5),
 ('https://scontent.fdad3-1.fna.fbcdn.net/v/t39.30808-6/341368431_1420261805378173_1400791020302257473_n.jpg?stp=dst-jpg_p600x600&_nc_cat=103&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=pxj0oIf2P8AAX9685IL&_nc_ht=scontent.fdad3-1.fna&oh=00_AfCh7FKjnkFAJwR6lBexnd0Bh_xOcBV-1XwJX59mj2AvYw&oe=645261EB',6)
;

INSERT INTO `thy_thu_project`.`product` (`product_code`, `product_name`, `price`, `description`, `flag_delete`, `category_id`) VALUES 
('P001', 'Túi xách laptop', '1000000', 'PRADA, đứng 25cm, ngang 21cm', 0, 7), 
('P002', 'Giày lười', '480000', 'Màu xanh rêu, dà bò, size 40', 0, 3), 
('P003', 'Kinh nữ', '300000', 'Chanel, mắt trà nữ', 0, 6),
('P004', 'Thắt lưng', '350000', 'Quần âu, da thật 100%', 0, 10),
('P005', 'Ví cầm tay', '350000', 'Quần âu, da thật 100%', 0, 9),
('P006', 'Ba lô', '350000','Vip, ngang 22cm, đứng 12cm', 0, 8)
;

INSERT INTO `thy_thu_project`.`category` (`category_name`) VALUES 
('Ví'), 
('Zippo'), 
('Giày Nam'), 
('Giày Nữ'), 
('Kính Nam'), 
('Kính Nữ'), 
('Tú Xách'), 
('Bao Lô'), 
('Ví Cầm Tay'), 
('Thắt Lưng')
;


INSERT INTO `thy_thu_project`.`account` (email, `password`, username, flag_delete, avatar, `name`, gender, phone_number, address) VALUES 
('tiensyvan@gmail.com', '$12$fKU8tawsAZKS1IGyZTtyiuuwdcFRHO07lDaPfTBKZ/Gk0NgaOeGrm', 'syvt', 0, 'https://scontent.fsgn2-7.fna.fbcdn.net/v/t39.30808-6/329957660_518849393693507_1360756579603794620_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=zsic4OzXswsAX_jR-au&_nc_oc=AQmwqqDJvom5QmRPIKuyX-y3Ftq9WuNj_6L_L6_kMeOv1Q-IZ5kfY8qkjqGWPmjpL0Y&_nc_ht=scontent.fsgn2-7.fna&oh=00_AfDsjQ_ZMkm1UlOY_Tmj_cwRAXGZQS4Wo6rQpxxICExDyg&oe=6444B7C0', 'Tiến Sỹ', 1, '123456789', 'Đà Nẵng'), 
('tranthithanhthu26296@gmail.com', '$12$fKU8tawsAZKS1IGyZTtyiuuwdcFRHO07lDaPfTBKZ/Gk0NgaOeGrm', 'thanhthu', 0, 'https://scontent.fsgn2-3.fna.fbcdn.net/v/t39.30808-6/337683244_251163847249612_2438987209407196604_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=djnRIkx5Cc0AX9e9Dxh&_nc_ht=scontent.fsgn2-3.fna&oh=00_AfD2Fvz5AkDyBL7YiTYj6x2xR_J_U6IVg1880y8D9waO3g&oe=6444FFB7', 'Thanh Thu', 0, '987654321', 'Đà Nẵng'),
('trantuan1010@gmail.com', '$12$fKU8tawsAZKS1IGyZTtyiuuwdcFRHO07lDaPfTBKZ/Gk0NgaOeGrm', 'trantuan', 0, 'https://scontent.fsgn2-4.fna.fbcdn.net/v/t39.30808-6/329152017_569926781705130_6197549642398066089_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=7dPXfYZQcCoAX_66PT1&_nc_ht=scontent.fsgn2-4.fna&oh=00_AfDBpjiBoLB6XDF83qI9al8RThA1fJJHSRTHu8X47bgTfw&oe=6444E333', 'Trần Tuấn', 1, '987654210', 'Đà Nẵng')
;

INSERT INTO `thy_thu_project`.`order_product` (`code_order`, `time_order`, `total_price`, `account_id`) VALUES
 ('ORD001', '2023-04-19 10:30:00', 500000, 1),
 ('ORD002', '2023-04-19 12:00:00', 1000000, 2),
 ('ORD003', '2023-04-19 14:30:00', 1000000,3), 
 ('ORD004', '2023-04-19 16:00:00', 1200000, 3),
 ('ORD005', '2023-04-19 18:30:00', 480000, 2)
