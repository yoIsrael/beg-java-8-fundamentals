// AccessLevelTest3.java
package com.jdojo.cls.p1;

import com.jdojo.cls.AccessLevel2; // A compiler error

public class AccessLevelTest3 { 
	public static void main(String[] args) {  
		int a = AccessLevel2.v1; // A compiler error
	}
}
