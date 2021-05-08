import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {
  Map<String, Map<String, Integer>> acceptedTypeCar;
  ArrayList<String> seatMaterial;

  public UberVan(String license,
    Account driver,
    Map<String, Map<String, Integer>> acceptedTypeCar,
    ArrayList<String> seatMaterial)
    {
    super(license, driver);
    this.acceptedTypeCar = acceptedTypeCar;
    this.seatMaterial = seatMaterial;
  }
}
