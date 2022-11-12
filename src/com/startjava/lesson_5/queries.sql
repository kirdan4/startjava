--выводит всю таблицы
SELECT * FROM Jaegers;

--отображает только не уничтоженных роботов
SELECT * FROM Jaegers WHERE status = 'Active';

--отображает роботов нескольких серий, например Mark-1 и Mark-6
SELECT * FROM Jaegers WHERE mark IN ('Mark-1','Mark-6');

--сортирует таблицу по убыванию по столбцу mark
SELECT * FROM Jaegers ORDER BY mark DESC;

--отображает самого старого робота
SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);

--отображает роботов, которые уничтожили больше/меньше всех kaiju
SELECT * FROM Jaegers WHERE kaijuKill >= (SELECT MAX(kaijuKill) FROM
		Jaegers) OR kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers) 
		ORDER BY kaijuKill DESC;

--отображает средний вес роботов
SELECT AVG(weight) AS avg_Jaegers FROM Jaegers;

--увеличивает на единицу количество уничтоженных kaiju у роботов, которые не разрушены
UPDATE Jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'Active';
SELECT * FROM Jaegers WHERE status = 'Active';

--удаляет уничтоженных роботов
DELETE FROM Jaegers WHERE status = 'Destroyed';
SELECT * FROM Jaegers;