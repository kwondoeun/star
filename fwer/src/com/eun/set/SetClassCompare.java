package com.eun.set;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetClassCompare {

	public static void main(String[] args) {
		//문자열을 저장하는 Set 인스턴스를 3개 생성
		Set<String> hashSet = new HashSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();
		
		//샘플 데이터 삽입
		hashSet.add("LG EDS");
		linkedHashSet.add("LG EDS");
		treeSet.add("LG EDS");
		
		hashSet.add("SAMSUNG");
		linkedHashSet.add("SAMSUNG");
		treeSet.add("SAMSUNG");
		
		hashSet.add("98");
		linkedHashSet.add("98");
		treeSet.add("98");
		
		hashSet.add("naruto");
		linkedHashSet.add("naruto");
		treeSet.add("naruto");
		
		hashSet.add("HANHWA");
		linkedHashSet.add("HANHWA");
		treeSet.add("HANHWA");
		
		//데이터 출력
		//HashSet : 어떤 순서로 출력될 지 예측할 수 없음
		for(String company : hashSet) {
			System.out.print(company + "\t");
		}
		System.out.println();
		
		//LinkedHashSet : add 한 순서대로 출력됨
		for(String company : linkedHashSet) {
			System.out.print(company + "\t");
		}
		System.out.println();
		
		//TreeSet : 정렬한 순서대로 출력되는데 숫자가 영문자보다 작고 대문자가 소문자보다 작음
		for(String company : treeSet) {
			System.out.print(company + "\t");
		}
		System.out.println();
	}
}
