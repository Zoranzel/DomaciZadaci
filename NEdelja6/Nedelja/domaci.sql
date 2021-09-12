

-- 1. zadatak - reseno na gori nacin


SELECT email, phone_number, region_name FROM ((((employees
INNER JOIN departments ON employees.department_id = departments.department_id)
INNER JOIN locations ON locations.location_id = departments.location_id)
INNER JOIN countries On countries.country_id = locations.country_id)
INNER JOIN regions ON regions.region_id = countries.region_id)
 WHERE region_name = 'Europe' AND phone_number IS NOT NULL;
 
 
 -- 2. zadatak 

SELECT dependents.first_name, dependents.last_name, employees.salary  FROM dependents
INNER JOIN employees ON employees.employee_id = dependents.employee_id
WHERE employees.salary IN (SELECT MAX(salary) FROM employees)



-- 3. zadatak 

SELECT SUM(salary), country_name FROM (((countries
INNER JOIN locations ON countries.country_id = locations.country_id)
INNER JOIN departments ON departments.location_id = locations.location_id)
INNER JOIN employees ON employees.department_id = departments.department_id)


GROUP BY country_name
ORDER BY SUM(salary) DESC;
