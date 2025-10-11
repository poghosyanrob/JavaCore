package homework.bracechecker;

public class Stack {
    char[] stck = new char[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(char item) {
        if (tos == stck.length - 1) {
            extend();
        } else {
            stck[++tos] = item;
        }
    }
    private void extend(){
        char[] copyArray = new char[stck.length + 10];
        for (int i = 0; i < stck.length; i++) {
            copyArray[i] = stck[i];
        }
        stck = copyArray;
    }

    char pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
