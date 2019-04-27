public class FirstClass {
    public static void main(String [] args){
        CalculateScore(true,5000,5,100);
                CalculateScore(true,10000,8,100);
                public static void CalculateScore( boolean gameover, int Score, int LevelCompleted,int Bonus ){
            if (gameover== true) {
                int FinalScore = Score + (LevelCompleted * Bonus);
                FinalScore += 3000;
                System.out.println("FinalScore =" + FinalScore);
            }
}


}


OUTPUT:
FinalScore =8500
FinalScore =13800

Process finished with exit code 0
