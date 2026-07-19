# Write your MySQL query statement below
select a.employee_id
from Employees as a
left join Employees as b
on b.employee_id=a.manager_id
where b.employee_id is NULL and a.salary<30000 and a.manager_id is not null
order by 1;