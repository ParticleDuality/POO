class Car {
  constructor (license, driver) {
    this.id
    this.license = license
    this.driver = driver
    this.passengers
  }
  
  printDetails () {
    console.log(`License: ${this.license}, Driver: ${this.driver}`)
  }
}