package homework.fileAnalayzer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileAnalyzerMain {

    public static void main(String[] args) {
        final String DATA_FILE = "C:\\Users\\myuser\\Desktop\\JavaCore\\src\\homework\\fileAnalayzer\\dataText.data";

        FileAnalyzer text = new FileAnalyzer();
        try {
            System.out.println(text.wordMap(DATA_FILE));
            System.out.println(text.totalWordCount(DATA_FILE));
            System.out.println(text.uniqueWordCount(DATA_FILE));
            System.out.println(text.topFrequentWords(DATA_FILE,2));
            System.out.println(text.countWordOccurrences(DATA_FILE,"rob"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }


}
