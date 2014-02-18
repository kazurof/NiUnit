package jp.gr.java_conf.kf.niunit.ランナーズ;

import jp.gr.java_conf.kf.niunit.ランナー.バージョン;

import org.junit.runner.JUnitCore;

public class 日本語ユニットコア {
	public static void main(String... args) {
		メイン(args);
	}
	
	public static void メイン(String... args) {
		System.out.println("日本語ユニット バージョン " + バージョン.バージョン番号());
		JUnitCore.main(args);
	}
}
