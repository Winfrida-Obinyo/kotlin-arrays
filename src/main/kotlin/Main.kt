fun main() {
    arrayOfIntegers()
    val arry = sumArrayElements(intArrayOf(2,6,7,8,3,98,65,45,2,))
    println("Sum of array elements: $arry")
    findlargest(arrayOf(34,67,89,2,45,89,65,32))

    val array = intArrayOf(1, 2, 3, 4, 5)
    val reversedArray = reverseArray(array)
    println(reversedArray.joinToString())

    findlSecondargest(arrayOf(67,54,5678,432,98,765))


}
//Write a program that takes an array of integers as input
//and returns a new array that contains only the unique elements from the original array.
fun arrayOfIntegers(){
        val input= arrayOf(1, 2, 3, 2, 4, 5, 4, 6, 7, 8, 7, 9)
        val unique = input.toSet().toIntArray()
        println("Input array: ${input.contentToString()}")
        println("Unique elements: ${unique.contentToString()}")

}
fun findLargestIndex(arr: IntArray): Int {
    var largestIndex = 0
    for (i in 1 until arr.size) {
        if (arr[i] > arr[largestIndex]) {
            largestIndex = i
        }
    }
    return largestIndex
}
//Given an array of integers, write a Kotlin function to find
// the sum of all the elements in the array.
fun sumArrayElements(arr: IntArray): Int {
    var sum = 0
    for (i in arr.indices) {
        sum += arr[i]
    }
    return sum
}

//Write a Kotlin function to find the largest element in an array of integers.
fun findlargest(num:Array<Int>){
    num.sortDescending()
//    num[0]
    println(num[0])
}
//Write a Kotlin function to reverse an array of integers.
fun reverseArray(array: IntArray): IntArray {
    array.reverse()
    return array
}

fun findlSecondargest(num:Array<Int>){
    num.sortDescending()
//    num[0]
    println(num[1])
}