package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		_00_LinearSearch l=new _00_LinearSearch();
		String[] words= {"fodnsnz","dsnozfd","nfdzndcm","dsnidnc","fndsnjnc"};
		int index=l.linearSearch(words, "dsnozfd");
		assertEquals(1,index);
		String[] words2= {"a","b","c","d","e","f"};
		index=l.linearSearch(words2, "e");
		assertEquals(4,index);
		String[] words3= {"a","khvv","c","kjhbb","e","[ipouiyutjyrhgs","\n\n\n\n\n\n"};
		index=l.linearSearch(words3, "[ipouiyutjyrhgs");
		assertEquals(5,index);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		_01_BinarySearch b=new _01_BinarySearch();
		int[] stuff= {234,567,8910,32767,234567,2345678,23456789};
		int index=b.binarySearch(stuff, 0, stuff.length, 32767);
		assertEquals(3,index);
		int[] stuff2= {1,22,333,4444,55555,666666,7777777,88888888,999999999};
		index=b.binarySearch(stuff2, 0, stuff2.length, 333);
		assertEquals(2,index);
		int[] stuff3= {1,12,123,1234,12345,123456,1234567,12345678,123456789};
		index=b.binarySearch(stuff3, 0, stuff3.length, 1234567);
		assertEquals(6,index);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		_02_InterpolationSearch b=new _02_InterpolationSearch();
		int[] stuff= {234,567,8910,32767,876543345,324567,2345678,234567};
		int index=b.interpolationSearch(stuff, 32767);
		assertEquals(3,index);
		int[] stuff2= {1,22,333,4444,55555,666666,7777777,88888888,999999999};
		index=b.interpolationSearch(stuff2, 333);
		assertEquals(2,index);
		int[] stuff3= {1,12,123,1234,12345,123456,1234567,12345678,123456789};
		index=b.interpolationSearch(stuff3, 1234567);
		assertEquals(6,index);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		_03_ExponentialSearch b=new _03_ExponentialSearch();
		int[] stuff= {234,567,8910,32767,876543345,324567,2345678,234567};
		int index=b.exponentialSearch(stuff, 32767);
		assertEquals(3,index);
		int[] stuff2= {1,22,333,4444,55555,666666,7777777,88888888,999999999};
		index=b.exponentialSearch(stuff2, 333);
		assertEquals(2,index);
		int[] stuff3= {1,12,123,1234,12345,123456,1234567,12345678,123456789};
		index=b.exponentialSearch(stuff3, 1234567);
		assertEquals(6,index);
	}
}
