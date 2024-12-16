import kotlin.math.absoluteValue

fun main() {
    fun part1(input: List<String>): Int {
        var leftNums = mutableListOf<Int>()
        var rightNums = mutableListOf<Int>()
        rightNums.sorted()
        leftNums.sorted()
        // use this section from the video Kotlin by JetBrains//
        val lines = readInput("day01.txt")
        val (leftNums, rightNums ) = lines.map { line ->
            val first = line.substringBefore(" ").toInt()
            val second = line.substringAfterLast(" ").toInt()
            first to second
        }.unzip()
        // end of the code used from the video kotlin by jetbrains day 1//

        var totalDistance = 0
        for (i in leftNums.indices){
            //var currentIndex = leftNums.indexOf(i)
            //totalDistance = i + rightNums[currentIndex]
            var difference = (rightNums[i]-leftNums[i]).absoluteValue
            totalDistance += difference
        }
        return totalDistance
    }
    val input = readInput("Day01")
    //part1(input).println()
    part1(input).println()
}



    // Read the input from the `src/Day01.txt` file.


//    fun part1(input: List<String>): Int {
//        println(input)
//        var leftNums = mutableListOf<Int>()
//        var rightNums = mutableListOf<Int>()
//        /*
//        for(i in leftNums){
//            for(x in leftNums){
//                if( x < i){
//                    var first = i
//                    var xindex = leftNums.indexOf(x)
//                    var iindex = leftNums.indexOf(i)
//                    leftNums[iindex] = x
//                    leftNums[xindex] = first
//                }
//            }
//        }
//        for(i in rightNums){
//            for(x in rightNums){
//                if( x < i){
//                    var first = i
//                    var xindex = rightNums.indexOf(x)
//                    var iindex = rightNums.indexOf(i)
//                    rightNums[iindex] = x
//                    rightNums[xindex] = first
//                }
//            }
//        }
//        */
//        return input.size
//    }



    /*
    fun par3(input: List<String>):Int{
        for(i in )
    }
    */


//    // Test if implementation meets criteria from the description, like:
//    check(part1(listOf("test_input")) == 1)
//
//    // Or read a large test input from the `src/Day01_test.txt` file:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

//    // Read the input from the `src/Day01.txt` file.
//    val input = readInput("Day01")
//    //part1(input).println()
//    part2(input).println()


