-- Data for H2 Database, if the app is set up with H2.
INSERT INTO bookshelf2_user (username, display_name) VALUES
('orville', 'Orville Wright'),
('amelia', 'Amelia Earhart'),
('bessie', 'Bessie Coleman'),
('charles', 'Charles Lindbergh');

INSERT INTO bookshelf2_book (title, author, pages, lent_out, owner_id, lent_out_to_id) VALUES
('Pride and Prejudice', 'Jane Austen', 432, false, 1, NULL),
('To Kill a Mockingbird', 'Harper Lee', 281, true, 1, 2),
('One Hundred Years of Solitude', 'Gabriel García Márquez', 448, true, 1, 4),
('In Cold Blood', 'Truman Capote', 368, false, 1, NULL),
('The Adventures of Tom Sawyer', 'Mark Twain', 308, true, 1, 3),
('The Adventures of Huckleberry Finn', 'Mark Twain', 366, false, 1, NULL),
('The Great Gatsby', 'F. Scott Fitzgerald', 192, false, 2, NULL),
('Crime and Punishment', 'Fyodor Dostoevsky', 492, true, 2, 1),
('In Cold Blood', 'Truman Capote', 368, true, 2, 3),
('Brave New World', 'Aldous Huxley', 288, false, 2, NULL);