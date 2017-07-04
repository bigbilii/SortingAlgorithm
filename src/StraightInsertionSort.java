/**
 * Created by bigbilii on 2017/7/4.
 * 直接插入排序
 */
public class StraightInsertionSort extends List {

    @Override
    public void sort() {
        //插入排序
        int j;
        int temp;
        for (int i = 1; i < list.length; i++) {
            j = i;
            temp = list[i];
            while (j > 0 && temp < list[j - 1]) {
                list[j] = list[j - 1];
                j--;
            }
            list[j] = temp;
        }
    }
}
