// 1812. Determine Color of a Chessboard Square
class Solution {
    public boolean squareIsWhite(String coordinates) {
        ArrayList<String> letter = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h"));
        String[] coord=coordinates.split("");
        if (letter.indexOf(coord[0])%2==0&&Integer.valueOf(coord[1])%2==0){
            return true;
        }else if (letter.indexOf(coord[0])%2!=0&&Integer.valueOf(coord[1])%2!=0){
            return true;
        }
        return false;
    }
}
