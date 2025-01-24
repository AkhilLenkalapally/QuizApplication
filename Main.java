public class Main{
    public static void main(String[] args){
        //System.out.println("Hello my dear");
        QuestionService service = new QuestionService();
        service.playQuiz();
        service.CalculateScore();
}
}