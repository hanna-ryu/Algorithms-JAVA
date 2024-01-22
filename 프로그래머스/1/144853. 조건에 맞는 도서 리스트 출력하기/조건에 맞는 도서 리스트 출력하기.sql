-- 코드를 입력하세요
SELECT BOOK_ID, DATE_FORMAT(PUBLISHED_DATE,'20%y-%m-%d') AS PUBLISHED_DATE
FROM BOOK
WHERE PUBLISHED_DATE BETWEEN '2021-01-01' AND '2021-12-31' 
AND CATEGORY = '인문'
ORDER BY PUBLISHED_DATE desc;