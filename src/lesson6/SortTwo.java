package lesson6;

public class SortTwo {
    public static void main(String[] args) {
        int[] Numbers = {1, 5, 5, 0, 4, 8, 5, 9, 1, 9, 1, 5, 2};
        int[] duplicateNumbers = new int[Numbers.length];

//        int duplicateNumbersIndex = 0;
        int repitableCOute = 0;

        for (int i = 0; i < Numbers.length - 1; i++) {
            for (int j = i + 1; j <Numbers.length ; j++) {
                boolean dubleFound = false;
                if(Numbers[i] == Numbers[j]){
                    for(int duplicateNUmber : duplicateNumbers){
                        if(Numbers[i] == duplicateNUmber){
                            dubleFound = true;
                            break;
                        }
                    }
                    if(!dubleFound){
//                        repitableCOute++;
                        duplicateNumbers[repitableCOute++] = Numbers[i];
                    }
                }
            }
        }
//        System.out.println(repitableCOute);
        System.out.println(repitableCOute);
        for (int i = 0; i < repitableCOute; i++) {
            System.out.print(duplicateNumbers[i] + " ");
        }


    }
}
