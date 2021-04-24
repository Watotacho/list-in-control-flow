
fun main(){
    println(even(20))
    println(even(21))
    var product=Granary("bread",200f,50,"groceries")
    var item=Granary("tissue",150f,100,"hygiene")
    product.items()
    item.items()
    println(checkChar("Banana"))

println(checkNames(arrayOf("Wato","Mercy","Buyole","Sharon")))

}
fun even(num:Int):Boolean {
    for (num in 10..40){
        if (num % 2 == 0) {
            return true
        }
        else{
         return false
        }
};return true
}

data class Granary(val name:String,val weight:Float,val price:Int,val category:String){
     fun items(){
      var groceries=mutableListOf<String>()
         var hygiene=mutableListOf<String>()
         var others=mutableListOf<String>()
          when("category") {
         "groceries"->println(mutableListOf("$name","$category"))
               " hygiene"->println(mutableListOf("$name","$category"))
                else->println(mutableListOf("$name","$category"))
}
}

}
          fun checkChar (name:String):String {
              var stringEven = ""
              for (char in name) {
                  if (name.indexOf(char) % 2 == 0) {
                      stringEven += char
                  }
              }

              return stringEven
          }


   fun checkNames(names:Array<String>):MutableList<String>{
       var longNamesList = mutableListOf<String>()
           for (name in names) {
               if (name.length % 2 == 0) {
                   println(longNamesList.add(name))
               }
           };return longNamesList
   }


