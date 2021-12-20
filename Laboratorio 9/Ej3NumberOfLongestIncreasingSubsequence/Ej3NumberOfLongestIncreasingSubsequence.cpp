//Ej3NumberOfLongestIncreasingSubsequence.cpp

class Solution {
public:
    int lengthOfLIS(vector<int>& nums) {
        int n = nums.size();
        vector<int>v;
        
        v.push_back(nums[0]);
        
        for(int i=1;i<n;i++)
        {
            if(v[v.size()-1]<nums[i])
            {
                v.push_back(nums[i]);
            }
            else if(v[v.size()-1]>nums[i])
            {
                auto it = lower_bound(v.begin(),v.end(),nums[i]);
                *it = nums[i];
            }
        }
        
        return v.size();
    }
};

/*
public class Ej3NumberOfLongestIncreasingSubsequence {
	
	public static void  main(String[] args){         
        int nums [] = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
	
    public static int lengthOfLIS(int[] nums) {
      //Dada una matriz de números enteros, la función devuelve la longitud 
      //de la subsecuencia estrictamente creciente más larga.
        if(nums.length <= 1) {
            return nums.length;
        }
        int res = 0, maxLen = 0;
        int[] lengths = new int[nums.length];
        int[] counts = new int[nums.length];  

        for(int i = 0; i < nums.length; i++) {
            lengths[i] = counts[i] = 1;
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    if(lengths[j] + 1 == lengths[i]) {
                        counts[i] += counts[j];
                    }
                    if(lengths[j] + 1 > lengths[i]) {
                        counts[i] = counts[j];
                        lengths[i] = lengths[j] + 1;
                    }
                }
            }
            if(lengths[i] == maxLen) {
                res += counts[i];
            }
            if(lengths[i] > maxLen) {
                maxLen = lengths[i];
                res = counts[i];
            }
        }
        return res;      
    }
}

//Resultado del caso de prueba
4
*/
