import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

/**
 * Created by lizhengxiang on 16-10-29.
 */

class Collection1 {
    // Fill with 'size' elements, start

    // counting at 'start':
    public static Collection fill(Collection c, int start, int size) {
        for (int i = start; i < start + size; i++)
            c.add(Integer.toString(i));
        return c;
    }

    // Default to a "start" of 0:
    public static Collection fill(Collection c, int size) {
        return fill(c, 0, size);
    }

    // Default to 10 elements:
    public static Collection fill(Collection c) {
        return fill(c, 0, 10);
    }

    // Create & upcast to Collection:
    public static Collection newCollection() {
        return fill(new ArrayList());
        // ArrayList is used for simplicity, but it's
        // only seen as a generic Collection
        // everywhere else in the program.
    }

    // Fill a Collection with a range of values:
    public static Collection newCollection(int start, int size) {
        return fill(new ArrayList(), start, size);
    }

    // Moving through a List with an iterator:
    public static void print(Collection c) {
        for (Iterator x = c.iterator(); x.hasNext();)
            System.out.print(x.next() + " ");
        System.out.println();
    }


}
public class Set1 {
    public static void testVisual(Set a) {
        Collection1.fill(a);
        Collection1.fill(a);
        Collection1.fill(a);
        Collection1.print(a); // No duplicates!
        // Add another set to this one:
        a.addAll(a);
        a.add("one");
        a.add("one");
        a.add("one");
        Collection1.print(a);
        // Look something up:
        System.out.println("a.contains(\"one\"): " +
                a.contains("one"));
    }
    public static void main(String[] args) {
        testVisual(new HashSet());
        testVisual(new TreeSet());
    }
}
