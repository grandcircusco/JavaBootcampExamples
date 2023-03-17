-- Copy-paste and run this code in MySQL Workbench to set up the database
-- table and sample data for this application.

CREATE TABLE `orders` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(80) DEFAULT NULL,
  `restaurant` varchar(80) DEFAULT NULL,
  `rating` int DEFAULT NULL,
  `order_again` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO orders (description, restaurant, rating, order_again)
VALUES ('Eggplant Parmesan', 'Antonio''s', 2, false);
INSERT INTO orders (description, restaurant, rating, order_again)
VALUES ('Nutella Crepe', 'Andrea''s Cafe', 4, true);
INSERT INTO orders (description, restaurant, rating, order_again)
VALUES ('Seasoned Fries', 'Andrea''s Cafe', 3, false);