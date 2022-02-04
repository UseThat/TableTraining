import java.util.Random;

public class TableActions {
    private Random random = new Random();
    public void fillTableRandomly(int[] tab){
        for(int i =0; i<tab.length; i++){
            tab[i] = random.nextInt(100-0);
        }
    }

    public void printNumbers(int[] tab){
        System.out.println("Numbers in table:");
        for (int print:
             tab) {
            System.out.print(print+" ");
        }
        System.out.println();
    }

    public void sumTable(int[] table1, int[] table2){
        int sum =0;
        for(int i = 0; i<table1.length; i++){
            sum += table1[i];
        }
        for(int i = 0; i<table2.length; i++){
            sum += table2[i];
        }

        System.out.println("Sum of two tables: "+sum);
    }
}
