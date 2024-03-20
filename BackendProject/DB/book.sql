use backend;
#Book Table
create table book_table (book_id int, book_name varchar(255), author_id int, language_id int, rating int, primary key(book_id), foreign key(author_id) references author_table(author_id), foreign key(language_id) references language_table(language_id));
insert into book_table (book_id, book_name, author_id, language_id, rating) values (1, "Ponniyin Selvan", 1, 1, 4);
insert into book_table (book_id, book_name, author_id, language_id, rating) values (2, "Parthiban Kanavu", 1, 1, 5);
insert into book_table (book_id, book_name, author_id, language_id, rating) values (3, "Panchali Sapatham", 2, 1, 5);
insert into book_table (book_id, book_name, author_id, language_id, rating) values (4, "Bharathiyar Kathaigal", 2, 1, 3);

insert into book_table (book_id, book_name, author_id, language_id, rating) values (5, "The Comedy of Errors", 3, 2, 4);
insert into book_table (book_id, book_name, author_id, language_id, rating) values (6, "Hamlet", 3, 2, 3);
insert into book_table (book_id, book_name, author_id, language_id, rating) values (7, "The Harry Potter", 4, 2, 5);
insert into book_table (book_id, book_name, author_id, language_id, rating) values (8, "The Ickabog", 4, 2, 3);

insert into book_table (book_id, book_name, author_id, language_id, rating) values (9, "Marthandavarma", 5, 3, 4);
insert into book_table (book_id, book_name, author_id, language_id, rating) values (10, "Premamritam", 5, 3, 4);
insert into book_table (book_id, book_name, author_id, language_id, rating) values (11, "Nimisham", 6, 3, 4);
insert into book_table (book_id, book_name, author_id, language_id, rating) values (12, "Vishwadarshanam", 6, 3, 4);

insert into book_table (book_id, book_name, author_id, language_id, rating) values (13, "Godaan", 7, 4, 4);
insert into book_table (book_id, book_name, author_id, language_id, rating) values (14, "Shatranj Ke Khiladi", 7, 4, 5);
insert into book_table (book_id, book_name, author_id, language_id, rating) values (15, "The Other Dimension", 8, 4, 3);
insert into book_table (book_id, book_name, author_id, language_id, rating) values (16, "Black Rose", 8, 4, 3);
select * from book_table;
