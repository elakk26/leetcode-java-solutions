/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head==null || head.next==null)
        return head;
       ArrayList<Integer> l=new ArrayList<>();
       ListNode cur=head;

       while(cur!=null)
       {
        l.add(cur.val);
        cur=cur.next;
       } 

        left=left-1;
        right=right-1;
        while(left<=right)
        {
            int temp=l.get(left);
            l.set(left,l.get(right));
            l.set(right,temp);
            left++;
            right--;
        }
        cur=head;
        for(int i:l)
        {
            cur.val=i;
            cur=cur.next;
        }
        
        return head;
    }
}