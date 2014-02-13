package jp.gr.java_conf.kf.niunit;

import jp.gr.java_conf.kf.niunit.マッチャー.文字列マッチャー終了状態;
import jp.gr.java_conf.kf.niunit.マッチャー.総称マッチャー終了状態;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;

public class 表明クラス {
//	static {
//		System.out.println("JPUnit version 4.11");
//	}

	public static <T> void 値(T じっさい, 総称マッチャー終了状態<? super T> まっちゃ) {
		値("", じっさい, まっちゃ);
	}

	public static <T> void 値(String reason, T じっさい, 総称マッチャー終了状態<? super T> まっちゃ) {
		Matcher<? super T> hamcrestMatcher = まっちゃ.HamcrestMatcher取得();
		MatcherAssert.assertThat(reason, じっさい, hamcrestMatcher);
	}

	public static void 文字列(String actual, 文字列マッチャー終了状態 まっちゃ) {
		文字列("", actual, まっちゃ);
	}

	public static void 文字列(String reason, String actual, 文字列マッチャー終了状態 まっちゃ) {
		Matcher<? super String> hamcrestMatcher = まっちゃ.HamcrestMatcher取得();
		MatcherAssert.assertThat(reason, actual, hamcrestMatcher);
	}
	
    static public void 失敗(String メッセージ) {
        if (メッセージ == null) {
            throw new AssertionError();
        }
        throw new AssertionError(メッセージ);
    }

    static public void 失敗() {
    	失敗(null);
    }

}
