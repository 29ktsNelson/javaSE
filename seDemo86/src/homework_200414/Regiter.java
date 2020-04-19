package homework_200414;

/**
 * 挂号类，接受Patient类和挂号时间Time类作为参数 goRegiter方法进行挂号
 * 
 * @author diyu-
 * @date 2020年4月14日
 */
public class Regiter {
	public void goRegiter(Patient pt, Time time) {
		if (time.hour == 0 || time.minute == 0) {
			System.out.println("请输入正确的时间");
		} else {
			pt.count++;
		}
		if (time.hour!=0&&time.minute!=0&&pt.count > 0 &&pt.count <= 3) {
			System.out.println("患者" + pt.pName + "于" + time.fullTime + "第" + pt.count + "次挂号。" + "挂号段：" + time.timeSlot
					+ " 剩余挂号次数" + (3 - pt.count) + "次");
		} else if(pt.count>3){
			System.out.println("今日预约数已满，请明天再来。");
		}
	}
}
