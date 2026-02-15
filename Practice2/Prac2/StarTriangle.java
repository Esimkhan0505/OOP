package Prac2;

public class StarTriangle {
    private int width;

    public StarTriangle(int width) {
        if (width < 1) width = 1;
        this.width = width;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int row = 1; row <= width; row++) {
            for (int col = 1; col <= row; col++) {
                sb.append("[*]");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
