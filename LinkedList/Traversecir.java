//first method to traverse is-:
// class Node
// {
//     int data;
//     Node next;
//     Node(int d)
//     {
//         data = d;
//         next = null;

//     } 
// }
// class Traversecir
// {
//     public static void Traverse(Node head)
//     {
//         if(head==null)
//         {
//             return ;
//         }
//         System.out.print(head.data+" ");
//         for(Node i=head.next;i!=head;i=i.next)
//         {
//             System.out.print(i.data+" ");
//         }
//     }
//     public static void main(String[] args)
//     {
//         Node head = new Node(10);
//         head.next = new Node(20);
//         head.next.next = new Node(30);
//         head.next.next.next = head;
//         Traverse(head); 
//     }

// }
class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}
class Traversecir
{
    static void Traverse(Node head)
    {
        if(head==null)
        {
            return ;
        }
        Node curr = head;
        do{
            System.out.print(curr.data+" ");
            curr = curr.next;
        }while(curr!=head);
    }
    public static void main(String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        Traverse(head); 

    }
}