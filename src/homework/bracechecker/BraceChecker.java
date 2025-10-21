package homework.bracechecker;

public class BraceChecker {
    private String text;
    Stack stack;

    public void chack(String text) {
        stack = new Stack(text.length());
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int last;
            switch (c) {
                case '[':
                case '(':
                case '{':
                    stack.push(c);
                    break;
                case '}':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error at " + i + ": closed } but not opened ");
                    } else if (last != '{') {
                        System.err.println("Error at " + i + ": closed } but opened " + (char) last);
                    }
                    break;
                case ']':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error at " + i + ": closed ] but not opened ");
                    } else if (last != '[') {
                        System.err.println("Error at " + i + ": closed ] but opened " + (char) last);
                    }
                    break;
                case ')':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error at " + i + ": closed ) but not opened ");
                    } else if (last != '(') {
                        System.err.println("Error at " + i + ": closed ) but opened " + (char) last);
                    }
                    break;
            }
        }
        int last;
        while ((last = stack.pop()) != 0) {
            System.out.println("Error: opened" + (char) last + " without closed");
        }

    }
}

