package pac;
import org.omg.Messaging.SyncScopeHelper;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws InterruptedException {
        while(true){
            Thread.sleep(1000);
            System.out.println((int)(Math.random()*100)+","+(int)(Math.random()*100));
        }
    }
}
