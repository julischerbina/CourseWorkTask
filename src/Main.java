ipublic class Main {
    public static void main(String[] args) {
        String[] array = {"ab", "cd", "ab", "ef", "gh", "cd", "ef", "gh", "ab", "ab"};
        String total = "";
        for (int i = 0; i < array.length; i++) {
            String current = String.valueOf(array[i]);
            for (int j = 1; j < array.length; j++) {
                if (i != j && current.equals(array[j])) {
                    array[j] = null;
                }
            }
            if (array[i] != null) {
                total += array[i];
            }
        }
        System.out.println(total);
    }
}