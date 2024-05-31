package delAtPosition;
class LinkedList {
    Node head;


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void deleteAtPosition(int pos) {
        if (head == null) {
            return;
        }

        if (pos == 1) {
            head = head.next;
            return;
        }



        for (int i = 1; head != null && i < pos- 1; i++) {
            head = head.next;
        }

        if (head == null || head.next == null) {
            return;
        }

        Node next = head.next.next;

        head.next = next;
    }


    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public void append(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
    }
         // to check the implementation above
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        System.out.println("Original List:");
        list.printList();


        list.deleteAtPosition(2);

        System.out.println("List after deleting node at position given position:");
        list.printList();
    }
}
