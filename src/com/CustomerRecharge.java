package com;
import java.util.function.Function;

public class CustomerRecharge {
	public static void rechargeData(Recharge[] rechargeObjects, Function<Recharge, String> rechargebata) {
        for (Recharge recharge : rechargeObjects) {
            String result = rechargebata.apply(recharge);
            System.out.println(result);
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recharge[] rechargeObjects = {
	            new Recharge(111, 150.0f, "valid"),
	            new Recharge(222, 300.0f, "invalid"),
	            
	        };
		
	        rechargeData(rechargeObjects, recharge -> "CID: " + recharge.getCustomerId() +
	                ", Amount Recharged: " + recharge.getAmount());
		}
}


