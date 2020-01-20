import java.util.*;
public class returntype {
    public static void main(String[] args) {
        // System.out.println(printdesc(0,10));
        System.out.println(powerbetter(2,5));
        System.out.println(calls(5));

    }
    public static int power(int a,int b){
        if(b==1){
            return 1;
        }
        int recAns=a*power(a,b-1);
        return recAns;
    }
    public static int powerbetter(int a,int b){
        if(b==1){
            return a;
        }
        int recAns=powerbetter(a,b/2);
        recAns=((b&1)==0?recAns*recAns:recAns*recAns*a);
        return recAns;
    }
    public static int printdesc(int st,int en){
        if(st==en){
            return st;
        }
        
        int recAns=printdesc(st+1, en);
        System.out.println(recAns);
        return recAns-1;
    }
    public static int calls(int n) {
        if (n <= 1) {
            System.out.println("base: " + n);
            return n + 1;
        }

        int count = 0;

        System.out.println("Pre: " + n);
        count += calls(n - 1);

        System.out.println("In: " + n);

        count += calls(n - 2);
        System.out.println("Post: " + n);

        return count + 3;

    }
}