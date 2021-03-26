import java.util.Scanner;

public class Solutions {
    /*1. factorial of number
    public int factorial(int number){
        int result = 1;
        while(number!=0){
            result = result*number;
            number--;
        }
        return result;
    }
    public static void main(String[] args) {
        Solutions my = new Solutions();
        System.out.println(my.factorial(5));
    }*/
    /*2. To print the geometric Sequence of number
    public void geometricSequence(int number){
        System.out.print(1);
        int result=1;
        for (int i =1;i<number;i++){
            result=result*2;
            System.out.print(","+result);
        }
    }
    public static void main(String[] args) {
        Solutions my = new Solutions();
        my.geometricSequence(5);
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a==b){
            System.out.println(a+b);
        }
        else{
            System.out.println((a+b)*2);
        }
    }
}
