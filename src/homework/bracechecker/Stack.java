package homework.bracechecker;

public class Stack {
    int[] stck;
    int tos;

    Stack() {
        tos = -1;
        stck = new int[10];
    }

    Stack(int lenght){
        tos = -1;
        stck = new int[lenght];
    }
    void push(int item) {
        if (tos != stck.length - 1) {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
