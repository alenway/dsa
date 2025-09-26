class demo{
    String name;
    void show(){
        System.out.println(name);
    }
}
class object {
    public static void main(String[] args) {
        demo d = new demo();
        d.name = "demo";
        d.show();
    }
}
