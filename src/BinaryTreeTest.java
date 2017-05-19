import org.junit.Test;
import java.util.Random;

/**
 * @author TFrenzel
 *
 */
public class BinaryTreeTest {

	/**
	 * Test method for {@link BinaryTree#BinaryTree()}.
	 */
	@Test
	public void testBinaryTree() {
		System.out.println("Creating Tree");
		BinaryTree tree = new BinaryTree();
		assert (tree) != null;
		System.out.println("Passed!");
	}

	/**
	 * Test method for {@link BinaryTree#insert(int)}.
	 */
	@Test
	public void testInsert() {
		BinaryTree tree = new BinaryTree();
		System.out.println("Insert 10 then lookup");
		tree.insert(10);
		assert (tree.lookup(10) == true);
		System.out.println("Passed!");
		System.out.println("Insert 5, 13, 15, 14 then lookup each");
		tree.insert(5);
		tree.insert(13);
		tree.insert(15);
		tree.insert(14);
		assert (tree.lookup(5) == true);
		assert (tree.lookup(13) == true);
		assert (tree.lookup(15) == true);
		assert (tree.lookup(14) == true);
		System.out.println("Passed!");
	}

	/**
	 * Test method for {@link BinaryTree#lookup()}.
	 */
	@Test
	public void testLookup() {
		BinaryTree tree = new BinaryTree();
		assert (tree) != null;
		Random ran = new Random();
		for (int i = 0; i < 25; i++) {
			tree.insert(ran.nextInt(100));
		}
		tree.insert(42);
		assert (tree.lookup(42));
		System.out.println("Passed!");
	}

}
