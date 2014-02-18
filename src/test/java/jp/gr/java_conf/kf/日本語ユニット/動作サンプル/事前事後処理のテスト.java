package jp.gr.java_conf.kf.niunit.動作サンプル;

import jp.gr.java_conf.kf.niunit.クラス事前処理;
import jp.gr.java_conf.kf.niunit.クラス事後処理;
import jp.gr.java_conf.kf.niunit.テスト;
import static jp.gr.java_conf.kf.niunit.マッチャー.総称マッチャー.は;
import jp.gr.java_conf.kf.niunit.ランナー.日本語テストランナー;
import jp.gr.java_conf.kf.niunit.ランナーズ.日本語ユニットコア;
import jp.gr.java_conf.kf.niunit.事前処理;
import jp.gr.java_conf.kf.niunit.事後処理;
import static jp.gr.java_conf.kf.niunit.表明クラス.値;
import org.junit.runner.RunWith;

@RunWith(日本語テストランナー.class)
public class 事前事後処理のテスト {

    static {
        System.out.println("staticイニシャライザが呼ばれています。");
    }

    public static void main(String[] args) {
        日本語ユニットコア.メイン(事前事後処理のテスト.class.getName());
    }

    {
        System.out.println("インスタンスイニシャライザが呼ばれています。");
    }

    public 事前事後処理のテスト() {
        System.out.println("コンストラクタが呼ばれています。");
    }

    @クラス事前処理
    public static void クラス事前処理() {
        System.out.println("クラス事前処理しています。");
    }

    @事前処理
    public void 事前処理() {
        System.out.println("事前処理しています。");
    }

    @テスト
    public void テスト() {
        System.out.println("テストしています。");
    }
    @事後処理
    public void 事後処理() {
        System.out.println("事後処理しています。");
    }

    @テスト
    public void テスト２() {
        String str = "りんご";
        値(str.charAt(2), は('ご').と同じである());
        System.out.println("テスト２しています。");
    }



    @クラス事後処理
    public static void クラス事後処理() {
        System.out.println("クラス事後処理しています。");
    }
}
