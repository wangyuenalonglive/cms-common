package com.wangyuena.utils;

import java.util.Scanner;

/**
 * @author WYN
 * @time 2019��10��14��
 */
public class StringTest {
	public static void main(String[] args) {
		StringTest ss = new StringTest();
		//ss.hasText();
		ss.isNumber();
	}
/**
 * �ж��Ƿ��ǿ�ֵ
 */
	protected void hasText() {
		System.out.println("�������ַ�����");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(str!="") {
			System.out.println("�ַ�����ֵ��");
		}else if(str=="" && str==" "){
			System.out.println("�ַ���Ϊ��ֵ");
		}
	}
	/***
	 * �ж��Ƿ�������
	 */
	protected void isNumber() {
		System.out.println("���������֣�");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>=0) {
			System.out.println(num+"������");
		}else {
			System.out.println("�޷�ʶ��");
		}
	}
}
