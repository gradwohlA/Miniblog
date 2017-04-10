create table tag(
tag_id SERIAL,
post_id int references post(post_id),
tag_name text UNIQUE,
constraint tag_pk primary key(tag_id)
)

insert into tag values(DEFAULT,2, 'spring')