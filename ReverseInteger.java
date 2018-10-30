class Solution {
    public int reverse(int x) {
       if (x >= 0){
           StringBuilder sb = new StringBuilder(Integer.toString(x));
           sb.reverse();
           try{
              int ans = Integer.parseInt(sb.toString());
              return ans;
           } catch (NumberFormatException e){
             return 0;  
           }
       } else{
           x = x * -1;
           StringBuilder sb = new StringBuilder(Integer.toString(x));
           sb.reverse();
           try{
               int ans = Integer.parseInt(sb.toString());
               return -1*ans; 
           } catch(NumberFormatException e){
              return 0;
           }
       }
    }
}