# Write your MySQL query statement below
select unique_id, name
from employees
left join employeeuni as e
on employees.id = e.id;