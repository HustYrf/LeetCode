package Dynamic;

public class RGB {
   public static char[] rgbReverse(char[] color) {
	   int r=0,b=0;
	   for(int i=0;i<color.length;i++) {
		   if(color[i]=='R') r++;
		   if(color[i]=='B') b++;
	   }
	   for(int i=0;i<r;i++) {
		   color[i]='R';
	   }
	   for(int j=color.length-1;j>=color.length-b;j--) {
		   color[j]='B';
	   }
	   for(int k=r;k<color.length-b;k++) {
		   color[k]='G';
	   }
	   return color;
   }
   
   
   public static void main(String[] args) {
	  char[] rgb = {'R','G','R','B','B','R'};
	  char[] result =rgbReverse(rgb);
	  for(int k=0;k<result.length;k++) {
		  System.out.print(result[k]+",");
	  }
}
}
