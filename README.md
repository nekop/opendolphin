OpenDolphin on JBoss AS 7.1.0 / Java EE 6 experimental migration project
====================

* Maven 3.0.3
* JBoss AS 7.1.0.Final
* Java EE 6


How to build
--------------------
Before build, change data source name in common/src/main/resources/META-INF/persistence.xml

> mvn clean package


How to deploy/run
--------------------
Server

> cp server/target/*.war $JBOSS_HOME/standalone/deployments/

Client

> java -jar client/target/OpenDolphin.jar


TODOs
--------------------

* Add jboss-as-maven-plugin support
* Functional test
* Consider renaming to avoid confusion
* Confirm someone if this commit is ok: Update itext libs. commit 18462c00910cf52ce889596b0b6c57c89ed49780


Original README
--------------------
2012-01-22 （株）デジタルグローブ　皆川和史

1．ライセンス
・OpenDolphinのライセンスは GNU GPL2 です。
・OpenDolphinには札幌市元町皮ふ科の松村先生、和歌山市増田内科の増田先生のコードが含まれています。これらの部分の著作権はそれぞれの先生に帰属します。
・OpenDolphinは（株）デジタルグローブの登録商標です。

２．開発環境
・jdk 1.6.0_29
・NetBeans 7.1
・maven 3.0.3
・JavaEE 5
・JBoss-6.1.0.Final
