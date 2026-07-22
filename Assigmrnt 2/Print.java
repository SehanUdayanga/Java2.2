class Print{
	  public static void main(String[] args) {
        printPattern("abc");
    }

    public static void printPattern(String str) {
        System.out.println(str);

        if (str.length() == 1) {
            return;
        }

        printPattern(str.substring(0, str.length() - 1));

        System.out.println(str);
    }
}