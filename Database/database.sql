create table OrderSystem(
Customer_ID int primary key identity(1,1) not null,
Customer_Name varchar(25) not null,
ContactNo nchar(11) not null,
Email   varchar(30) not null,
Product_ID nchar(10) not null,
Product_Name nchar(25) not null,
Price    decimal(10,2) not null,
Quantity nchar(25) not null,
);

select *from OrderSystem

create table Inventory(
ID int primary key identity(1,1) not null,
Product_Name varchar(25) not null,
Quantity nchar(25) not null,
Price    decimal(10,2) not null,
);
select *from Inventory