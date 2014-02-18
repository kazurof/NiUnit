package jp.gr.java_conf.kf.日本語ユニット.マッチャー;

import org.hamcrest.Matcher;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsSame;

public enum 記号 implements 特殊文字 {
	と同じである {
		@Override
		<型> Matcher<型> マッチャー取得(型 あたい) {
			return Is.is(あたい);
		}
	},
	と同じでない {
		@Override
		<型> Matcher<型> マッチャー取得(型 あたい) {
			return IsNot.not(あたい);
		}
	},
	と同一である {
		@Override
		<型> Matcher<型> マッチャー取得(型 あたい) {
			return IsSame.sameInstance(あたい);
		}
	},
	と同一でない {
		@Override
		<型> Matcher<型> マッチャー取得(型 あたい) {
			return IsNot.not(と同一である.マッチャー取得(あたい));
		}
	};

	abstract <型> Matcher<型> マッチャー取得(型 あたい);

	@Override
	public boolean 記号である() {
		return true;
	}

	@Override
	public 記号 記号取得() {
		return this;
	}

	@Override
	public boolean 文字列記号である() {
		return false;
	}

	@Override
	public 文字列記号 文字列記号取得() {
		return null;
	}

	@Override
	public boolean 結合子である() {
		return false;
	}

}
