package estruturas.de.dados.arvorebinaria;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        System.out.println("=== INSERT ===");
        int[] values = {8, 3, 10, 1, 6, 4, 7, 14, 13};
        for (int v : values) {
            bst.insert(v);
        }
        System.out.println("Inserted: 8, 3, 10, 1, 6, 4, 7, 14, 13\n");

        System.out.println("=== SEARCH TEST ===");
        System.out.println("Contains 7? " + bst.contains(7));  // true
        System.out.println("Contains 2? " + bst.contains(2));  // false
        System.out.println();

        System.out.println("=== TREE STATS ===");
        System.out.println("Height: " + bst.height());
        System.out.println("Min: " + bst.min());
        System.out.println("Max: " + bst.max());
        System.out.println("Count: " + bst.count());
        System.out.println("Sum: " + bst.sum());
        System.out.println();

        System.out.println("=== TRAVERSALS ===");
        System.out.println("Pre-Order:   " + bst.preOrder());
        System.out.println("Post-Order:  " + bst.postOrder());
        System.out.println("Level-Order: " + bst.levelOrder());
        System.out.println();

        System.out.println("=== DELETE TESTS ===");
        bst.delete(10);  // test deleting node with two children
        System.out.println("After deleting 10 -> LevelOrder: " + bst.levelOrder());

        bst.delete(1);   // leaf
        bst.delete(6);   // one child
        System.out.println("After deleting 1 and 6 -> LevelOrder: " + bst.levelOrder());
        System.out.println();

        System.out.println("=== INVERT TREE ===");
        bst.inverter();
        System.out.println("LevelOrder (mirrored): " + bst.levelOrder());

        System.out.println("\n=== All tests executed ===");
    }
}
