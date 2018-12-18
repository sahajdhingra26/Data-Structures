/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        return helperMerge(lists, 0, lists.length-1);
    }
    public ListNode helperMerge(ListNode[] lists, int left, int right)
    {   if(left==right)
            return lists[left];
           
        int mid=(left+right)/2;
        ListNode l1=helperMerge(lists,left, mid);
        ListNode l2=helperMerge(lists,mid+1,right);
        return merge(l1,l2);
    }
    public ListNode merge(ListNode l1, ListNode l2)
    {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                temp.next=l1;
                temp=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                temp=l2;
                l2=l2.next;
            }
        }
        while(l1!=null)
        {
            temp.next=l1;
            temp=l1;
            l1=l1.next;
        }
        while(l2!=null)
        {
            temp.next=l2;
            temp=l2;
            l2=l2.next;
        }
        return dummy.next;
    }
}