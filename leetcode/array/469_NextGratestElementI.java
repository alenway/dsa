class NextGratestElementI {
    public static void main(String[] args) {
        int store = 0;
        int[] num = { 10, 4, 3, 11, 6, 5, 7, 13 };
        for (int i = 0; i < num.length; i++) {
            if (i < num.length) {
                if (num[i] > num[i + 1]) {
                    store = num[i + 1];
                }
            }
        }
        System.out.println(store);
    }
}
