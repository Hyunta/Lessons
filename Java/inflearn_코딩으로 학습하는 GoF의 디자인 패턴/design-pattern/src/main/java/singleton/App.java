//package singleton;
//
//import java.io.*;
//import java.lang.reflect.Constructor;
//import java.lang.reflect.InvocationTargetException;
//
//public class App {
//    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
//        Settings settings = Settings.getInstance();
//
//        /**
//         * new를 통해 생성하게 된다면 인스턴스를 새로 생성하게 된다.
//         */
////        Settings settings = new Settings();
////        Settings settings1 = new Settings();
//
//        /**
//         * 1. 싱글톤 패턴을 가장 단순히 구현하는 방법
//         * 심각한 문제점 - 웹 애플리케이션을 만들 때 멀티쓰레드를 사용하는데,이 코드는 멀티쓰레드 환경에서 안전하지 못하다
//         */
//
////        Settings settings1 = Settings.getInstance();
////        System.out.println(settings == settings1);
//
//        /**
//         * 싱글톤 패턴 구현 깨트리는 방법1 - 리플렉션 사용하기
//         */
//        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Settings settings2 = constructor.newInstance();
//        System.out.println(settings == settings2);
//
//        /**
//         * 싱글톤 패넡 구현 깨트리는 방법2 - 직렬화 & 역직렬화를 사용
//         */
//        Settings settings3 = null;
//        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
//            out.writeObject(settings);
//        }
//
//        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
//            settings3 = (Settings) in.readObject();
//        }
//        System.out.println(settings == settings3);
//    }
//}
