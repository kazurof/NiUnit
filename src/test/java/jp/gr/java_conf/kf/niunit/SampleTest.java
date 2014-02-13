package jp.gr.java_conf.kf.niunit;

import static jp.gr.java_conf.kf.niunit.マッチャー.文字列マッチャー.は;
import static jp.gr.java_conf.kf.niunit.マッチャー.総称マッチャー.はΓ;
import static jp.gr.java_conf.kf.niunit.表明クラス.値;
import static jp.gr.java_conf.kf.niunit.表明クラス.文字列;

import org.hamcrest.Matcher;
import org.hamcrest.core.AllOf;
import org.hamcrest.core.Is;
import org.hamcrest.core.StringStartsWith;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import jp.gr.java_conf.kf.niunit.マッチャー.総称マッチャー;

import java.util.ArrayList;
import java.util.List;


public class SampleTest {

	public static void main(String[] args) {
		JUnitCore.main(SampleTest.class.getName());
	}

	@Test(expected = AssertionError.class)
	public void と同じであるへのテスト_失敗() {
		値("aaa", は("aaab ").と同じである());
	}
	@Test
	public void と同じであるへのテスト() {

		値("aaa", は("aaa").と同じである());
		
	}
	@Test
	public void 始まるへのテスト() {		
		文字列("myValue", は("my").で始まる());
	}
	
	@Test(expected = AssertionError.class)
	public void 始まるへのテスト_失敗() {
		文字列("myValue", は("aaamy").で始まる());
		
	}
	
	// TODO 連結するような式の扱い。
//		表明("myValue", は("my").で始まる().かつ("Val").を含む());
	@Test
	public void hoge(){
		List<Matcher<? super String>> itr = new ArrayList<>();
		itr.add(Is.is("sss"));
		itr.add(new StringStartsWith("aaa"));
		AllOf<String> test = new AllOf<String>(itr);
		
//		総称マッチャー<String> sut = 総称マッチャー.<String>はΓ().Γ("");
//		値("myValue",はΓ().と同じである().と同じである());
	}
}
