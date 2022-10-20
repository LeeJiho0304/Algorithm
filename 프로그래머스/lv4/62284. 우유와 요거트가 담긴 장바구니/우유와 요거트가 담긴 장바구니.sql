-- 코드를 입력하세요


SELECT distinct cp1.CART_ID
from (
        select cart_id 
        from CART_PRODUCTS
        where name='Milk'
    ) cp1, 
    (
        select cart_id 
        from CART_PRODUCTS
        where name='Yogurt'
    ) cp2
where cp1.CART_ID = cp2.CART_ID
order by cp1.CART_ID;