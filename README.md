# psr-java
#### README.md作成日
- 2022-09-01

#### メンバ
- 2名

#### 位置付け
- 本プロジェクトでは、Private Study Roomの続編としてJavaを学ぶものとする

#### 目標
- まずはGoFのデザインパターンを習得することを目標とする

#### 進め方
- 毎週何かしら（ちょこっとでもOKなので）進めていく
- 課題を解く。ベースでやる(やりたい)
- GoFの本には、Zipでも範囲解答があるので一旦自分で書いてみて、照らし合わせてみる

#### その他
- リポジトリはGoF以外のCodeを載せてもOKとする
- 何かモノを作ってみたい(2022-10-31メモ)


| ## | Category | Pattern      | サマリ | メリデメとか気になるもの |
|----|----------|--------------|---------------|----|
| 01 | デザパタに慣れる | Iterator     |統一した方法で一つずつ処理する(実装と切り離して繰り返し処理できる)|実装がどうあれIteratorを使える<br>*抽象クラスやInterfaceを使ってプログラミングする|
| 02 | デザパタに慣れる | Adaptor      |既存クラスをWrapして再利用する|既にあるクラスを再利用可能<br>継承よりも委譲を使った方がトラブル少ない|
| 03 | サブクラスに任せる | Template     |具体的な処理をサブクラスに任せる|ロジックを共通化できる<br>The Liskov Substitution Principle|
| 04 | サブクラスに任せる | Factory      |インスタンス作成をサブクラスに任せる|パッケージに依存しない|
| 05 | インスタンスを作る | Singleton    |インスタンスが1個だけ(Private Constructor)|インスタンスが相互に及ぼしあって悪影響を受けることはない|
| 06 | インスタンスを作る | Prototype    |コピーしてインスタンスを作る|2回目以降のインスタンス生成が非常に低コストで行える|
| 07 | インスタンスを作る | Builder      |複雑なインスタンスを組み上げていく|コンストラクタに対して、パラメータを多く設定する場合に有用|
| 08 | インスタンスを作る | Abstract Factory |関連する部品を組み合わせて製品を作る|実行するメインプログラムを修正せずに、サブクラス群を環境変化に伴って交換することができる|
| 09 | 分けて考える | Bridge       |機能の階層と実装の階層を分ける|機能/実装を独立して管理することで機能の拡張を容易にする|
| 10 | 分けて考える | Strategy     |アルゴリズムをごっそり切り替える|状況に応じて必要な処理を使い分けられる|
| 11 | 同一視 | Composite|容器と中身の同一視|「枝」と「葉」は共通のインターフェースを実装しているため、枝と葉を同様に扱えるようになる|
| 12 | 同一視 | Decorator    |飾り枠と中身の同一視|拡張元となるクラスに変更を加えることなく、柔軟に機能の拡張を行うことができる|
| 13 | 構造を渡り歩く | Visitor      |構造をわたり歩きながら仕事をする|データ構造と処理を分離することで、機能追加が容易にできる|
| 14 | 構造を渡り歩く | ChainOfResponsibility |たらい回し(委譲)|要求の送信側と受信側の結びつきを緩くできる<br>たらい回しにより処理が遅くなる場合もある|
| 15 | シンプルにする | Facade       |シンプルな窓口|クライアント側が詳細な制御をしなくて済む<br>インターフェースの呼び出し口を絞ることで外部と疎結合にできる|
| 16 | シンプルにする | Mediator     |相手は相談役一人だけ|Hubのようなイメージになる|
| 17 | 状態を管理する | Observer     |状態の変化を通知する|通知元のCodeを改修せずに動作をつけたせる(拡張できる)|
| 18 | 状態を管理する | Memento      |状態を保存する|Objectの状態をスナップショットで保存する|
| 19 | 状態を管理する | State        |状態をクラスとして表現する|main(contoroller)の処理で状態に応じてif文の分岐が多岐にわたる場合に使える<br>状態がよく変わるプログラムを管理しやすくなる|
| 20 | 無駄をなくす | Flyweight    |同じものをシェアする|生成済みのオブジェクトをできるだけ再利用することで、メモリ消費量を抑える|
| 21 | 無駄をなくす | Proxy        |必要になってから作る|忙しくて仕事ができない`本人`オブジェクトの代わりに、`代理人`オブジェクトが一部の仕事をこなすパターン|
| 22 | クラスで表現する | Command     |命令・動作をObject化する |コマンドの管理を容易にする|
| 23 | クラスで表現する | Interpreter    |文法規則をクラスで表現する|構文木を生成する|
| 99 | DB | Data Access Pattern | DBへのCRUD操作を「表」ごとに作成するパターン ||

#### Ref
- [Java GoF 23](https://www.hyuki.com/dp/)
- [Java マルチスレッド](https://www.hyuki.com/dp/dp2.html)
- [Effective Java](https://www.maruzen-publishing.co.jp/item/?book_no=303408)
- [Clean Architecture](https://www.amazon.co.jp/-/en/Robert-C-Martin/dp/4048930656)