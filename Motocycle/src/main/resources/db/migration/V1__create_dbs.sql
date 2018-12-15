use motocycle_db;

create table persoana(
  id int unique AUTO_INCREMENT,
  nume varchar(50),
  nrTelefon varchar(50),
  mail varchar(50),
  primary key (id)
);

create table motor(
  id int AUTO_INCREMENT,
  marca varchar(50),
  tip varchar(50),
  primary key (id)
);

create table echpament(
  id int AUTO_INCREMENT,
  denumire varchar(50),
  tip varchar(50),
  primary key (id)
);