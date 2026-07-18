# Write your MySQL query statement below
select contest_id,Round(count(contest_id)/(select count(user_id) from Users) *100,2) as percentage
from Register 
group by 1
order by 2 desc,1;