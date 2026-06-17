class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        int a=0;
        for(int i=0;i<nums1.length;i++){
            int n=-1;
            int ind=0;
            while (ind<nums2.length && nums2[ind] != nums1[i]) ind++;
            for (int j=ind+1;j<nums2.length;j++) {
                if (nums2[j]>nums1[i]) {
                    n=nums2[j];
                    break;
                }
            }
            ans[a++]=n;
        }
        return ans;
    }
}
