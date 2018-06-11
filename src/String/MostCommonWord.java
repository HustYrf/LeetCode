package String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
    	String[] s= paragraph.trim().toLowerCase().split(" |\\,|\\.|\\!|\\?|\\;|\\'");
    	int max=-1;
    	String resultStr = null;
    	for(int i=0;i<s.length;i++) {
    		if(s[i].length()==0) s[i]=null;
    	}
    	Map<String,Integer> map = new HashMap<>();
    	for(int k=0;k<banned.length;k++) {
    		map.put(banned[k], 0);
    	}
    	for(int j=0;j<s.length;j++) {
    		if(s[j]!=null) {
    			if(map.keySet().contains(s[j])) s[j]=null;
    			else continue;
    		}
    	}
    	Map<String,Integer> result= new HashMap<>();
    	for(int m=0;m<s.length;m++) {
    		if(s[m]!=null) result.put(s[m], 0); 
    	}
    	for(int n=0;n<s.length;n++) {
    		if(result.keySet().contains(s[n])) {
    			int flag =result.get(s[n])+1;
    		    result.put(s[n],flag);
    		    max = Math.max(flag, max);
    		}
    	}
    	Iterator  iterator = result.entrySet().iterator();
    	while(iterator.hasNext()) {
    		Map.Entry<String,Integer> entry =(Map.Entry)iterator.next();
    		if(entry.getValue()==max) {
    			resultStr=entry.getKey();
    			break;
    		}
    	}
    	return resultStr;
    }
}



