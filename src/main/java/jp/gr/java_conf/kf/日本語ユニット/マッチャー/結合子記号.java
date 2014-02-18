package jp.gr.java_conf.kf.日本語ユニット.マッチャー;

public enum 結合子記号 implements 特殊文字 {
	かつ, または;

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
		return true;
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
