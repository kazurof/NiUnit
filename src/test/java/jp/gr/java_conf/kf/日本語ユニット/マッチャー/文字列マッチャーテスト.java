package jp.gr.java_conf.kf.niunit.マッチャー;

import org.hamcrest.Matcher;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class 文字列マッチャーテスト {

	@Test
	public void A() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("りんご").と同じである();
		assertThat("りんご", テスト対象.HamcrestMatcher取得());
	}

	@Test
	public void AまたはB() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("りんご").と同じである().または("あいう").で始まる();
		assertThat("りんご", テスト対象.HamcrestMatcher取得());
		assertThat("あいうおおおお", テスト対象.HamcrestMatcher取得());
	}
	
	@Test
	public void AまたはBまたはC() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("りんご").と同じである().または("あいう").で始まる().または("わわわ").を含む();
		assertThat("りんご", テスト対象.HamcrestMatcher取得());
		assertThat("あいうおおおお", テスト対象.HamcrestMatcher取得());
		assertThat("あああわわわさあああ", テスト対象.HamcrestMatcher取得());
	}
	@Test
	public void AかつBかつC() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("りんご").を含む().かつ("あいう").を含む().かつ("わわわ").を含む();
		assertThat("りんごわわわあいう", テスト対象.HamcrestMatcher取得());
		assertThat("あいうおおりんごおおわわわ", テスト対象.HamcrestMatcher取得());
		assertThat("あああわわわさあいう　りんごあああ", テスト対象.HamcrestMatcher取得());
	}
	@Test
	public void AまたはBかつC() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("りんご").と同じである().または("あいう").で始まる().かつ("わわわ").を含む();
		assertThat("りんご", テスト対象.HamcrestMatcher取得());
		assertThat("あいうおわわわお", テスト対象.HamcrestMatcher取得());
		// assertThat("あああわわわさあああ", テスト対象.getHamcrestMatcher());
	}

	@Test(expected = AssertionError.class)
	public void AまたはBかつC＿失敗() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("りんご").と同じである().または("あいう").で始まる().かつ("わわわ").を含む();
		Matcher<? super String> matcher = テスト対象.HamcrestMatcher取得();
		assertThat("あいうお", matcher);
	}

	@Test
	public void AかつBまたはC() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("りんご").で始まる().かつ("あいう").を含む().または("わわわ").を含む();
		Matcher<? super String> matcher = テスト対象.HamcrestMatcher取得();
		assertThat("りんごあいう", matcher);
		assertThat("りわわわあいう", matcher);
	}

	@Test(expected = AssertionError.class)
	public void AかつBまたはC＿失敗() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("りんご").で始まる().かつ("あいう").を含む().または("わわわ").を含む();
		Matcher<? super String> matcher = テスト対象.HamcrestMatcher取得();
		assertThat("りんご", matcher);
	}

	@Test
	public void AかつBまたはCかつD() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("りんご").で始まる().かつ("あいう").を含む().または("わわわ").を含む().かつ("けけけ").を含む();
		Matcher<? super String> matcher = テスト対象.HamcrestMatcher取得();
		assertThat("りんごあいう", matcher);
		assertThat("りわわわあけけけう", matcher);
	}

	@Test(expected = AssertionError.class)
	public void AかつBまたはCかつD＿失敗() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("りんご").で始まる().かつ("あいう").を含む().または("わわわ").を含む().かつ("けけけ").を含む();
		Matcher<? super String> matcher = テスト対象.HamcrestMatcher取得();
		assertThat("りんごけけけいう", matcher);
	}
	
	@Test(expected = AssertionError.class)
	public void AかつBまたはCかつD＿失敗２() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("りんご").で始まる().かつ("あいう").を含む().または("わわわ").を含む().かつ("けけけ").を含む();
		Matcher<? super String> matcher = テスト対象.HamcrestMatcher取得();
		assertThat("わわわあいう", matcher);
	}
	@Test
	public void AまたはBかつCかつD() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("あいう").を含む().または("わわわ").を含む().かつ("けけけ").を含む().かつ("ろろろ").を含む();
		Matcher<? super String> matcher = テスト対象.HamcrestMatcher取得();
		assertThat("わわあいう", matcher);
		assertThat("ろろろああわわわあああけけけ", matcher);
	}
	
	@Test
	public void AまたはBかつCかつD＿２() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("あいう").を含む().または("わわわ").を含む().かつ("けけけ").を含む().かつ("ろろろ").を含む();
		Matcher<? super String> matcher = テスト対象.HamcrestMatcher取得();
		assertThat("わわあいう", matcher);
		assertThat("ろろろああわわわあああけけけ", matcher);
	}

	@Test
	public void AまたはBかつCかつDまたはE() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("あいう").を含む().または("わわわ").を含む().かつ("けけけ").を含む().かつ("ろろろ").を含む().または("そそそ").を含む();
		Matcher<? super String> matcher = テスト対象.HamcrestMatcher取得();
		assertThat("わわあいう", matcher);
		assertThat("ろろろああわわわあああけけけ", matcher);
		assertThat("そそそ", matcher);
	}
	//   Γ亅
	@Test
	public void AかつΓBまたはC亅() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("あいう").を含む().かつΓ("ろろろ").を含む().または("そそそ").を含む亅();
		Matcher<? super String> matcher = テスト対象.HamcrestMatcher取得();
		assertThat("わわあいうろろろ", matcher);
		assertThat("あいうそそそ", matcher);
	}
	@Test(expected = AssertionError.class)
	public void AかつΓBまたはC亅＿失敗() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("あいう").を含む().かつΓ("ろろろ").を含む().または("そそそ").を含む亅();
		Matcher<? super String> matcher = テスト対象.HamcrestMatcher取得();
		assertThat("わわあいうろろ", matcher);
	}
	@Test(expected = AssertionError.class)
	public void AかつΓBまたはC亅＿失敗２() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("あいう").を含む().かつΓ("ろろろ").を含む().または("そそそ").を含む亅();
		Matcher<? super String> matcher = テスト対象.HamcrestMatcher取得();
		assertThat("ろろろああああああ", matcher);
	}
	@Test(expected = AssertionError.class)
	public void AかつΓBまたはC亅＿失敗３() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("あいう").を含む().かつΓ("ろろろ").を含む().または("そそそ").を含む亅();
		Matcher<? super String> matcher = テスト対象.HamcrestMatcher取得();
		assertThat("ろろろそそそああ", matcher);
	}
	
	@Test
	public void AかつΓBまたはC亅かつΓDまたはE亅() {
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("あいう").を含む().かつΓ("ろろろ").を含む().または("そそそ").を含む亅().かつΓ("ぺぺぺ").を含む().または("ととと").を含む亅();
		Matcher<? super String> matcher = テスト対象.HamcrestMatcher取得();
		assertThat("わわあいうろろろぺぺぺ", matcher);
		assertThat("わわあいうろろろととと", matcher);
		assertThat("わわあいうそそそぺぺぺ", matcher);
		assertThat("わわあいうそそそととと", matcher);
	}
        
        @Test
	public void AかつΓBまたはCかつΓDまたはE亅亅() {
            // TODO テスト追加　これは括弧対応が可笑しいエラーになるべき。
		文字列マッチャー終了状態 テスト対象 = new 文字列マッチャー("あいう").を含む().かつΓ("ろろろ").を含む().または("そそそ").を含む().かつΓ("ぺぺぺ").を含む().または("ととと").を含む亅();
		Matcher<? super String> matcher = テスト対象.HamcrestMatcher取得();
		assertThat("わわあいうろろろぺぺぺ", matcher);
		assertThat("わわあいうろろろととと", matcher);
		assertThat("わわあいうそそそぺぺぺ", matcher);
		assertThat("わわあいうそそそととと", matcher);
	}
        
        
}


