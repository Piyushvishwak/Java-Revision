import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void printJava(){
        System.out.println("Hello java!");
    }
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        for(int i=1; i<11; i++){
            System.out.print(i*i + " ");
        }
            //primitive types
        byte age=30;
        int a=1234;
        long b=12344324568296986L;
        float pi=3.14F;
        char kj='@';
        boolean isAdult=true;

        //non-primitive types
        String name="Aman";
        String name2 = new String("Akku");
        System.out.println("\n"+name.length());
        System.out.println(name2);
        System.out.println(name+name2);
        System.out.println(name.charAt(0));
        String name3 = name.replace('a', 'b');
        System.out.println(name);
        System.out.println(name3);
        System.out.println(name3.substring(0, 2));


        //Arrays
        int[] marks=new int[3]; //initialised with any garbage value which we didn't assigned
        marks[0]=11;
        marks[1]=21;
        marks[2]=13;

        System.out.println(marks);
        System.out.println(marks[0]);
        System.out.println(marks.length); // no bracket for length
        Arrays.sort(marks);
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        int[] arr={4,34,342};
        System.out.println(Arrays.toString(arr));

        int[][] finalmarks= {{123,21,312,3}, {123,4,45,4}};
        System.out.println(finalmarks[0][2]);
        System.out.println(Arrays.deepToString(finalmarks));

        //casting
        double price = 100.00;
        double finalPrice = price + 18; //implicit casting
        System.out.println(finalPrice); //correct

        int p=122;
        int fp = p + (int)12.99;    //error without (int)
        System.out.println(fp); //explicit casting

//        constants
        final float PI=3.14F;
//        PI=98124;   //error

//        Maths
        System.out.println(Math.max(5, 6));
        System.out.println(Math.min(5, 6));

        //Random--> any random value between 0.00  to 1.00, long
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100));

        // How to take input
        Scanner sc=new Scanner(System.in);
        System.out.print("Input your age: ");
//        int inp1 = sc.nextInt();
//        Float inp2 = sc.nextFloat();
//        String inp3 = sc.next();        //takes only single word
//        String s = sc.nextLine();        //takes whole string
        System.out.println(name);
//        System.out.println(s);

        // try-catch
        int[] number={12, 12,1, 2,1, 2};
        try{
            System.out.println(number[10]);  //will not print next all codes if exception caught
        }
        catch(Exception e){
            System.out.println("exception caught");
        }
        System.out.println("The name is aman");


        // methods
        printJava();


        // game
        int guess = 0;
        int num = (int)(Math.random()*100);
        while(true){
            if(guess == -1){
                System.out.println("exiting...");
                break;
            }
            System.out.print("Guess any number between 1-100: ");
            guess = sc.nextInt();
            if(guess < num){
                System.out.println("The guessed number is lesser than actual.");
            }
            else if(guess > num){
                System.out.println("The guessed number is greater than actual.");
            }
            else{
                System.out.println("You guessed the number correctly, congratulations!!");
                System.out.println("The number was " + num);
                break;
            }
            System.out.println("Press -1 to exit.");
        }
    }

}
