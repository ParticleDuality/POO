class UberBlack extends Car {
  constructor(license, driver, acceptedCarType, seatMaterial) {
    super(license, driver)
    this.acceptedCarType = acceptedCarType
    this.seatMaterial = seatMaterial
  }
}