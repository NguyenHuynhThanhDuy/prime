package prime;
import java.util.Scanner;
public class SumPrime {
    public int n;
    
    public SumPrime() {
        this.n = 0;
    }
    
    public SumPrime(int n) {
        this.n = n;
    }
    
    public int Ngto(int n) {
        if(n<2) return 0;
        int k = (int)Math.sqrt(n);
        for(int i = 2; i <= k; i++)
            if(n%i==0)
                   return 0;
        return 1;
    }
    
    public void Tong(int n) {
        SumPrime sp = new SumPrime();
        int s = 0;
        for(int i = 0; i < n; i++) 
            if(sp.Ngto(i)==1)
                s+=i;
        System.out.println("Tong ngto < n: " + s);
    }
    
    public static void main(String[] args) {
        SumPrime spmain = new SumPrime();
        spmain.Tong(2);
    }
    
}
