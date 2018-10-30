class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap();
        for (int i=0; i < list1.length; i++){
            map.put(list1[i], i);
        }
        Map<String, Integer> finalMap = new HashMap();
        for (int i=0; i < list2.length; i++){
            if(map.containsKey(list2[i]))
                finalMap.put(list2[i], map.get(list2[i]) + i);
        }
        int lis = Integer.MAX_VALUE;
        List<String> list = new LinkedList();
        for (Map.Entry<String, Integer> entry: finalMap.entrySet()){
            if (entry.getValue() <= lis){
                if(entry.getValue() < lis){
                    list.clear();
                }
                list.add(entry.getKey());
                lis = entry.getValue();
            }
        }
        String[] ans = list.toArray(new String[list.size()]);
        return ans;
    }
}