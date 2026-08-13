-- Last updated: 8/13/2026, 10:16:25 AM
# Write your MySQL query statement below
select distinct author_id as id from views where author_id=viewer_id order by author_id asc;