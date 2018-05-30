package ii_collections

import util.TODO

fun todoTask24(): Nothing = TODO(
    """
        Task 24.
        The function should do the same as '_24_JavaCode.doSomethingStrangeWithCollection'.
        Replace all invocations of 'todoTask24()' with the appropriate code.
    """,
        references = { c: Collection<String> -> _24_JavaCode().doSomethingStrangeWithCollection(c) }
)

fun task24() {

}

fun Collection<String>.groupByLength(): Map<Int, List<String>> {
    return groupBy { it.length }
}

fun Map<Int, Collection<String>>.maxStringGroup(): Collection<String>? {
    return values.maxBy { it.size }
}

fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {
    return collection.groupByLength().maxStringGroup()
}


