package jp.gr.java_conf.kf.niunit.ランナー;

public class バージョン {
	private バージョン() {
		// don't instantiate
	}

	public static String バージョン番号() {
		return "1.0-SNAPSHOT";
	}
	
	public static void main(String[] args) {
		System.out.println(バージョン番号());
	}
}
