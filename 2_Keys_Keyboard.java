import java.util.*;

//First solution approach is wrong and done by even and odd approach secind is correcct observation with effcient way and prime factor solution.
class Solution_wrong_approach {
    
    public int minSteps(int n) {
        if(n==1){
            return 0;
        }
        if(n%2!=0){
            //Here i need to handle case for odd no with prime factor concept from here i got original solution concept.
        }
        if(n%2==0){
             int p = (int)(Math.log(n)/Math.log(2));
             int comp =(int) Math.pow(2,p);
             if(comp==n){
                return 2*p;
             }
             else{
               while(n%2==0){
                n=n/2;
               }   
               return n+2;
             }
        }
        return 0;
    }
}

class Solution {
    public int minSteps(int n) {
    //Initial mistake which i was doing going via odd even approach, i didn't wet to prime factor concept even though i was doing same.    
        if(n==1){
            return 0;
        }
       int s=0; //var for string sum;
       int fac =2; //to know factors of n;
       while(n>1){
        while(n%fac == 0){
            s+=fac;
            n=n/fac;
        }
        fac++;
       }
       return s;
    }
}