CREATE TABLE `rooms` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `name` VARCHAR(255) NULL,
  `max_capacity` INT NULL,
  `available` BIT(1) NULL);
  
INSERT INTO `rooms` (name, max_capacity, available) VALUES 
('Annex', 16, true),
('Balcony', 24, false),
('Penthouse', 50, true);