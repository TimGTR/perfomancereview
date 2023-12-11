package ru.ubrr.pr.streamapi.s_4_6_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamApiExample {
    public static void main(String[] args) {
        List<String> stringsList = Arrays.asList("apple", "banana", "orange");
        Stream<String> stringStream = stringsList.stream();

        String[] stringArray = {"apple", "banana", "orange"};
        Stream<String> stringStreamFromArray = Arrays.stream(stringArray);

        Stream<String> stringStreamOf = Stream.of("apple", "banana", "orange");

        String filePath = "path/to/your/file.txt";
        try (Stream<String> linesStream = Files.lines(Paths.get(filePath))) {
            linesStream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String text = "Hello, World!";
        text.chars().forEach(System.out::println);

        String fruitsText = "apple,banana,orange";
        Pattern pattern = Pattern.compile(",");
        Stream<String> fruitsStream = pattern.splitAsStream(fruitsText);
    }
}
