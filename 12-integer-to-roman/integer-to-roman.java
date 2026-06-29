class Solution {
    public String intToRoman(int n) {
    int[] arr={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] arr2={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    StringBuilder s=new StringBuilder();
    for(int i=0;i<arr.length;i++)
    {
        while(n>=arr[i])
        {
        
            s.append(arr2[i]);
            n=n-arr[i];
        }
    }
    return s.toString();
    }
}