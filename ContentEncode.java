package cn.io.study01;

import java.io.UnsupportedEncodingException;

/**
 * 编码：字符---》字节
 * 解码：字节---》字符
 * @author dell
 *
 */

public class ContentEncode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg="性命生命使命a";
		//编码：字节数组
	    byte[] datas=msg.getBytes();//默认工程字符集GBK：一个中文字符使用2个字节保存，一个英文字符使用1个字节保存。
	    System.out.println(datas.length);
	   
	    //解码：字符串
	    msg=new String(datas,0,datas.length,"GBK");
	    System.out.println(msg);
	    //解码时会出现乱码：1，字节数不够
	    msg=new String(datas,0,datas.length-2,"GBK");
	    System.out.println(msg);
	    //2,字符集不统一
	    msg=new String(datas,0,datas.length,"utf8");
	    System.out.println(msg);
	    
	   //编码：其他字符集、
	    datas=msg.getBytes("UTF-8");//一个中文字符使用3个字节保存,一个英文字符使用1个字节保存，变长Unicode字符
	    System.out.println(datas.length);
	    
	    datas=msg.getBytes("UTF-16LE");//定长Unicode字符，均使用2个字节来保存字符。
	    System.out.println(datas.length);
	    
	    
	   
	   
	}

}
