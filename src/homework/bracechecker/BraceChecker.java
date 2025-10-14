package homework.bracechecker;

public class BraceChecker {
    private String text;

    BraceChecker(String text) {
        this.text = text;
    }

    void chack() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '[':
                case '(':
                case '{':
                    stack.push(text.charAt(i));
                    break;
                case ']':
                case ')':
                case '}':
                    stack.push(text.charAt(i));
                    break;
            }
        }
        int num = stack.tos / 2;
        int index  = text.length() - 1;
        for (int i = 0; i < num + 1; i++) {
            char k = stack.pop();
            for (int j = index; j > 0; j--) {
                if(k == text.charAt(j)){
                    index = j;
                    break;
                }
            }
            if (k == '}') {
                char a = stack.pop();
                if (a != '{') {
                    System.out.println("Error: opened " + a + " but closed " + k + " at " + index);
                }
            }
            if (k == ']') {
                char a = stack.pop();
                if (a != '[') {
                    System.out.println("Error: opened " + a + " but closed " + k+ " at " + index);
                }
            }
            if (k == ')') {
                char a = stack.pop();
                if (a != '(') {
                    System.out.println("Error: opened " + a + " but closed " + k+ " at " + index);
                }
            }
        }


    }
}

