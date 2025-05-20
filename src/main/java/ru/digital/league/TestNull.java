package ru.digital.league;

public class TestNull {

    public static void main(String[] args) {
        TestNull testNull = new TestNull();
        testNull.testNull(testNull.getObject());
    }

    public void testNull(String string) {
        System.out.println("string");
    }

    public void testNull(Long l) {
        System.out.println("long");
    }

    public String getObject() {
        return null;
    }
}
