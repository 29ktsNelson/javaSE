package day4;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runNum("罗翔",5);
	}
	public static void runNum(String name,int maxNum) {
//		int i=1;
//		while(i<=maxNum) {
//			System.out.println(name+"跑了第"+i+"圈");
//			i++;
//		}
		
//		do {
//			System.out.println(name+"跑了第"+i+"圈");
//			i++;
//		}while(i<=maxNum);
		
		for(int i=1;i<=maxNum;i++) {
			System.out.println(name+"跑了第"+i+"圈");
		}
	}
}
