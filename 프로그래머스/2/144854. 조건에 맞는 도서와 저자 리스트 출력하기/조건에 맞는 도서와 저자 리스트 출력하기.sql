SELECT BOOK_ID, AUTHOR_NAME, date_format(PUBLISHED_DATE,'%Y-%m-%d')from BOOK b
left join AUTHOR a
on a.AUTHOR_ID = b.AUTHOR_ID
where CATEGORY = "경제"
order by PUBLISHED_DATE asc