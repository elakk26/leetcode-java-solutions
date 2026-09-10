class Solution {
    public int[][] merge(int[][] intervals) {
        
        List<int[]> res=new ArrayList<>();
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        int prevs=intervals[0][0];
        int preve=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            int[] temp=intervals[i];
            int curs=temp[0];
            int cure=temp[1];

            if(curs <= preve)
            {
                preve=Math.max(preve,cure);
            }
            else
            {
                res.add(new int[] {prevs,preve});
                preve=cure;
                prevs=curs;
            }
        }
        res.add(new int[] {prevs,preve});
        //System.out.print(res);

        return res.toArray(new int[res.size()][]);
    }
}