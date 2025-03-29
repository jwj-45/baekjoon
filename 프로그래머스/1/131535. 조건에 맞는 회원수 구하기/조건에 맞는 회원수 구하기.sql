-- 코드를 입력하세요
SELECT count(*) from USER_INFO 
where (age between 20 and 29) AND TO_CHAR(JOINED, 'YYYY') = 2021;