import javax.swing.*;

public class GUI {
    public GUI(){
        var frame = frameSetup();
        JLabel label = new JLabel("test");
        frame.add(label);
    }

    public JFrame frameSetup(){
        var frame = new JFrame();
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        return frame;
    }

}
