package LinkedList;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedlist(int nodeValue){
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //Insert Method

    public void insertLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null){
            createSingleLinkedlist(nodeValue);
            return; // add jump out return to update properly
        } else if (location == 0) {
            node.next = head;
            head = node;

        } else if (location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
    size++; // missing size update to feed back correct output
    }

    public void delete(int pos) {
        if (head == null) {
            System.out.println("List empty. Nothing to delete.");
            return;
        }
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position.");
            return;
        }
        if (pos == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
            return;
        }

        Node tempNode = head;
        int index = 0;
        while (index < pos - 1) {
            tempNode = tempNode.next;
            index++;
        }

        tempNode.next = tempNode.next.next;

        if (pos == size - 1) {
            tail = tempNode;
        }
        size--;
    }

}

