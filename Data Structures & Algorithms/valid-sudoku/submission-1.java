class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                if (board[r][c] == '.') {
                    continue;
                }

                char num = board[r][c];

                int box = (r / 3) * 3 + (c / 3);

                if (set.contains(num + "row" + r) ||
                    set.contains(num + "col" + c) ||
                    set.contains(num + "box" + box)) {

                    return false;
                }

                set.add(num + "row" + r);
                set.add(num + "col" + c);
                set.add(num + "box" + box);
            }
        }

        return true;
    }
}