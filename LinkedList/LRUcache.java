import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.*; 

class Node 
{
    int key;
    int value;
    Node prev;
    Node next;

    public Node(int key,int value)
    {
        this.key = key;
        this.value = value;
    }
}
class LRUcached
{
    private HashMap<Integer,Node> map;
    private int cap;
    private Node head,tail;

    public Node LRUcached(int capacity)
    {
        map = new HashMap<>();
        cap = capacity;
        head = new Node(0,0);
        tail = new Node(0,0);

        head.next = tail;
        tail.prev = head;
        head.prev = null;
        tail.next = null;
       

    }
    private void addNode(Node node)     //add first
    {
        Node nbr = head.next;
        node.next = nbr;
        node.prev = head;
        nbr.prev = node;
        head.next = node;

    }
    private void removeNode(Node node) //remove 
    {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
        node.next = node.prev =null;

    }
    private void moveFront(Node node)   //update. 
    {
        removeNode(node);
        addNode(node);
    }
    public void put(int key,int value)
    {
        Node node = map.get(key);
        if(node==null)  //Pair does not exit.
        {
            Node newNode = new Node();
            newNode.key = key ;
            newNode.value = value;
            if(map.size()==cap)
            {
                Node LRU_NODE = tail.prev;
                map.remove(LRU_NODE.key);
                removeNode(LRU_NODE);

            }
            map.put(key,newNode);
            addNode(newNode);
        }
        else
        {
            node.value = value;
            moveFront(node);
        }
    }
    public int get(int key)
    {
        Node node = map.get(key);
        if(node==null)
        {
            return -1;

        }
        else
        {
            int v1= node.value;
            moveFront(node);
            return v1;
        }
    }

    
}
class LRUcache
{
    public static void main(String[] args)
    {
        LRUcache cache = new LRUcache(2);
        cache.set(1,10);

        	cache.set(2, 20); 
		System.out.println("Value for the key: 1 is " + cache.get(1)); // returns 10 

		// removing key 2 and store a key (3) with value 30 in the cache. 
		cache.set(3, 30); 

		System.out.println("Value for the key: 2 is " + 
				cache.get(2)); // returns -1 (not found) 

		// removing key 1 and store a key (4) with value 40 in the cache. 
		cache.set(4, 40); 
		System.out.println("Value for the key: 1 is " + 
			cache.get(1)); // returns -1 (not found) 
		System.out.println("Value for the key: 3 is " + 
						cache.get(3)); // returns 30 
		System.out.println("Value for the key: 4 is " + 
						cache.get(4)); // return 40 

      
    }
}