//
//// leetcode question :- 21
//public class MergeTwoSortedLists {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if(list1 == null){ return list2;}
//        if(list2 == null){ return list1;}
//
//        ListNode resNode = new ListNode();
//
//        //init
//        if(list1.val>list2.val)
//        {
//            resNode.val = list2.val;
//            list2 = list2.next;
//        }
//        else
//        {
//            resNode.val = list1.val;
//            list1 = list1.next;
//        }
//
//        ListNode lastNode = resNode;
//
//        //iterate to one listNode next is null
//        while(list1!=null && list2!=null)
//        {
//            ListNode nowNode = new ListNode();
//            if(list1.val>list2.val)
//            {
//                nowNode.val = list2.val;
//                list2 = list2.next;
//            }
//            else
//            {
//                nowNode.val = list1.val;
//                list1 = list1.next;
//            }
//
//            lastNode.next = nowNode;
//            lastNode = nowNode;
//        }
//
//        //one linked list will have some remain node
//        if(list1!=null)
//        {
//            lastNode.next = list1;
//        }
//        else
//        {
//            lastNode.next = list2;
//        }
//
//        return resNode;
//    }
//}
