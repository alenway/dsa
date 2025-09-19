public class CountWovels {
    public static int wovels(String s){
        int count = 0;
        s = s.toLowerCase();
         for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(wovels(s));
    }
}
