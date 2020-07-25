
ポートフォリ# member_search
ポートフォリオ
開発環境
from_Java_Eclips_springboot
Java　SE8
Eclips Version: 2020-03 (4.15.0)
SpringBoot
Thymeleaf
Mysql8.0（workbench）
Github


＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿
開発内容
スレッド型のバンドメンバー募集掲示板（後に内容拡張予定）
Top画面には各スレッドで投稿された内容が新しい順番で掲載される。
各スレッド部分に移動するにはユーザー登録とログインが必要（springsecurity）
ユーザー同士のやり取りは投稿時に掲載された連絡手段で行う
________________________________________________________
今後の追加機能（予定）
Top画面への検索機能の追加（ワード検索）
バリテーション機能
簡単ログイン機能
管理者のみの投稿削除機能の追加（現在はworkbench上で対応）
Top画面で表示されている最新投稿内容の表示をイベント参加者募集に変更（こちらは管理人のみが投稿）＝メンバー募集は各種スレッドのみで表示し、TOPでは掲載しない
スレッドの拡張（イベント告知、各種クリエイターへの仕事依頼）※動画、絵、講師募集etc
＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿
MySQLDate
CREATE TABLE `users` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `password` varchar(255) NOT NULL,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`user_id`)
  
 CREATE TABLE `boards_contents` (
  `post_no` int NOT NULL AUTO_INCREMENT,
  `board_id` int DEFAULT NULL,
  `content` varchar(140) NOT NULL,
  `posted_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `posted_user_id` varchar(30) NOT NULL,
  `href_url` text,
  PRIMARY KEY (`post_no`) 
  
  CREATE TABLE `boards` (
  `board_id` int NOT NULL AUTO_INCREMENT,
  `board_name` varchar(30) NOT NULL,
  `created_user_id` int NOT NULL,
  PRIMARY KEY (`board_id`),
  KEY `created_user_id` (`created_user_id`)
  
  CREATE TABLE `auto_login_users` (
  `user_id` int NOT NULL,
  `login_token` varchar(255) NOT NULL,
  `expire` timestamp NOT NULL,
  PRIMARY KEY (`user_id`)
 ＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿ 
各ファイル解説

FormController　Top画面のController
form.html　Top画面のViewFile
FormContentInterface　form.htmlとFormControllerがやりとりするクラス

BoardDto　boards_contentsテーブルのEntityクラス
BoardRepository　BoardDtoのインターフェース
BoardDao　DB にアクセスするメソッド

CommentDto　boards_contentsテーブルのEntityクラス
CommentRepository　CommentDtoのインターフェース


ログイン、ユーザー登録関係
accountComplete.html ユーザー登録完了時に表示するViewFile
Completecontroller　ユーザー登録完了画面のController
register.html ユーザー登録画面のViewFile
RegisterController register.htmlのController
RegisterDto　formからPOSTされた時に値を受け取るクラス
RegisterprocessDto　usersテーブルのEntityクラス
RegisterRepository　Registerのインターフェース
RegisterService 　　ユーザー登録のサービスクラス　リポジトリをimportし、保存処理　パスワードハッシュ化　コントローラにPOSTされた時の処理
WebSecurityConfig  Spring Securityを利用するにあたり、「WebSecurityConfigurerAdapter」を継承して認証設定をしているクラス
RegisterRepository  RegisterprocessDtoのインターフェース
login.html　ログイン画面のViewFile
LoginController　ログイン画面のController
JpaUserDetailsServiceImpl　UserDetailsServiceクラスを継承
UserDetails　DB認証機能
Register　UserDetails形式で値を返すEntityクラス
LogoutController ログアウト機能に対してのController
error.html 操作エラー時に対しての表示画面

各スレッド関係
Thread.html　各スレッド一覧画面のViewFile
ThreadController　各スレッド一覧画面のController
shigasouth.html 滋賀南部スレッドのViewFile
ShigasouthController　滋賀南部スレッドのController
osakasouth.html 大阪南部スレッドのViewFile
OsakasouthController　大阪南部スレッドのController
kyotosouth.html 京都南部スレッドのViewFile
KyotosouthController　京都南部スレッドのController




