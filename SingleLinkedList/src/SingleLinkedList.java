class SingleLinkedList
{
    class Node
    {
        int data;
        Node next= null;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;

    public void add(int data)
    {
        Node newNode = new Node(data);
        if(head == null) {
            newNode.next = null;
            head= newNode;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void print()
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public static void main(String args [])
    {
        SingleLinkedList myList = new SingleLinkedList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.print();
        myList.add(4);
        myList.add(5);
        myList.print();
    }
}