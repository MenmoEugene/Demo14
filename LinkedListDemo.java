import java.util.*;

/*
LinkedList：特有方法：
addFirst();
addLast();

getFirst();
getLast();
获取元素，但不删除元素。如果集合中没有元素，会出现NoSuchElementException

removeFirst();
removeLast();
获取元素，但删除元素。如果集合中没有元素，会出现NoSuchElementException

在JDK1.6出现了替代方法。
offerFirst();
offerLast();

peekFirst();
peekLast();
获取元素，但不删除元素。如果集合中没有元素，会返回null。

pollFirst();
pollLast();
获取元素，但元素被删除。如果集合中没有元素，会返回null。
*/
class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList link = new LinkedList();

		link.addFirst("java01");//在头部位置添加元素
		link.addFirst("java02");
		link.addFirst("java03");
		link.addFirst("java04");

//		sop(link);
//		sop(link.getFirst());
//		sop(link.getLast());
//		sop(link.removeFirst());

//		sop("size="+link.size());
		
		while (!link.isEmpty())
		{
			sop(link.removeFirst());
		}
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
