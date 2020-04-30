package day16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 循环读取记事本内容
 * @author 29ktsNelson
 * @date 2020年4月30日
 */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr=new FileReader("E:\\Documents\\WorkSpace\\seDemo86\\src\\day16\\Untitled 1");
			int flag;
			while ((flag=fr.read())!=-1) {//此时已经读取一位了
//				char c=(char) fr.read();
				System.out.println((char)flag);//把fr.read()的值传给flag去输出

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
