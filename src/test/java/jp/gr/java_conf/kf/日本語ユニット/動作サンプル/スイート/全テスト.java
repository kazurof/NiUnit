package jp.gr.java_conf.kf.日本語ユニット.動作サンプル.スイート;

import jp.gr.java_conf.kf.日本語ユニット.ランナーズ.スイート;
import jp.gr.java_conf.kf.日本語ユニット.ランナーズ.スイート.スイートクラス;
import jp.gr.java_conf.kf.日本語ユニット.ランナーズ.日本語ユニットコア;

import org.junit.runner.RunWith;


@RunWith(スイート.class)
@スイートクラス({ なんとかテスト.class, かんとかテスト.class,
		jp.gr.java_conf.kf.日本語ユニット.動作サンプル.スイート.サブパッケージ.全テスト.class })
public class 全テスト {
	public static void main(String[] args) {
		日本語ユニットコア.メイン(全テスト.class.getName());
	}
}


