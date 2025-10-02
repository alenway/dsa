public class Main {
    public static void main(String[] args) {
        String name = "Nitin";
        int length = name.length();
        char c = name.charAt(0);
        // System.out.println(length - 1);
        // System.out.println(length);
        String name2 = "Nitin";
        // how to check equality
        // System.out.println(name2.equals(name));
        // ignore chase sensetivity
        // System.out.println(name.equalsIgnoreCase(name));
        // compare to method
        String str1 = "remote";
        String str2 = "car";

        int i = str1.compareTo(str2);
        // System.out.println(i);

        String name3 = "      aman panchal      ";
        // String substring = name.substring(5, 8);
        // System.out.println(substring);
        // System.out.println(name3.toUpperCase());
        // System.out.println(name3.toLowerCase());
        // System.out.println(name3.trim());
        String newName3 = name3.replace("panchal", "sharma").toUpperCase();
        // System.out.println(newName3);
        // System.out.println(name3.contains("pan"));
        name3.startsWith("am");
        String str3 = "   ";
        // System.out.println(str3.isEmpty());
        // System.out.println(str3.isBlank());

        // int j = name3.indexOf("a");
        // int p = name3.lastIndexOf("a");

        // conver int to string
        // int a = 10;
        // String s = String.valueOf(a);
        // System.out.println(s);

        String formatedStr = String.format("My name is %s and i am %d years old", "john", 20);
        // System.out.println(formatedStr);

    }
}
