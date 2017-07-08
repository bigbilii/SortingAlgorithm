import java.util.Random;

/**
 * Created by bigbilii on 2017/7/4.
 *
 */
public class List {

    int[] list = new int[8];

    List() {
        randList();
    }

    private void randList() {
        for (int i = 0; i < list.length; i++) {
            list[i] = new Random().nextInt(100);
        }
    }

    public void printList() {
        for (int aList : list) {
            System.out.print(aList + " ");
        }
        System.out.println();
    }

    public void sort() {

    }
}
