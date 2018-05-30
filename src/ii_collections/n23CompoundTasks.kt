package ii_collections

fun Shop.getCustomersWhoOrderedProduct(product: Product): Set<Customer> {
    return customers.filter { it.orderedProducts.contains(product) }.toSet()
}

fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    return orders
            .filter(Order::isDelivered)
            .flatMap(Order::products)
            .maxBy(Product::price)
    // Return the most expensive product among all delivered products
    // (use the Order.isDelivered flag)
}

fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    // Return the number of times the given product was ordered.
    // Note: a customer may order the same product for several times.

    return customers
            .flatMap(Customer::orders)
            .flatMap(Order::products)
            .filter { it == product }
            .count()
}
