package jp.gr.java_conf.kf.日本語ユニット.動作サンプル.スイート;

import jp.gr.java_conf.kf.日本語ユニット.テスト;
import jp.gr.java_conf.kf.日本語ユニット.ランナー.日本語テストランナー;
import org.junit.runner.RunWith;

@RunWith(日本語テストランナー.class)
public class かんとかテスト {

    @テスト
    public void かんとかテストメソッド() {
        System.out.println("かんとかテストメソッド");
    }
}
