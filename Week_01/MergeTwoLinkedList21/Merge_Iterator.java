package Algorithm.Week_01.MergeTwoLinkedList21;

/**
 * 思路：
 * 一直循环，只要两个链表不是null
 * 比较两个链表的值，pre指向小的那个，小的那个链表往下移动
 * 最后pre在指向不是null的那个链表
 */
public class Merge_Iterator {
    public static void main(String[] args) {
        ListNode list1 = init();
        ListNode list2 = init();
        merge(list1, list2);
    }

    private static ListNode merge(ListNode list1, ListNode list2) {
        ListNode pre = new ListNode(-1);
        ListNode head = pre;
        while (list1 != null && list2 != null) {
            if (list1.value<=list2.value){
                head.next=list1;
                list1=list1.next;
            }else {
                head.next=list2;
                list2=list2.next;
            }
            head=head.next;
        }
        head.next=list1==null?list2:list1;
        return pre.next;
    }

    public static ListNode init() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;
        return listNode1;
    }

    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }
}
