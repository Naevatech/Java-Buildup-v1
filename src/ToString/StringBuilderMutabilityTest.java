package ToString;

/**
 * Created by Rosaleen
 * MUTABILITY - Can be changed after its created
 * Metaphor: whiteboard, you can erase and rewrite on it.
 */
public class StringBuilderMutabilityTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Before: " + sb);

        sb.append(" World");//This shows that the same sb object is modified when you call append() - that's mutability.

        System.out.println("After: " + sb);
    }
}
