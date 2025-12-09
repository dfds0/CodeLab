package estruturas.de.dados.arvorebinaria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {
    private Node root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int value) {
        // 1 - Spot empty
        if (current == null) {
            return new Node(value);
        }

        // 2 - Spot found, rebalance
        if (value > current.getValue()) {
            current.setRight(insertRecursive(current.getRight(), value));
        } else if (value < current.getValue()) {
            current.setLeft(insertRecursive(current.getLeft(), value));
        }

        return current;
    }

    public boolean contains(int value) {
        return containsRecursive(root, value);
    }

    private boolean containsRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }

        if (value == current.getValue()) {
            return true;
        }

        if (value > current.getValue()) {
            return containsRecursive(current.getRight(), value);
        } else {
            return containsRecursive(current.getLeft(), value);
        }
    }

    public void inOrder() {
        inorderRecursive(root);
        System.out.println();
    }

    private void inorderRecursive(Node current) {
        if (current != null) {
            inorderRecursive(current.getLeft());
            System.out.println(current.getValue());
            inorderRecursive(current.getRight());
        }
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.getValue()) {
          if (current.getLeft() == null) {
              return current.getRight();
          }

          if (current.getRight() == null) {
              return current.getLeft();
          }

          Node next = findMin(current.getRight());
          current.setValue(next.getValue());
          current.setRight(deleteRecursive(next.getRight(), next.getValue()));

        } else if (value > current.getValue()) {
            current.setRight(deleteRecursive(current.getRight(), value));
        } else if (value < current.getValue()) {
            current.setLeft(deleteRecursive(current.getLeft(), value));
        }

        return current;
    }

    private Node findMin(Node node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
    }

    public int height() {
        return heightRecursive(root);
    }

    private int heightRecursive(Node current) {
        if (current == null) {
            return 0;
        }

        int left = heightRecursive(current.getLeft());
        int right = heightRecursive(current.getRight());

        return Math.max(left, right) + 1;
    }

    public int min() {
        return minRecursive(root);
    }

    private Integer minRecursive(Node current) {
        if (current == null) {
            return null;
        }

        Integer leftValue = minRecursive(current.getLeft());
        if (leftValue == null) {
            return current.getValue();
        } else {
            return leftValue;
        }
    }

    public Integer max(){
        return maxRecursive(root);
    }

    private Integer maxRecursive(Node current){
        if (current == null) {
            return null;
        }

        Integer rightValue = maxRecursive(current.getRight());
        if (rightValue == null) {
            return current.getValue();
        } else {
            return rightValue;
        }
    }

    public List<Integer> preOrder(){
        List<Integer> output = new ArrayList<Integer>();
        preOrderRecursive(root, output);

        return output;
    }

    private void preOrderRecursive(Node current, List<Integer> output) {
        if (current == null) {
            return;
        }

        output.add(current.getValue());
        preOrderRecursive(current.getLeft(), output);
        preOrderRecursive(current.getRight(), output);
    }

    public List<Integer> postOrder(){
        List<Integer> output = new ArrayList<Integer>();
        postOrderRecursive(root, output);

        return output;
    }

    private void postOrderRecursive(Node current, List<Integer> output) {
        if (current == null) {
            return;
        }

        postOrderRecursive(current.getLeft(), output);
        postOrderRecursive(current.getRight(), output);
        output.add(current.getValue());
    }

    public List<Integer> levelOrder() {
        List<Integer> output = new ArrayList<>();
        if (root == null) return output;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            output.add(current.getValue());

            if (current.getLeft() != null) queue.add(current.getLeft());
            if (current.getRight() != null) queue.add(current.getRight());
        }

        return output;
    }

    public int count() {
        return preOrder().size();
    }

    public int sum() {
        return sumRecursive(root);
    }

    private int sumRecursive(Node current) {
        if (current == null) {
            return 0;
        }

        return current.getValue() + sumRecursive(current.getLeft()) + sumRecursive(current.getRight());
    }

    public void inverter() {
        inverterRecursive(root);
    }

    private void inverterRecursive(Node root) {
        if (root == null) {
            return;
        }

        Node left = root.getLeft();
        Node right = root.getRight();

        inverterRecursive(left);
        inverterRecursive(right);

        root.setLeft(right);
        root.setRight(left);
    }
}
