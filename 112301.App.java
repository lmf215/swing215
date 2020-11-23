package pac;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        while(true){
            Scanner scanner=new Scanner(System.in);
            int userNum=scanner.nextInt();
            int a,b;
            if(userNum!=1){
                System.out.println("输入数字1！");
            }else {
                a=(int)(Math.random()*100);
                b=(int)(Math.random()*100);
                System.out.println("坐标("+a+","+b+")");
            }
        }
    }
}
