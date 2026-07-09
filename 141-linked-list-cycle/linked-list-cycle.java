/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode temp = head;
        HashMap<ListNode, Integer> map = new HashMap<>();

        ListNode position=null;
        
        int i=0;
        while(!map.containsKey(temp) && temp!=null){
                map.put(temp, i);
                i++;
                temp = temp.next;
        }

        if(temp!=null) return true;
        else return false;

        
    }
}