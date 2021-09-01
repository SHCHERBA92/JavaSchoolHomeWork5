package ThirdW;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        ClassGetters classGetters = new ClassGetters();

        Method[] methods = classGetters.getClass().getDeclaredMethods();

        for (Method m:
             methods) {
            m.setAccessible(true);
            if (m.getName().contains("get"))
            {
                arrayList.add(m.getName());
            }
        }

        System.out.println(arrayList);

    }
}
