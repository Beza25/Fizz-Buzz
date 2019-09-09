public class Main {
    public static void main(String[] args){

        int message = 0;
        String str;

        for(int i =1; i <= 12; i++){
            message = i;
            if(i%3 == 0){
                str = Integer.toString(message);
                str = "Fizz";


            }else if(i%5 == 0){
                str = Integer.toString(message);
                str = "Buzz";

            }else{
                continue;
            }
            System.out.println(message);

        }

    }
}
