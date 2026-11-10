class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> h = new HashMap<>();

        for(String s : strs){

            char arr[] = s.toCharArray();

            Arrays.sort(arr);

            String key = new String(arr);

            if(h.containsKey(key)){
                
                h.get(key).add(s);
            }
            else{

                h.put(key,new ArrayList<>());

                h.get(key).add(s);

            }
        }

        return new ArrayList<>(h.values());
    }
}