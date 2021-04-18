object TestAll {
  def main(args: Array[String]): Unit = {
     var a = 1;
     if(a>0) a = 100 else a = -1
     print(a)

     for(i <- 1 to 3;j <- 1 to 3 if i  != j) print ((10*i+j)+" ")
  }
}





