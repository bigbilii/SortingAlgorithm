/**
 * Created by bigbilii on 2017/7/4.
 * 简单选择排序
 */
public class SimpleSelectionSort extends List{

    @Override
    public void sort() {
        for (int i = 0; i < list.length; i++) {
            int min = findMin(i,list.length);
            if (i != min) {
                int temp = list[min];
                list[min] = list[i];
                list[i] = temp;
            }
        }
    }


    private int findMin(int start, int end) { //找到最小值
        int min = list[start];
        int index = start;
        for (int i = start + 1; i < end; i++) {
            if (list[i] < min) {
                min = list[i];
                index = i;
            }
        }
        return index; //返回坐标
    }
}
