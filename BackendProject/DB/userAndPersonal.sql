use backend;

#User Personal Detail
create table user_personal_detail (personal_detail_id int, phone_number long, address varchar(255), primary key(personal_detail_id));
insert into  user_personal_detail (personal_detail_id, phone_number, address) values (1, 1234567890, "Nagercoil");
insert into  user_personal_detail (personal_detail_id, phone_number, address) values (2, 4569221174, "Trivandrum");
insert into  user_personal_detail (personal_detail_id, phone_number, address) values (3, 7831111111, "Kochi");
insert into  user_personal_detail (personal_detail_id, phone_number, address) values (4, 9964218777, "Pune");
insert into  user_personal_detail (personal_detail_id, phone_number, address) values (5, 1223999775, "Chennai");
insert into  user_personal_detail (personal_detail_id, phone_number, address) values (55, 1010101010, "Villukuri");
select * from user_personal_detail;

#User Table
create table user_table (user_id int, user_name varchar(255), user_personal_details_id int, book_id int, from_date varchar(255), to_date varchar(255), book_received varchar(255), primary key(user_id), foreign key(user_personal_details_id) references user_personal_detail(personal_detail_id), foreign key(book_id) references book_table(book_id));
insert into user_table (user_id, user_name, user_personal_details_id, book_id, from_date, to_date, book_received) values (1, "Robi", 1, 3, "15-03-2024", "20-03-2024", "Yes");
insert into user_table (user_id, user_name, user_personal_details_id, book_id, from_date, to_date, book_received) values (2, "Mukil", 2, 11, "10-01-2024", "26-01-2024", "Yes");
insert into user_table (user_id, user_name, user_personal_details_id, book_id, from_date, to_date, book_received) values (3, "Dany", 3, 9, "01-02-2024", "10-02-2024", "Yes");
insert into user_table (user_id, user_name, user_personal_details_id, book_id, from_date, to_date, book_received) values (4, "Tanya", 4, 14, "20-02-2024", "01-03-2024", "No");
insert into user_table (user_id, user_name, user_personal_details_id, book_id, from_date, to_date, book_received) values (5, "Kanu", 5, 5, "30-01-2024", "25-02-2024", "No");
select * from user_table;
