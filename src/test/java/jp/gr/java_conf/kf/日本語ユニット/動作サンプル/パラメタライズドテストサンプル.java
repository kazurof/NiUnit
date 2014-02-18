package jp.gr.java_conf.kf.日本語ユニット.動作サンプル;

import java.util.Arrays;
import jp.gr.java_conf.kf.日本語ユニット.テスト;
import static jp.gr.java_conf.kf.日本語ユニット.マッチャー.総称マッチャー.は;
import jp.gr.java_conf.kf.日本語ユニット.ランナーズ.パラメタライズドテスト;
import jp.gr.java_conf.kf.日本語ユニット.ランナーズ.パラメタライズドテスト.テストデータ;
import jp.gr.java_conf.kf.日本語ユニット.ランナーズ.パラメタライズドテスト.テストデータ保持;
import jp.gr.java_conf.kf.日本語ユニット.ランナーズ.日本語ユニットコア;
import static jp.gr.java_conf.kf.日本語ユニット.表明クラス.値;
import org.junit.runner.RunWith;

@RunWith(パラメタライズドテスト.class)
public class パラメタライズドテストサンプル {
    @テストデータ(テスト名称 = "添字{index}:  パラメータ {0} , {1}")
    public static Iterable<Object[]> テストデータ() {
        return Arrays.asList(new Object[][]{{1, 1}, {-2, 2}, {3, 3}});
    }

    @テストデータ保持
    public int 入力値;
    // org.junit.runners.Parameterized.Parameter と同様、
    // 配列の添字が０でないなら明示的に指定が必要。
    @テストデータ保持(1)
    public int 期待値;

    @テスト
    public void なんとかテスト() {
        値(Math.abs(入力値), は(期待値).と同じである());
        System.out.printf("なんとかテスト  入力値 ->  %d ,期待値 ->  %d %n%n",
            入力値, 期待値);
    }

    @テスト
    public void かんとかテスト() {
        値((int) Math.sqrt(入力値 * 入力値), は(期待値).と同じである());
        System.out.printf("かんとかテスト  入力値 ->  %d ,期待値 ->  %d %n%n", 入力値, 期待値);
    }
    
    public static void main(String[] args) {
        日本語ユニットコア.メイン(パラメタライズドテストサンプル.class.getName());
    }
}

