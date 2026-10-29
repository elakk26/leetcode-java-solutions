class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int five=0,ten=0,twen=0;


        for(int i:bills)
        {
            if(i==5)
            five++;

            else if(i==10)
            {
                if(five>=1)
                {
                    ten++;
                    five--;
                }

                else
                return false;
            }

            else
            {

                if(ten>0 && five>0)
                {
                    twen++;
                    ten--;
                    five--;
                }

                else if(five>=3)
                {
                    five-=3;
                    twen++;
                }

                else
                return false;
            }
        }
        return true;
    }
}