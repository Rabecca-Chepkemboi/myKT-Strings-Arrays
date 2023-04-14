fun main(){

    var b = secondLargest(arrayOf(23, 45, 13, 56, 76))
    println(b)

    var x = sumEven(arrayOf(2, 7, 6, 4, 5))
    println(x)

    var y = countVowels("hello cheep")
    println(y)

    var f = maxValue(arrayOf(34, 90, 78, 56, 45, 43))
    println(f)

    var w = palindrome("racecar")
    println(w)

}


// 1. Write a function that takes an array of integers as input and returns the second
//largest value in the array.

fun secondLargest(numb: Array<Int>): Int {
    numb.sortDescending()                             // Sort the array in descending order
    return numb[1]                                    // Return the second element
}


// 2. Write a function that takes an array of integers as input and returns the sum of
//all the even numbers in the array.

fun sumEven(nums: Array<Int>): Int {
    return nums.filter { it % 2 == 0 }.sum()          //.filter to return a list containing only the matching predicate
}


// 3. Write a function that takes a string as input and returns the number of vowels in the
//string. For example, if the input string is "hello world".

fun countVowels(str: String): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')              //.contvowel creates a set of all the vowels and uses
    return str.count { vowels.contains(it.toLowerCase()) }   //.count function to cont the no of characters in the output
}


// 4. Write a function that takes an array of integers as input and returns the maximum value in
//the array. For example, if the input array is [1, 2, 3, 4, 5, 6], the output should be 6.

fun maxValue(nums: Array<Int>): Int {
    return nums.max()                                      // Use the max() function to find the maximum value
}


// 5. Write a function that takes a string as input and checks if it is a palindrome and return the ouput
//(i.e., if it reads the same backwards as forwards). For example, if the input
//string is "racecar", the output should be true.

fun palindrome(word: String): Boolean {
    val reversed = word.reversed()         //uses the reversed function to obtain a reversed copy of the input string,
    return word == reversed                //and then checks if the original string and the reversed copy are equal
}


//                    SOME OF THE TAKEAWAY KEYS INCLUDE
// 1. Arrays in Kotlin are represented by the Array class, which is generic over the type of the array elements.

// 2. Kotlin supports string templates, which allow you to embed expressions in a string. To use a string template, enclose the expression in ${}.

// 3. You can create an array using the arrayOf() function or the Array() constructor.
