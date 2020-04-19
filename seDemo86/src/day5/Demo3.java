package day5;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldArry=new int[2];
		oldArry[0]=1;
		oldArry[1]=2;
		//oldArry[2]=3;//越界
		
		int[] newArry=new int[oldArry.length*2];
		//oldArry=newArry;//旧数据全部被覆盖，不推荐
		//复制旧数组到新数组
		System.arraycopy(oldArry, 0, newArry, 0, oldArry.length);
		System.out.println("旧数组的长度为"+oldArry.length);
		System.out.println("新数组的长度为"+newArry.length);
		for(int i:newArry) {
			System.out.println(i);
		}
	}
}
