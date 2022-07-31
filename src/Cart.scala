case class Item (val name: String, val price: Double, val quantity: Int)

object Cart{

  def displayshoppingCart(items:Array[Item]) : Unit = for (item <- items)
    println(item.quantity + " " + item.name + " at Rs " + item.price + " each.")

  def itemFound(value : String , items:Array[Item]): Unit = for (item <- items)
    if(item.name == value)
        println(item.quantity + " " + item.name + " at Rs " + item.price + " each.")
    else
       println("Found another item.")


  def main(args: Array[String]) {
    val item1 = Item("Vanilla ice cream", 3.99 , 13 )
    val item2 = Item("Chocolate biscuits", 4.00 , 6 )
    val item3 = Item("Cupcakes", 7.77 , 7 )

    val shoppingCart = Array(item1 , item2 , item3)
    displayshoppingCart(shoppingCart)
    print("\n------------Find Items------------\n")
    itemFound("Vanilla ice cream",shoppingCart)
  }
}