import javax.swing.*;

public class GUI {
    public GUI(){
        frameSetup();

    }

    public void frameSetup(){
        var frame = new JFrame();
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
