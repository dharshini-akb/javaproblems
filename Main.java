
/*Question Problem 2:
Problem Statement – Vohra went to a movie with his friends in a Wave theatre and
during break time he bought pizzas, puffs and cool drinks. Consider the following
prices :
• Rs.100/pizza
• Rs.20/puffs
• Rs.10/cooldrink
Generate a bill for What Vohra has bought.
Sample Input 1:
• Enter the no of pizzas bought:10
• Enter the no of puffs bought:12
• Enter the no of cool drinks bought:5
Sample Output 1:
Bill Details
• No of pizzas:10
• No of puffs:12
• No of cooldrinks:5
• Total price=1290
ENJOY THE SHOW!!! */

import java.util.*;
public class Main 
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int pizza=100;
        int puffs=20;
        int cooldrinks=10;
        int pi=sc.nextInt();
        int pu=sc.nextInt();
        int co=sc.nextInt();
        System.out.println("Bill Details");
        System.out.println("No of Pizzas: "+pi);
        System.out.println("No of Pizzas: "+pu);
        System.out.println("No of Pizzas: "+co);
        int total=(pizza*pi)+(puffs*pu)+(cooldrinks*co);
        System.out.println("Total Amount: "+total);
        System.out.println("Enjoy the Show!!!");
    }
}