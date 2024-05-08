import exception.ReadException;
import exception.WriteException;
import model.Cat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Runner {

    private static final String PATH = "test.csv";
    private static final String DELIMITER = ";";

    public static void main(String[] args) {
        try {
            write(new Cat("Ford", 2));
            read();
        } catch (ReadException | WriteException e) {
            System.err.println(e);
        }
    }

    private static void write(Cat cat) throws WriteException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(PATH, true))) {
            writer.println(cat.toString());
        } catch (IOException e) {
            throw new WriteException("The object is not serialized!");
        }
    }

    private static void read() throws ReadException {
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(DELIMITER);
                Cat cat = new Cat(fields[0], Integer.parseInt(fields[1]));
                System.out.println(cat);
            }
        } catch (IOException e) {
            throw new ReadException("The object is not deserialized!");
        }
    }
}
