-- Copy-paste and run this code in MySQL Workbench to set up the database
-- table and sample data for this application.

CREATE TABLE `rooms` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `available` bit(1) DEFAULT NULL,
  `max_capacity` int DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
  
INSERT INTO `rooms` (name, max_capacity, available) VALUES 
('Living Room', 8, true),
('Home Office', 2, false),
('Family Room', 6, true),
('Back Yard', 20, false);