class A {
    void callme() {
        System.out.println("Inside callme() of class A");
    }
}

class B extends A {
    void callme() {
        System.out.println("Inside callme() of class B");
    }
}

class C extends A {
    void callme() {
        System.out.println("Inside callme() of class C");
    }

    void callme1() {
        System.out.println("Inside callme1() of class C");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}