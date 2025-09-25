import java.util.*;
public class EorOArrayCount {//Counting Even Or Odd numbers In Array 
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in); 
        System.out.println("Enter the Size of Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter an Array : ");
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        evenOddCount(arr);
        sc.close();
    }
    static void evenOddCount(int[] a){
        int len =a.length;
        int EvenC=0,OddC=0;
        for(int i=0;i<len;i++){
            if(a[i]%2==0)
            EvenC++;
            else
            OddC++;
        }
        System.out.println("Even : "+EvenC+" "+" Odd : "+OddC);  
    }
}
