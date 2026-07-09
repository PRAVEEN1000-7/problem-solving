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
import java.util.ArrayList;

public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode temp = head;
        ArrayList<ListNode> map = new ArrayList<>();

        ListNode position=null;
        
        int i=0;
        while(!map.contains(temp) && temp!=null){
                map.add(temp);
                temp = temp.next;
        }

        if(temp!=null) return true;
        else return false;

        
    }
}