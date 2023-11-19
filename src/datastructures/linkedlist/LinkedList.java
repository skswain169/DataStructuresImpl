package datastructures.linkedlist;

public class LinkedList {

    private Node head;

    class Node {

        private int data;
        Node next_node;

        public Node(int data) {
            this.data = data;
            this.next_node = null;
        }
    }

    public void insertAtLast(int data) {

        Node dataNode = new Node(data);

        if (head == null)
            head = dataNode;
        else {
            Node tempNode = head;

            while (tempNode.next_node != null) {
                tempNode = tempNode.next_node;
            }

            tempNode.next_node = dataNode;
            dataNode.next_node = null;
            tempNode = null;
        }

    

    }

    public void insertAtFirst(int data) {

        Node dataNode = new Node(data);
        dataNode.next_node = head;
        head = dataNode;

    }


    public void insertAtPosition(int pos, int data)
    {

        Node dataNode= new Node(data);
        Node tempNode= head;
        Node iterateNode= head;

        int i=0;

        while (i< pos-1) {
            
            tempNode= iterateNode;
            iterateNode= iterateNode.next_node;
            i++;
        }
        dataNode.next_node=tempNode.next_node;
        tempNode.next_node=dataNode;
    }


    public void reverseList()
    {
        if(head.next_node==null)
        return;

        else
        {


            Node curr=head,prev=head;
            Node nextNode= head.next_node;

            while (nextNode!=null) {

                curr=nextNode;
                nextNode=nextNode.next_node;
                curr.next_node=prev;
                prev=curr;
                
            }

            head.next_node=null;
            head=curr;
        }
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + "-->");
            node = node.next_node;
        }
    }

}
