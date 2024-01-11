package extend1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        this(a, 100);
        //super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        this(a, b, 200);
        System.out.println("ClassB 생성자 a="+ a + " b=" + b);
    }

    public ClassB(int a, int b, int c) {
        super();
        System.out.println("ClassB 생성자 a=" + a + " b=" + b + " c=" + c);
    }
}
