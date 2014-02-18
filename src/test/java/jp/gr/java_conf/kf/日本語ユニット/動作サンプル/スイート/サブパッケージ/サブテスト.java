package jp.gr.java_conf.kf.niunit.動作サンプル.スイート.サブパッケージ;

import jp.gr.java_conf.kf.niunit.テスト;
import jp.gr.java_conf.kf.niunit.ランナー.日本語テストランナー;

import org.junit.runner.RunWith;

@RunWith(日本語テストランナー.class)
public class サブテスト {

	@テスト
	public void サブテストメソッド() {
		System.out.println("サブテストメソッド");
	}
}
