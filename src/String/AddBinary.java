package String;

import java.math.BigInteger;
/**
public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
*/


public class AddBinary {
    public String addBinary(String a, String b) {
        //return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
    	a = new StringBuilder(a.trim()).reverse().toString();
    	b = new StringBuilder(b.trim()).reverse().toString();
    	char ch = a.length()>=b.length()?'a':'b';
        int length=Math.min(a.length(), b.length());
        StringBuilder sb = new StringBuilder();
        int flag=0;
        for(int index=0;index<length;index++) {
           int aValue	= Integer.parseInt(a.substring(index, index+1));
           int bValue = Integer.parseInt(b.substring(index, index+1));
           System.out.println(aValue);
           System.out.println(bValue);
           if(aValue+bValue+flag==0) {
        	   sb.append("0");
        	   flag = 0;
           }else if(aValue+bValue+flag==1){
        	   sb.append("1");
        	   flag=0;
           }else if(aValue+bValue+flag==2){
        	   sb.append("0");
        	   flag=1;
           }else if(aValue+bValue+flag==3) {
        	   sb.append("1");
        	   flag=1;
           }
           
        }
        int lastLength = 0;
        if(ch=='a') {
            lastLength = b.length();
            while(lastLength<a.length()) {
            	if(Integer.parseInt(a.substring(lastLength,lastLength+1))+flag==0){
            		sb.append("0");
            		flag=0;
            	}else if(Integer.parseInt(a.substring(lastLength,lastLength+1))+flag==1) {
            		sb.append("1");
            		flag =0;
            	}else if(Integer.parseInt(a.substring(lastLength,lastLength+1))+flag==2) {
            		sb.append("0");
            		flag=1;
            	}
            	lastLength++;
            }
        }else {
        	lastLength = a.length();
            while(lastLength<b.length()) {
            	if(Integer.parseInt(b.substring(lastLength,lastLength+1))+flag==0){
            		sb.append("0");
            		flag=0;
            	}else if(Integer.parseInt(b.substring(lastLength,lastLength+1))+flag==1) {
            		sb.append("1");
            		flag =0;
            	}else if(Integer.parseInt(b.substring(lastLength,lastLength+1))+flag==2) {
            		sb.append("0");
            		flag=1;
            	}
            	lastLength++;
            }
        }
        sb = flag==1?sb.append("1"):sb;
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
    	AddBinary add = new AddBinary();
    	System.out.println(add.addBinary("11","1"));
	}
}
