-- Last updated: 8/13/2026, 10:19:03 AM
# Write your MySQL query statement below
select max(salary) as SecondHighestSalary from employee where salary<(
    select max(salary)
    from employee
);