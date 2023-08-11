package com;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.ArrayList;

public class Predicating {
ArrayList<CallQualityFeedBack> itemList=new ArrayList();
	
	Predicating()
	{
		itemList.add(new CallQualityFeedBack(1,"9988776655","Good",3));
		itemList.add(new CallQualityFeedBack(2,"9988706655","Average",4));
		itemList.add(new CallQualityFeedBack(3,"9908776655","Excellent",5));
		itemList.add(new CallQualityFeedBack(4,"9988776055","Poor",2));
	}
	
	public void forEachItem(Consumer<CallQualityFeedBack> c) {
		for(CallQualityFeedBack i:itemList) {
			c.accept(i);
		}
	}
	public void forEachCall(Predicate<CallQualityFeedBack> c) {
		for(CallQualityFeedBack i:itemList) {
			if(c.test(i)) {
				System.out.println(i+" call quality is good");
			}
			else {
				System.out.println(i+" call quality is bad");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicating obj=new Predicating();
		obj.forEachItem((c)->System.out.println(c));
		obj.forEachCall((c)->c.getRating()>3);

	}

}
