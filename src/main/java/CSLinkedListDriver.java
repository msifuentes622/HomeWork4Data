// CSLinkedListDriver.java
// Starter file for the Linked List portion of the Data Structures assignment.
// DO NOT change the class name or the signature of main().
// Implement ONLY the method for your assigned task (e.g., runLL3_CourseWaitlist).

import java.util.Comparator;

public class CSLinkedListDriver {

    public static void main(String[] args) {
        // TODO: Uncomment EXACTLY ONE of the following lines,
        // then implement that method below.

        //runLL1_Playlist();
        //runLL2_TodoList();
        //runLL3_CourseWaitlist();
        //runLL4_TextEditorLines();
        //runLL5_RecentlyContacted();
        runLL6_ShoppingListAddAfter();
        //runLL7_BusRouteStops();
        //runLL8_EventScheduleSorted();
        //runLL9_BugTrackerRemoveById();
        //runLL10_PlaylistShuffleCopy();
    }

    // LL1 – Music Playlist Manager
    private static void runLL1_Playlist() {
        //TODO: Implement task LL1 here.
        // See the assignment handout for the scenario description.
        CSLinkedList<String> playlist = new CSLinkedList<>();
        playlist.addLast("a");
        System.out.println(playlist);
        playlist.addLast("b");
        System.out.println(playlist);
        playlist.addLast("c");
        System.out.println(playlist);
        playlist.addLast("d");
        System.out.println(playlist);
        playlist.addFirst("e");
        System.out.println(playlist);
        playlist.remove(3);
        System.out.println(playlist);

    }

    //LL2 – To-Do List with Priorities
    private static void runLL2_TodoList() {
        // TODO: Implement task LL2 here.
        /*
        this is a to do list that has order when asked to throw the trash away you are given a task
        to clean your room first so you can throw that trash too at the same time
        in this program we use the add last for the todo list then add in in index 0
        then remove once done
         */
        CSLinkedList<String> ToDo = new CSLinkedList<>();
        ToDo.addLast("Throw trash");
        System.out.println(ToDo);
        ToDo.add( 0, "clean room");
        System.out.println(ToDo);
        ToDo.remove(0);
        System.out.println(ToDo);
    }

    // LL3 – Course Waitlist (No Duplicates)
    private static void runLL3_CourseWaitlist() {
        // TODO: Implement task LL3 here.
        // You may add a helper method addIfAbsent(E item) to CSLinkedList if needed.
        CSLinkedList<String> Waitlist = new CSLinkedList<>();
        Waitlist.addIfAbsent("kelly");
        Waitlist.addIfAbsent("tommy");
        Waitlist.addIfAbsent("kelly");
        Waitlist.addIfAbsent("tommy");
        System.out.println(Waitlist);
    }

    // LL4 – Text Editor Line Manager
    private static void runLL4_TextEditorLines() {
        // TODO: Implement task LL4 here.
        CSLinkedList<String> lines = new CSLinkedList<>();
        lines.add("1.press enter");
        lines.add("2.press enter");
        lines.add("3.press enter");
        lines.add("4.press enter");
        System.out.println(lines);
        lines.remove("3.press enter");
        System.out.println(lines);

    }

    // LL5 – Recently Contacted Friends (Move to Front)
    private static void runLL5_RecentlyContacted() {
        // TODO: Implement task LL5 here.
        // You may add a helper method moveToFront(E item) to CSLinkedList if needed.
        CSLinkedList<String> RecentlyContacted = new CSLinkedList<>();
        RecentlyContacted.addFirst("kelly");
        RecentlyContacted.addLast("tommy");
        RecentlyContacted.addLast("billy");
        System.out.println(RecentlyContacted);
        RecentlyContacted.moveToFront("tommy");
        System.out.println(RecentlyContacted);
    }

    // LL6 – Shopping List: Insert After Item
    private static void runLL6_ShoppingListAddAfter() {
        // TODO: Implement task LL6 here.
        // You may add a helper method addAfter(E target, E newItem) to CSLinkedList if needed.
        CSLinkedList<String> ShoppingList = new CSLinkedList<>();
        ShoppingList.addAfter("Sugar", "coffee");
        System.out.println(ShoppingList);
    }

    // LL7 – Bus Route Stops
    private static void runLL7_BusRouteStops() {
        // TODO: Implement task LL7 here.
        CSLinkedList<String> BusRouteStops = new CSLinkedList<>();
    }

    // LL8 – Event Schedule (Insert by Time)
    private static void runLL8_EventScheduleSorted() {
        // TODO: Implement task LL8 here.
        // You may add a helper method addInOrder(E item, Comparator<E> cmp) to CSLinkedList if needed.
    }

    // LL9 – Bug Tracker List (Remove by ID)
    private static void runLL9_BugTrackerRemoveById() {
        // TODO: Implement task LL9 here.
        // You may add a helper method removeFirstOccurrence(E item) to CSLinkedList if needed.
    }

    // LL10 – Playlist Shuffle Copy
    private static void runLL10_PlaylistShuffleCopy() {
        // TODO: Implement task LL10 here.
        // You may add a helper method copy() to CSLinkedList if needed.
    }
}
