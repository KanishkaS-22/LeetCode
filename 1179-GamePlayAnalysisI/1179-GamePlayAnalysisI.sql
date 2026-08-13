-- Last updated: 8/13/2026, 10:16:29 AM
# Write your MySQL query statement below
select player_id,min(event_date)as first_login from activity group by player_id; 