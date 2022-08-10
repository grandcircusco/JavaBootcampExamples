CREATE TABLE `rooms` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NULL,
  `max_capacity` INT NULL,
  `available` BOOLEAN NULL,
  PRIMARY KEY (`id`));
  
INSERT INTO rooms (name, max_capacity, available) VALUES 
('Annex', 16, true),
('Balcony', 24, false),
('Penthouse', 50, true);