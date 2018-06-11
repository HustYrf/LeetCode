package Array;

public class CanPlaceFlowers {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int i = 0, count = 0;
		while (i < flowerbed.length) {
			if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
					&& (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
				flowerbed[i] = 1;
				count++;
			}
			i++;
		}
		return count >= n;
	}
}

// int count = 0;
// if(flowerbed.length==1){
// int count2=0;
// count2= flowerbed[0]==0?1:0;
// return count2>=n;
// }
// if(flowerbed.length==2) {
// int count3=0;
// if(flowerbed[0]==0&&flowerbed[1]==0) count3++;
// return count3>=n;}
// if(flowerbed.length==3) {
// int index1=0;
// int count1=0;
// if(flowerbed[index1]==0&&flowerbed[index1+1]==0) count1++;
// if(flowerbed[index1]==0&&flowerbed[index1+1]==0&&flowerbed[index1+2]==0)
// count1++;
// if(flowerbed[index1+1]==0&&flowerbed[index1+2]==0) count1++;
// return count1>=n;
// }
// if(flowerbed[0]==0&&flowerbed[1]==0) {flowerbed[0]=1;count++;}
// for(int i=1;i<flowerbed.length-3;i++) {
// if(flowerbed[i]==0) {
// if(flowerbed[i-1]==0&&flowerbed[i+1]==0) {flowerbed[i]=1;count++;}
// else continue;
// }else {
// if(flowerbed[i+1]==0&&flowerbed[i+2]==0&&flowerbed[i+3]==1)
// {flowerbed[i+2]=1;count++;}
// else continue;
// }
// }
// int index = flowerbed.length-3;
// if(flowerbed[index-1]==0&&flowerbed[index]==0&&flowerbed[index+1]==0) {
// flowerbed[index]=1;count++;}
// if(flowerbed[index]==0&&flowerbed[index+1]==0&&flowerbed[index+2]==0) {
// flowerbed[index+1]=1;count++;}
// if(flowerbed[index+1]==0&&flowerbed[index+2]==0) count++;
// return count>=n;
