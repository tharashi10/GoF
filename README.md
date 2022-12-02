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
- リポジトリはGoF以外のCodeを載せてもOKとする（PythonでもSQLでもOK）
- 何かモノを作ってみたい(2022-10-31メモ)


| ## | Category | Pattern      | サマリ |
|----|----------|--------------|---------------|
| 01 | デザパタに慣れる | Iterator     |統一した方法で一つずつ処理する(実装と切り離して繰り返し処理できる)|
| 02 | デザパタに慣れる | Adaptor      |既存クラスをWrapして再利用する|
| 03 | サブクラスに任せる | Template     |具体的な処理をサブクラスに任せる|
| 04 | サブクラスに任せる | Factory      |インスタンス作成をサブクラスに任せる|
| 05 | インスタンスを作る | Singleton    |インスタンスが1個だけ(Private Constructor)|
| 06 | インスタンスを作る | Prototype    |コピーしてインスタンスを作る|
| 07 | インスタンスを作る | Builder      |複雑なインスタンスを組み上げていく|
| 08 | インスタンスを作る | Abstract Factory |関連する部品を組み合わせて製品を作る|
| 09 | 分けて考える | Bridge       |機能の階層と実装の階層を分ける|
| 10 | 分けて考える | Strategy     |アルゴリズムをごっそり切り替える|
| 11 | 同一視 | Composite    |容器と中身の同一視|
| 12 | 同一視 | Decorator    |飾り枠と中身の同一視|
| 13 | 構造を渡り歩く | Visitor      ||
| 14 | 構造を渡り歩く | ChainOfResponsibility ||
| 15 | シンプルにする | Facade       ||
| 16 | シンプルにする | Mediator     ||
| 17 | 状態を管理する | Observer     ||
| 18 | 状態を管理する | Memento      ||
| 19 | 状態を管理する | State        ||
| 20 | 無駄をなくす | Flyweight    ||
| 21 | 無駄をなくす | Proxy        ||
| 22 | クラスで表現する | Command      ||
| 99 | DB | Data Access Pattern | DBへのCRUD操作を「表」ごとに作成するパターン |

#### Ref
- [Java GoF 23](https://www.hyuki.com/dp/)
- [Java マルチスレッド](https://www.hyuki.com/dp/dp2.html)
- [Effective Java](https://www.maruzen-publishing.co.jp/item/?book_no=303408)
