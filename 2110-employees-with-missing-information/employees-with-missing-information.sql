# Write your MySQL query statement below
select e.employee_id as employee_id
from Employees as e
left join Salaries as s
on e.employee_id=s.employee_id
where salary is null


UNION 

select s.employee_id
from Salaries as s
left join Employees as e
on s.employee_id=e.employee_id
where name is null

order by 1;
