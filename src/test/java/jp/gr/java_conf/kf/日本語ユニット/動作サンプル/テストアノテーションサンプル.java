package jp.gr.java_conf.kf.日本語ユニット.動作サンプル;

import jp.gr.java_conf.kf.日本語ユニット.テスト;
import jp.gr.java_conf.kf.日本語ユニット.表明クラス;
import jp.gr.java_conf.kf.日本語ユニット.ランナー.日本語テストランナー;
import jp.gr.java_conf.kf.日本語ユニット.ランナーズ.日本語ユニットコア;

import org.junit.runner.RunWith;

@RunWith(日本語テストランナー.class)
public class テストアノテーションサンプル {
	public static void main(String[] args) {
		日本語ユニットコア.メイン(テストアノテーションサンプル.class.getName());
	}

	@テスト
	public void テスト実行() {
		System.out.println("こんにちは、日本語ユニットの世界");
	}

	@テスト(想定例外 = AssertionError.class)
	public void 想定例外の動作サンプル() {
		System.out.println("テスト実行されてますが失敗します。");
		表明クラス.失敗();
	}

	@テスト(タイムアウト = 100)
	public void タイムアウトのテスト() throws InterruptedException {
		Thread.sleep(200);
	}

	@テスト(タイムアウト = 100)
	public void タイムアウトのテスト2() throws InterruptedException {
		Thread.sleep(50);
	}
}
