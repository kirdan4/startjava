--выведите всю таблицу +
SELECT * FROM Jaegers;
--отобразите только не уничтоженных роботов +
SELECT * FROM Jaegers WHERE status = 'Active';
--отобразите роботов нескольких серий, например Mark-1 и Mark-6 +
SELECT * FROM Jaegers WHERE mark IN ('Mark-1','Mark-6');
--отсортируйте таблицу по убыванию по столбцу mark+
SELECT * FROM Jaegers ORDER BY mark DESC;
--отобразите самого старого робота+
SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);
--отобразите роботов, которые уничтожили больше/меньше всех kaiju+
SELECT * FROM Jaegers WHERE kaijuKill >= (SELECT MAX(kaijuKill) FROM Jaegers) OR kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers) ORDER BY kaijuKill DESC;
--отобразите средний вес роботов+
SELECT AVG(weight) AS avg_Jaegers FROM Jaegers;
--yвеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE Jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'Active';
SELECT * FROM Jaegers WHERE status = 'Active';
--удалите уничтоженных роботов
DELETE FROM Jaegers WHERE status = 'Destroyed';
SELECT * FROM Jaegers;