/**
 * Created by bigbilii on 2017/7/4.
 * 冒泡排序
 */
public class BubbleSort extends List {

    @Override
    public void sort() {
        //冒泡排序
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if(list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j+1] = temp;
                }
            }
        }
    }
}
