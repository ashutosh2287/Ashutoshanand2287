class Solution {
    public String convert(String s, int numRows) {
        // Edge case: agar sirf ek row ho ya string chhoti ho
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // Har row ke liye ek StringBuilder banate hain
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int curRow = 0;          // abhi ka row
        boolean goingDown = false; // direction flag (upar/neeche)

        // Har character ko correct row me dalna hai
        for (char c : s.toCharArray()) {
            rows[curRow].append(c);

            // Agar first ya last row pe ho → direction change karo
            if (curRow == 0 || curRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Row update: agar neeche ja rahe → +1, upar ja rahe → -1
            curRow += goingDown ? 1 : -1;
        }

        // Saari rows ko jodna hai final answer ke liye
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
