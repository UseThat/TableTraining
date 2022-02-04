public class TableTest {
    public static void main(String[] args) {
        int [] tab = new int[3];
        int [] tab2 = new int[3];

        TableActions tableActions = new TableActions();

        tableActions.fillTableRandomly(tab);
        tableActions.fillTableRandomly(tab2);

        tableActions.printNumbers(tab);
        tableActions.printNumbers(tab2);

        tableActions.sumTable(tab,tab2);

    }
}
