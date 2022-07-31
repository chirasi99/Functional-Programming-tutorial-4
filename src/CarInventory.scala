case class Car(name: String, price: Double)

class CarUUID(car: Car) {
  def findUUID : Int = car.name.hashCode()
}
object CarInventory {

  def main(args: Array[String]): Unit = {

    val bmw3 = Car("bmw 3 series", 20000.00)
    val bmw5 = Car("bmw 5 series", 50000.00)
    val vwPassat = Car("vw passat", 10000.00)
    val vwGolf = Car("vw golf", 12000.00)
    val mazda3 = Car("mazda 3", 15000.00)

    val cars = Array(bmw3, bmw5, vwPassat, vwGolf, mazda3)
    for(car <- cars) {
      val x = new CarUUID(car)

      println("Car UUID = " + car.name + " - " + x.findUUID)
    }

  }


}
