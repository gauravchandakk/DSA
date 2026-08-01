# Write your MySQL query statement below
select case when e.id=u.id then u.unique_id else null end as unique_id , name
from Employees as e
left join EmployeeUNI as u
on e.id=u.id;
