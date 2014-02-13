package jp.gr.java_conf.kf.niunit.動作サンプル;

import jp.gr.java_conf.kf.niunit.テスト;
import static jp.gr.java_conf.kf.niunit.マッチャー.総称マッチャー.は;
import jp.gr.java_conf.kf.niunit.ランナー.日本語テストランナー;
import jp.gr.java_conf.kf.niunit.ランナーズ.日本語ユニットコア;
import static jp.gr.java_conf.kf.niunit.表明クラス.値;
import org.junit.runner.RunWith;

@RunWith(日本語テストランナー.class)
public class 最も簡単なテストのサンプル {
    @テスト
    public void 同じであるのテスト() {
        値("テスト", は("テスト").と同じである());
    }
    
    public static void main(String[] args) {
        日本語ユニットコア.メイン(最も簡単なテストのサンプル.class.getName());
    }
}



class A{}