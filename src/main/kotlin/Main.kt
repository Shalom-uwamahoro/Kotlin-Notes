fun main(args: Array<String>) {

    var snacks= listOf("crips", "cake", "donut", "popcorns","pizza")
    println(snacks)
    println(snacks.sorted())
    snacks= snacks.sorted()
    // This allows you to sort the list parmanently
    println(snacks)
    // we don't need to add contentTostring on lists, as we used to on arrays; this is immutable list and it behaves like an aarray

    val friends= mutableListOf("Elijiah", "Moses", "Daniel", "Susan", "Canary")
    friends.add("Laura")
    friends.add("Terry")
    //this is a list with mutable list you can add and remove items
    println(friends)

    friends.remove("Daniel")
    println(friends)
    friends.removeAt(4)
    println(friends[4])
    //when you remove an item in mutable list the items that was behind it replaces it.

//    friends.addAll(listOf("Peter", "James","Samson"))  This adds at the end of the list
    println(friends)
    friends.addAll(2, listOf("Peter", "James","Samson"))
    println(friends)
    // The above adds elements at a particualr index

    friends.add(3,"Mary")
    println(friends)

    createListFromStrings("Nairobi","Kigali","Dodoma")
    createListFromStrings2("Nairobi","Kigali","Dodoma","Tutu", "Zanzbar")
    createListofIntegers(listOf(20,15,14,34,8))
    createListofIntegers2(listOf(20,15,14,34,8,45,87,9,44,55))
    createListofIntegers3(listOf(90,15,14,64,8,45,87,9,44,55))

    val phone= Product("Sumsanga Galaxy", 0.15, 50000.0)
    val milk= Product("Tuzo", 0.5, 65.0)
    val bread= Product("Supaloaf", 0.4, 55.0)

    var myCart= listOf(phone,milk,bread)
       myCart= myCart.sortedBy {  product -> product.name}
       myCart= myCart.sortedByDescending {  product -> product.weight}
    //you can sort with any of attributes in product; name, weight or price
    println(myCart)

}

fun createListFromStrings(city1: String, city2: String, city3: String): List<String>{
    println(listOf(city1,city2,city3))
    return listOf(city1,city2,city3)
}

fun createListFromStrings2(vararg cities: String): MutableList<String>{
    val result = mutableListOf<String>()
    cities.forEach {city -> result.add(city) }
    println(result)
    return result
}

//write a function that takes in a list containing 5 integers and return the sum of the elements at odd indices

fun createListofIntegers(nums: List<Int>): Int {

    val sum = nums[1] + nums[3]
    println(sum)
    return sum
}

//write a function that takes in a list of integers and return the sum of the elements at odd indices

fun createListofIntegers2(numz: List<Int>): Int {
    var sumz = 0
    for (x in numz){
        var indexOfInt= numz.indexOf(x)
        if (indexOfInt % 2 != 0) {
            sumz += x
        }

    }
    println(sumz)
    return sumz
}

fun createListofIntegers3(nums: List<Int>): Int {
    var sum = 0
    nums.forEachIndexed{index, item ->
        if(index % 2 != 0) {
            sum += index
        }
    }
    println(sum)
    return sum
}
//fun createListofIntegers4(nums: List<Int>): Int {
//    var sum = 0
//    var idx=1
//    while(
//}


data class Product(
    var name: String,
    var weight: Double,
    var price: Double
)



