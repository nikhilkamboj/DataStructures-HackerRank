package linkedlist;

public class LinkedList {
    Node head;


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
