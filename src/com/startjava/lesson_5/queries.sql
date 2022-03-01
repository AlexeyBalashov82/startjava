SELECT * FROM Jaegers;

SELECT * FROM Jaegers
    WHERE status IS true;

SELECT * FROM Jaegers
    WHERE mark IN ('MARK-1', 'MARK-6');

SELECT * FROM Jaegers
    ORDER BY mark DESC;

SELECT  * FROM Jaegers
    ORDER BY launch
    LIMIT 1;

SELECT * FROM Jaegers
    WHERE kaijukill IN
            (SELECT MIN (kaijukill)
                FROM Jaegers);

SELECT * FROM Jaegers
    WHERE kaijukill IN
            (SELECT MAX (kaijukill)
                FROM Jaegers);

SELECT AVG(weight) AS avgweight FROM Jaegers;

UPDATE Jaegers
    SET kaijukill = kaijukill + 1
    WHERE status IS true;

DELETE FROM Jaegers
    WHERE status IS false;