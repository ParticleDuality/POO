<?php
class UberVan extends Car {
  public $acceptedTypeCar;
  public $seatMaterial;

  public function __construct($license, $driver, $acceptedTypeCar, $seatMaterial)
  {
    parent::__construct($license, $driver);
    $this->acceptedTypeCar = $acceptedTypeCar;
    $this->seatMaterial = $seatMaterial;
  }
}