package ii_collections

fun example4() {
    val max = listOf(1, 42, 4).max()
    val longestString = listOf("a", "b").maxBy { it.length }
}

fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? {
    return customers.maxBy { it.orders.count() }
}

fun Customer.getMostExpensiveOrderedProduct(): Product? {
    return orders.flatMap(Order::products).maxBy(Product::price)
    // Return the most expensive product which has been ordered
}
