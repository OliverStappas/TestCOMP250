public class TestCOMP250 {
    private String[] testArray;

    public TestCOMP250() {
        this.testArray = null;
    }

    public void addNewArrayPrint(int i, String input) {
        this.testArray = new String[i];
        this.testArray[0] = input;
        System.out.println(this.testArray[0]);
        System.out.println(this.testArray.length);
    }

    public static void main(String[] args) {
        TestCOMP250 test = new TestCOMP250();
        test.addNewArrayPrint(3, "sucar");


    }
}
