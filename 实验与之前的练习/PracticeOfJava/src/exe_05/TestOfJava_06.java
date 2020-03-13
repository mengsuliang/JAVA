package exe_05;

public class TestOfJava_06 {

	public static void main(String[] args) {
//		int[] nums1 = {1,2,2,1};
//		int[] nums2 = {2,2};
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		System.out.print("数组1: ");
		for(int num1:nums1) {
			System.out.print(num1+" ");
		}
		System.out.print("\n数组2: ");
		for(int num2:nums2) {
			System.out.print(num2+" ");
		}
		System.out.println("\n");
		
		Solution solution = new Solution();
		int[] result = new int[2]; 
		result = solution.intersection(nums1, nums2);
		System.out.print("结果数组：");
		for(int result1:result) {
			System.out.print(result1+" ");
		}
	}
}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] result;
        //对数组nums1进行排序,逆序
        for(int i=0;i<nums1.length-1;i++){
            for(int j=0;j<nums1.length-i-1;j++){
                if(nums1[j+1]>nums1[j]){
                    int temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                }
            }
        }

        //对数组nums2进行排序,逆序
        for(int i=0;i<nums2.length-1;i++){
            for(int j=0;j<nums2.length-i-1;j++){
                if(nums2[j+1]>nums2[j]){
                    int temp = nums2[j];
                    nums2[j] = nums2[j+1];
                    nums2[j+1] = temp;
                }
            }
        }
        int count = 0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    count++;
                }
            }
        }
        result = new int[count];
        int k = 0;
        for(int i=0;i<nums1.length;i++){
           for(int j=0;j<nums2.length;j++){
                    if(nums1[i]==nums2[j]){
                        result[k] = nums1[i];
                        k++;
                    }
                }
        }
        int count1=1;
        for(int i=0;i<result.length-1;i++){
            if(result[i] != result[i+1]){
                count1++;
            }
        }
        
        int[] result1 = new int[count1];
        int k1 = 0;
        for(int i=0;i<result.length-1;i++){
            if(i==0){
                result1[k1] = result[0];
                k1++;
            }
            else if(result[i] != result[i+1]){
                result1[k1] = result[i];
                k1++;
            }
        }

        return result1;
    }
}