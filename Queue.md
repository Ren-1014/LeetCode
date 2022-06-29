### Queue

		**add**    增加一个元索           如果队列已满，则抛出一个IIIegaISlabEepeplian异常
　　**remove**  移除并返回队列头部的元素  如果队列为空，则抛出一个NoSuchElementException异常
　　**element** 返回队列头部的元素       如果队列为空，则抛出一个NoSuchElementException异常
　　**offer**    添加一个元素并返回true    如果队列已满，则返回false
　　**poll**     移除并返问队列头部的元素  如果队列为空，则返回null
　　**peek**    返回队列头部的元素       如果队列为空，则返回null
　　**put**     添加一个元素           如果队列满，则阻塞
　　**take**    移除并返回队列头部的元素   如果队列为空，则阻塞



- LinkedList：基于双向链表实现，只能顺序访问，但是可以快速地在链表中间插入和删除元素。不仅如此，LinkedList 还可以用作栈、队列和双向队列。
- PriorityQueue：基于堆结构实现，可以用它来实现优先队列。优先队列中的每个元素都有优先级，而优先级高（或者低）的将会先出队，而优先级相同的则按照其在优先队列中的顺序依次出队。





### Stack

栈的特点是：先进后出。它通过5个操作对类vector进行扩展，允许将向量视为堆栈。

 它提供了通常的 `push` 和 `pop` 操作，以及取栈顶点的 `peek` 方法、测试堆栈是否为空的 `empty` 方法、在堆栈中查找项并确定到栈顶距离的 `search` 方法。 

```java
 E push(E item) 
          把项压入堆栈顶部。 
 E pop() 
          移除堆栈顶部的对象，并作为此函数的值返回该对象。 
 E peek() 
          查看堆栈顶部的对象，但不从堆栈中移除它。 
 boolean empty() 
          测试堆栈是否为空。  
 int search(Object o) 
          返回对象在堆栈中的位置，以 1 为基数。
```



### 优先队列

优先队列中的元素可以默认自然排序或者通过提供的Comparator（比较器）在队列实例化的时排序。（不指定Comparator时默认为最小堆）
