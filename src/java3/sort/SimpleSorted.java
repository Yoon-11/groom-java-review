package java3.sort;

// 버블 정렬
public class SimpleSorted {
    public int[] sorted(int[] param) {
        int n = param.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (param[j] > param[j + 1]) {
                    int tmp = param[j];
                    param[j] = param[j + 1];
                    param[j + 1] = tmp;
                }
            }
        }
        return param;
    }
}
