import javax.swing.*;

public class SurveyModel 
{
 public String[] questions()
 {
  String [] question = new String[21];
  question[0] = dropDown( "1/21 \nYou're planning a night out. Which option sounds more fun? \n\n\n a. Dinner with your best friend - just the two of you - and sharing what's on your mind. \n\n b. Going out with a group of friends. The more people, the more energy you feel. \n ");
  question[1] = dropDown( "2/21 \nIf you were forced to chose one, which would you choose? \n\n\n a. A weekend with zero social plans \n\n b. A weekend packed with zero social plans \n ");
  question[2] = dropDown( "3/21 \nAs a student, would you rather... \n\n\n a. Listen to an interesting lecture \n\n b. Participate in a lively discussion \n ");
  question[3] = dropDown( "4/21 \nIn general, after attending a large party or networking event, how do you feel? \n\n\n a. Tired and drained, even if I had fun \n\n b. Energized and ready for more \n ");
  question[4] = dropDown( "5/21 \nYou've just met someone new. How would they describe you? \n\n\n a. Quiet, reserved, and calm \n\n b. Outgoing, talkative, and friendly \n ");
  question[5] = dropDown( "6/21 \nIn general, which statement is most true for you? \n\n\n a. I like to focus deeply on one thing at a time rather than jump from task to task \n\n b. I don't mind multi-tasking, and I often do it \n ");
  question[6] = dropDown( "7/21 \nYou and a coworker have a disagreement. How do you react? \n\n\n a. I become quiet in the moment but may bring up the problem later. \n      I often need time to process before i talk. \n\n b. I don't hold back my thoughts. Better to get it all out there, right away. \n ");
  question[7] = dropDown( "8/21 \nAs a child, were you called \"shy\" or \"quiet\"? \n\n\n a. Yes, often \n\n b. No, not really \n ");
  question[8] = dropDown( "9/21 \nLet's say you wrote a poem. What do you do next? \n\n\n a. Keep it to yourself. You don't share your work with others until you've perfected it. \n\n b. Show it to a friend or share it on social media. It doesn't matter that it's not perfect. \n      The important thing is to get your ideas out there. \n ");
  question[9] = dropDown( "10/21 \nHow do you feel about meeting new people? \n\n\n a. It's tiring and a little nerve-wracking. \n\n b. It's exciting and interesting. \n " );
  question[10] = dropDown( "11/21 \nYou need to vent about your terrible day at work. What do you do? \n\n\n a. Text someone. \n\n b. Call someone. \n " );
  question[11] = dropDown( "12/21 \nYou find yourself home alone for the afternoon. What's your reaction? \n\n\n a. Thrilled. You've finally got a few hours all to yourself! \n\n b. Restless. You call up a friend to chat. \n ");
  question[12] = dropDown( "13/21 \nIn general, you... \n\n\n a. Need a moment to think before answering a question \n\n b. Answer quickly, as words are usually \"on the tip of your tongue\" \n " );
  question[13] = dropDown( "14/21 \nWhen it comes to concentrating on a task, which statement is true for you? \n\n\n a. I don't mind if people interrupt me. Stopping to chat for a few minutes is a welcome break. \n\n b. I dislike being interrupted. I dive deep into my work, so interruptions really throw off my train of thought. \n " );
  question[14] = dropDown( "15/21 \nWhen it comes to small talk, do you... \n\n\n a. Hesitate. It doesn't come naturally to me. \n\n b. Dive right in. I can always think of things to talk about! \n " );
  question[15] = dropDown( "16/21 \nIn general, do you consider yourself a risk-taker? \n\n\n a. No \n\n b. Yes \n " );
  question[16] = dropDown( "17/21 \nIf you had to choose one vacation, which would you choose? \n\n\n a. A warm beach and a book, either alone or with just one other person \n\n b. A cruise, where there are lots of things to do and people to meet. \n ");
  question[17] = dropDown( "18/21 \nWhich statement is true for you? \n\n\n a. I have a few friends. \n\n b. I have many friends. \n " );
  question[18] = dropDown( "19/21 \nAre you always up for trying something new? \n\n\n a. No \n\n b. Yes \n " );
  question[19] = dropDown( "20/21 \nWhich statement is true for you? \n\n\n a. People tell me I'm a good listener. \n\n b. It's difficult for me to listen for long periods of time. \n " );
  question[20] = dropDown( "21/21 \nWhich statement is true for you? \n\n\n a. As long as I'm living a life that's meaningful to me, fame, money, and status don't matter that much. \n\n b. It's important to me to be well-liked, have money, and be seen as an \"important\" person. \n " );
  return question;     
 }

 public String checkWinner(String result[])
 {
  int introvert = 0;
  int extrovert = 0;
  int winner = 1;
  for (int i = 0; i < result.length;i++)
      {
       if(result[i].equals("a"))
         { introvert++; }
         else if(result[i].equals("b"))
                { extrovert++; }
      }
  if(extrovert > introvert)
    { winner=2; }
  String personality ="";
  switch (winner)
         {
          case 1:
                 personality = "Introverted";
                 break;
          case 2:
                 personality = "Extroverted";
                 break;
          default:
                 personality = "Error";
                 break;
         }
  return personality;
 }

 public double winner_percentage(String[] result)
 {
  double percentage = 0;
  int introvert = 0;
  int extrovert = 0;
  int winner = 1;
  for (int i = 0; i < result.length;i++)
      {
       if(result[i].equals("a"))
         { introvert++; }
         else if(result[i].equals("b"))
                { extrovert++; }
      }
  if(extrovert > introvert)
    { winner = extrovert; }
    else { winner = introvert; }
  percentage = (100.0/result.length) * winner;
  return percentage;
 }

 private String dropDown(String s)
 {
  Object[] possibleValues = { "a", "b" };
  Object selectedValue = JOptionPane.showInputDialog(null, s, "Input", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
  return "" + selectedValue;
 }
}
