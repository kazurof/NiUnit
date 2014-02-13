package jp.gr.java_conf.kf.niunit.マッチャー;

public enum 括弧 implements 特殊文字 {
	/** 括弧開く。ギリシャ文字ガンマ */
	Γ,
	/** 括弧閉じる。かぎ　　http://ja.wiktionary.org/wiki/%E4%BA%85 */
	亅;

	@Override
	public boolean 記号である() {
		return false;
	}

	@Override
	public 記号 記号取得() {
		return null;
	}

	@Override
	public boolean 結合子である() {
		return false;
	}

	@Override
	public boolean 文字列記号である() {
		return false;
	}

	@Override
	public 文字列記号 文字列記号取得() {
		return null;
	}

}
