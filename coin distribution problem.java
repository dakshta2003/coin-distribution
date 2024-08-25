/*Find the minimum number of coins required to form any value between 1 to N, both inclusive.Cumulative value of
coins should not exceed N. Coin denominations are 1 Rupee, 2 Rupee and 5 Rupee.Let's Understand the problem
using the following example.
Consider the value of N is 13, then the minimum number of coins required to formulate any value between 1 and 13,
is 6. One 5 Rupee, three 2 Rupee and two 1 Rupee coins are required to realize any value between 1 and 13. Hence
this is the answer.
However, if one takes two 5 Rupee coins, one 2 rupee coin and two 1 rupee coin, then too all values between 1*/
import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number: ");
        int number = sc.nextInt();
        int one =0;
        int two =0;
        int five = (number-4)/5;
        if(((number-5*five)%2)==0){
            one = 2;
        }
        else
        {
            one = 1;
        }

        two = (((number-5)*five-one)/2);
        System.out.print("total number of coins =");
        System.out.println( one+five+two);
        System.out.println("total number of 5 coins reqired = "+ five);
        System.out.println("total number of 1 coins reqired ="+ one);
        System.out.println("total number of 2 coins reqired ="+ two);


    }
    
}
