package i_introduction._4_Lambdas

import util.JavaCode

class JavaCode4 : JavaCode() {
    fun task4(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }
}