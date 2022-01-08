package _01_creational_pattern.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class App2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Settings settings = Settings.INSTANCE;

        /**
         * enum을 사용하면 reflection으로 뚫을 수 없음
         */
//        Settings settings1 = null;
//        Constructor<?>[] declaredConstructors = Settings.class.getDeclaredConstructors();
//        for (Constructor<?> constructor : declaredConstructors) {
//            constructor.setAccessible(true);
//            settings1 = (Settings) constructor.newInstance("INSTANCE");
//        }
//        System.out.println(settings == settings1);

        /**
         * enum을 사용하면 직렬화 & 역직렬화에서도 같은 인스턴스를 갖는다.
         */
        Settings settings2 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings2 = (Settings) in.readObject();
        }
        System.out.println(settings == settings2);
    }
}
