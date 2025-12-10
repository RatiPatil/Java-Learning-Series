// Program to demonstrate different types of Inner Classes in Java

class OuterClass {

    private String message = "Hello from Outer Class!";

    // 1. Regular Inner Class
    class InnerClass {
        void showMessage() {
            System.out.println("Inner Class: " + message);
        }
    }

    // 2. Static Inner Class
    static class StaticInnerClass {
        void display() {
            System.out.println("Static Inner Class method executed");
        }
    }

    // 3. Method Local Inner Class
    void methodWithLocalClass() {
        class LocalInnerClass {
            void localMsg() {
                System.out.println("Local Inner Class inside a method");
            }
        }

        LocalInnerClass obj = new LocalInnerClass();
        obj.localMsg();
    }

    // 4. Anonymous Inner Class
    void anonymousInnerClass() {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Inner Class implementing Runnable");
            }
        };
        run.run();
    }
}

public class InnerClassExample {
    public static void main(String[] args) {

        // Regular Inner Class
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass innerObj = outer.new InnerClass();
        innerObj.showMessage();

        // Static Inner Class
        OuterClass.StaticInnerClass staticObj = new OuterClass.StaticInnerClass();
        staticObj.display();

        // Local Inner Class Example
        outer.methodWithLocalClass();

        // Anonymous Inner Class Example
        outer.anonymousInnerClass();
    }
}
