CREATE DATABASE teste_api_user;
CREATE TABLE users(
  id serial primary key,
  name varchar(100) not null,
  cpf varchar(11) not null unique,
  telephone varchar(11) not null,
  birth_date date not null,
  email varchar(50) not null unique
);