/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.gr.java_conf.kf.niunit.動作サンプル;

import jp.gr.java_conf.kf.niunit.テスト;
import static jp.gr.java_conf.kf.niunit.マッチャー.総称マッチャー.は;
import static jp.gr.java_conf.kf.niunit.表明クラス.値;
import static org.hamcrest.core.IsInstanceOf.any;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

/**
 *
 * @author fukuhara
 */
public class 動作検証用サンプル {
        
    interface A {};
    class Hoge implements A {};
    interface B  {};
    interface C extends B {};

    
    class TestClass implements C{};
    
    @テスト
    public void クラスのインスタンスであるのテスト() {
        Integer num = 3;
        値(num, は(Integer.class).クラスのインスタンスである());
    }
    
    @テスト
    public void クラスのインスタンスであるのテスト＿失敗() {
        String str = "";
        値(str, は(CharSequence.class).クラスのインスタンスである());
    }

    
    @テスト
    public void クラスのインスタンスであるのテスト＿失敗2() {
        TestClass str = new TestClass();
        値(str, は(B.class).クラスのインスタンスである());
    }
        @テスト
    public void クラスのインスタンスであるのテスト＿失敗3() {
//        TestClass str = new TestClass();
//        A sut = new Hoge();
//        assertThat(sut ,  isA(B.class));

        assertThat(1, instanceOf(Number.class));
        assertThat(1.0, instanceOf(Number.class));
        assertThat(null, not(instanceOf(Number.class)));
        assertThat(new Object(), not(instanceOf(Number.class)));
        
        
      assertThat(true, any(boolean.class));
      assertThat((byte)1, any(byte.class));
      assertThat('x', any(char.class));
      assertThat(5.0, any(double.class));
      assertThat(5.0f, any(float.class));
      assertThat(2, any(int.class));
      assertThat(4L, any(long.class));
      assertThat((short)1, any(short.class));
    }
}
