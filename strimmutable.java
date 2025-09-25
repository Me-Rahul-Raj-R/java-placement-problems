import java.util.*;
public class strimmutable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String st1 = sc.next();
        System.out.println(str.hashCode());
        System.out.println(st1.hashCode());
        StringBuilder name = new StringBuilder(sc.next());
        StringBuilder name1 = new StringBuilder(sc.next());
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());
        sc.close();

    }
    
}
