-- Copy-paste and run this code in MySQL Workbench to set up the database
-- table and sample data for this application.

CREATE TABLE `bookshelf2_user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `username` varchar(80) DEFAULT NULL,
  `display_name` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `bookshelf2_book` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `title` varchar(80) DEFAULT NULL,
  `author` varchar(80) DEFAULT NULL,
  `pages` int DEFAULT NULL,
  `lent_out` bit(1) DEFAULT NULL,
  `owner_id` bigint DEFAULT NULL,
  `lent_out_to_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKa9vgmfgyvn97er25xt7ektmho` (`lent_out_to_id`),
  CONSTRAINT `FKa9vgmfgyvn97er25xt7ektmho` FOREIGN KEY (`lent_out_to_id`) REFERENCES `bookshelf2_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO bookshelf2_user (username, display_name) VALUES
('bill', 'Bill Gates'),
('steve', 'Steve Jobs'),
('linus', 'Linus Torvalds');

INSERT INTO bookshelf2_book (title, author, pages, lent_out, owner_id, lent_out_to_id) VALUES
('Pride and Prejudice', 'Jane Austen', 432, false, 1, NULL),
('To Kill a Mockingbird', 'Harper Lee', 281, true, 1, 2),
('One Hundred Years of Solitude', 'Gabriel García Márquez', 448, false, 1, NULL),
('In Cold Blood', 'Truman Capote', 368, false, 1, NULL),
('The Adventures of Tom Sawyer', 'Mark Twain', 308, true, 1, 3),
('The Adventures of Huckleberry Finn', 'Mark Twain', 366, false, 1, NULL),
('The Great Gatsby', 'F. Scott Fitzgerald', 366, false, 2, NULL),
('Crime and Punishment', 'Fyodor Dostoevsky', 366, true, 2, 1),
('In Cold Blood', 'Truman Capote', 366, true, 2, 3),
('Brave New World', 'Aldous Huxley', 366, false, 2, NULL);