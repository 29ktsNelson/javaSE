package day10;

public class TestObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son=new Son();
		System.out.println("getClass:"+son.getClass());//全限定路径名称
		System.out.println("Son.class:"+Son.class);//全限定路径名称
		System.out.println("hashCode:"+son.hashCode());
		System.out.println(son);
		System.out.println(son.toString());//和输出son的结果是一样的
		
		int pwd=111111;
		int ppwwdd=111123;
		String s=(pwd==ppwwdd)?"一致":"不一致";
		System.out.println(s);
		
		String name="张三";
		String nnaame="张三";
		String s1=(name==nnaame)?"一致":"不一致";
		System.out.println(s1);
		String s2=(name.equals(nnaame))?"一致":"不一致";
		System.out.println(s2);
	}

}
