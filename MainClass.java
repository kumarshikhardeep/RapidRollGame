import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.JFrame;

public class MainClass extends JFrame {
  AudioClip click;
int g=1;
  public static void main(String[] args) {
    new MainClass();
  }

  public MainClass() {
    this.setSize(400, 400);
    this.setTitle("Mouse Clicker");
    this.addMouseListener(new Clicker());

    URL urlClick = MainClass.class.getResource("ChillingMusic.wav");
    click = Applet.newAudioClip(urlClick);
    


    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    while(g>=0)
    {
     click.play();
   
     g++;
     
    } 
  }

  private class Clicker extends MouseAdapter {
     
      
    public void mouseClicked(MouseEvent e) {
     
    }
  }
}