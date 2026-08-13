-- Last updated: 8/13/2026, 10:17:24 AM
# Write your MySQL query statement below
select class from courses group by class having count(*) >=5;