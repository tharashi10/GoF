package com.orcl.design.strategy;

// ジャンケンの戦略を表すクラス
public interface Strategy {
    // 次に出す手を得る
    public abstract Hand nextHand();

    // さっき出した手によって勝ったかどうかを学習する
    public abstract void study(boolean win);
}
