package String;

import java.util.ArrayList;
import java.util.List;
//列出所有的结果，用递归算法求解
public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        digui(s,0,"",result);
        return result;
    }
    
    public void digui(String s,int n,String out,List<String> result) {
    	if(n==4) {
    		if(s.isEmpty()) result.add(out);
    		return;
    	}
    	for(int k=1;k<4;k++) {
    		if(s.length()<k) break;
    		int val = Integer.parseInt(s.substring(0, k));
    		if(val>255||k!=String.valueOf(val).length()) continue;
    		digui(s.substring(k),n+1,out+s.substring(0,k)+(n==3?"":"."),result);
    	}
    	
    }
}
