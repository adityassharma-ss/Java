import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class SearchAnElementInLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        System.out.println(search(head, 1));
    }
    public static boolean search(ListNode head, int target) {
        while (head != null) {
            if (head.val == target) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
    
    
}
