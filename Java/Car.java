public class Car {
  Integer id;
  String license;
  Account driver;
  Integer passengers;

  public Car(String license, Account driver) {
    this.license = license;
    this.driver = driver;
  }

  public void printDetails() {
    System.out.println(
      "License: " + license +
      " Driver: " + driver.name
    );
  }
}
