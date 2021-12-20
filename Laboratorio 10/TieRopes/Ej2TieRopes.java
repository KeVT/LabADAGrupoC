class Solution {
    public int solution(int K, int[] A) {
        int resultado = 0;
        int length = 0;
        for (int rope : A) {
            length += rope;
            if (length >= K) {
                resultado++;
                length = 0;
            }
        }
        return resultado;
    }
}
