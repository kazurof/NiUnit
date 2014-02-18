package jp.gr.java_conf.kf.日本語ユニット.動作サンプル;

import jp.gr.java_conf.kf.日本語ユニット.テスト;
import jp.gr.java_conf.kf.日本語ユニット.ランナー.日本語テストランナー;
import jp.gr.java_conf.kf.日本語ユニット.ランナーズ.日本語ユニットコア;

import org.junit.runner.RunWith;


@RunWith(日本語テストランナー.class)
public class 日本語テストランナーとテストアノテーションのテスト {
	public static void main(String[] args) {
		日本語ユニットコア.メイン(日本語テストランナーとテストアノテーションのテスト.class.getName());
	}

	@テスト
	public void カスタムランナーとテストアノテーションのテスト() {
		System.out.println("こんにちは、日本語ユニットの世界");
	}
}
