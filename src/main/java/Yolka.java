public class Yolka {
    public String print() {
        int starNum = 1;
        String result = "";
        for (int i = 0; i <= 2; i++) {
            result += blanks(blanksNum(starNum)) + stars(starNum) + blanks(blanksNum(starNum)) + "\n";
            starNum += 2;
        }
        return result;
    }

    private int blanksNum(int starNum) {
        return (7 - starNum) / 2;
    }

    private String stars(int starNum) {
        return printSymbols(starNum, "*");
    }

    private String blanks(int blNum) {
        return printSymbols(blNum, " ");
    }

    private String printSymbols(int blanksNumber, String symbol) {
        String result = "";
        for (int j = 0; j < blanksNumber; j++)
            result += symbol;
        return result;
    }
}
