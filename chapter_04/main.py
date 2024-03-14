from Models.product import Product
from Helpers.producthelper import ProductHelper
from typing import List

l = [Product("Laptop", 4000, 3)]

l.append(Product("Phone", 2000))
l.append(Product("Oxygen"))

dataList = ProductHelper.create_items_from_txt()

for item in dataList:
    l.append(item)

balance = ProductHelper.get_total_balance(l)
print(f"Tüm ürünlerin fiyatı:{balance}₺ (KDV Dahil)")
