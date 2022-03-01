CREATE DATABASE Jaegers;

\c jaegers;

CREATE TABLE Jaegers (
  id SERIAL PRIMARY KEY,
  modelName VARCHAR(20) NOT NULL,
  mark VARCHAR(6) NULL,
  height REAL NOT NULL,
  weight REAL NOT NULL,
  status BOOLEAN NOT NULL,
  origin VARCHAR(15),
  launch DATE NOT NULL,
  kaijuKill INT NULL
);