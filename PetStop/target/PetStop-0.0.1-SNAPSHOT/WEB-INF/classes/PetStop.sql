create table petuser(ownerid number(5)not null primary key, username varchar(55) not null unique, userpasswd varchar(55) not null);

create table pets(petid number(5) not null primary key, 
petname varchar(55) not null, petage number(2), petplace varchar(55), ownerid number(5), 
foreign key(ownerid) references petuser(ownerid) on delete cascade);

insert into petuser values(petuser_ownerid_seq.nextval,'geet','geet111');
insert into petuser values(petuser_ownerid_seq.nextval,'var1','varsh');
insert into petuser values(petuser_ownerid_seq.nextval,'revathi','revathi111');
insert into petuser values(petuser_ownerid_seq.nextval,'sugan','sugan111');
insert into petuser values(petuser_ownerid_seq.nextval,'nivi','nivi111');

insert into pets values(pets_id_seq.nextval,'jimchoo',8,'Sydney');
insert into pets values(pets_id_seq.nextval,'Jumbo',1,'Singapore');
insert into pets values(pets_id_seq.nextval,'Ghost',6,'US');
insert into pets values(pets_id_seq.nextval,'Tommy',2,'Chennai'); 

create sequence petuser_ownerid_seq start with value 100 increment by 1;
create sequence pets_id_seq start with value 1 increment by 1;