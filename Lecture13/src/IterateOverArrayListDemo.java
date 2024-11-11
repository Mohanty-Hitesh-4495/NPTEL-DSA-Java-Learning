import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateOverArrayListDemo {
    public static void main(String[] args) {
        // Initialize the ArrayList of TV shows
        ArrayList<String> tvShows = new ArrayList<>();
        tvShows.add("Nimki Mukhiya");
        tvShows.add("Game of Thrones");
        tvShows.add("Mahabharat");
        tvShows.add("Balika Badhu");

        // Traverse using forEach() and lambda
        System.out.println("Traversing using forEach() and lambda:");
        tvShows.forEach(tvShow -> System.out.println(tvShow));

        // Iterate using an Iterator
        System.out.println("\n=== Iterate using an Iterator ===");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()) {
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }

        // Traverse using forEachRemaining() with Iterator
        System.out.println("Traversing using Iterator and forEachRemaining():");
        tvShowIterator = tvShows.iterator(); // Reset iterator
        tvShowIterator.forEachRemaining(tvShow -> System.out.println(tvShow));

        // Traverse using ListIterator in reverse order
        System.out.println("\n=== Iterate using a ListIterator ===");
        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
        while (tvShowListIterator.hasPrevious()) {
            String tvShow = tvShowListIterator.previous();
            System.out.println(tvShow);
        }

        // Iterate using a simple for-each loop
        System.out.println("\n=== Iterate using a simple for-each loop ===");
        for (String tvShow : tvShows) {
            System.out.println(tvShow);
        }

        // Iterate using a for loop with index
        System.out.println("\n=== Iterate using for loop with index ===");
        for (String tvShow : tvShows) {
            System.out.println(tvShow);
        }
    }
}
