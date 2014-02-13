package jp.gr.java_conf.kf.niunit.動作サンプル;

import static jp.gr.java_conf.kf.niunit.表明クラス.文字列;
import static jp.gr.java_conf.kf.niunit.マッチャー.文字列マッチャー.は;
import jp.gr.java_conf.kf.niunit.テスト;
import jp.gr.java_conf.kf.niunit.ランナー.日本語テストランナー;
import jp.gr.java_conf.kf.niunit.ランナーズ.日本語ユニットコア;
import org.junit.runner.RunWith;

@RunWith(日本語テストランナー.class)
public class 文字列マッチャーサンプル {

    public static void main(String[] args) {
        日本語ユニットコア.メイン(文字列マッチャーサンプル.class.getName());
    }

    @テスト
    public void 文字列マッチャーのテスト() {
        文字列("テストなんとか", は("テスト").で始まる());
        文字列("テストなんとか", は("ストなん").を含む());
        文字列("テストなんとか", は("テストなんとか").で終わる());
        文字列("テストなんとか", は("なんとか").で始まらない());
        文字列("テストなんとか", は("みかん").を含まない());
        文字列("テストなんとか", は("テスト").で終わらない());
    }

}
