package Office_Hours.Practice_09_15_2020;

public class FinalKeyword {

private final int c= 200;
public int getC(){
    return c;
}
 //public void setC(int c){
  //  this.c =c;
//}

    public String getUserName() {
        return userName;
    }

    //
    // final static int z = 300;
    final private String userName= "Cybertek";
final private String passWord= "Cybertek123";


    public static void main(String[] args) {
        final int a = 100;

    }


}
class TestBase{
    public final void setUP() {
        System.out.println("Set the driver");
        System.out.println("Open browser");
        System.out.println("URL");
        System.out.println("Maximize window");
        System.out.println("Implicit wait");


    }
        public final void tearDown(){
            System.out.println("if failed, take screenshot");
            System.out.println("Close Browser");
        }

    }
    class TesCase extends TestBase{





}