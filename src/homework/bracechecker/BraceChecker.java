package homework.bracechecker;

public class BraceChecker {
    private String text;

    BraceChecker(String text) {
        this.text = text;
    }

    void chack() {
        Stack stack = new Stack();
        int stackCount = 0;
        for (int i = 0; i < text.length(); i++) {

            switch (text.charAt(i)) {
                case '[':
                case '(':
                case '{':
                    stack.push(text.charAt(i));
                    stackCount++;
                    break;
                case ']':
                case ')':
                case '}':
                    stack.push(text.charAt(i));
                    stackCount++;
                    break;
            }

        }
        char[] charArr = new char[stackCount];
        for (int j = stackCount - 1; j >= 0; j--) {
            charArr[j] = stack.pop();
        }
        for (int i = 0; i < stackCount; i++) {
            if ((charArr[i] == '{' && charArr[++i] == '}')
                    || (charArr[i] == '[' && charArr[++i] == ']')
                    || (charArr[i] == '(' && charArr[++i] == ')')
            ) {
                i += 2;
            }
            if (charArr[--i] != charArr[++i]) {
                int num1 = --i;
                int num2 = ++i;
                for (int j = 0; j < text.length(); j++) {
                    if(charArr[num2] == text.charAt(j)){
                        System.out.println("Error: opened " + charArr[num1]+ " but closed " + charArr[num2] + " at " + j);
                    }
                }

            }
        }

    }
}
