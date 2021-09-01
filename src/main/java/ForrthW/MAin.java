package ForrthW;

import java.lang.reflect.Field;

public class MAin {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = new DayOfWeek();
        Field[] fields = dayOfWeek.getClass().getDeclaredFields();
        boolean flagStat = true;
        String strArg = null;
        String nameField = null;

        for (Field f:
             fields) {
            nameField = f.getName();
            //System.out.println(f.getName());
            try {
                strArg = (String) f.get(dayOfWeek);
                //System.out.println(str);

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (!(nameField.equals(strArg)))
            {
                System.out.println("Имена констант НЕ совпадают с их значениями");
                flagStat = false;
                break;
            }

        }

        if (flagStat){
            System.out.println("Имена констант совпадают с их значениями");
        }
    }
}
