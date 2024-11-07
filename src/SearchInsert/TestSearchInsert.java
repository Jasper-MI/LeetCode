package SearchInsert;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestSearchInsert {



    @Test
    void test1() {
        assertEquals(2, SearchInsertMain.searchInsert(new int[] {1,3,5,6}, 5));
    }

    @Test
    void test2() {
        assertEquals(1, SearchInsertMain.searchInsert(new int[] {1,3,5,6}, 2));
    }

    @Test
    void test3() {
        assertEquals(4, SearchInsertMain.searchInsert(new int[] {1,3,5,6}, 7));
    }

    @Test
    void test4() {
        assertEquals(0, SearchInsertMain.searchInsert(new int[] {1,3,5,6}, 0));
    }

    @Test
    void test5() {
        assertEquals(0, SearchInsertMain.searchInsert(new int[] {1}, 0));
    }


}
