package cn.io.study01;

import java.io.UnsupportedEncodingException;

/**
 * ���룺�ַ�---���ֽ�
 * ���룺�ֽ�---���ַ�
 * @author dell
 *
 */

public class ContentEncode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg="��������ʹ��a";
		//���룺�ֽ�����
	    byte[] datas=msg.getBytes();//Ĭ�Ϲ����ַ���GBK��һ�������ַ�ʹ��2���ֽڱ��棬һ��Ӣ���ַ�ʹ��1���ֽڱ��档
	    System.out.println(datas.length);
	   
	    //���룺�ַ���
	    msg=new String(datas,0,datas.length,"GBK");
	    System.out.println(msg);
	    //����ʱ��������룺1���ֽ�������
	    msg=new String(datas,0,datas.length-2,"GBK");
	    System.out.println(msg);
	    //2,�ַ�����ͳһ
	    msg=new String(datas,0,datas.length,"utf8");
	    System.out.println(msg);
	    
	   //���룺�����ַ�����
	    datas=msg.getBytes("UTF-8");//һ�������ַ�ʹ��3���ֽڱ���,һ��Ӣ���ַ�ʹ��1���ֽڱ��棬�䳤Unicode�ַ�
	    System.out.println(datas.length);
	    
	    datas=msg.getBytes("UTF-16LE");//����Unicode�ַ�����ʹ��2���ֽ��������ַ���
	    System.out.println(datas.length);
	    
	    
	   
	   
	}

}
