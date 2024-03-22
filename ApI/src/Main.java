import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "Apple", "Banana", "Apricot", "Pear", "Avocado", "Orange", "Mango", "Pineapple",
                "Grapes", "Cherry", "Strawberry", "Blueberry", "Raspberry", "Blackberry", "Kiwi",
                "Watermelon", "Peach", "Plum", "Lemon", "Lime"
        );
        Stream<String> stream = strings.stream()
                .filter(s -> s.startsWith("A"));
        long count = stream.count();
        System.out.println("Count: " + count);


    }
}