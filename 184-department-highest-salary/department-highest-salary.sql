# Write your MySQL query statement below

select x.dname as Department,x.ename as Employee, x.salary As Salary from(
select d.name as dname,e.name as ename,e.salary,dense_rank() over( partition  by departmentId order by e.salary desc) as rnk from Employee e join Department d on e.departmentId=d.id ) x where rnk <2;