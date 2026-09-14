package ClassObjectTheory;

class Operations{
    public int sum(int a, int b){
        return a+b;
    }
    public int diff(int a, int b){
        return (a>b) ? a-b : b-a;
    }
    public int prod(int a, int b){
        return a*b;
    }
    public int div(int a,int b){
        return (a>b)? a/b : b/a;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Operations op = new Operations();
        System.out.println(op.sum(2,5));
        System.out.println(op.diff(2,5));
        System.out.println(op.prod(2,5));
        System.out.println(op.div(2,5));
    }
    
}
