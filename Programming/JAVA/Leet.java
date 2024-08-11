import java.util.Arrays;

public class Leet {
public static void main(String[] args) {
    int []nums={1,2,3,4,5,6,7};
    int c=0,j=0,k=3;
    //         for(j=k;j<nums.length;j++){
    //             mem[j]=nums[c];
    //             c++;
    //         }
    //         for(j=0;j<k;j++){
    //             mem[j]=nums[c];
    //             c++;
    //         }
    //         nums=mem;
    //         System.out.println(Arrays.toString(nums));
    int x=nums.length-1;
    int y=0,t=0;
        while (k!=0) 
        {
            t=nums[x];
            for(int i=nums.length-2;i>=0;i--)  
            {
                // int z=nums[i];
                nums[i+1]=nums[i];
                
            }
            System.out.println(Arrays.toString(nums));
            nums[y]=t;
            y++;
            x--;
        }        
        System.out.println(Arrays.toString(nums));
    }
}

