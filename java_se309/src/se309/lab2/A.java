package se309.lab2;

public class A {
    protected int n1;
    protected C c;
    A(int n, C c){
        n1 = n;
        this.c = c;
    }
    public void caller(){}
}

class B extends A{
    private int n2;

    B(int n, int n2, C c) {
        super(n, c);
        this.n2 = n2;
    }

    public void caller(){
        System.out.println(c.sum(n1,n2));
    }
}
