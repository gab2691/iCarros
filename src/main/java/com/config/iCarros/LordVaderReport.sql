select OrderID,
       TotalPrice
       
from pedido 
where CustomerName = 'DeathStar'
order by OrderID, TotalPrice;