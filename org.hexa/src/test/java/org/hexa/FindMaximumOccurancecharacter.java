package org.hexa;

import java.util.Arrays;

public class FindMaximumOccurancecharacter {

	public static void main(String[] args) {
		String s="heello";
		char[]c=s.toCharArray();
		int size=s.length();
		boolean[] visited=new boolean[size];
		Arrays.fill(visited, false);
		for(int i=0;i<size;i++) {
			if(visited[i]==true)
				continue;
		int count=1;
			for(int j=i+1;j<size;j++) {
				if(c[i]==c[j]) {
					visited[j]=true;
					count++;
				}
			}
			System.out.println(c[i]+"occured" +count);
		}
		
	}

}
