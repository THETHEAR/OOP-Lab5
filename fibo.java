import java.util.Scanner;

// import javax.swing.text.html.HTMLDocument.RunElement;

public class fibo {

    static int F(int n) //Fibo
        {
            if(n==0||n==1){
                // System.out.println("if"+n);
                return 1;
            }
            else{
                // System.out.println("esle"+n);
                return F(n-1)+F(n-2);
            }
        }
    
    static int Fac(int n) //Factorial
    {
        if(n==1){
            return 1;
        }
        else{
            return n+Fac(n-1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int f = F(n);
        // System.out.println(f);
        int fac = Fac(n);
        System.out.println(fac);
    }
}
