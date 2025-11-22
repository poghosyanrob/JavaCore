package homework.fileAnalayzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileAnalyzer {

    public Map<String, Integer> wordMap(String path) throws IOException {
        String text = Files.readString(Path.of(path)).toLowerCase();
        List<String> wordSplit = new ArrayList<>(Arrays.asList(text.split(" ")));
        Map<String, Integer> wordsMap = new HashMap<>();
        for (int i = 0; i < wordSplit.size(); i++) {
            int k = 1;
            for (int j = i + 1; j < wordSplit.size(); j++) {
                if (wordSplit.get(i).contains(wordSplit.get(j))) {
                    k++;
                    wordSplit.remove(j);
                }
            }
            wordsMap.put(wordSplit.get(i), k);
        }
        return wordsMap;
    }

    public int totalWordCount(String path) throws IOException {
        String text = Files.readString(Path.of(path)).toLowerCase();
        List<String> wordCount = new ArrayList<>(Arrays.asList(text.split(" ")));
        return wordCount.size();
    }

    public int uniqueWordCount(String path) throws IOException {
        String text = Files.readString(Path.of(path)).toLowerCase();
        List<String> wordSplit = new ArrayList<>(Arrays.asList(text.split(" ")));
        for (int i = 0; i < wordSplit.size(); i++) {
            for (int j = i + 1; j < wordSplit.size(); j++) {
                if (wordSplit.get(i).contains(wordSplit.get(j))) {
                    wordSplit.remove(i);
                    wordSplit.remove(j);
                }
            }
        }
        return wordSplit.size();
    }

    public Map<String, Integer> topFrequentWords(String path, int n) throws IOException {
        String text = Files.readString(Path.of(path)).toLowerCase();
        List<String> wordSplit = new ArrayList<>(Arrays.asList(text.split(" ")));
        Map<String, Integer> wordCopy = wordMap(path);
        Map<String, Integer> topWord = new HashMap<>();
        int k = 0;
        for (String s : wordSplit) {
            if (wordCopy.get(s) != 1) {
                if (k < n) {
                    topWord.put(s, wordCopy.get(s));
                    k++;
                }
            }
        }
        return topWord;
    }

    public int countWordOccurrences(String path, String word) throws IOException {
        String text = Files.readString(Path.of(path)).toLowerCase();
        List<String> wordSplit = new ArrayList<>(Arrays.asList(text.split(" ")));
        int count = 0;
        for (String s : wordSplit) {
            if (s.contains(word)) {
                count++;
            }
        }

        return count;
    }

}
