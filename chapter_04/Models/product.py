import datetime


class Product:
    def __init__(self, name: str = "default", price: float = 0.0, quantity: int = 1):
        self.__name__ = name
        self.__price__ = price
        self.__quantity__ = quantity
        print(f"Ürün oluşturuldu. Ürün adı:{name}\tTarih:{datetime.date.today()}")

    @property
    def name(self):
        return self.__name__

    @name.setter
    def name(self, value: str):
        if len(value) > 3 and len(value) < 8:
            self.__name__ = value
        else:
            self.__name__ = "default"

    @property
    def price(self):
        return self.__price__

    @price.setter
    def price(self, value):
        if value < 0:
            self.__price__ = 0
        else:
            self.__price__ = value

    @property
    def quantity(self):
        return self.__quantity__

    @quantity.setter
    def quantity(self, value):
        if value < 1:
            self.__quantity__ = 1
        else:
            self.__quantity__ = value

    def get_total_price(self) -> float:
        return self.__price__ * self.__quantity__

    def __repr__(self):
        pass
