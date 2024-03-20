create database backend;
use backend;

#Language Table
create table language_table (language_id int, language_name varchar(255), primary key(language_id));
insert into language_table (language_id, language_name) values (1, "Tamil");
insert into language_table (language_id, language_name) values (2, "English");
insert into language_table (language_id, language_name) values (3, "Malayalam");
insert into language_table (language_id, language_name) values (4, "Hindi");
select * from language_table;

#Author Table
create table author_table (author_id int, author_name varchar(255), primary key(author_id));
insert into author_table (author_id, author_name) values (1, "Kalki");
insert into author_table (author_id, author_name) values (2, "Bharathiyar");
insert into author_table (author_id, author_name) values (3, "William Shakespeare");
insert into author_table (author_id, author_name) values (4, "J.K.Rowling");
insert into author_table (author_id, author_name) values (5, "C.V.Raman Pillai");
insert into author_table (author_id, author_name) values (6, "G.Sankara Kurup");
insert into author_table (author_id, author_name) values (7, "Munshi Premchand");
insert into author_table (author_id, author_name) values (8, "Amrita Pritam");
select * from author_table;

