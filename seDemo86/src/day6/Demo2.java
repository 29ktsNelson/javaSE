package day6;

/**
 * 排序
 * 存在优化问题待解决
 * @author 29ktsNelson
 * @date 2020年4月17日
 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 15, 1, 23, 86, 45, 66, 3, };
		showIntArray(bubbleSort(nums, true));
		showIntArray(bubbleSort(nums, false));
	}
	
	//存在问题，待优化效率
	public static int[] bubbleSort(int[] bubbleNums, boolean a) {// 冒泡排序，升序true，降序false
		boolean flag = false;
		int n = 0;
		if (a == true) {// 升序
			for (int i = 0; i < bubbleNums.length - 1; i++) {// 外部循环数组输出的长度次
				for (int j = 0; j < bubbleNums.length - 1 - i; j++) {
					if (bubbleNums[j] > bubbleNums[j + 1]) {// 如果比后边一位的数大，交换两数
						int temp = bubbleNums[j];
						bubbleNums[j] = bubbleNums[j + 1];
						bubbleNums[j + 1] = temp;
						n++;
						flag = true;// 标识比较过的
					}
				}
//				if (!flag) {// 优化比较次数//有问题，待优化
//					break;
//				}
			}
			
		} else if (a == false) {// 降序
			for(int i=0;i<bubbleNums.length-1;i++) {
				for(int j=0;j<bubbleNums.length-1-i;j++) {
					if(bubbleNums[j]<bubbleNums[j+1]) {
						int temp = bubbleNums[j];
						bubbleNums[j] = bubbleNums[j + 1];
						bubbleNums[j + 1] = temp;
						n++;
						flag = true;// 标识比较过的
					}	
				}
//				if (!flag) {// 优化比较次数
//					break;
//				}
			}
		} 
		System.out.println("交换的次数为：" + n);
		return bubbleNums;
	}

	public static void showIntArray(int[] array) {//顺序输出数组
		for (int i : array) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}
