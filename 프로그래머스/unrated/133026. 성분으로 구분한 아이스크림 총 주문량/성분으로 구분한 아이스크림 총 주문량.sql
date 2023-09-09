-- 코드를 입력하세요
SELECT INGREDIENT_TYPE, SUM(TOTAL_ORDER) AS TOTAL_ORDER 
FROM FIRST_HALF A, ICECREAM_INFO B 
WHERE A.FLAVOR = B.FLAVOR 
GROUP BY INGREDIENT_TYPE ORDER BY TOTAL_ORDER ASC