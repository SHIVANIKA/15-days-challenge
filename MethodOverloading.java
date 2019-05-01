public class FirstClass{
    public static void main(String args []){
        calcFeetAndInchesToCentimeters(4.9 ,11.9   );
        calcFeetAndInchesToCentimeters(139);

        }
        public static double calcFeetAndInchesToCentimeters(double feet ,  double inches){
            if ((feet < 0 ) || ((inches<0)&&(inches>12))){
                System.out.println("invalid feet and inches");
                return -1;

            }
            double centimeters = (feet *12) * 2.54;
            centimeters += inches  * 2.54;
            System.out.println(feet + "feet," + inches + "inches = " + centimeters + "cm");
            return centimeters;
        }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
            double feet = (int) inches/12;
        double remainingInches = (int) inches % 12 ;
        System.out.println(inches + "inches is equal to " + feet + "feet and " + remainingInches+ "inches");
        return calcFeetAndInchesToCentimeters( feet ,inches);


    }
}
  OUTPUT:
4.9feet,11.9inches = 179.578cm
139.0inches is equal to 11.0feet and 7.0inches
11.0feet,139.0inches = 688.34cm

Process finished with exit code 0

