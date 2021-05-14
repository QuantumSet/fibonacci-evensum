import java.util.ArrayList;
public class FibonacciEvenSum {
	
    public static void main(String []args){
        int start = 1;
        int start2 = 2;
        
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(2);
        int numset = 0;
        while (numset < 4000000) 
        {
            numset = start + start2;
            if (checkEven(numset)) 
            {
                myNumbers.add(numset);
            }
            start = start2;
            start2 = numset;
        }
        int sum = 0;
        for (int i : myNumbers)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
     
     
    public static boolean checkEven (int num)
    {
        if (num % 2 == 1)
        {
            return false;
        } else {
            return true;
        }
    }
	
}
