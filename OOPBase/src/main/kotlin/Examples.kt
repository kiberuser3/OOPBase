fun findMax(inputList: List<Int>): Int {
    var max = Int.MIN_VALUE
    for (i in inputList.indices) {
        if (max < inputList[i]) {
            max = inputList[i]
        }
    }
    return max
}

fun printList(inputList: List<Any>) {
    for (i in inputList.indices) {
        println(inputList[i])
    }
}

fun listtask2(){
    var numbers = mutableListOf<Int>(5,6,7)
    for (i in 0..4) {
        println(i)
    }

    for(i in numbers.indices) {
        println(numbers[i])
        numbers[i] = numbers[i] + 1
    }
}

fun listtask() {
    var city = listOf<String>("Омск","Москва","Томск")
    println(city[2])
    var names = mutableListOf<String>("Алексанрд","Егор")
    names.add("Николай")
    names.removeAt(1)
    names.remove("")
    var food = listOf<Int>(1,2,3)

}

// Задачи по теме if-else
fun ifFirstTask() {
    var x = 6
    var y = 8

    if (y != 0) {
        println(x / y)
    } else {
        println("Делить на ноль нельзя")
    }

    println("Прогамма закончена")
}

fun ifSecondTask() {
    var p = 4
    var b = 6
    var fg = p + b
    println("")

}

fun ifThirdTask() {
    val month = 12
    if (month == 12) {
        println("Декабрь")
    }
    else if (month == 11) {
        println("Ноябрь")
    }
    else if (month == 10) {
        println("Октябрь")
    }
    else if (month == 9) {
        println("Сентябрь")
    }
    else if (month == 8) {
        println("Август")
    }
    else if (month == 7) {
        println("Июнь")
    }
    else if (month == 6) {
        println("Июль")
    }
    else if (month == 5) {
        println("Май")
    }
    else if (month == 4) {
        println("Апрель")
    }
    else if (month == 3) {
        println("Март")
    }
    else if (month == 2) {
        println("Февраль")
    }
    else if (month == 1) {
        println("Январь")
    } else {

    }
}
