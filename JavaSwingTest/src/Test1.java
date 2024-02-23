import javax.swing.*;

class Test1{

    public static void main(String args[]){

       JFrame frame = new JFrame("63131016");

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       frame.setSize(200,200);

       JButton button = new JButton("Press");

       frame.getContentPane().add(button); 

       frame.setVisible(true);

    }

}