import java.util.Scanner;
/**
 * Finds powers, absolutes, and square roots without the Math class and then checks and displays several cases with the Math class
 * @author Patrick H.
 * @since 2017-11-12
 * @version 1.0
 */
public class Expressions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter 3 numbers. (x y z)");
        int uinx = sc.nextInt();
        int uiny = sc.nextInt();
        int uinz = sc.nextInt();

        double result =(Expressions.Sqrt(uinx) + Expressions.abs(uiny)+ ((int)square(uinz,uiny)));
        double result2 = (Math.sqrt(uinx) + Math.abs(uiny) + Math.pow(uinz,uiny));

        System.out.println("First with my algorithms:");
        System.out.println(uinx + "^10 = " + Expressions.square(uinx, 10));
        System.out.println(uinx+" + "+uiny+" = "+(uinx+uiny));
        System.out.println("Squareroot("+uinx+") + |"+uiny+"| + "+uinz+"^"+uiny+" = "+result);

        System.out.println("\n\nNow with the Math class:");
        System.out.println(uinx + "^10 = " + Math.pow(uinx, 10));
        System.out.println(uinx+" + "+uiny+" = "+(uinx+uiny));
        System.out.println("Squareroot("+uinx+") + |"+uiny+"| + "+uinz+"^"+uiny+" = "+result2);

        System.out.println("now for some additional Math class functions:");
        System.out.println("a random value from 1 - 10: " + (Math.random()*10));

            int grtr1 = Math.max(uinx,uiny);
            int grtr2 = Math.max(uiny,uinz);
            int grtst = Math.max(grtr1,grtr2);

        System.out.println("The greatest value you input: " + grtst);

            int smlr1 = Math.min(uinx,uiny);
            int smlr2 = Math.min(uiny,uinz);
            int smlst = Math.min(smlr1,smlr2);

        System.out.println("The Smallest value you input: " + smlst);
        System.out.println("7.5984729592 truncated is: " + Math.floor(7.5984729592));
        System.out.println("7.5984729592 rounded up is: " + Math.ceil(7.5984729592));
        System.out.println("7.5984729592 rounded properly is: " + Math.round(7.5984729592));
    }
        public static double abs(int x){
            if (x>0){
                return x;
            }
            else{
                return (0-x);
            }
        }
        public static double square(int x, int y){
            int count = 0;
            int result = 1;
            while (count < y){
                result = (result*x);
                count++;
            }
            return result;
        }
        public static double Sqrt(double input){
            double result = 1;
            for (int i = 0; i < input; i++) {
                result = 0.5 * (result + input / result);
            }
            return result;
    }

}

