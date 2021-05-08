class UberVan(Car):
  acceptedCarType = []
  seatMaterial = []

  def __init__(self, license, driver, acceptedCarType, seatMaterial):
    super.__init__(license, driver)
    self.acceptedCarType = acceptedCarType
    self.seatMaterial = seatMaterial