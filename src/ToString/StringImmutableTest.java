package ToString;

/**
 * Created by Rosaleen:
 * COMMENTS: Immutable
 * Metaphor - Writing with pen on paper. Once written you cannot change it.
 * You need new paper to write something different
 */
public class StringImmutableTest {
    public static void main(String[] args) {
        String s = "Hello";

        System.out.println("Before: " + s);

        s = s + " World";//This demonstrates String immutability.
        // When you do s = s + " World", it doesn't modify the original "Hello" string.
        // Instead, it creates a new String object "Hello World" and makes s point to it.
        // The original "Hello" string remains unchanged in memory.

        System.out.println("After: " + s);
    }
}
