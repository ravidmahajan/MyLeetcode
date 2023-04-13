# Write your MySQL query statement below

SELECT c.name AS Customers from Customers c left join Orders o
ON  c.id = o.customerId
WHERE o.customerId IS NULL;