package day16;
/**
 * 异常实例测试
 * @author 29ktsNelson
 * @date 2020年4月30日
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int num=10/0;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("error,getMessage:"+e.getMessage()+"\te.getStackTrace"+e.getStackTrace());
			System.out.println("错误");
			System.err.println(e.toString());//错误异常类及错译原因
			e.fillInStackTrace();
		}
		
		try {//数组越界
			String[] s1=new String[1];
			s1[0]="rua";
			s1[1]="mua";
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("数组越界错误");
			System.err.println(e.getMessage());
			System.err.println(e.getStackTrace());
			System.out.println(e.toString());
			e.fillInStackTrace();
		}
	}

}
