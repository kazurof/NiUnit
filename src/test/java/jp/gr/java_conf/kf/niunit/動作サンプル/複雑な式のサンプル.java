package jp.gr.java_conf.kf.niunit.動作サンプル;

import jp.gr.java_conf.kf.niunit.テスト;
import static jp.gr.java_conf.kf.niunit.マッチャー.文字列マッチャー.は;
import jp.gr.java_conf.kf.niunit.ランナー.日本語テストランナー;
import jp.gr.java_conf.kf.niunit.ランナーズ.日本語ユニットコア;
import static jp.gr.java_conf.kf.niunit.表明クラス.文字列;
import org.junit.runner.RunWith;

@RunWith(日本語テストランナー.class)
public class 複雑な式のサンプル {

    public static void main(String[] args) {
        日本語ユニットコア.メイン(複雑な式のサンプル.class.getName());
    }

    @テスト
    public void かつまたはのテスト() {
        文字列("テストなんとか", 
                は("テスト").で始まる().かつ("なんとか").で終わる());
        文字列("テストなんとか", 
                は("テスト").で始まる().または("なんとか").で始まる());
        文字列("テストなんとか", 
                は("テスト").で終わる().または("なんとか").で終わる());
    }

    @テスト
    public void 複雑な式のテスト() {
        文字列("りんごみかん", 
                は("りんご").で始まる().かつ("みかん").を含む().
                        または("すいか").を含む().かつ("れもん").を含む());
        文字列("すいかれもん", 
                は("りんご").で始まる().かつ("みかん").を含む().
                        または("すいか").を含む().かつ("れもん").を含む());
    }
    @テスト
    public void 括弧のテスト() {        
        文字列("りんごみかんいちご", 
                は("みかん").を含む().
                        かつΓ("いちご").を含む().または("すいか").を含む亅());
        文字列("りんごみかんすいか", 
                は("みかん").を含む().
                        かつΓ("いちご").を含む().または("すいか").を含む亅());
    }
}
