-- Last updated: 8/13/2026, 10:19:06 AM
# Write your MySQL query statement below
select person.firstname,person.lastname,address.city,address.state from person left join address on person.personId=address.personId;