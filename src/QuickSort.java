/**
 * Created by bigbilii on 2017/7/4.
 * 快速排序
 */
public class QuickSort extends List{

    private int partition(int[] array, int lo, int hi){
        int key = array[lo];
        while(lo < hi){
            while(array[hi] >= key && hi > lo){ //从后半部分向前扫描
                hi--;
            }
            array[lo] = array[hi];
            while(array[lo] <= key && hi > lo){ //从前半部分向后扫描
                lo++;
            }
            array[hi] = array[lo];
        }
        array[hi] = key;
        return hi;
    }

    @Override
    public void sort() {
        sort(0,19);
    }

    private void sort (int lo, int hi) {
        //快速排序
        if(lo >= hi) {
            return;
        }

        int index = partition(list,lo,hi);
        sort(lo,index - 1);
        sort(index + 1, hi);
    }
}
