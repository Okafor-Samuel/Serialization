import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("/Users/decagon/Downloads/Serialization/src");
        file.mkdir();
        file = new File("/Users/decagon/Downloads/Serialization/src//StudentFile.txt");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            Student student = new Student();
            student.rollNumber = 1004;
            student.name = "Kingsley";
            student.department = "Java Stack";
            bufferedWriter.write(String.valueOf(student));
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("RuntimeException(e)");
        }
        System.out.println("Succesful");

    }
}