# Write your MySQL query statement below
select we.id
from weather as w
left join weather as we
on w.temperature < we.temperature
and date_add(w.recorddate, Interval 1 day) = we.recorddate
where we.id is not null;