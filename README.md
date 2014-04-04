日本語ユニット　略称 NiUnit
===========================

NiUnit（にうにっと）は、日本語でテストクラスを書くためのフレームワークです。ネタフレームワークなのであまり真剣に受け取らなくてよいです。お気軽に。

Javaにおけるテストクラスから英語を可能な限り除去し日本語で置き換えて書くことを目標にしています。例えば `assertThat("りんご".charAt(0), is('り'));` の代わりに `値("りんご".charAt(0), は('り').と同じである());` と書くことができます。

現在バイナリの配布はありませんので利用にはJDK8, Maven 3.1.0にて `mvn package` を実行してjarをビルドしてください。

動作サンプルとしては、
[動作サンプル](https://github.com/kazurof/NiUnit/tree/master/src/test/java/jp/gr/java_conf/kf/日本語ユニット/%E5%8B%95%E4%BD%9C%E3%82%B5%E3%83%B3%E3%83%97%E3%83%AB)パッケージのソースを御覧ください。 [最も簡単なテストのサンプル.java](https://github.com/kazurof/NiUnit/blob/master/src/test/java/jp/gr/java_conf/kf/日本語ユニット/%E5%8B%95%E4%BD%9C%E3%82%B5%E3%83%B3%E3%83%97%E3%83%AB/%E6%9C%80%E3%82%82%E7%B0%A1%E5%8D%98%E3%81%AA%E3%83%86%E3%82%B9%E3%83%88%E3%81%AE%E3%82%B5%E3%83%B3%E3%83%97%E3%83%AB.java)、[総称マッチャーサンプル.java](https://github.com/kazurof/NiUnit/blob/master/src/test/java/jp/gr/java_conf/kf/日本語ユニット/%E5%8B%95%E4%BD%9C%E3%82%B5%E3%83%B3%E3%83%97%E3%83%AB/%E7%B7%8F%E7%A7%B0%E3%83%9E%E3%83%83%E3%83%81%E3%83%A3%E3%83%BC%E3%82%B5%E3%83%B3%E3%83%97%E3%83%AB.java)、[文字列マッチャーサンプル.java](https://github.com/kazurof/NiUnit/blob/master/src/test/java/jp/gr/java_conf/kf/日本語ユニット/%E5%8B%95%E4%BD%9C%E3%82%B5%E3%83%B3%E3%83%97%E3%83%AB/%E6%96%87%E5%AD%97%E5%88%97%E3%83%9E%E3%83%83%E3%83%81%E3%83%A3%E3%83%BC%E3%82%B5%E3%83%B3%E3%83%97%E3%83%AB.java)、などから読まれるのがおすすめです。



