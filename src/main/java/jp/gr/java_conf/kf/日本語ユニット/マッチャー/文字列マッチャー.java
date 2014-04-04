package jp.gr.java_conf.kf.日本語ユニット.マッチャー;


public class 文字列マッチャー extends 総称マッチャー<String> implements 文字列マッチャー値受付状態 , 文字列マッチャー終了状態 {
    public static  文字列マッチャー値受付状態 は(String value){
        return new 文字列マッチャー(value);
    }
    public static  文字列マッチャー値受付状態 はΓ(String value){
        return new 文字列マッチャー(value);
    }

	public 文字列マッチャー(String あたい) {
		super(あたい);
	}

	public 文字列マッチャー終了状態 を含む() {
		じょうたい = じょうたい.処理(プッシュダウンテープ, 文字列記号.を含む);
		return this;
	}
	public 文字列マッチャー終了状態 を含む亅() {
		じょうたい = じょうたい.処理(プッシュダウンテープ, 文字列記号.を含む);
		じょうたい = じょうたい.処理(プッシュダウンテープ, 括弧.亅);
		return this;
	}
    
    @Override
    public 文字列マッチャー終了状態 を含まない() {
		じょうたい = じょうたい.処理(プッシュダウンテープ, 文字列記号.を含まない);
		return this;
    }

    @Override
    public 文字列マッチャー終了状態 を含まない亅() {
		じょうたい = じょうたい.処理(プッシュダウンテープ, 文字列記号.を含まない);
		じょうたい = じょうたい.処理(プッシュダウンテープ, 括弧.亅);
		return this;
    }
    
	public 文字列マッチャー終了状態 で始まる() {
		じょうたい = じょうたい.処理(プッシュダウンテープ, 文字列記号.で始まる);
		return this;
	}
	public 文字列マッチャー終了状態 で始まる亅() {
		じょうたい = じょうたい.処理(プッシュダウンテープ, 文字列記号.で始まる);
       	じょうたい = じょうたい.処理(プッシュダウンテープ, 括弧.亅);
		return this;
	}
    
    
    @Override
    public 文字列マッチャー終了状態 で始まらない() {
		じょうたい = じょうたい.処理(プッシュダウンテープ, 文字列記号.で始まらない);
		return this;
    }

    @Override
    public 文字列マッチャー終了状態 で始まらない亅() {
		じょうたい = じょうたい.処理(プッシュダウンテープ, 文字列記号.で始まらない);
       	じょうたい = じょうたい.処理(プッシュダウンテープ, 括弧.亅);
		return this;
    }
    
    public 文字列マッチャー終了状態 で終わる() {
		じょうたい = じょうたい.処理(プッシュダウンテープ, 文字列記号.で終わる);
		return this;
	}
	public 文字列マッチャー終了状態 で終わる亅() {
		じょうたい = じょうたい.処理(プッシュダウンテープ, 文字列記号.で終わる);
       	じょうたい = じょうたい.処理(プッシュダウンテープ, 括弧.亅);
		return this;
	}
    
    
    @Override
    public 文字列マッチャー終了状態 で終わらない() {
		じょうたい = じょうたい.処理(プッシュダウンテープ, 文字列記号.で終わらない);
		return this;
    }

    @Override
    public 文字列マッチャー終了状態 で終わらない亅() {
		じょうたい = じょうたい.処理(プッシュダウンテープ, 文字列記号.で終わらない);
       	じょうたい = じょうたい.処理(プッシュダウンテープ, 括弧.亅);
		return this;    }
	
	@Override
	public 文字列マッチャー終了状態 と同じである() {
		super.と同じである();
		return this;
	}
	
	@Override
	public 文字列マッチャー終了状態 と同じでない() {
		super.と同じでない();
		return this;
	}
	
	@Override
	public 文字列マッチャー終了状態 と同一である() {
		super.と同じである();
		return this;
	}
	
	@Override
	public 文字列マッチャー終了状態 と同一でない() {
		super.と同じでない();
		return this;
	}
	
	@Override
	public 文字列マッチャー値受付状態 かつ(String あたい) {
		super.かつ(あたい);
		return this;
	}
	
	
	@Override
	public 文字列マッチャー値受付状態 または(String あたい) {
		super.または(あたい);
		return this;
	}
	
	@Override
	public 文字列マッチャー値受付状態 かつΓ(String あたい) {
		super.かつΓ(あたい);
		return this;
	}

	@Override
	public 文字列マッチャー値受付状態 またはΓ(String あたい) {
		super.またはΓ(あたい);
		return this;
	}


}
