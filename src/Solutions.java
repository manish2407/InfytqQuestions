public class Solutions {
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
    }
}
