package jp.gr.java_conf.kf.niunit.動作サンプル;

import jp.gr.java_conf.kf.niunit.テスト;
import static jp.gr.java_conf.kf.niunit.マッチャー.総称マッチャー.は;
import jp.gr.java_conf.kf.niunit.ランナー.日本語テストランナー;
import jp.gr.java_conf.kf.niunit.ランナーズ.日本語ユニットコア;
import static jp.gr.java_conf.kf.niunit.表明クラス.値;
import org.junit.runner.RunWith;

@RunWith(日本語テストランナー.class)
public class 総称マッチャーサンプル {

    public static void main(String[] args) {
        日本語ユニットコア.メイン(総称マッチャーサンプル.class.getName());
    }

    @テスト
    public void 総称マッチャーのテスト() {
        値("テスト", は("テスト").と同じである());
        値("テスト", は("テストあああ").と同じでない());
        Integer num = 3;
        値(num, は(num).と同一である());
        値(new Integer(3), は(new Integer(3)).と同一でない());
    }

    @テスト(タイムアウト = 200)
    public void タイムアウトのテスト() throws InterruptedException {
        Thread.sleep(100);
    }

    @テスト(想定例外 = AssertionError.class)
    public void 同じであるのテスト_失敗() {
        値("テスト", は("テストあああ").と同じである());
    }

    @テスト(タイムアウト = 100)
    public void タイムアウトのテスト2() throws InterruptedException {
        Thread.sleep(50);
    }
}
