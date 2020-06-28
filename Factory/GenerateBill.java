package Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
	public static void main(String args[]) throws IOException {
		GetPlanFactory planfactory = new GetPlanFactory();
		System.out.println("Enter Plan: ");
		InputStreamReader r=new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(r);
		
		String planName = br.readLine();
		System.out.println("Enter Number of units: ");
		int units = Integer.parseInt(br.readLine());
		
		Plan p = planfactory.getPlan(planName);
		
		System.out.println("Bill amount: ");
		p.getRate();
		p.calculateBill(units);
	}
}
