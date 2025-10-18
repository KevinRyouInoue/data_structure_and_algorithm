public class Singled_Linked_List {
    private static class Node {
        private int data;
        private Node next;

        private Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        private Node(int data) { this(data, null); }

        public String toString() { return Integer.toString(data); }
    }
}
