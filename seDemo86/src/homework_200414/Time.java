package homework_200414;
/**
 * 对时间进行分段
 * 把时和分分开，创建个时间类
 * @author 29ktsNelson
 * @date 2020年4月15日
 */
public class Time {
	String fullTime;
	int hour=0;
	int minute=0;
	int timeSlot=0;
	
	Time(int x,int y){
		if(x==8) {
			timeSlot=1;
		}else if(x==9) {
			timeSlot=3;
		}else if(x==10) {
			timeSlot=5;
		}else if(x==11) {
			timeSlot=7;
		}else if(x==12) {
			timeSlot=9;
		}else if(x==13) {
			timeSlot=11;
		}else if(x==14) {
			timeSlot=13;
		}else if(x==15) {
			timeSlot=15;
		}else if(x==16) {
			timeSlot=17;
		}else if(y>30&&y<=59){
			timeSlot++;
		}if(x>=8&&x<=16&&y>=0&&y<=59) {
			hour=x;
			minute=y;
		}
		else {
			//System.out.println("请输入正确的时间");
		}	
		fullTime(hour, minute);
	}
	
	public void fullTime(int hour,int minute) {//时分不足10时补0
		String i=null;//时
		String j=null;//分
		if(hour<10) {
			i="0"+String.valueOf(hour);
		}else {
			i=String.valueOf(hour);
		}
		if(minute<10) {
			j="0"+String.valueOf(minute);
		}else {
			j=String.valueOf(minute);
		}
		fullTime=i+":"+j;
		//System.out.println(fullTime);
	}
	
}
