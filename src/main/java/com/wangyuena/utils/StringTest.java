package com.wangyuena.utils;

import java.util.Scanner;

/**
 * @author WYN
 * @time 2019年10月14日
 */
public class StringTest {
	public static void main(String[] args) {
		StringTest ss = new StringTest();
		//ss.hasText();
		ss.isNumber();
	}
/**
 * 判断是否是控制
 */
	protected void hasText() {
		System.out.println("请输入字符串：");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(str!="") {
			System.out.println("字符串有值！");
		}else if(str=="" && str==" "){
			System.out.println("字符串为空值");
		}
	}
	/***
	 * 判断是否是数字
	 */
	protected void isNumber() {
		System.out.println("请输入数字：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>=0) {
			System.out.println(num+"是数字");
		}else {
			System.out.println("无法识别");
		}
	}
}
