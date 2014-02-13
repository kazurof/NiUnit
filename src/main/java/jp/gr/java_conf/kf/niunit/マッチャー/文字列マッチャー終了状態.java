/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.gr.java_conf.kf.niunit.マッチャー;

/**
 *
 * @author fukuhara
 */
public interface 文字列マッチャー終了状態 extends  総称マッチャー終了状態<String>  {
    文字列マッチャー終了状態 を含む();
    
    
    
    
    
    文字列マッチャー値受付状態 かつ(String あたい);
    
    文字列マッチャー値受付状態 または(String あたい);
    文字列マッチャー値受付状態 かつΓ(String あたい);
}
