/**
 * @Author fandayong
 * @Date 2021/4/22 11:35 AM
 * @description
 */
public class TestException {
    public static void main(String[] args) {
        try{
            getException();
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public static void getException() throws Exception {
        try{
            int a = 1/0;
        }catch (Exception e){
            throw new Exception("什么东西");
        }
    }
}
