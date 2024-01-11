package extend1.super3;

public class Super2Main {

    public static void main(String[] args) {
        ClassB classB = new ClassC();
//        classC.classCMethod();
//        classC.classBMethod();
//        classC.classAMethod();
        ((ClassC) classB).classCMethod();
        classB.classBMethod();
        classB.classAMethod();
    }
}
