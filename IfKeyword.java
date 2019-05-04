public class FirstClass {
    public static void main(String [] args){

            boolean gameover = true;
            int FirstScore = 5000;
            int LevelCompleted = 5 ;
            int Bonus = 100;
            if (gameover== true){
                int FirstFinalScore = FirstScore + (LevelCompleted * Bonus);
                System.out.println("FirstFinalScore ="+ FirstFinalScore);

            }
            boolean NewGameOver = false;
            int SecondScore = 10000;
            int NextLevelCompleted = 8;
            int NextBonus = 200;

            if(NewGameOver==false){
                int SecondFinalScore = SecondScore + (NextLevelCompleted * NextBonus);
                System.out.println("SecondFinalScore = "+ SecondFinalScore)
            }

OUTPUT
FirstFinalScore =5500
SecondFinalScore = 11600

Process finished with exit code 0
