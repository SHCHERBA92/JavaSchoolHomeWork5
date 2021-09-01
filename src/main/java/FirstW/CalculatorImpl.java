package FirstW;

import java.lang.reflect.Method;

public class CalculatorImpl implements Calculator {
    @Override
    @Param(number = 1)
    public int calc(int number) {


//        for (Method m:
//             this.getClass().getDeclaredMethods()) {
//            if (m.isAnnotationPresent(Param.class))
//            {
//                Param param = m.getAnnotation(Param.class);
//                number = param.number();
//            }
//        }

        try {
            Method method = this.getClass().getDeclaredMethod("calc", int.class);
            System.out.println(method);
            System.out.println(method.getAnnotation(Param.class));
            if (method.isAnnotationPresent(Param.class))
            {
                Param param = method.getAnnotation(Param.class);
                System.out.println(param.number() + " == " + number);
                int paramNumber = param.number();
                if (number >= paramNumber)
                {
                    if (number <= paramNumber) {
                        return 1;
                    }
                    else {
                        return number * calc(number - 1);
                    }
                }
                else{
                    System.out.println("Не могу подсчитать фактариал числа");
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return 0;
    }
}
