package h2;

public class SimpleList {
    public Node head;

    public SimpleList() {
        Node n = new Node(Integer.MIN_VALUE);
        head = n;
    }

    public Node getFirst() {
        if (head.next == null) {
            return null;
        }

        Node n = head.next;
        return n;
    }

    public Node getLast() {
        Node current = head;

        if (current.next == null) {
            return null;
        }

        while (current.next != null) {
            current = current.next;
        }

        return current;
    }

    public void append(int newValue) {
        Node n = getLast();

        Node newNode = new Node(newValue);

        if (n == null) {
            head.next = newNode;
        } else {
            n.next = newNode;
        }
    }
    
    public Node findFirst (int value) {
        Node current = head.next;

        while (current != null) {
            if (current.value == value) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public boolean insertAfter (int preValue, int newValue) {
        Node preNode = findFirst(preValue);

        if (preNode == null) {
            return false;
        }

        Node newNode = new Node(newValue);
        newNode.next = preNode.next;
        preNode.next = newNode;

        return true;
    }

    public boolean delete (int value) {
        Node current = head;

        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }

        return false;
    }
}
