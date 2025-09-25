import java.util.*;
public class factorial {// recursive Case
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for Factorial : ");
        int num =sc.nextInt();
        System.out.println(fact(num));//argument
        sc.close();

    }
    static int fact(int n){//parameter
        if(n==0 || n==1)
        return 1;
    return (n*fact(n-1));
    }
}
