# Write your MySQL query statement below
select customer_id, count(customer_id) as count_no_trans
from visits as v 
left join transactions as t
on v.visit_id = t.visit_id
where t.transaction_id is null
group by customer_id
order by count_no_trans asc;