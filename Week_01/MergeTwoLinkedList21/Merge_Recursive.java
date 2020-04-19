package Algorithm.Week_01.MergeTwoLinkedList21;

public class Merge_Recursive {
    public static void main(String[] args) {
        ListNode list1 = init();
        ListNode list2 = init();
        merge(list1,list2);
    }

    private static ListNode merge(ListNode list1, ListNode list2) {

        if (list1==null){
            return list2;
        }else if (list2==null){
            return list1;
        }else if (list1.value<list2.value){
            list1.next=merge(list1.next,list2);
            return list1;
        }else {
            list2.next=merge(list1,list2.next);
            return list2;
        }
    }

    public static ListNode init(){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        listNode5.next=null;
        return listNode1;
    }
    static class ListNode {
        int value;
        ListNode next;
        ListNode(int value){
            this.value=value;
        }
    }
}
