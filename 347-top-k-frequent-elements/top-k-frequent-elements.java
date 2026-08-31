class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();

        for(int i:nums)
        {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b) -> a.fre -b.fre);

        for(int i:h.keySet())
        {
            pq.offer(new Pair(i,h.get(i)));
            if(pq.size()>k)
            pq.poll();
        }
        int[] res=new int[k];
        int index=0;
        while(!pq.isEmpty())
        {   Pair i=pq.poll();
            res[index++]=i.key;
        }
        return res;
    }

    static class Pair{
        int key;
        int fre;


        Pair(int key, int fre)
        {
            this.key=key;
            this.fre=fre;
        }
    }
}