# Write your MySQL query statement below
SELECT DISTINCT a.email AS Email FROM Person a join Person b
on a.email = b.email AND a.id <> b.id;