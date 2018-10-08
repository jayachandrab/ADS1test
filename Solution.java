

import java.util.Scanner;
class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
		//System.out.println(number);
		LinkedList newNode=new LinkedList();
		for(int i=0;i<number.length();i++) {
			
			int c=Integer.parseInt(String.valueOf(number.charAt(i)));
					
			newNode.addLast(c);
		}
	
    	return newNode;

    }

    public static String digitsToNumber(LinkedList list) {
		//System.out.println(list);
    	return list.toString();

    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
		return list2;

    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        LinkedList qDigits;
        LinkedList pDigits ;
        switch(input){
            case "numberToDigits":
                 pDigits = AddLargeNumbers.numberToDigits(p);
                 qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                 pDigits = AddLargeNumbers.numberToDigits(p);
                 qDigits = AddLargeNumbers.numberToDigits(q);
                 LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
