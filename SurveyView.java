import javax.swing.*;
import java.awt.*;

public class SurveyView extends JPanel
{
 private int width = 600;
 private int height = 75;
 private int space = 15;
 private String[][] info;

 public SurveyView( String[][] vargu ) 
 { info = vargu; }
    
    
 public void display() 
 {
  int i = info.length+1;
  JFrame frame = new JFrame();
  frame.setSize(width + 2*space,i*height);
  frame.setTitle("Survey App");
  frame.setVisible(true);
  frame.getContentPane().add(this);
  frame.setLocationRelativeTo(null);
 }

 public void paintComponent(Graphics g)
 {
  for(int i = 0; i<info.length; i++) 
     {
		if(i==0) 
        {
		   g.setColor(new Color(0, 52, 137));
		   g.fillRect(0,i*height, width, height);
		   g.setColor(Color.WHITE);
		   g.drawRect(0,i*height, width, height);
		  }
		  else 
         {
          g.setColor(new Color(76, 144, 255));
		    g.fillRect(0,i*height, width, height);
		    g.setColor(Color.WHITE);
		    g.drawRect(0,i*height, width, height);
		   }
      for(int j=0; j<3; j++) 
         {
		    g.setColor(Color.WHITE);
		    g.drawLine(j*width/3, i*height, j*width/3, height*(i+1));
		    if(i==0) g.setColor(Color.WHITE);
          g.drawString(info[i][j], space + j*(width/3),((i+1)*height)-35);
         }
     }
 }
}









