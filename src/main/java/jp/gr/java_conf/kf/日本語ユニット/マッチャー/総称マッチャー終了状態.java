package jp.gr.java_conf.kf.日本語ユニット.マッチャー;

import org.hamcrest.Matcher;

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
