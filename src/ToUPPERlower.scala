object ToUPPERlower {

  def ToLower(pattern: String):String = pattern.toLowerCase()

  def ToUpper(pattern: String):String = pattern.toUpperCase()

  def FormatPatterns (text: String)(index: Int*)(func: String => String): String ={
    if(index.isEmpty){
      return func(text)
    }
    var T = ""
    var i=0
    while (i < text.length()){
      if(index.contains(i)) T = T + func(text.charAt(i).toString) else T = T + text.charAt(i).toString
      i = i+1
    }
    T
  }

  def main(args:Array[String]): Unit ={
    println(FormatPatterns("Benny")()(ToUpper))
    println(FormatPatterns("Niroshan")(0,1)(ToUpper))
    println(FormatPatterns("Saman")()(ToLower))
    println(FormatPatterns("Kumara")(5)(ToUpper))
  }

}
