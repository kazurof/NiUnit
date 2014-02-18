package jp.gr.java_conf.kf.niunit.マッチャー;

import jp.gr.java_conf.kf.niunit.ランナーズ.スイート;
import org.junit.runner.RunWith;
import jp.gr.java_conf.kf.niunit.動作サンプル.パラメタライズドテストサンプル;

@RunWith(スイート.class)
@スイート.スイートクラス({文字列マッチャーテスト.class, 総称マッチャーテスト.class, パラメタライズドテストサンプル.class})
public class 全テスト {
    
}
