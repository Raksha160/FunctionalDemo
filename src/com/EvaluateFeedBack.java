package com;
import java.util.function.Consumer;
import java.util.ArrayList;
public class EvaluateFeedBack {
ArrayList<CallQualityFeedBack> itemList=new ArrayList();
	
	EvaluateFeedBack()
	{
		itemList.add(new CallQualityFeedBack(1,"9988776655","Good",3));
		itemList.add(new CallQualityFeedBack(2,"9988706655","Average",4));
		itemList.add(new CallQualityFeedBack(3,"9908776655","Excellent",5));
		itemList.add(new CallQualityFeedBack(4,"9988776055","Poor",2));
	}
	
	public void forEach(Consumer<CallQualityFeedBack> c)
	{
		for(CallQualityFeedBack i:itemList) {
			c.accept(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvaluateFeedBack obj=new EvaluateFeedBack();
		obj.forEach((c)->System.out.println(c));

	}

}
