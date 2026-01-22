package operators;
public class OperatorsDemo {
    public static void main(String[] args){
       int a = 10 + 5;
       int b = 10 - 5;
       int c = 10 * 5;
       int d = 10 / 5;
       int e = 10 % 5;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e );

        int result1 = 10+5*2;
        System.out.println(result1);

        int result2 = (10+5)*2;
        System.out.println(result2);

        int result3 = 1234;
        int result4 = 1234;
        int result5 = 1230;

        if(result3 == result4 && result4 == result3){
            System.out.println("Both are equal.");
            System.out.println("True");
        }else {
            System.out.println("flase");
        }

        System.out.println(result3==result4);
        System.out.println(result3!=0);
        System.out.println(result4!=0);
        System.out.println(result5!=0);

    } 
}
