package LinkedList;

import java.util.LinkedList;

public class SingleLinkedListTest extends SingleLinkedList {
    // i updated this class to extend the list class, removing redefining variables
  /*  public Node head;
    public Node tail;
    public int size;*/

    public Node createSingleLinkedlist(int nodeValue){
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    LinkedList<String> lit = new LinkedList<>();

    //Insert Method
    public void insertLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null){
            createSingleLinkedlist(nodeValue);
            return;
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
        size++;
    }

    // Traversing through a linked list

    public void traverseLinkedList(){
        if (head == null) {
            System.out.println("SLL does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size -1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    //Search for an element
    public boolean searchNode(int nodeValue){
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                if (tempNode.value == nodeValue) {
                    System.out.print("Found the node at location: " +i+"\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("Node " + nodeValue + " not found");
        return false;
    }

    //implement deleting a node from single linked list
    public void delete(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Error in position.");
            return;
        }

        // delete from start
        if (pos == 0) {
            head = head.next;
        } else {
            Node curr = head;
            // for loop to go point to the node before the one to delete
            for (int i = 0; i < pos - 1; i++) { // went too far, had to add -1 to position for correct output
                curr = curr.next;
            }
            // curr is now at pos 1, remove node by skipping
            curr.next = curr.next.next;
        }
        size--;
    }
}
