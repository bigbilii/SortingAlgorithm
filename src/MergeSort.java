/**
 * Created by bigbilii on 2017/7/8.
 * 归并排序
 */
public class MergeSort extends List {

    @Override
    public void sort() {

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
        for (int i = low; i < high; i++) {
            list[i] = array[p3++];
        }
    }
}
