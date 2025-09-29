class MyObj {
    private String name;
    private static int counter = 0;
    private final int id;

    static {
        System.out.println("my object");
    }
    {
        id = counter++;
        System.out.println();
    }

    public MyObj(String name) {
        this.name = name;
        System.out.println("constructor execution -. " + name);
    }

    public void performTask() {
        System.out.println("performing task with : " + name);
    }

    public void updateData(String newName) {
        this.name = newName;
        System.out.println("Data update to ; " + name);
    }
    // int value;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize object id: " + id + " - name: " + name);
        super.finalize();
    }

}

public class lifeCycle {
    public static void main(String[] args) {
        // object creationg phase
        System.out.println("object creation");
        MyObj myobject = new MyObj("Test object");

        myobject.performTask();
        myobject.updateData("updated data");

        // object becomes unreachable
        System.out.println("making object reachable");
        myobject = null; // eligable for gc

        System.out.println("requesting for gc");
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
