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
public boolean isPalindrome(ListNode H1) {
    if(H1.next == null) return true;
    int n = 0;
    // To Get Middle Node
    ListNode H2 = H1, temp = H1;
    while(temp != null){
        if(temp.next == null){
            H2 = H2.next; break;
        }
        H2 = H2.next; temp = temp.next.next;
    }
    // To Reverse half of List
    if(H2 != null){
        ListNode newH = null, newNode = null;
        while(H2 != null){
            newNode = H2;
            H2 = H2.next;
            newNode.next = newH;
            newH = newNode;
        }
        H2 = newH;
    }
    // To Compare first half and second half
    while(H2 != null){
        if(H2.val != H1.val) return false;
        H2 = H2.next; H1 = H1.next;
    }
    return true;
}
}