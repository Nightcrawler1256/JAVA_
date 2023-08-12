public class AlphabetPatterns {

    public static void printAlphabetA() {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 9; col++) {
                if (col == 0 || col == 8 || (row == 0 && (col != 0 && col != 8)) || (row == 2 && (col != 0 && col != 8))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printAlphabetB() {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (col == 0 || (row == 0 || row == 2 || row == 4) && col != 4 || (col == 4 && (row == 1 || row == 3))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printAlphabetC() {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (col == 0 || (row == 0 || row == 4) && col != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printAlphabetD() {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (col == 0 || (col == 4 && (row != 0 && row != 4)) || (row == 0 || row == 4) && (col != 0 && col != 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printAlphabetE() {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (col == 0 || row == 0 || row == 2 || row == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printAlphabetF() {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (col == 0 || (row == 0 || row == 2) && col != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printAlphabetG() {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (col == 0 || (row == 0 || row == 4) && col != 0 || (row == 2 && col > 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printAlphabetH() {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (col == 0 || col == 4 || row == 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printAlphabetA();
        printAlphabetB();
        printAlphabetC();
        printAlphabetD();
        printAlphabetE();
        printAlphabetF();
        printAlphabetG();
        printAlphabetH();
    }
}

