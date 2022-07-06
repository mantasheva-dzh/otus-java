package hw01.gradle;

import com.google.common.base.Joiner;

import java.util.List;

public class HelloOtus {
    public static final List<String> fruits = List.of("apples", "oranges", "bananas");

    public static String listFruits() {
        return Joiner.on(",").join(fruits);
    }
}
