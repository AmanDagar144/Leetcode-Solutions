# Write your MySQL query statement below
Select m.name from employee as e
inner join employee as m on e.managerid = m.id
group by e.managerid
having count(e.id)>=5;


