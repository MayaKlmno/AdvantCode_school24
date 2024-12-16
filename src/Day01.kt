fun main() {

    fun part2(input: List<String>): Int {
        var leftNums = mutableListOf<Int>()
        var rightNums = mutableListOf<Int>()
        rightNums.sort()
        leftNums.sort()

        var totalDistance = 0
        for (i in leftNums){
            var currentIndex = leftNums.indexOf(i)
            totalDistance = i + rightNums.get(currentIndex)
        }
        return totalDistance

    }

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("Day01")
    //part1(input).println()
    part2(input).println()

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
}
