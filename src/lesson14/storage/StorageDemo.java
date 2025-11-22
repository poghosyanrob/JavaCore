package lesson14.storage;

public class StorageDemo {

    public static void main(String[] args) {

        Storage<String> name = new Storage<>();

        name.add("Poxos");
        name.add("Hakob");
        name.add("Vazgen");
        name.print();

        Storage<Integer> nums = new Storage<>();
        nums.add(45);
        nums.add(79);
        nums.add(7954);
        nums.print();

    }

}
