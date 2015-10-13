create database LEASING_COMPANY;

create table RECOVERY_OFFICER{
recovery_officer_id varchar(30) not null,
name varchar(250) not null,
nic varchar(11) not null,
address varchar(250) not null,
tel_no varchar(20) not null,
constraint primary key(recovery_officer_id)
}ENGINE=INNODB;


create table MARKETING_OFFICER{
marketing_officer_id varchar(30) not null,
name varchar(250) not null,
nic varchar(11) not null,
address varchar(250) not null,
tel_no varchar(20) not null,
constraint primary key(marketing_officer_id)
}ENGINE=INNODB;


create table CLIENT{
client_id varchar(30) not null,
recovery_officer_id varchar(30) not null,
marketing_officer_id varchar(30) not null,
client_name varchar(250) not null,
nic varchar(11) not null,
occupation varchar(75) not null,
private_address varchar(250) not null,
official_address varchar(250),
contact_no varchar(20);
organization_type varchar(100),
resident_duration varchar(100) not null,
status_in_pvt_address varchar(100) not null,
citizenship varchar(20) not null,
age int not null,
marital_status varchar(30) not null,
income_source varchar(300) not null,
total_monthly_income decimal(10,2) not null,
constraint primary key(clien_id,recovery_officer_id),
constraint foreign key(recovery_officer_id) references RECOVERY_OFFICER(recovery_officer_id) on update cascade,
constraint foreign key(marketing_officer_id) references MARKETING_OFFICER(marketing_officer_id) on update cascade
}ENGINE=INNODB;


create table CLIENT_BANKERS{
client_id varchar(30) not null,
bank_name varchar(50) not null,
address varchar(100) not null,
account_no varchar(30) not null,
constraint primary key(client_id,account_no),
constraint foreign key(client_id) reference CLIENT(client_id)
}ENGINE=INNODB;


create table LEASING{
leasing_no varchar(30) not null,
client_id varchar(30) not null,
no_of_payments int not null,
total_leased_cost decimal(10,2) not null,
commence_date varchar(30) not null,
end_date varchar(30) not null,
down_payment decimal(10,2) not null,
rental_fee decimal(10,2) not null,
due_date varchar(12) not null,
constraint primary key(leasing_no,client_id),
constraint foreign key(client_id) references CLIENT(client_id)
}ENGINE=INNODB;


create table RENTAL_PAYMENT{
leasing_no varchar(30) not null,
rental_arrears decimal(10,2) not null,
percent_of_received decimal(10,2) not null,
rental_od_interest decimal(10,2) not null,
total_arrears decimal(10,2) not null,
rental_od decimal(10,2) not null,
sundry_od decimal(10,2) not null,
paid_date varchar(30) not null,
paid_time varchar(30) not null,
payment decimal(10,2) not null,
constraint primary key(leasing_no,paid_date,paid_time),
constraint foreign key(leasing_no) references LEASING(leasing_no)
}ENGINE=INNODB;


create table VEHICLE_CATEGORY{
vehicle_category_id varchar(20) not null,
description varchar(200) not null,
constriant primary key(vehicle_category_id)
}ENGINE=INNODB;


create table LEASED_VEHICLE{
vehicle_id varchar(20) not null,
vehicle_category_id varchar(20) not null,
model_&_name varchar(150) not null,
chassis_no varchar(100) not null,
registration_no varchar(30) not null,
engine_no varchar(100) not null,
manufactured_year int not null,
estimated_price decimal(10,2) not null,
colour varchar(30) not null,
fuel_used decimal(5,3) not null,
cylinder_capacity decimal(5,2) not null,
wheel_base decimal(3,2),
licensed_date varchar(11) not null,
constraint primary key(vehicle_id),
constraint foreign key(vehicle_category_id) references VEHICLE_CATEGORY(vehicle_category_id)
}ENGINE=INNODB;


create table INSURANCE{
insuarance_no varchar(30) not null,
vehicle_id varchar(20) not null,
policy_fee decimal(10,2) not null,
due_date varchar(15) not null,
paid varchar(10), 
constraint primary key(vehicle_id ,insuarance_no),
constraint foreign key(vehicle_id) references VEHICLE(vehicle_id)
}ENGINE=INNODB;


create table CLIENT_VEHICLE{
client_id varchar(30) not null,
client_vehicle_id varchar(20) not null,
type_name_&_model varchar(100) not null,
purchased_price decimal(10,2) not null,
market_value decimal(10,2) not null,
mortgage_status varchar(10) not null,
constraint primary key(client_id,client_vehicle_id),
constraint foreign key(client_id) references CLIENT(client_id)
}ENGINE=INNODB;


create table CLIENT_INCOMETAX{
client_id varchar(30) not null,
year int not null,
taxable_income decimal(10,2) not null,
tax_paid decimal(10,2) not null,
constraint primary key(client_id,year),
constraint foreign key(client_id) references CLIENT(client_id)
}ENGINE=INNODB;


create table GUARENTOR{
client_id varchar(30) not null,
guarentor_id varchar(30) not null,
guarentor_name varchar(250) not null,
nic varchar(11) not null,
occupation varchar(75) not null,
private_address varchar(250) not null,
official_address varchar(250),
contact_no varchar(20);
organization_type varchar(100),
resident_duration varchar(100) not null,
status_in_pvt_address varchar(100) not null,
citizenship varchar(20) not null,
age int not null,
marital_status varchar(30) not null,
income_source varchar(300) not null,
total_monthly_income decimal(10,2) not null,
constraint primary key(client_id,guarentor_id),
constraint foreign key(client_id) references CLIENT(client_id)
}ENGINE=INNODB;


create table GUARENTOR_BANKERS{
guarentor_id varchar(30) not null,
bank_name varchar(50) not null,
address varchar(100) not null,
account_no varchar(30) not null,
constraint primary key(guarentor_id,account_no),
constraint foreign key(guarentor_id) reference GUARENTOR(guarentor_id)
}ENGINE=INNODB;


create table GUARENTOR_VEHICLE{
guarentor_id varchar(30) not null,
guarentor_vehicle_id varchar(20) not null,
type_name_&_model varchar(100) not null,
purchased_price decimal(10,2) not null,
market_value decimal(10,2) not null,
mortgage_status varchar(10) not null,
constraint primary key(guarentor_id,guarentor_vehicle_id),
constraint foreign key(guarentor_id) references GUARENTOR(guarentor_id)
}ENGINE=INNODB;


create table GUARENTOR_INCOMETAX{
guarentor_id varchar(30) not null,
year int not null,
taxable_income decimal(10,2) not null,
tax_paid decimal(10,2) not null,
constraint primary key(guarentor_id,year),
constraint foreign key(guarentor_id) references GUARENTOR(guarentor_id)
}ENGINE=INNODB;


