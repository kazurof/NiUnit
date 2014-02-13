/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.gr.java_conf.kf.niunit.マッチャー;

import org.hamcrest.Matcher;

/**
 *
 * @author fukuhara
 */
public interface 総称マッチャー終了状態<型> {

    総称マッチャー終了状態<型> 亅();

    // TODO これの実装？
//    総称マッチャー<型> 亅ではない();
    
    総称マッチャー値受付状態<型> かつ(型 あたい);

    総称マッチャー値受付状態<型> かつΓ(型 あたい);

    総称マッチャー値受付状態<型> または(型 あたい);

    総称マッチャー値受付状態<型> またはΓ(型 あたい);
   
    Matcher<? super 型> HamcrestMatcher取得();
}
