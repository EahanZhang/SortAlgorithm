package algorithm.sort.comparison_sort.insert_sort;

/**
 * Created By sunshine on 2018/8/20
 * @Description: 简单插入排序
 * @Author: EhangZhang
 */

/**
 * 算法描述：
 *  1. 从a[1]开始向后遍历数组，若a[j]位于a[0]和a[i]之间(0 < i < j)，
 *  则找到a[j]应该插入的位置x，使得a[x-1] < a[j] < a[x], 将x到j-1的元素向后移动一位，然后在x出插入元素a[j].
 *  2. 重复1直到遍历结束
 *
 *  时间复杂度O(n^2)
 *  空间复杂度O(1)
 *
 */
public class SimpleInsertSort {

    public static void simpleInsertSort(int[] array) {
        if (array == null || array.length <= 1) return ;
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i + 1];
            int j = i;
            for (; j >= 0; j--) {
                // 若当前元素大于temp，说明temp应该位于其前面，将当前元素后移
                if (array[j] > temp) {
                    array[j+1] = array[j];
                } else {
                    // 当当前元素小于temp时，说明temp的位置在当前元素的后面，跳出循环
                    break;
                }
            }
            // 将temp放在正确的位置上
            array[j+1] = temp;
        }
    }
}
