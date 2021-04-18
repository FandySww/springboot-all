import com.sun.net.httpserver.Authenticator.Failure
import org.apache.flink.configuration.Configuration
import org.slf4j.LoggerFactory
import java.util.concurrent.{ExecutorService, Executors}

import scala.concurrent.{ExecutionContext, ExecutionContextExecutor, Future}
import scala.concurrent.{Await, ExecutionContext, ExecutionContextExecutor, Future}
import scala.collection.mutable
import scala.util.{Failure, Success}
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.ExecutionContext
/**
  * @Author fandayong
  * @Date 2021/3/26 2:40 PM
  * @description
  */
object MyFuture {
  def main(args: Array[String]): Unit = {


//    val value = {
//
//      Thread.sleep(2000)
//
//      10
//
//    }
//    val value=Future{
//
//      Thread.sleep(2000)
//
//      10
//
//    }
//    print("123")
//    print(value)

    val p = new Person1("12",2);
    print(p.age)
  }

}

class Person1(val name:String,val age:Int) {
  print("111111111111111111111111")
  def desc = "1221212121"+age
  print(desc)
}