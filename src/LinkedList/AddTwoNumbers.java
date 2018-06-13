package LinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

//        long value1 = 0;
//        int j = 0;
//        while (l1 != null) {
//            value1 += (l1.val) * (Math.pow(10.0, j++));
//            l1 = l1.next;
//        }
//        long value2 = 0;
//        int i = 0;
//        while (l2 != null) {
//            value2 += (l2.val) * Math.pow(10.0, i++);
//            l2 = l2.next;
//        }
//
//        long result = value1 + value2;
//        String strResult = String.valueOf(result);
//        int[] resultNums = new int[strResult.length()];
//        for(int index = 0;index<strResult.length();index++){
//            resultNums[index] = Integer.valueOf(strResult.substring(index,index+1));
//        }
//        int length = resultNums.length-1;
//        ListNode head = new ListNode(0);
//        ListNode resultListNode = head;
//        resultListNode.val = resultNums[length--];
//        while (length>=0){
//            resultListNode.next= new ListNode(resultNums[length--]);
//            resultListNode = resultListNode.next;
//        }
//      return head;

        //以上为小整数处理
        ListNode head = new ListNode(0);
        ListNode curr = head;
        ListNode p = null;
        int sum = 0, flag = 0;
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + flag;
            curr.val = sum % 10;
            flag = sum / 10;
            p = curr;
            curr.next = new ListNode(0);
            curr = curr.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            sum = l1.val + flag;
            curr.val = sum % 10;
            flag = sum / 10;
            p = curr;
            curr.next = new ListNode(0);
            curr = curr.next;
            l1 = l1.next;
        }
        if (l2 != null) {
            sum = l2.val + flag;
            curr.val = sum % 10;
            flag = sum / 10;
            p = curr;
            curr.next = new ListNode(0);
            curr = curr.next;
            l2 = l2.next;
        }

        if(flag!=0){
            curr.val = flag;
            p = curr;
        }
        p.next = null;

        return head;

    }

    public static void main(String[] args) {
        AddTwoNumbers a = new AddTwoNumbers();
        a.addTwoNumbers(null, null);
    }
}
