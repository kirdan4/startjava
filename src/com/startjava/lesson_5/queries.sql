--выводит всю таблицы

SELECT *
  FROM Jaegers;

--отображает только не уничтоженных роботов

SELECT *
  FROM Jaegers
 WHERE status = 'Active';

--отображает роботов нескольких серий, например Mark-1 и Mark-6

SELECT *
  FROM Jaegers
 WHERE mark IN ('Mark-1', 'Mark-6');

--сортирует таблицу по убыванию по столбцу mark

SELECT *
  FROM Jaegers
 ORDER BY mark DESC;

--отображает самого старого робота

SELECT *
  FROM Jaegers
 WHERE launch_date =
		(SELECT MIN(launch_date)
		   FROM Jaegers);

--отображает роботов, которые уничтожили больше/меньше всех kaiju

SELECT *
  FROM Jaegers
 WHERE kaiju_kill >=
		(SELECT MAX(kaiju_kill)
		   FROM Jaegers)
	OR kaiju_kill =
		(SELECT MIN(kaiju_kill)
		   FROM Jaegers)
 ORDER BY kaiju_kill DESC;

--отображает средний вес роботов

SELECT AVG(weight) AS avg_Jaegers
  FROM Jaegers;

--увеличивает на единицу количество уничтоженных kaiju у роботов, которые не разрушены

UPDATE Jaegers
   SET kaiju_kill = kaiju_kill + 1
 WHERE status = 'Active';


SELECT *
  FROM Jaegers
 WHERE status = 'Active';

--удаляет уничтоженных роботов

DELETE
  FROM Jaegers
 WHERE status = 'Destroyed';


SELECT *
  FROM Jaegers;