import java.util.ArrayList;
import java.util.List;

/**
 * @Author: MrLee
 * @Description: //TODO
 * @Date: Created in 00:16 2022/2/20
 */
public class generate {

    static List<String> resust = new ArrayList<>();

    public static void main(String[] args) {

        resust.clear();
        ge(3, 0, 0, "");
        System.out.println(resust);

    }

    public static void ge(int n, int lc, int rc, String str) {
        if (lc == n && rc == n) {
            resust.add(str);
        }
        if (lc <= n) {
            ge(n, lc + 1, rc, str + "(");
        }
        if (rc <= lc && rc <= n) {
            ge(n, lc, rc + 1, str + ")");
        }

    }


}
