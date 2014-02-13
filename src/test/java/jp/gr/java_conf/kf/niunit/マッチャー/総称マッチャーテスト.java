package jp.gr.java_conf.kf.niunit.マッチャー;

import static org.junit.Assert.assertThat;
import org.junit.Test;

public class 総称マッチャーテスト {

	@Test
	public void いくつか入れてみて正しく入るかテスト() {
		総称マッチャー終了状態<String> テスト対象 = new 総称マッチャー<>("テスト").と同じである();
		assertThat("テスト", テスト対象.HamcrestMatcher取得());
	}

	@Test
	public void いくつか入れてみて正しく入るかテスト2() {
		総称マッチャー終了状態<Integer> テスト対象 = new 総称マッチャー<>(100).と同じである();
		assertThat(100, テスト対象.HamcrestMatcher取得());
	}

	@Test
	public void いくつか入れてみて正しく入るかテスト3() {

		総称マッチャー終了状態<Integer> テスト対象 = new 総称マッチャー<>(100).と同じである().または(23).と同じである();
		assertThat(100, テスト対象.HamcrestMatcher取得());
		assertThat(23, テスト対象.HamcrestMatcher取得());
		// assertThat( 233, テスト対象.getHamcrestMatcher());

	}

	@Test(expected = AssertionError.class)
	public void いくつか入れてみて正しく入るかテスト3失敗() {

		総称マッチャー終了状態<Integer> テスト対象 = new 総称マッチャー<>(100).と同じである().または(23).と同じである();

		assertThat(233, テスト対象.HamcrestMatcher取得());

	}

	@Test
	public void いくつか入れてみて正しく入るかテスト4() {

		総称マッチャー終了状態<Integer> テスト対象 = new 総称マッチャー<>(100).と同じである().または(23).と同じである().または(2323).と同じである();
		assertThat(100, テスト対象.HamcrestMatcher取得());
		assertThat(23, テスト対象.HamcrestMatcher取得());
		assertThat(2323, テスト対象.HamcrestMatcher取得());

	}

	@Test
	public void いくつか入れてみて正しく入るかテスト5() {

		// TODO かつ　または　でかつが優先されることを実装

		総称マッチャー終了状態<Integer> テスト対象 = new 総称マッチャー<>(100).と同じである().または(23).と同じである().かつ(23).と同じである();
		assertThat(100, テスト対象.HamcrestMatcher取得());
		assertThat(23, テスト対象.HamcrestMatcher取得());
	}

	@Test
	public void いくつか入れてみて正しく入るかテスト6() {
		総称マッチャー終了状態<Integer> テスト対象 = 総称マッチャー.はΓ(100).と同じである().かつ(100).と同じである亅().または(500).と同じでない();
		assertThat(100, テスト対象.HamcrestMatcher取得());
		assertThat(200, テスト対象.HamcrestMatcher取得());
	}
	

	@Test
	public void クラスであるテスト() {
		総称マッチャー終了状態<String> テスト対象 = 総称マッチャー.は(String.class).クラスのインスタンスである();
		assertThat("aaa", テスト対象.HamcrestMatcher取得());
//		assertThat(200, テスト対象.getHamcrestMatcher());
	}
}
