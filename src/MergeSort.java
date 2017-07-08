/**
 * Created by bigbilii on 2017/7/8.
 * 归并排序
 */
public class MergeSort extends List {

    @Override
    public void sort() {
        for (int i = 1; i < list.length; i *= 2) {
            Msort(i);
            System.out.print(i + ": ");
            printList();
        }
    }

    private void Msort(int gap) {
        int i = 0;

        for (i = 0; i + 2 * gap - 1 < list.length; i += 2 * gap) {
            merge(i,i + gap - 1, i + 2 * gap - 1);
        }

        if (i + gap - 1 < list.length) {
            merge(i, i + gap - 1, list.length - 1);
        }
    }

    private void merge(int low, int mid, int high) { //合并两个序列
        int[] array = new int[high - low + 1]; //临时合并序列

        int p1 = low; //序列1的游标
        int p2 = mid + 1; //序列2的游标
        int p3 = 0;

        while(p1 <= mid && p2 <= high) {
            if (list[p1] <= list[p2]) {
                array[p3++] = list[p1++];
            } else {
                array[p3++] = list[p2++];
            }
        }

        while (p1 <= mid) {
            array[p3++] = list[p1++];
        }

        while (p2 <= high) {
            array[p3++] = list[p2++];
        }

        p3 = 0;
        for (int i = low; i <= high; i++) {
            list[i] = array[p3++];
        }
    }
}
