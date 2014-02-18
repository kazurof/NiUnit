package jp.gr.java_conf.kf.日本語ユニット.マッチャー;

import org.hamcrest.Matcher;

import java.util.Deque;
import java.util.LinkedList;

public class プッシュダウンレコード<型> {
	結合子記号 けつごうし;
	Deque<Matcher<? super 型>> マッチャーリスト = new LinkedList<>();

	型 あたい = null;
	Class<?> くらす = null;

}
