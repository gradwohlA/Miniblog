create table post(
post_id serial,
post_title text,
post_content text,
post_img text,
status int,
post_date timestamp,
constraint post_pk primary key (post_id)
)