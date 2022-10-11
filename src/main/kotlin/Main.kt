import kotlin.math.*
fun main(args: Array<String>) {
    //Зд.1
    val exercises:Int=13
    var exercisesSolved:Int=0
    exercisesSolved+=1
    println("exercises = $exercises")
    println("exercisesSolved = $exercisesSolved")
    //Зд.2
    val age:Int=17
    println("age = $age")
    //Зд.3
    var age1:Double=17.0
    age1=(age1+30.0)/2
    println("age1 = $age1")
    //Зд.4
    val testNumber:Int=10
    val evenOdd:Int=testNumber%2
    println("evenOdd = $evenOdd")
    //если заменить его на чётное число, evenOdd будет равно 0
    //Зд.5
    var answer:Double=0.0
    answer+=1
    answer*=10
    answer/=2*2*2
    println("answer = $answer")
    //Зд.6
    val a:Int=46
    val b:Int=10
    //Зд.7
    val answer1:Int=(a*100)+b
    val answer2:Int=(a*100)+(b*100)
    val answer3:Int=(a*100)+(b/10)
    println("answer1 = $answer1")
    println("answer2 = $answer2")
    println("answer3 = $answer3")
    // Зд.8 (5 * 3) - ((4 / 2) * 2)
    //Зд.9
    val a1:Double=10.0
    val b1:Double=15.0
    val average:Double=(a1+b1)/2
    println("average = $average")
    //Зд.10
    val fahrenheit:Double=10.0
    var celcius:Double=(fahrenheit-38)/1.8
    println("celcius = $celcius")
    //Зд.11

    //Зд.12
    val degrees: Double = 60.0
    val radians: Double = (degrees * PI) / 180.0
    println("radians = $radians")
    exercisesSolved += 1
    //Зд.13
    val x1: Double = 3.0
    val y1: Double = 8.0
    val x2: Double = 8.0
    val y2: Double = 5.0
    val distance: Double = sqrt( (x2 - x1).pow(2)) + (y2 - y1).pow(2)
    println("distance = $distance")




}