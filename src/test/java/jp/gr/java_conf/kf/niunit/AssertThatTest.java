package jp.gr.java_conf.kf.niunit;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsAnything.anything;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;

public class AssertThatTest {
	public static void main(String[] args) {
		JUnitCore.main(AssertThatTest.class.getName());
	}

	@Test
	public void testAssertThat() {
		Assert.assertThat("みかんりんごすいか".substring(3, 6), is("りんご"));
	}

	@Test
	public void testAssertEquals() {
		assertEquals("みかんりんごすいか".substring(3, 6), "りんご");
	}

	@Test
	public void testAssertThatTwo() {
		Assert.assertThat("みかんりんごすいか".substring(3, 6), not("いちご"));
		Assert.assertThat("みかんりんごすいか".substring(3, 6), anything());
		Assert.assertThat("みかんりんごすいか".substring(3, 6), equalTo("りんご"));
		Assert.assertThat("みかんりんごすいか".substring(3, 6), notNullValue());
		String hoge = null;
		Assert.assertThat(hoge, nullValue());
		// 可変長引数でジェネリックな型を使うとコンパイラが警告を出す。
		// allof メソッドの設計の問題？
		Assert.assertThat("みかんりんごすいか".substring(3, 6), allOf(equalTo("りんご"), notNullValue()));

//		Assert.assertThat("み", allOf(equalTo("りんご"), notNullValue(), startsWith("")));
//		assertThat("み", allOf(equalTo("りんご"), notNullValue(), anyOf(startsWith(""), is("hoge"))));

	}
}