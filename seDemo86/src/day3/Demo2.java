package day3;
/**
 * 条件控制语句，if,switch语句
 * break与continue
 * 在debug模式中查看方法变量范围
 * @author diyu-
 * @date 2020年4月14日
 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showSeason(4);// 季节数字，1春天，2夏天，3秋天，4冬天		
		showDayWeek(2);
		showWorkDay(6);
		System.out.println("-----------");
		demoContinue();
		System.out.println("-----------");
		demoBreak();
	}

	public static void showMsg(String msg) {
		System.out.println("季节是" + msg);
	}
	
	public static void showMsg2(String msg) {
		System.out.println("今天是" + msg);
	}
	
	public static void showSeason(int season) {
		String msg = null;//msg必须赋值，哪怕赋空值（=null或=""），不然下面方法调用时会报错
		if (season == 1) {
			msg = "春天";
		} else if (season == 2) {
			msg = "夏天";
		} else if (season == 3) {
			msg = "秋天";
		} else if (season == 4) {
			msg = "冬天";
		} else {
			System.out.println("请输入合法数字");
		}
		
		if (msg != null) {
			showMsg(msg);
		}
	}
	
	public static void showDayWeek(int day) {
		String msg2 = null;
		switch (day) {
		case 1:
			msg2 = "周一";
			break;
		case 2:
			msg2 = "周二";
			break;
		default:
			//以此类推
			System.out.println("请输入合法日期");
		}
		if (msg2 != null) {
			showMsg2(msg2);
		}
	}
	
	public static void showWorkDay(int day) {//分号;是终点，能简洁点
		switch(day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:System.out.println("工作日");break;
		case 6:
		case 7:System.out.println("休息日");break;
		default:System.out.println("不知道是什么日");
		}
	}
	
	//switch能进行判断的类型只有int,string和enum，注意以下错误方法的报错信息
	/*
	 * public static void testSwitch(double i) { switch(i) {} }
	 */
	
	public static void demoContinue() {//continue时，跳过本次循环，执行下一次循环
		for(int i=0;i<=5;i++) {
			if(i==3) continue;//跳过了i=3的输出
			System.out.println("The number is:"+i);
		}
		System.out.println("循环终止");
	}
	
	public static void demoBreak() {//break时，结束整个循环,执行下一条语句
		for(int i=0;i<=5;i++) {
			if(i==3) break;//i=3时循环终止
			System.out.println("The number is:"+i);
		}
		System.out.println("循环终止");
	}
}
