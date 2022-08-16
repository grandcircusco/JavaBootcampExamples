-- Copy-paste and run this code in MySQL Workbench to set up the database
-- table and sample data for this application.

CREATE TABLE `little_library_book` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `title` varchar(80) DEFAULT NULL,
  `author` varchar(80) DEFAULT NULL,
  `pages` int DEFAULT NULL,
  `lent_out` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO little_library_book (title, author, pages, lent_out) VALUES
('Pride and Prejudice', 'Jane Austen', 432, false),
('To Kill a Mockingbird', 'Harper Lee', 281, true),
('One Hundred Years of Solitude', 'Gabriel García Márquez', 448, false),
('In Cold Blood', 'Truman Capote', 368, false),
('The Adventures of Tom Sawyer', 'Mark Twain', 308, true),
('The Adventures of Huckleberry Finn', 'Mark Twain', 366, false);