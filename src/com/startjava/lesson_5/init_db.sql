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

insert into Jaegers VALUES (1, 'Acid Geisha','MARK-3', 17.5, 1.9, true, 'Moscow', '2022-01-01', 2);
insert into Jaegers VALUES (2, 'Bracer Phoenix','MARK-5', 70.91, 2.128, false, 'Mexico', '2025-11-01', 1);
insert into Jaegers VALUES (3, 'Lucky Seven','MARK-1', 66.45, 2.005, false, 'Unknown', '2019-06-01', 1);
insert into Jaegers VALUES (4, 'Chronos Berserker','MARK-5', 73.91, 2.28, true, 'Australia', '2025-01-01', 0);
insert into Jaegers VALUES (5, 'Diablo Intercept','MARK-2', 60.09, 1.999, false, 'Chile', '2016-01-01', 0);
insert into Jaegers VALUES (6, 'November Ajax','MARK-6', 78.94, 2.677, false, 'Unknown', '2026-11-01', 3);
insert into Jaegers VALUES (7, 'Saber Athena','MARK-7', 76.91, 1.628, false, 'Unknown', '2028-10-01', 1);
insert into Jaegers VALUES (8, 'Guardian Brabo','MARK-6', 73.21, 1.975, true, 'india', '2033-12-01', 1);
insert into Jaegers VALUES (9, 'Scrapper','MARK-1', 12.07, 0.278, false, 'Russia', '2020-11-01', 1);
insert into Jaegers VALUES (10, 'Maradeur','MARK-?', 55.91, 1.128, false, 'Unknown', '2000-01-01', 0);
