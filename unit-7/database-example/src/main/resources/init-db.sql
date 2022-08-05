CREATE TABLE `rooms` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NULL,
  `maxCapacity` INT NULL,
  `available` BOOLEAN NULL,
  PRIMARY KEY (`id`));
  
INSERT INTO `rooms` VALUES 
(1, 'Annex', 16, true),
(2, 'Balcony', 24, false),
(3, 'Penthouse', 50, true);