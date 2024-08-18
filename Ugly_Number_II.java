import java.util.*;

class Solution {
    public int nthUglyNumber(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        int var2 =0, var3=0,var5=0;
        while(arr.size()<n){
            int nextVar2 = arr.get(var2)*2;
            int nextVar3 = arr.get(var3)*3;
            int nextVar5 = arr.get(var5)*5;

            int nextVar =  Math.min(nextVar2, Math.min(nextVar3, nextVar5));
            arr.add(nextVar);

            if(nextVar == nextVar2) var2++;
            if (nextVar == nextVar3) var3++;
            if(nextVar == nextVar5)  var5++;

         
        }
        // System.out.println(arr.size());
        // for(int i=0;i<arr.size();i++){
        //     System.out.println(arr.get(i));
        // }
        return arr.get(n-1);
    }
}

//Link to read detail approach for solution https://leetcode.com/problems/ugly-number-ii/solutions/5654779/classical-hamming-theory-solution