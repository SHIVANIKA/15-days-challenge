public class FirstClass {
    public static void main(String [] args){
       int x = 334364;
       int Newx = (x+56);
        System.out.println("Newx ="+ Newx );
        byte y = 127;
        byte Newy = (byte) (y-6);
        System.out.println("Newy ="+ Newy);
        short z = 46;
        short Newz =(short) (z-6);
        System.out.println("Newz ="+Newz);
        long w = 234L;
        long neww = (50000L + 10L*(x+y+z));
        System.out.println("neww =" + neww);


    }
}


OUTPUT:

Newx =334420
Newy =121
Newz =40
neww =3395370

Process finished with exit code 0
