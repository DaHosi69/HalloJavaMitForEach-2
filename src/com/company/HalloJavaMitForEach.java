package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HalloJavaMitForEach {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList();
        stringList.add("Hallo");
        stringList.add("Welt");
        stringList.add("Kannst");
        stringList.add("Du");
        stringList.add("Mich");
        stringList.add("Hören");

        for(String s: stringList)
        {
            System.out.println(s);
        }
        System.out.println("\n");

        stringList.forEach((String s) -> System.out.println(s));
        System.out.println("\n");
        stringList.forEach(System.out::println);
    }
}
