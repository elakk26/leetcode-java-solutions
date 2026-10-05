# Write your MySQL query statement below
with temptb as(
    select e.name as Employee,e.salary as Salary,d.name as Department,dense_rank() over(partition by e.departmentId order by e.salary desc)as rnk from Employee e join Department d on e.departmentId=d.id
)

select Department,Employee,Salary from temptb where rnk<=3;