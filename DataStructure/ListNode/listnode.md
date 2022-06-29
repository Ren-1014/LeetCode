### 1.删除节点

题目：删除带头结点的单链表L中的结点p，p不是最后一个结点，要求时间复杂度为O(1)。

如果不要求时间复杂度为O(1)，我们可以找出p的前驱结点，然后很容易就删除p。

现在要求时间复杂度为O(1)，因为p不是最后一个结点，知道结点p我们可以删除p的后继结点，那么我们可以把p的后继结点元素的值赋给p结点元素的值。

```java
class ListNode{
    public int val;
    public ListNode next;
}
```

```java
public class LinkListUtli {
	public static void deleteNode(LNode p)
	{
		if(p==null||p.next==null) return;//如果p为空或为单链表中最后一个结点不符合题意，直接返回
		LNode q=p.next;//q为p的后继结点
		p.val=q.val; 
		p.next=q.next;//从单链表中删除结点q
	}
}
```

**拓展：如果删除的结点p可能是最后一个结点。**

解题思路：此时只能保证删除结点的平均时间复杂度为O(1)，当p不是最后一个结点，时时间复杂度为O(1)，当p是最后一个结点时，时间复杂度为O(n)。

```java
public class LinkListUtli {
	public static void deleteNode(LNode L,LNode p)
	{
		if(p==null||L==null) return;//如果p为空或单链表L为空不符合题意，直接返回
		if(p.next != null) //如果p不是最后一个结点
		{
			LNode q=p.next;//q为p的后继结点
		    p.val=q.val;
		    p.next=q.next;//从单链表中删除结点q
		}
		else //如果p是最后一个结点
		{
			LNode pre=L;//用pre表示p的前驱结点
			while(pre.next != null) //保持pre有后继结点
			{
				if(pre.next==p)//如果pre是p的前驱结点
				{
					pre.next=p.next;//将结点p从单链表中删除
				}
			}
		}
	
	}
}
```

**当要删除的结点位于头结点的时候：** 如下图要删除的元素1的结点位于头结点，先进行while判断头结点是否为null且判断该结点的元素是否为要删除的元素，如果是把head指向head.next即可，直接跳过头结点，直到头结点不是要删除的元素就结束循环。

**当要删除的结点不在头结点的时候**：如下图删除元素为3的结点，由于上面已经判断了头结点不是要删除的元素，所以我们从头结点的下一个结点开始循环，即cur.next，当cur.next是要被删除的元素时，直接cur.next = curr.next.next就能直接跳过cur.next，断开。
