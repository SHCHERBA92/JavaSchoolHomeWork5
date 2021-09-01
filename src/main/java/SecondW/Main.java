package SecondW;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        MyClassChild myClassChild = new MyClassChild();

        Method[] methods = myClassChild.getClass().getDeclaredMethods();

        for (Method m:
             methods) {
            m.setAccessible(true);
            System.out.println(m);
        }

        Class superClass = myClassChild.getClass().getSuperclass();
        System.out.println(superClass + " - родительский класс.\n Его методы :");

        for (Method m:
             superClass.getDeclaredMethods()) {
            m.setAccessible(true);
            System.out.println(m);
        }
    }
}
