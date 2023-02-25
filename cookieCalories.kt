fun  main(){
  val caloriesPerCookie = 75
  
  printlin("Enter the number of cookies eaten: ")
  var cookiesEaten = readLine()!!.toInt()
  var calorieIntake =cookiesEaten * caloriePerCookie
  println("Your calorie intake was " + calorieIntake + " calories. ")
}
