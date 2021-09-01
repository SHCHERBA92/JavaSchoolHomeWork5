package FifthW;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyClassInvocation implements InvocationHandler {
    private MyInterface1 myInterface1;

    public MyClassInvocation(MyInterface1 myInterface1) {
        this.myInterface1 = myInterface1;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Будет подсчёт");
        return null;
    }
}
