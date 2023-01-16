package learning;

public class Calculator {
    public int sum(int a, int b) {
        System.out.println("value of" );
        return a+b;
    }

    public int sum(int ...a) {
        int sum = 0;
        for (int i: a) {
            sum+=i;

        }
        return sum;
    }

    public int divide(int a, int b) {
        if(b==0){
            throw new BadDivisorExpection("Please don't divide by Zero");
        }
        return a/b;
    }

    public long multiply(int a, int b) {
        if (a < 0) {
            a = 1;

        }
        if (b < 0) {
            b = 1;
        }
        return ++a * b;
    }

        public String getName(){
            return null;

        }
    }

