class StringLength {
    public static int length(String s){
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == ' '){
                continue;
            } else{
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Hello Wrold";
        System.out.println(length(s));
    }
}
