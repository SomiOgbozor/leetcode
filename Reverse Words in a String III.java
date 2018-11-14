class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder("");
        String[] array = s.split(" ");
        for (int i=0; i < array.length; i++){
            StringBuilder temp = new StringBuilder(array[i]);
            temp.reverse();
            if (i != array.length - 1){
                ans.append(temp.toString());
                ans.append(" ");
            }
            else{
                ans.append(temp.toString());
            }
        }
        return ans.toString();
    }
}