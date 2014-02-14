package jp.gr.java_conf.kf.niunit.マッチャー;

import org.hamcrest.Matcher;
import org.hamcrest.core.AllOf;
import org.hamcrest.core.AnyOf;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;

import java.util.LinkedList;

public enum 文処理状態 {
	初期状態 {
		@Override
		public <型> 文処理状態 処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ, 特殊文字 もじ) {
			if (もじ == 括弧.Γ) {
				プッシュダウンレコード<型> レコード = new プッシュダウンレコード<>();
				プッシュダウンテープ.push(レコード);
				return 初期状態;
			} else {
				Assert.fail("日本語文法エラーです。");
			}
			return null;
		}

		@Override
		public <型> Matcher<? super 型> 終了処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ) {
			Assert.fail("日本語文法エラーです。");
			return null;
		}

		@Override
		public <型> 文処理状態 処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ, 型 あたい) {
			プッシュダウンテープ.peek().あたい = あたい;
			return 値受付;
		}

		@Override
		public <型> 文処理状態 処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ,
				Class<? extends 型> くらす) {
			プッシュダウンテープ.peek().くらす = くらす;
			return クラス受付;
		}
	},

	値受付 {
		@Override
		public <型> 文処理状態 処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ, 特殊文字 もじ) {

			if (もじ.記号である()) {

				記号 きごう = もじ.記号取得();
				Matcher matcher = きごう.マッチャー取得(プッシュダウンテープ.peek().あたい);
				プッシュダウンテープ.peek().マッチャーリスト.add(matcher);

				return 終了状態;
			} else if (もじ.文字列記号である()) {

				文字列記号 きごう = もじ.文字列記号取得();
				Matcher matcher = きごう.マッチャー取得((String) プッシュダウンテープ.peek().あたい);
				プッシュダウンテープ.peek().マッチャーリスト.add(matcher);

				return 終了状態;
			} else {
				Assert.fail("日本語文法エラーです。");
			}
			return null;
		}

		@Override
		public <型> 文処理状態 処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ, 型 あたい) {
			Assert.fail("日本語文法エラーです。");
			return null;
		}

		@Override
		public <型> Matcher<? super 型> 終了処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ) {
			Assert.fail("日本語文法エラーです。");
			return null;
		}

		@Override
		public <型> 文処理状態 処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ,
				Class<? extends 型> くらす) {
			Assert.fail("日本語文法エラーです。");
			return null;
		}

	},
	
	クラス受付 {
		@Override
		public <型> 文処理状態 処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ, 特殊文字 もじ) {
			if (もじ == クラスのインスタンスである.インスタンス) {
                            Matcher くらすまっちゃ = IsInstanceOf.instanceOf(プッシュダウンテープ.peek().くらす);
				プッシュダウンテープ.peek().マッチャーリスト.add(くらすまっちゃ);

				return 終了状態;
			} else {
				Assert.fail("日本語文法エラーです。");
			}
			return null;
		}

		@Override
		public <型> 文処理状態 処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ, 型 あたい) {
			Assert.fail("日本語文法エラーです。");
			return null;
		}

		@Override
		public <型> Matcher<? super 型> 終了処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ) {
			Assert.fail("日本語文法エラーです。");
			return null;
		}

		@Override
		public <型> 文処理状態 処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ,
				Class<? extends 型> くらす) {
			Assert.fail("日本語文法エラーです。");
			return null;
		}

	},
	終了状態 {
		@Override
		public <型> 文処理状態 処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ, 特殊文字 もじ) {
			if (もじ == 括弧.Γ) {
				Assert.fail("日本語文法エラーです。");
				return null;
			}
			
			if (もじ == 括弧.亅) {
				プッシュダウンレコード<? super 型> さいごのレコード = プッシュダウンテープ.pop();
				Matcher 処理対象 ; 
				if(さいごのレコード.けつごうし == 結合子記号.かつ){
					処理対象= new AllOf(さいごのレコード.マッチャーリスト);
					
				}else{
					処理対象= new AnyOf(さいごのレコード.マッチャーリスト);
				}
				if (プッシュダウンテープ.isEmpty()) {
					プッシュダウンテープ.push(new プッシュダウンレコード<>());
				}
				プッシュダウンテープ.peek().マッチャーリスト.add(処理対象);	
				return 終了状態;
			}
			if (もじ == 結合子記号.かつ) {
				結合子記号 いまのけつごうし = プッシュダウンテープ.peek().けつごうし;
				if (いまのけつごうし == 結合子記号.かつ || いまのけつごうし == null) {
					// 今までかつでつながっていた場合あるいは本当に最初の状態。
					プッシュダウンテープ.peek().けつごうし = 結合子記号.かつ;
					return 初期状態;
				}

				// 今まで　または　でつながっていたが、これからはかつでつながる場合
				// プッシュダウンテープ.peek().けつごうし = 結合子記号.かつ;
				プッシュダウンレコード<型> しんレコード = new プッシュダウンレコード<>();
				しんレコード.けつごうし = 結合子記号.かつ;
				しんレコード.マッチャーリスト.add(プッシュダウンテープ.peek().マッチャーリスト.removeLast());
				プッシュダウンテープ.push(しんレコード);
				return 初期状態;
			}
			if (もじ == 結合子記号.または) {
				結合子記号 いまのけつごうし = プッシュダウンテープ.peek().けつごうし;
				if (いまのけつごうし == 結合子記号.または || いまのけつごうし == null) {
					// 今までまたはでつながっていた場合あるいは本当に最初の状態。
					プッシュダウンテープ.peek().けつごうし = 結合子記号.または;
					return 初期状態;
				}
				// 今まで　かつ　でつながっていたが、これからはまたはでつながる場合
				プッシュダウンレコード<? super 型> さいごのレコード = プッシュダウンテープ.pop();

				Matcher AND連結 = new AllOf(さいごのレコード.マッチャーリスト);
				if (プッシュダウンテープ.isEmpty()) {
					プッシュダウンテープ.push(new プッシュダウンレコード<>());
				}
				プッシュダウンテープ.peek().マッチャーリスト.add(AND連結);
				プッシュダウンテープ.peek().けつごうし = 結合子記号.または;
				return 初期状態;
			}

			return null;
		}

		@Override
		public <型> 文処理状態 処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ, 型 あたい) {
			Assert.fail("日本語文法エラーです。");
			return null;
		}

		@Override
		public <型> Matcher<? super 型> 終了処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ) {
			while (プッシュダウンテープ.size() != 1) {

				プッシュダウンレコード<? super 型> さいしゅうレコード = プッシュダウンテープ.pop();
				プッシュダウンレコード<? super 型> まとめ先 = プッシュダウンテープ.peek();
				
//				if(さいしゅうレコード.マッチャーリスト.size() == 1){
//					まとめ先.マッチャーリスト.add((Matcher<?>) さいしゅうレコード.マッチャーリスト.getFirst());
//				}else{
					
				
				if (さいしゅうレコード.けつごうし == 結合子記号.かつ) {
					まとめ先.マッチャーリスト.add(new AllOf(さいしゅうレコード.マッチャーリスト));
				} else {
					まとめ先.マッチャーリスト.add(new AnyOf(さいしゅうレコード.マッチャーリスト));
				}
//				}
			}

			プッシュダウンレコード<? super 型> レコード = プッシュダウンテープ.peek();

			if (レコード.けつごうし == 結合子記号.かつ) {
				return new AllOf(レコード.マッチャーリスト);
			} else {
				return new AnyOf(レコード.マッチャーリスト);
			}
		}

		@Override
		public <型> 文処理状態 処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ,
				Class<? extends 型> くらす) {
			Assert.fail("日本語文法エラーです。");
			return null;
		}
	};

	public abstract <型> 文処理状態 処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ, 特殊文字 とくしゅもじ);
	public abstract <型> 文処理状態 処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ, 型 あたい);
	public abstract <型> 文処理状態 処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ, Class<? extends  型> くらす);
	public abstract <型> Matcher<? super 型> 終了処理(LinkedList<プッシュダウンレコード<? super 型>> プッシュダウンテープ);
}
