create table admin(
admin_name text not null UNIQUE,
password text not null,
constraint admin_pk primary key(admin_name)
)

insert into admin values('admin', 123456)