package solutions.leetcode1041;

class Solution {
    public boolean isRobotBounded(String instructions) {
        int x = 0, y = 0, dx = 0, dy = 1, temp = 0;
        for (int l = 0; l < 4; l++) {
            for (char c : instructions.toCharArray()) {
                if (c == 'G') {
                    x += dx;
                    y += dy;
                } else if (c == 'L') {
                    temp = dx;
                    dx = -dy;
                    dy = temp;
                } else {
                    temp = dx;
                    dx = dy;
                    dy = -temp;
                }
            }
            System.out.println(x+":"+y);
        }
        return x == 0 && y == 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
