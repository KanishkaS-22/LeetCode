-- Last updated: 8/13/2026, 10:17:30 AM
# Write your MySQL query statement below
select name from customer where referee_id is null or referee_id not in(2);