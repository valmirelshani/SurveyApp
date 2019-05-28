import java.awt.*;
import javax.swing.*;

public class SurveyController 
{
 SurveyModel sd = new SurveyModel();
 String[][] vargu;
 public String[][] conditions() 
 { 
  JOptionPane.showMessageDialog(null, "Are You More of an Introvert or Extrovert? \n\n Introverts gain energy being alone. Extroverts crave people and activity. \n\n Take this quiz to find out which one you are! \n ");
  int users = new Integer(JOptionPane.showInputDialog("How many people are going to be taking this quiz? (Up to five) \n (Results will be shown after all people complete the quiz.)")).intValue();
  if(users > 0 && users <6)
    {
     vargu = new String[users + 1][3];
     vargu[0][0] = "Name";
     vargu[0][1] = "Personality";
     vargu[0][2] = "Percentage";

     String[] result = new String[9];
     for (int i = 0; i < users; i++) 
         {
          for (int j = 0; j < 6; j++) 
              {
               switch (j) 
               { 
                case 0:
                       vargu[i + 1][j] = JOptionPane.showInputDialog("Enter a name for person " + (i + 1) + "! \n(It doesn't have to be your real name)");
                       break;
                case 1:
                       result = sd.questions();
                       vargu[i + 1][j] = sd.winner(result);
                       break;
                case 2:
                       String s = "" + sd.percentages(result);
                       vargu[i + 1][j] = s.substring(0, 5) + " %";
                       break;
               }
              }
         }
    }
    else if(users > 5)
           {
            JOptionPane.showMessageDialog(null, "The quiz can't be taken from more than five people at a time.");
            conditions();
           }
            else if(users < 0 )
                   {
                    JOptionPane.showMessageDialog(null, "You can't input a negative number of people.");
                    conditions();
                   }
                   else 
                    {
                     JOptionPane.showMessageDialog(null, "Zero people can't take the quiz.");
                     conditions();
                    }
  return vargu;
 }
	
 public static void main(String[] args)
 {
  SurveyController sc = new SurveyController();
  SurveyView sv = new SurveyView(sc.conditions());
  sv.display();
 }
}
