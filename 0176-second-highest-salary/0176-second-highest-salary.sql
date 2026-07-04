# Write your MySQL query statement below
SELECT MAX(DISTINCT salary) AS SecondHighestSalary
FROM employee 
WHERE salary < (
    SELECT MAX(salary)
    FROM employee
)