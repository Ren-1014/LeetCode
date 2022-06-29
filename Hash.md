# Java HashSet

HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。

HashSet 允许有 null 值。

HashSet 是无序的，即不会记录插入的顺序。



初始化：

```java
import java.util.Arrays;
import java.util.HashSet;

public class HashSetTest {
    // 方法1
    public static final HashSet<Character> set1 = new HashSet<Character>(){{
        add('a');
        add('b');
        add('c');
        add('d');
        add('e');
        add('f');
    }};
    
    // 方法2
    public static final HashSet<Character> set2 = new HashSet<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'));

    public static void main(String[] args) {
        System.out.println(set1);
        System.out.println(set2);
    }
}
// Arrays.asList的作用是将数组转化为list，一般是用于在初始化的时候，设置几个值进去，简化代码，省去add的部分。
```



