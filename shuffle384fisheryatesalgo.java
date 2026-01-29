class Solution {
    private int[] nums;
    private Random rand;

    public Solution(int[] nums) {
    this.nums=nums;
    this.rand=new Random();
    }
    
    public int[] reset() {
        return nums;
        
    }
    private void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public int[] shuffle() {
    int randnums[]= new int[nums.length];
    for(int i=0;i<nums.length;i++){
        randnums[i]=nums[i];
}
for(int i=0;i<nums.length;i++){
    int randidx=i+rand.nextInt(nums.length-i);
    swap(randnums,i,randidx);
}
return randnums;
    }
}
