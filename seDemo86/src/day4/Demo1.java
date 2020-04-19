package day4;

/**
 * 
 * @author 29ktsNelson
 * @date 2020年4月15日
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxNum = 200;
		getNums(maxNum);
	}

	public static void getNums(int maxNum) {
		int i = 1;
		int y = 0;
		while (i <= maxNum) {
			if (i % 2 != 0) {
				System.out.println("输出奇数第" + i + "数字");
				y++;
			}
			i++;
		}
		System.out.println("奇数共有" + y + "个");
	}
}
