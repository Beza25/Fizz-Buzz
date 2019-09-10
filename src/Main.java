public class Main {
    public static void main(String[] args){

        int message = 0;
        String str, five;

        for(int i =1; i <= 100; i++){
            message = i;
            if(i%3 == 0){
                str = Integer.toString(message);
                str = "Fizz";
                System.out.println(str);


            }else if(i%5 == 0){
                five = Integer.toString(message);
                five = "Buzz";
                System.out.println(five);

            }else{
                System.out.println(i);
            }


        }

    }
}
