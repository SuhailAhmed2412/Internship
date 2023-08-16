

public class LinkedListIntersect {
    public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a=0, b=0;
        ListNode currA = headA, currB = headB;
        while(currA != null){
            currA = currA.next;
            a++;
        }
        while(currB != null) {
            currB = currB.next;
            b++;
        }
        int k = Math.abs(b-a);
        if ( b > a ) {
            while(k>0) {
                headB = headB.next;
                k--;
            }
        }
        else {
            while(k>0) {
                headA = headA.next;
                k--;
            }
        }
        
        while(headA != headB && headA.next != null && headB.next != null) {
            headA = headA.next;
            headB = headB.next;
        }
        
        if(headA != headB) return null;
        
        // if above statement is not true, then return the common node either headA or headB
        return headA;
    }
    public static void main(String[] args) {
        ListNode obj= new ListNode(0);
        obj.next  =new ListNode(2);
    }
}
