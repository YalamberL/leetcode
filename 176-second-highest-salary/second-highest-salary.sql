# Write your MySQL query statement below
WITH second_highest_salary AS (
    SELECT 
        salary,
        DENSE_RANK() OVER (
            ORDER BY salary DESC
        ) AS salary_dense_rank
    FROM Employee
)
SELECT MAX(CASE WHEN salary_dense_rank = 2 THEN salary END) AS SecondHighestSalary
FROM second_highest_salary;
