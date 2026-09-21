CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
    with rankedsalary as (select salary, dense_rank() over(order by salary desc) as rnk  from Employee)
    
    select distinct salary from rankedsalary where rnk=N

  );
END