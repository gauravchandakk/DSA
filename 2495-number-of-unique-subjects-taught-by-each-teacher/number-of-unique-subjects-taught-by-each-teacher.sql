# Write your MySQL query statement below
SELECT teacher_id,count(DISTINCT subject_id) AS cnt
FROM Teacher
Group By teacher_id;
