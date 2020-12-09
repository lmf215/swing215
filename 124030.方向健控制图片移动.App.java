import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_plane=new JLabel();

    int CELL=64;
    //构造方法
    public App() {


        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()==e.VK_UP){
                    label_plane.setBounds(label_plane.getX(),label_plane.getY()-CELL,CELL,CELL);
                }
                if(e.getKeyCode()==e.VK_DOWN){
                    label_plane.setBounds(label_plane.getX(),label_plane.getY()+CELL,CELL,CELL);
                }
                if(e.getKeyCode()==e.VK_LEFT){
                    label_plane.setBounds(label_plane.getX()-CELL,label_plane.getY(),CELL,CELL);
                }
                if(e.getKeyCode()==e.VK_RIGHT){
                    label_plane.setBounds(label_plane.getX()+CELL,label_plane.getY(),CELL,CELL);
                }
            }
        });
    }
    //显示窗体方法
    void go(){


        java.net.URL imgURL = App.class.getResource("img/plane0.png");
        label_plane.setIcon(new ImageIcon(imgURL));
        label_plane.setBounds(200,500,CELL,CELL);
        myPanel.add(label_plane);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600,200,512,720);
        //frame.pack();
        frame.setVisible(true);

        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new App().go();
    }
}
