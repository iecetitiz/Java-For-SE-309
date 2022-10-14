package se309.lab1;

public class driver {
    public static void main(String[] args) {
        roman first= new roman("f");
        roman second= new roman("V");

        System.out.println(first);
        System.out.println(second);
        first.add(second);
        System.out.println(first);
        first.increment();
        System.out.println(first);
        first.increment();
        System.out.println(first);
        second.decrement();
        System.out.println(second);
    }
}
