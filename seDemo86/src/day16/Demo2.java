package day16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 多重捕获块
 * try{
 * 
 * }catch(异常类1 别名1){
 * 		输出异常信息
 * }catch(异常类2 别名2){
 * 		输出异常信息
 * }
 * @author 29ktsNelson
 * @date 2020年4月30日
 */
public class Demo2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//记事本文件读取
		//创建FileReader对象时，强制要求抛出异常
			try {
				FileReader fr=new FileReader("E:\\Documents\\WorkSpace\\seDemo86\\src\\day16\\Untitled 1");
				System.out.println(fr.read());//输出对应的字符编码，如为空输出-1
				System.out.println((char)fr.read());
				//1.先捕获从子类异常，再捕获父类异常
				//2.可以不需要子类异常，直接捕获父类异常
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
