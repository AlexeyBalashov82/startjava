CREATE DATABASE Jaegers;

\c jaegers;

CREATE TABLE Jaegers
(
  id int NOT NULL,
  modelName varchar(20) NOT NULL,
  mark varchar(6) NULL,
  height real NOT NULL,
  weight real NOT NULL,
  status boolean NOT NULL,
  origin varchar(15),
  launch date NOT NULL,
  kaijuKill int NULL,

  CONSTRAINT PK_JaegerID
    PRIMARY KEY (id)
);