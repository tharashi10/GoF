### Concurrent Programming

|##|       Title           | Summary |  Tips   |
|--|-----------------------|---------|---------|
|00|   Introduction        |スレッドの基本(RunnableかThread継承か), Synchronizedの動き|スレッドセーフ=Synchronizedではない。<br>良いマルチスレッドかどうかは、安全性、生存性、再利用性、パフォで決まる。|
|01| Single Threaded Exec  |この橋を渡れるのはたった1人|Synchronizedを見つけた際は、「何を守っているのか」を考えるようにすべし。<br>Synchronizedを付与した場合、ロックの解放は必ず行われる(try..catch..finallyのイメージ)。<br>Synchronizedメソッドを使うことで、スレッドの観点からは、Atomic(分割できないもの)として扱われる。|
|02|     Immutable         |||
|03|  Guarded Suspention   |||
|04|       Balking         |||
|05|  Producer-Comsumer    |||
|06|   Read Write Lock     |||
|07| Thread Per Message    |||
|08|   Worker Thread       |||
|09|       Future          |||
|10|Two-Phase Termination  |||
|11|Thread Specific Storage|||
|12|    Active Object      |||

----
### パフォについて（Lea)
- プログラムの品質を向上させるためには、処理を高速かつ大量に処理させる必要がある
- スループット = 処理数/sec (たくさん処理できる)
- 応答性 = 反応速度 (レイテンシ(待ち時間)が短いともいう)
- キャパシティ = 同時に処理できる数
- スケーラビリティなどもある。これらの考えうる要素はTrade-offの関係にある

