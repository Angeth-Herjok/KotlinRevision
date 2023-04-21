import java.util.Arrays
import java.util.NavigableMap

fun main() {
    and("Susan")
    and("Angeth")
//    school()
    text()
    val name = "Joan"
    val year = "1986"
    val age = "40"
    val sentence = "I am $name.I was born in $year and i am $age years old."
    println(sentence)
    println(person("Rebby" ,25))
    compass("Mark")
    compass("Peter")
    lady("Ajok")
    lady("Ex")
    var him ="salva kiir"
    println(him.toUpperCase())
    println(him.toLowerCase())
    println(him.capitalize())
    println(him.decapitalize())
    compose("James",45)
    letter("country"+""+"z")

    var d ="I am from "
    var home ="Bor"
    println(d + "" + home)

    println(parent("Achan","Erjok"))

    var emptyString=""
    var blankString=" "
    println(emptyString.isBlank())
    println(emptyString.isEmpty())
    println(blankString.isBlank())
    println(blankString.isEmpty())

    president()
    city()
    sentences()
    split()
    weight()
    friends()
    numbers()
    names()
    number()
    birds()
    kilogram()

    var book=Book("Trevor Noah","Born a crime",290,"Trevor")
    println(book.name)
    println(book.title)
   var Angeth=Human()
    Angeth.think()

    var a1=ActorPerson(30,"John")
a1.actor()
    var a2=EmployePerson(24,"Nimo")
    a2.working()
    var a3=TrainerPerson(35,"james","Kotlin")
    a3.training()
//school()
    println(peoples("Angeth ","Ajak"))
    brothers("")

}
fun and(name:String){
    var me="Angeth"
    if ((me==name))
        println("That's me!")
       else{
           println("I don't know who that is")}
}
//fun school(){
//    val school="Akirachix"
//
//    val output =($akirachix[0])$(akirachix[2])$(akirachix[3]))
//    println("output")
//
//}
fun text(){
    var text="Herjok"
    var j=text[3]
    var e=text[1]
    var k=text[5]
    var h=text[0]
    println("The string of the fourth,second,sixth,first characters is $j$e$k$h")
}
fun person(x:String,y:Int):String{
    var x ="Rebby"
    var y = 25
    return "Hi,my name is $x and i am $y years old"
}
fun compass(boy:String){
    var brother ="Mark"
    if((brother==boy)){
        println("He is my brother!")
    }
    else{
        println("He is my step brother")
    }
}
fun lady(bride:String){
    var first ="Ajok"
    if((bride==first)){
        println("She is my girlfriend.")
    }
    else{
        println("I don't want that girl")
    }
}
fun compose(write:String,age:Int){
    var write ="James"
    var age = "45"
    println("My name is $write and i am $age years old")
}
fun letter(nature: String){
    var country ="South Sudanese "
    var z ="are very tall!"
    println("South Sudanese " + "" + "are very tall!")
}
fun parent(mum:String,dad:String):String{
    var mum="Achan  "
    var dad="Erjok"
    return ("Achan " + "" + "Erjok" )
}
fun president(){
    val serve=" Mwai Kibaki "
    println(serve.trimStart())
    println(serve.trimEnd())
    println(serve.trim())
}
fun city(){
    val location="Eldoret"
    println(location.startsWith("E"))
    println(location.endsWith("f"))
}
fun sentences(){
    var sentence="The lawyer who shown up at the court is a South Sdanese."+
            "He has lived in Kenya for 20 years"
    println(sentence.replace("Kenya","USA"))
}
fun split(){
    var word="eagle,hen,dove,awl"
    var birds =word.split(",")
    println(birds)
    println(birds[2])
}
fun weight(){
    var weight="56 "
    println("My weight is " + weight.toString())
}
fun friends(){
    var friendsArray= arrayOf("James","Mathew","Peter","John")
    friendsArray.set(2,"Peter")
    println(friendsArray.get(2))
    var friendsArray1=friendsArray.plus("Bullen")
    println(friendsArray1.contentToString())
    println(friendsArray1[4])
    println(friendsArray1.indexOf("John"))
}
fun numbers(){
    var numArray = arrayOf(10,14,32,6,43,2,75,8)
    println(numArray.sum())
    println(numArray.min())
    println(numArray.max())
    println(numArray.count())
    var sortedArray=numArray.sortedArray()
    println(Arrays.toString(sortedArray))
    println(numArray.contentToString())
}
fun names(){
        var namesArray= arrayOf("Ada", "Beth", "Chris", "Diana", "Elsie","Fiona")
    for (name in namesArray)
        println(name)
    var sortedArray=namesArray.sortedArray()
    println(Arrays.toString(sortedArray))
    namesArray.set(3,"Jom")
    println(namesArray.get(3))

}
fun number(){
var numbArray = arrayOf(1,15,31,5,42,3,65,9)
var sortednumb=numbArray
    println(Arrays.toString(sortednumb))
}
fun birds(){
    val word = "eagle,falcon,hawk,owl"
    val bird=word.split(",")
    println(bird[1])
    println(bird)
    println(bird[1])
}
fun kilogram(){
    var weight=50
    println("My weight is "+ weight.toString())
}
data class Book(var name: String,var title:String,var pages:Int,var author:String)

 open class Human(){
    open fun think() {
        println("Real thinking")
    }
}
class Alien():Human(){
  override  fun think(){
         println("Virtual thinking")
    }
}
open class Person(personAge:Int,personName:String){
     init {
         println("person's age is $personAge")
    println("Person's name is $personName")
     }
}
class EmployePerson(age: Int,name: String):Person(age,name){
 fun working(){
     println("Employee works for the company.")
 }
}
class ActorPerson(age: Int,name: String):Person(age,name){
    fun actor(){
        println("Actor acts a play")
    }
}
class TrainerPerson(age: Int,name: String,subject:String):Person(age,name){
    init {
        println("$name is  trainer having $age and allowance training as $subject ")
    }
    fun training(){
        println("Trainer trains a person on a subject")
    }
}
fun students(){
    var students2="Nairobi"
    println(students2[2])
}
fun peoples(string1:String,string2:String):String{
    var people1=string1 +""+ string2
    return people1
}

fun brothers(brothers1:String){
    var brother1="Ajak"
    if (brother1==brother1){
        println("That's Ajak")
    }
    else{
        println("That's his twin brother")
    }
}



















