package constructor;

public class ConstructorDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
    }
}

class A {
    A() {
        System.out.println("Constructor A");
    }
}

class B extends A {
    B() {
        System.out.println("Constructor B");
    }
}

class C extends B {
    C() {
        System.out.println("Constructor C");
    }
}