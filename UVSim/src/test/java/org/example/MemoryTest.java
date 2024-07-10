package test.java.org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.example.data.Memory;
import org.junit.jupiter.api.BeforeEach;

/**
 * Unit tests for the Memory class.
 * @author Damon Morgan
 */
class MemoryTest {

    private Memory memory;

    @BeforeEach
    public void setUp() {
        memory = new Memory();
    }

    @Test
    public void testSetDataWithinBounds_MaxIndex99() {
        int size = 120;
        for (int i = 0; i < size; i++) {
            memory.setData(i, i);
        }
        assertThat(memory.getData(99)).isEqualTo(99);
    }

    @Test
    public void testSetData_MaxSize() {
        int value = 2006;
        memory.setData(Memory.SIZE-1, value);
        assertThat(memory.getData(Memory.SIZE-1)).isEqualTo(value);
    }

    @Test
    public void testSetDataTruncatesToFourDigits_positiveValue() {
        int index = 5;
        int inputValue = 123456;
        int expectedValue = 1234; // Expecting the first four digits

        memory.setData(index, inputValue);

        assertEquals(expectedValue, memory.getData(index));
    }

    @Test
    public void testSetDataTruncatesToFourDigits_negativeValue() {
        int index = 5;
        int inputValue = -123456;
        int expectedValue = -1234; // Expecting the first four digits

        memory.setData(index, inputValue);

        assertEquals(expectedValue, memory.getData(index));
    }

    @Test
    public void testSetDataHandlesNegativeValue() {
        int index = 5;
        int inputValue = -123456;
        int expectedValue = -1234; // Expecting the first four digits with the negative sign

        memory.setData(index, inputValue);

        assertEquals(expectedValue, memory.getData(index));
    }

    @Test
    public void testGetDataRetrievesValue() {
        int index = 5;
        int expectedValue = 5678;
        memory.setData(index, expectedValue);

        int actualValue = memory.getData(index);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetDataRetrievesZeroByDefault() {
        int index = 5;
        int expectedValue = 0; // Default value should be 0

        int actualValue = memory.getData(index);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testClear_positiveValue() {
        Memory memory = new Memory();
        int index = 5;
        int inputValue = 1234;
        int expectedValue = 0;

        memory.setData(index, inputValue);
        memory.clear();

        assertThat(memory.getData(index)).isEqualTo(expectedValue);
    }
}