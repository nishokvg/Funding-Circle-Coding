package Prime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// main program
public class Prime {

    public static void main (String[] args){

        int N;
        int status = 1;
        int num = 3;
        List<Integer> Primenumber = new ArrayList<Integer>();
   //getting the n prime number as input    
        System.out.println("Enter N Integers:");
        Scanner inputNumber = new Scanner(System.in);
        N = inputNumber.nextInt();
        // calculating the N prime number
        Primenumber.add(2);
        for ( int a = 2 ; a <=N ;  )
        {
            for ( int b = 2 ; b <= Math.sqrt(num) ; b++ )
            {
                if ( num%b == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                Primenumber.add(num);
                a++;
            }
            status = 1;
            num++;
        }
        
        // printing n prime number in row and 10 multiplication on column
        for(int i=1;i<=10;i++){
            for(int j=0;j<Primenumber.size();j++) {
                System.out.print(Primenumber.get(j) * i +"    ");
            }
            System.out.println();
        }
    }
}