## Part 1: Test it with SQL

Select column_name, data_type from information_schema.columns
where table_schema = 'techjobs' AND table_name = 'job';

## Part 2: Test it with SQL(THIS MAY NEED WORK)

SELECT name from techjobs.employer
where location = "%louis%";

## Part 3: Test it with SQL

## Part 4: Test it with SQL