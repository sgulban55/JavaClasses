package Homework;

public class taskboolean {
	
	public static void main (String[] args) {
		
		/* Create a boolean variable workDay and assign true
		 * create int variable day and assign it to 1
		 * as long as it is a workDay print "I need a day off" and increase day
		 * once day is 6 print "I do not need a day off any more"
		 */
		
		boolean workDay = true;
		int day = 1;
		
		while (workDay) {
			
			if (day==6) {
				workDay = false;
				System.out.println("I do not need a day off anymore");
				
			} else {
				System.out.println("I need a day off");

			}
			day++;
		}
		//Another way
		
//		boolean workDay = true;
		
//		int day = 1;
//		
//		while (workDay) {
//			
//			if (day==6 || day==7) {
//				workDay = false;
//				System.out.println("I do not need a day off anymore");
//				
//			} else {
//				System.out.println("I need a day off");
//
//			}
//			day++;
		
	}
}


