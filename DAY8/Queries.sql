-------------------------------------- Joins Two table----------------------------------------------------
--Show candidate name and offer salary

SELECT 
    candidates.name,
    offers.salary
FROM candidates
JOIN offers
ON candidates.candidate_id = offers.candidate_id;

--Show company name and recruiter name

select 
   companies.company_name,
   recruiters.recruiter_name 
from companies
join  recruiters
on companies.company_id = recruiters.company_id  ;

--Show candidate name and interview status

select
     c."name" ,
     i.status 
 from candidates c
 join  interviews i 
 on c.candidate_id =i.candidate_id ;

--Show recruiter name and interview date
 select 
 r.recruiter_name ,
 i.interview_date 
from recruiters r 
join interviews i 
on  r.recruiter_id =i.recruiter_id ;
     
--Show company name and offer date
select c.company_name ,o.offer_date 
from companies c
join offers o 
on c.company_id = o.company_id ;

-------------------------- Group By  with join  ----------------------------------------------
--formula 
--SELECT group_column, AGG_FUNCTION(column)
--FROM table
--GROUP BY group_column;

--Show status-wise interview count 

-- Show status-wise interview count
SELECT 
    status,
    COUNT(*)
FROM interviews
GROUP BY status;

--Show recruiter-wise interview count
select 
       i.recruiter_id ,
      count(*)
from interviews i 
group by i.recruiter_id ;

--Show company-wise total salary

select
    c.company_name , 
    SUM(o.salary )
from companies c
join offers o 
on c.company_id  =o.company_id 
group by c.company_name ;

-- Show candidate-wise interview count
select 
  c."name" ,
  c.candidate_id  ,
  count(i.candidate_id )
from  candidates c
join  interviews i
on c.candidate_id =i.candidate_id 
group by c.candidate_id , c."name" ;
     

--EXTRACT = take out a specific part (year, month, day) from a date.
--SELECT EXTRACT(MONTH/YEAR/DATE FROM interview_date), COUNT(*)
--FROM interviews
--GROUP BY EXTRACT(MONTH/YEAR/DATE FROM interview_date);

-- Show month-wise interview count
select 
extract (month from i.interview_date),
count(*)
from interviews i
group by extract(month from i.interview_date);

--Show year-wise interview count
select 
extract (year from i.interview_date),
count(*)
from interviews i
group by extract (year from i.interview_date);

--Show day-wise interview count
select 
  i.interview_date,
count(*)
from interviews i 
group by i.interview_date;


