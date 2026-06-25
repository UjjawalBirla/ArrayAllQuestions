package Stack_Project;

public class TrappingRainWaterIMP {
    
    public static int TrappingWater(int[] height)
    {
        int left=0;
        int right=height.length-1;
        int leftmax=0;
        int rightmax=0;
        int ans=0;

        while(left<right)
        {
            if(height[left]<height[right])
            {
                if(height[left]>=leftmax)
                {
                    leftmax=height[left];
                }
                else
                {
                    ans+=leftmax-height[left];
                }
                left++;
            }
            else
            {
                if(height[right]>=rightmax)
                {
                    rightmax=height[right];
                }
                else
                {
                    ans+=rightmax-height[right];
                }
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(TrappingWater(height));

    }
}
