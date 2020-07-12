package GenericsTwoParam;

import java.util.ArrayList;

public class Main {
    public static void main(String a[]) {

        Box<String, String> sample1 = new Box<>("имя", "Нетология");
        System.out.println(sample1);

        Box<Integer, Boolean> sample2 = new Box<>(1, Boolean.TRUE);
        System.out.println(sample2);

        ArrayList<Box<String, Integer>> list1 = new ArrayList<>();
        //list1.add(sample1); Добавить не получится, лист ожидает на вход Box с параметрами
        // Srting, Integer, а мы передаем объект со значениями  String String
        //list1.add(sample2);  Так же как и в первом варианте входные параметры отличаются от ожидаемых,
        // ниже создадим лист, который будет хранить в себе объекты типа Box с любыми значениями "К,V"

        ArrayList<Box> list2 = new ArrayList<>();
        list2.add(sample1);
        list2.add(sample2);

    }
}
