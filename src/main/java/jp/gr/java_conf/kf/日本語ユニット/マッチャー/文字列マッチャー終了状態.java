package jp.gr.java_conf.kf.日本語ユニット.マッチャー;

public interface 文字列マッチャー終了状態 extends  総称マッチャー終了状態<String>  {
    文字列マッチャー値受付状態 かつ(String あたい);
    文字列マッチャー値受付状態 または(String あたい);
    文字列マッチャー値受付状態 かつΓ(String あたい);
    文字列マッチャー値受付状態 またはΓ(String あたい);
}
