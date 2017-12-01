package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderWithoutHandling {
    public void readFile() throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());
        Path path = Paths.get(file.getPath());
        Stream<String> fileLines = null;
        try {
            fileLines = Files.lines(path);
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            throw new FileReaderException();
        }



    }
}
