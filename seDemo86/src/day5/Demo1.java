package day5;

/**
 * 
 * @author 29ktsNelson
 * @date 2020年4月16日
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//showCity("江苏");
		showCity("浙江");
		showArry();//两种用for循环输出数组的方法
	}

	public static void showCity(String prov) {
		//String[] prov0 = { "江苏", "浙江" };
		String[] city1 = { "南京", "无锡", "徐州", "苏州" };// 0-3
		String[] city2 = { "杭州", "温州", "义乌", "湖州" };// 0-3

		if (prov.equals("江苏")) {
			System.out.println(prov + "下的城市有：");
			for (int j = 0; j <= city1.length - 1; j++) {
				System.out.print(city1[j] + " ");
			}
			System.out.println(" ");
		} else if (prov.equals("浙江")) {
			System.out.println(prov + "下的城市有：");
			for (int j = 0; j <= city2.length - 1; j++) {
				System.out.print(city2[j] + " ");
			}
		}
		System.out.println();
	}
	
	public static void showArry() {
		String[] str= {"rua","mua","guna"};
		for(int i=0;i<=str.length-1;i++) {
			System.out.println("一种输出数组的方法："+str[i]);
		}
		
		for(String c:str) {
			System.out.println("另一种输出数组的方法："+c);
		}
	}
}
