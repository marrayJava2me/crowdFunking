package com.wudi.didi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

public class TestLog4j {
	
	
	//去重复数值+数值大于4+升序排列后只返回前3个元素
//	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1,2,3,3,3,4,0,-11,5,6,7,8,9);
//		
//		List<Integer> sort = sort(list);
//		for (Integer num : sort) {
//			System.out.println(num);
//		}
//	}
//	@SuppressWarnings("unchecked")
//	public static List<Integer> sort(List list){
//		List result = new ArrayList();
//		//对集合先排序
//		Collections.sort(list);
//		Set<Integer> set = new HashSet<Integer>();
//		for (int i=0; i<list.size();i++) {
//			//去重
//			int num = (int) list.get(i);
//			set.add(num);
//		}
//	
//		int count =1;
//		for (Integer num : set) {
//			
//			result.add(num);
//			
//			if(count == 3){
//				break;
//			}
//			count ++;
//		}
//		for (Integer integer : set) {
//			System.out.println(integer);
//		}
		
//		return result;
	private static final Logger logger = Logger.getLogger(TestLog4j.class);
	public static void main(String[] args) {
		
	}
}
