sanvitalia
====================
- WEBアプリとか作ってみてーなーと思い立った時に、コード書くまでの準備が面倒なので用意したプロジェクトです。
    - 他の人から見るとゴミかもしれないけど無料の魔力に勝てないのでパブリックです。
    - 使ってもいいけど、自己責任でお願いします。


# 色んなコマンド

## リリースする時
- コンパイル済みのモジュールを消して（clean）
- ソースをコンパイルして（compile）
- 成果物（jarとかwar等）をtargetフォルダに出力する（package）

    mvn clean compile package


## warをデバッガにかける為にeclipseからTomcatを起動したい
- 前提として、warプロジェクトのpom.xmlにTomcatプラグイン設定を入れる
    - sanvitalia-server/pom.xmlを開いて、buildタグ配下の構成を見てくだし。（【tomcat7-maven-plugin】で探すといいよ）
- メニューから「【実行】＞【デバッグの構成】」
    - 左ペインから「【Mavenビルド】右クリック＞【新規】」
       - 【名前】は自由に入力
       - 【基底ディレクトリー】は【ワークスペース】ボタンクリックから「warプロジェクト」を指定
       - 【ゴール】は【tomcat7:run】を最後に含めていればok
          - 例） clean compile tomcat7:run


## プロジェクトを作成した後、eclipseで読み込めるようにしたい

### eclipse用の設定を追加する
- シングル構成のプロジェクト

    cd /d （pom.xmlがあるフォルダ）
    mvn eclipse:eclipse

- マルチ構成のプロジェクト

    cd /d （親pom.xmlがあるフォルダ）
    mvn eclipse:eclipse

- マルチ構成のプロジェクト（後からサブプロジェクトを追加。この場合は一旦eclipse上からプロジェクトを削除しておく。但し物理ファイルは残したままです）

    cd /d （親pom.xmlがあるフォルダ）
    mvn eclipse:clean eclipse:eclipse


### eclipseで取り込む
- eclipseを起動
- メニューから【ファイル】＞【インポート】
- 【一般】＞【既存プロジェクトをワークスペースへ】
- 【ルートディレクトリの選択】で【親のプロジェクトフォルダ】を選びます
- 【ネストされたプロジェクトを検索】にチェックを付けます
- あとは適当に。


# サブプロジェクトの追加方法

## jarプロジェクト
- Windows

    mvn archetype:generate ^
    -DgroupId=jp.gr.java_conf.mahny.sanvitalia.sanvitalia_commons ^
    -DartifactId=sanvitalia-commons ^
    -DarchetypeArtifactId=maven-archetype-quickstart
    -DinteractiveMode=false

- MacやLinuxは、↑のコマンドの【^】を【\】に置き換えるか、消してワンライナーにして下さい。
- 【groupId】は【パッケージ名】になるのでハイフンは使えなかったりします。
- 【artifactId】はMaven上のエイリアスっぽい感じです。モジュール名にも使います。親や他のプロジェクトと被らないようにしましょ。
- 【archetypeArtifactId】はいくつか決まった物があります。
    - 何か使えるのかはここを見るといいと思う。
        - https://maven.apache.org/guides/introduction/introduction-to-archetypes.html
    - 他にはMavenにプラグインを導入することで、増えたりもします。


## warプロジェクト
- Windows

    mvn archetype:generate ^
    -DgroupId=jp.gr.java_conf.mahny.sanvitalia.sanvitalia_server ^
    -DartifactId=sanvitalia-server ^
    -DarchetypeArtifactId=maven-archetype-webapp ^
    -DinteractiveMode=false


## JavaFX用プロジェクト


# 未整理

    <!-- https://mvnrepository.com/artifact/com.zenjava/javafx-maven-plugin -->
    <dependency>
	    <groupId>com.zenjava</groupId>
	    <artifactId>javafx-maven-plugin</artifactId>
	    <version>8.7.0</version>
    </dependency>
