from chapter_04.Models.product import Product
from chapter_04.Helpers.producthelper import ProductHelper
from typing import List

l = []

l.append(Product("Laptop", 4000, 3))
l.append(Product("Phone", 2000))
l.append(Product("Oxygen"))

dataList = ProductHelper.create_items_from_txt()

for item in dataList:
    l.append(item)

balance = ProductHelper.get_total_balance(l)
print(f"Tüm ürünlerin fiyatı:{balance}₺ (KDV Dahil)")
