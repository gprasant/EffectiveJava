package org.effectivejava.examples.ch02.item03;



public class Elvis {
    // Singleton with a public final field
    public class Elvis1 {
        public final Elvis1 INSTANCE = new Elvis1();
        // Private constructor to prevent instantiation
        private Elvis1() {}
    }

    // Singleton with Static Factory
    public class Elvis2 {
        private final Elvis2 INSTANCE = new Elvis2();
        // Private constructor to prevent instantiation
        private Elvis2() {}

        public Elvis2 getInstance() {return INSTANCE;}

        // readResolve method to preserve singleton property.
        private Object readResolve() {
            return INSTANCE;
        }
    }

    // Singleton with Enum
    public enum Elvis3 {
        INSTANCE;

        public void leaveTheBuilding() {
            System.out.println("Elvis3 has left the building.");
        };
    }

    public static void main(String[] args) {
        Elvis3 e = Elvis3.INSTANCE;
        e.leaveTheBuilding();
    }
}

