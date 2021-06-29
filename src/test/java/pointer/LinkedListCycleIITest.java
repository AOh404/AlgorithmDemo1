package pointer;

import model.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListCycleIITest {
    LinkedListCycleII linkedListCycleII = new LinkedListCycleII();

    private ListNode generateListNode(int[] node, int entryPoint) {
        if (node.length == 0) {
            return null;
        }
        ListNode listNode = new ListNode(node[0]);
        ListNode entryPointListNode = entryPoint >= 0 ? listNode : null;
        ListNode temp = listNode;
        for (int index = 1, length = node.length; index < length; ++index) {
            temp.next = new ListNode(node[index]);
            temp = temp.next;
            if (index == entryPoint) {
                entryPointListNode = temp;
            }
        }
        temp.next = entryPointListNode;
        return listNode;
    }

    // region 快慢指针

    @Test
    public void test_slowFastPointer_case1() {
        ListNode head = generateListNode(new int[]{3, 2, 0, -4}, 1);
        Assertions.assertEquals(2, linkedListCycleII.detectCycleSlowFastPointer(head).val);
    }

    @Test
    public void test_slowFastPointer_case2() {
        ListNode head = generateListNode(new int[]{1, 2}, 0);
        Assertions.assertEquals(1, linkedListCycleII.detectCycleSlowFastPointer(head).val);
    }

    @Test
    public void test_slowFastPointer_case3() {
        ListNode head = generateListNode(new int[]{1}, -1);
        Assertions.assertNull(linkedListCycleII.detectCycleSlowFastPointer(head));
    }

    // endregion

    // region 哈希表

    @Test
    public void test_hashtable_case1() {
        ListNode head = generateListNode(new int[]{3, 2, 0, -4}, 1);
        Assertions.assertEquals(2, linkedListCycleII.detectCycleHashtable(head).val);
    }

    @Test
    public void test_hashtable_case2() {
        ListNode head = generateListNode(new int[]{1, 2}, 0);
        Assertions.assertEquals(1, linkedListCycleII.detectCycleHashtable(head).val);
    }

    @Test
    public void test_hashtable_case3() {
        ListNode head = generateListNode(new int[]{1}, -1);
        Assertions.assertNull(linkedListCycleII.detectCycleHashtable(head));
    }

    // endregion
}
