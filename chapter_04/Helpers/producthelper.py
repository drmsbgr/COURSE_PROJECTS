from Models.product import Product


class ProductHelper:
    @staticmethod
    def create_items_from_txt() -> list:
        l = []
        f = open("chapter_04/Products.txt", "r")
        content = f.read()

        lines = content.split("\n")

        for line in lines:
            attr = line.split(",")
            l.append(Product(attr[0], float(attr[1]), int(attr[2])))

        return l

    @staticmethod
    def get_total_balance(products: list) -> float:
        balance = 0.0

        for item in products:
            # print(f"{item.name},{item.get_price()},{item.quantity}")
            totalPrice = item.get_total_price()
            balance += totalPrice * 1.2

        return balance
