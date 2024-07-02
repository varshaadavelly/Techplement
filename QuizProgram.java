import java.util.Scanner;
public class QuizProgram
 {
   public static void main(String[] args)
   {
     int score = 0;
     Scanner scanner = new Scanner(System.in);

     for (int i = 0; i < args.length; i += 2)
     {
       String question = args[i];
       String correctAnswer = args[i + 1];

       System.out.println("Question " + (i / 2 + 1) + ": " + question);
       System.out.print("Your answer: ");

       String userAnswer = scanner.nextLine().trim();

       if (userAnswer.equalsIgnoreCase(correctAnswer.trim())) { //ignoring case and trim whitespace
       System.out.println("Correct!");
       score++;
       }
       else 
         {
           System.out.println("Incorrect. The correct answer is: " + correctAnswer);
         }
       System.out.println();
      }

     scanner.close();

     if((args.length / 2)>0)
        {
          System.out.println("Quiz completed!");
          System.out.println("Your score: " + score + " out of " + (args.length / 2));
        }

     else
        {
         System.out.println("no input! give input");
        }
   }
 }