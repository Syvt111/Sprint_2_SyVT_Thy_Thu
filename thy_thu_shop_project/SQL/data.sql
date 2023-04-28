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
 ('https://scontent.fsgn2-4.fna.fbcdn.net/v/t39.30808-6/341462999_2671505906325967_6992278550125931184_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=fWBG1OnBlH4AX_4iJ2M&_nc_ht=scontent.fsgn2-4.fna&oh=00_AfCb-HIQEGjQtJSyp1FJ3jwPWnLgbLKNhsGQNQk_f2frrA&oe=64455858',1),
 ('https://scontent.fsgn2-4.fna.fbcdn.net/v/t39.30808-6/341198598_1316469625568137_6389935900806964640_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=15yH53CVs-8AX-2e_g7&_nc_ht=scontent.fsgn2-4.fna&oh=00_AfAgCmKFh1HZXRIiLO-TnVH4RbOLFLg-Or9P6NcSKSX2nA&oe=64441E7C',1),
 ('https://scontent.fsgn2-8.fna.fbcdn.net/v/t39.30808-6/341685474_1353521342156528_2951168477368966469_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=X_E8BqztLPYAX8VikWQ&_nc_ht=scontent.fsgn2-8.fna&oh=00_AfBcjpph48FmP8yqX50lmLJUQYvsyydTUoqOXvjdEMefvg&oe=64449A4C',1),
 ('https://scontent.fsgn2-7.fna.fbcdn.net/v/t39.30808-6/340932780_210895121580359_7881943884609371355_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=G0gI7tLuqqAAX8nh1EI&_nc_ht=scontent.fsgn2-7.fna&oh=00_AfAgA7PJadw3-WmKU9zfZS3ktqeURzuaC52Byk1HjTIE5A&oe=64441775',1), 
 ('https://scontent.fsgn2-5.fna.fbcdn.net/v/t39.30808-6/340926618_1747689332293368_8952512025315175093_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=BnXqSkgexTAAX_aLJjl&_nc_ht=scontent.fsgn2-5.fna&oh=00_AfC3qLlx9nUXL6qyz8JoAy2hYnkPPhEx9-jkpo_Jm3gMjA&oe=64444D57',2), 
 ('https://scontent.fsgn2-5.fna.fbcdn.net/v/t39.30808-6/340823653_1260740387877424_7914424019328410101_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=2kFytM0iykoAX-ew2zs&_nc_ht=scontent.fsgn2-5.fna&oh=00_AfCcEnxwHCNghBKoRMioLUVGBrAViHJFcXo2Co7b5Ooyyg&oe=64440377',2), 
 ('https://scontent.fsgn2-6.fna.fbcdn.net/v/t39.30808-6/340964385_240060135168824_3857617940295325951_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=ymw_Ab1gbo8AX-pOW87&_nc_ht=scontent.fsgn2-6.fna&oh=00_AfBdEbM_wPchQ-R7GtN0fkraOQb-8bFbq14o-pPdWXxayw&oe=64452719',2), 
 ('https://scontent.fsgn2-5.fna.fbcdn.net/v/t39.30808-6/341517959_267672158933802_7296883328350561823_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=1xp4rAc39AMAX8h3MEF&_nc_ht=scontent.fsgn2-5.fna&oh=00_AfBekVjgMVvY5LUdMgX5aSUKXGunjP1954-ZR9VEDKRTAw&oe=64452917',2),
 ('https://scontent.fdad1-3.fna.fbcdn.net/v/t39.30808-6/301183856_570915501309306_802994049969712918_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=TiesNFJ10WkAX_znxrd&_nc_ht=scontent.fdad1-3.fna&oh=00_AfDG1dDP4IB4X6aHqNs2iRUUOUO3QTdcgkdPoTwYuNn9Iw&oe=6443CBE7',3), 
 ('https://scontent.fdad1-4.fna.fbcdn.net/v/t39.30808-6/301061039_570915581309298_6024341164992928898_n.jpg?stp=dst-jpg_p206x206&_nc_cat=100&ccb=1-7&_nc_sid=da31f3&_nc_ohc=ZdjL3IbKSg0AX9BPKnE&_nc_ht=scontent.fdad1-4.fna&oh=00_AfB1qfq9Cmr-9RNkcrZPtDuO4jYZqQdAyxzIP2jz2xuuwA&oe=6444C0C3',3), 
 ('https://scontent.fdad1-4.fna.fbcdn.net/v/t39.30808-6/301138112_570915527975970_1421457035190012357_n.jpg?stp=dst-jpg_p206x206&_nc_cat=100&ccb=1-7&_nc_sid=da31f3&_nc_ohc=tacjt4yefd8AX9f0RKl&_nc_ht=scontent.fdad1-4.fna&oh=00_AfBA5_y5IlbMDrPi_hU0Xtd1G_GlLNjoqcE7hT1d2E6tRQ&oe=64440DD4',3),
 ('https://scontent.fdad1-4.fna.fbcdn.net/v/t39.30808-6/301010805_570915304642659_5516259919393042104_n.jpg?stp=dst-jpg_p206x206&_nc_cat=105&ccb=1-7&_nc_sid=da31f3&_nc_ohc=dzJ6ClYPXAEAX-Uz8-L&_nc_ht=scontent.fdad1-4.fna&oh=00_AfBU-LehBrBW8rzYgQFrD9Lv2VXCa8UsDi6tmxrYo8XpGA&oe=6445426A',3),
 ('https://scontent.fdad3-6.fna.fbcdn.net/v/t39.30808-6/301567333_571780767889446_2706165009972821761_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=EVfdz65Z5GkAX-Z-rIq&_nc_ht=scontent.fdad3-6.fna&oh=00_AfBdQMFbD1Itaiotwod8TAYicjoV5X77JA5gxWfehuonHw&oe=64446AEB',4),
 ('https://scontent.fdad3-6.fna.fbcdn.net/v/t39.30808-6/301222792_570904174643772_4471682753101749454_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=z8Cxjfl4ZRwAX9fi6Pu&_nc_ht=scontent.fdad3-6.fna&oh=00_AfCZLtMjJoH818mMSWT2a1Xs5yu7bRnXfUGa-A_VL6SEXg&oe=644498C7',5),
 ('https://scontent.fdad3-1.fna.fbcdn.net/v/t39.30808-6/301183860_570904361310420_4867085203321388659_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=EwlpSUb5DiEAX9xM6FI&_nc_ht=scontent.fdad3-1.fna&oh=00_AfAqN9a8pcwEdgTbEJmPEAHyps3UOsAsaLvQcubWow9Bvg&oe=64445665',6)
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
