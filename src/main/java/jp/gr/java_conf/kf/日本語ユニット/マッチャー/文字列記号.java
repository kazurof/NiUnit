package jp.gr.java_conf.kf.niunit.マッチャー;

import org.hamcrest.Matcher;
import org.hamcrest.core.IsNot;
import org.hamcrest.core.StringContains;
import org.hamcrest.core.StringEndsWith;
import org.hamcrest.core.StringStartsWith;

public enum 文字列記号 implements 特殊文字{
	を含む {
		@Override
		Matcher<String> マッチャー取得(String あたい) {
			return StringContains.containsString(あたい);
		}
	},
	を含まない {
		@Override
		Matcher<String> マッチャー取得(String あたい) {
			return new IsNot<>(を含む.マッチャー取得(あたい));
		}
	},
	で終わる {
		@Override
		Matcher<String> マッチャー取得(String あたい) {
			return StringEndsWith.endsWith(あたい);
		}
	},
	で終わらない {
		@Override
		Matcher<String> マッチャー取得(String あたい) {
			return new IsNot<>(で終わる.マッチャー取得(あたい));
		}
	},
	で始まる {
		@Override
		Matcher<String> マッチャー取得(String あたい) {
			return StringStartsWith.startsWith(あたい);
		}
	},
	で始まらない {
		@Override
		Matcher<String> マッチャー取得(String あたい) {
			return new IsNot<>(で始まる.マッチャー取得(あたい));
		}
	};

	abstract Matcher<String> マッチャー取得(String あたい);
	

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
		return true;
	}

	@Override
	public 文字列記号 文字列記号取得() {
		return this;
	}
}
