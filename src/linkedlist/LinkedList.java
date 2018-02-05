package linkedlist;

public class LinkedList {
    Node head;

//    using head as a node where data part is null and next part points to first element of the list
    public LinkedList() {
        head = new Node();
        head.setData(null);
    }

    public void insertNodeAtHead(Integer data){
//  inserting new node at the head.
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(null);

        if (head.getNext() == null){
            head.setNext(newNode);
        } else {
            newNode.setNext(head.getNext());
            head.setNext(newNode);
        }
    }



    public boolean haveLoop() {
//        fast and slow are just references not nodes
        Node fast = head.getNext().getNext();
        Node slow = head.getNext();

        if (head.getNext() == null) {
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
