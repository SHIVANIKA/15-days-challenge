public class FirstClass {
    public static void main(String [] args){
            
            double FirstValue = 20d;
            double SecondValue = 80d;
            double Total =(FirstValue + SecondValue) *25;
            System.out.println("Total =" + Total);
            double remainder = Total % 40;
            System.out.println("remainder ="+ remainder);
            if(remainder <=20)
            System.out.println("Total was over the limit");


  }
}

OUTPUT
Total =2500.0
remainder =20.0
Total was over the limit

Process finished with exit code 0
