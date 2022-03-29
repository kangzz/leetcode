package leetcode.medium;


/**
 * 两数相加
 * https://leetcode-cn.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {
    public static ListNode start() {
        ListNode listNode1 = new ListNode();
        listNode1 = new ListNode(2,listNode1);
        listNode1 = new ListNode(4,listNode1);
        listNode1 = new ListNode(5,listNode1);
        ListNode listNode2 = new ListNode();
        listNode2 = new ListNode(2,listNode2);
        return addTwoNumbers(listNode1, listNode2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;

            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        return root.next;
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        if(s.length() != goal.length()){
            return false;
        }

        char[] sArray = s.toCharArray();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sArray.length;i++){
            sb.append(sArray[i]);
            if(sb.toString().contains(goal)){
                return true;
            }
        }
        return false;
    }
}

