import java.util.Scanner;
public class QuestionService {

    Question [] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService()
    {
        questions[0] = new Question(1, "which programming language was invented in 1995 by Sun Microsystems", 
        "java", "cpp", "c#", "python", "java");
        questions[1] = new Question(2, "What is the size of the int data type in Java?", "8", "16", "32", "64", "32");
        questions[2] = new Question(3, "What is the size of the int data type in Java?", "run()", "execute()", "start()", "end()", "start()");
        questions[3] = new Question(4, "Which of the following is not a Java feature?", "Object-oriented", "Use of pointers", "Platform independent", "Robust", "Use of pointers");
        questions[4] = new Question(5, "What is the default value of a local variable in Java?", "null", "0", "depends on datatype", "No default value", "No default value");
    }


    public void playQuiz()
    {
        //questions[0] = new Question();
        int i=0;
        for(Question q: questions){
            //System.out.println(q.getQuestion());
            System.out.println("Question no: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
        for(String s : selection)
        {
            System.out.println(s);
        }
    }

    public void CalculateScore(){
        int score = 0;
        for(int i=0; i<questions.length;i++)
        {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();

            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer))
            {
                score++;
            }
        }
        System.out.println("Your score is : " + score);
    }
}
