object InventoryManagement {
  var itemNames: Array[String] = Array("Carrots", "Potatoes", "Tomatoes")
  var itemQuantities: Array[Int] = Array(50, 30, 20)

  def displayInventory(): Unit = {
    println("Current Inventory:")
    if (itemNames.isEmpty) {
      println("The inventory is empty.")
    } else {
      itemNames.zip(itemQuantities).foreach { case (item, quantity) =>
        println(s"Item: $item, Quantity: $quantity")
      }
    }
  }

  def restockItem(item: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(item)
    if (index >= 0) {
      itemQuantities(index) += quantity
      println(s"Restocked $quantity of $item. New quantity: ${itemQuantities(index)}")
    } else {
      println(s"Item $item does not exist in the inventory.")
    }
  }

  def sellItem(item: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(item)
    if (index >= 0) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println(s"Sold $quantity of $item. Remaining quantity: ${itemQuantities(index)}")
      } else {
        println(s"Not enough $item in stock to sell $quantity. Available quantity: ${itemQuantities(index)}")
      }
    } else {
      println(s"Item $item does not exist in the inventory.")
    }
  }

  def main(args: Array[String]): Unit = {
    displayInventory()
    restockItem("Carrots", 20)
    sellItem("Potatoes", 10)
    sellItem("Tomatoes", 25)
    restockItem("Spinach", 40)
    displayInventory()
  }
}

