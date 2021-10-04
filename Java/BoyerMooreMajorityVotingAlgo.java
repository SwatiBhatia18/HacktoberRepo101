import java.util.*;

public class Main {
    
    public static int findMajorityElement(int []arr)
    {
        int count = 0;
        int val = arr[0];
        for(int x : arr)
        {
            if(x == val)
            {
                count++; 
            }
            else
            {
                count--;
            }
            if(count == 0)
            {
                val = x;
                count = 1;
            }
        }
        return val;
    }

    public static void printMajorityElement(int[] arr) {
        int val = findMajorityElement(arr);
        int count = 0;
        for(int x:arr)
        {
            if(val==x)
            {
                count++;
            }
        }
        if(count > arr.length/2)
        {
            System.out.println(val);
        }
        else
        {
            System.out.println("No Majority Element exist");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        printMajorityElement(arr);
    }
}
