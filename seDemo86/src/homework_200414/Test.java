package homework_200414;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] hour = {8,9,12,15,16};
		int[] minute= {1,35};
		Time time1=new Time(hour[0],minute[0]);
		System.out.println(time1.fullTime);
		System.out.println(time1.timeSlot);
	}

}
