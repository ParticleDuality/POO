from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car('ABC123', Account('Santiago Pulido', '1024600'))
    car.id = 1
    car.passengers = 2

    print(vars(car))