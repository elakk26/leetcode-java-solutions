# Write your MySQL query statement below
-- with temprank as (
--     select d.name as Department, e.name as Employee, e.salary As Salary, 
--     dense_rank() over (partition by d.name order by e.salary desc) as rnk
--     from Employee e 
--     join Department d on e.departmentId=d.id 
-- )

-- select Department,Employee, Salary from temprank where rnk<=3;

select Department, Employee, Salary from(
select d.name as Department, e.name as Employee, e.salary As Salary, 
    dense_rank() over (partition by d.name order by e.salary desc) as rnk
    from Employee e 
    join Department d on e.departmentId=d.id ) t where rnk<=3;