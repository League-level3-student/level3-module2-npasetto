package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
			
		
		return -1;
	}
	public static int countPearls(List<Boolean> list) {
		int count=0;
		for (Boolean boolean1 : list) {
			if(boolean1) {
				count++;
			}
		}
		return count;
	}
	public static double findTallest(List<Double> list) {
		double maximum=0;
		for (Double double1 : list) {
			if(double1>maximum) {
				maximum=double1;
			}
		}
		return maximum;
	}
	public static String findLongestWord(List<String> list) {
		String word="";
		for (String string : list) {
			if(string.length()>word.length()) {
				word=string;
			}
		}
		return word;
	}
	public static boolean containsSOS(List<String> list) {
		boolean found=false;
		for (String string : list) {
			if(string.contains("... --- ...")) {
				found=true;
				break;
			}
		}
		return found;
	}
	public static List<Double> sortScores(List<Double> list){
		boolean finished=false;
		while(finished==false) {
			finished=true;
			for (int i = 0; i < list.size()-1; i++) {
				if(list.get(i)>list.get(i+1)) {
					finished=false;
					double value=list.get(i+1);
					list.set(i+1, list.get(i));
					list.set(i, value);
				}
			}
		}
		return list;
	}
	public static List<String> sortDNA(List<String> list){
		boolean finished=false;
		while(finished==false) {
			finished=true;
			for (int i = 0; i < list.size()-1; i++) {
				if(list.get(i).length()>list.get(i+1).length()) {
					finished=false;
					String value=list.get(i+1);
					list.set(i+1, list.get(i));
					list.set(i, value);
				}
			}
		}
		return list;
	}
	public static List<String> sortWords(List<String> list){
		boolean finished=false;
		while(finished==false) {
			finished=true;
			for (int i = 0; i < list.size()-1; i++) {
				if(list.get(i).compareTo(list.get(i+1))>0) {
					finished=false;
					String value=list.get(i+1);
					list.set(i+1, list.get(i));
					list.set(i, value);
				}
			}
		}
		return list;
	}
}
