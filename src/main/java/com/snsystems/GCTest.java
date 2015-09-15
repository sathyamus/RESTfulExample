package com.snsystems;

import java.util.Vector;

public class GCTest {

	public static void main(String[] args) {
		int SIZE = 5000000;
		testGC();
		int[] arr = new int[SIZE*10];
		long time = System.currentTimeMillis();
		arr = null;
		System.out.println("starting explicit gc");
		//System.gc();
		System.out.println("gc took" + (System.currentTimeMillis() - time));
	}

	private static void testGC() {
		int SIZE = 5000000;
		StringBuffer s;
		Vector v;
		
		for(int i=0;i<SIZE;i++) {
			s = new StringBuffer(50);
			v = new Vector(30);
			s.append(i).append(i+1).append(i+2).append(i+3);
		}
		s = null;
		v = null;
		long time = System.currentTimeMillis();
		System.out.println("starting explicit gc");
		System.gc();
		System.out.println("gc took" + (System.currentTimeMillis() - time));	
	}
}
