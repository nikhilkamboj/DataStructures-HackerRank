package linkedlist;

public class LinkedList {
    Node head;




    public void insertNode(int data){
//  inserting new node at the head.
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(null);

        if (head == null){
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }



    public boolean haveLoop() {
        Node fast = head.getNext();
        Node slow = head;

        if (head == null) {
            return false;
        }

        while (fast != null && fast.getNext() != null && slow != null) {

            if (fast == slow) {
                return true;
            }

            fast = fast.getNext().getNext();
            slow = slow.getNext();

        }
        return false;
    }

}
