# "$2a$10$GL.rnkf6YGWzPrVTj7wG0e2Mq.J67I7SZgwkGI8twWZahGDY.jP26" = "password"
insert into user (user_id, name, account, password, unlocked, role, two_factor_use, two_factor_type, status) value
(1, '安部', 'abe@sharecrest.com', '$2a$10$GL.rnkf6YGWzPrVTj7wG0e2Mq.J67I7SZgwkGI8twWZahGDY.jP26', true, 'ROLE_ADMIN', false, null, 'NORMAL'),
(2, '池田', 'ikeda@sharecrest.com', '$2a$10$GL.rnkf6YGWzPrVTj7wG0e2Mq.J67I7SZgwkGI8twWZahGDY.jP26', true, 'ROLE_ADMIN', false, null, 'NORMAL'),
(3, '鈴木', 'suzuki@sharecrest.com', '$2a$10$GL.rnkf6YGWzPrVTj7wG0e2Mq.J67I7SZgwkGI8twWZahGDY.jP26', true, 'ROLE_USER', false, null, 'NORMAL'),
(4, '小林', 'kobayashi@sharecrest.com', '$2a$10$GL.rnkf6YGWzPrVTj7wG0e2Mq.J67I7SZgwkGI8twWZahGDY.jP26', true, 'ROLE_USER', false, null, 'NORMAL');

insert into fixed_mail (fixed_mail_id, code, name, description, subject, body) value
(1, 'AUTH', '認証コード送信', '2段階認証時の6桁認証コードの送信', '$\{ APP_NAME } - 認証コード確認', '認証コード : $\{ AUTH_CODE }'),
(2, 'SIGNUP', 'サインアップ時メールアドレス確認', 'サイアンアップ時のメールアドレス確認用メール、メール内に本登録用のURLが含まれます', '$\{ APP_NAME } - 会員登録手続きのご案内', '■□　【$\{ APP_NAME }】会員登録手続きのご案内　□■\r\n\r\nこの度は「$\{ APP_NAME }」にご登録の申し込みをいただきまして、誠にありがとうございます。\r\n\r\n下記のＵＲＬにアクセスして、会員登録手続きを行ってください(登録手続きはまだ完了していません)。\r\n----------------------------------------------\r\n【会員登録ＵＲＬ】\r\n$\{ SIGNUP_URL }\r\n----------------------------------------------\r\n※上記ＵＲＬの有効期限は$\{ SIGNUP_URL_EXPIRED }\r\n\r\n※ＵＲＬが2行以上になっている等により、クリックをしてもアクセスできない\r\n　場合には、ＵＲＬをコピーしてブラウザのアドレスバーに1行になるように\r\n　貼り付けて画面を表示させてください。\r\n\r\n※ＵＲＬ有効期限が切れて登録手続きが完了できない場合には、恐れ入りますが、\r\n　下記ＵＲＬよりもう一度登録のお申し込みを行ってください。\r\n　$\{ APP_URL }\r\n\r\n======================================================================\r\n\r\n※本メールは送信専用メールアドレスからお送りしています。\r\nご返信いただいてもお答えできませんのでご了承ください。\r\n\r\n・お問い合わせはコチラ\r\n$\{ QA_URL }\r\n\r\n======================================================================\r\n　XXXXXXXXXXXXX株式会社\r\n　〒999-8888　東京都江東区ＸＸＸ1丁目1番3号\r\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\r\n(c) 2019 XXXXXXXX, Co.,Ltd.\r\n');

insert into option_data (option_data_id, key_code, value, description) value
(1, 'FROM_MAIL_ADDDRESS', 'agaga@sharecrest.com', '送信元メールアドレス'),
(2, 'APP_URL', 'http://localhost:8080', 'アプリケーショントップURL'),
(3, 'QA_URL', 'http://www.shareknowledge.jp/', '問い合わせ用URL'),
(4, 'SIGNUP_MAIL_EXPIRED', '3', 'サインアップ時のワンタイムURLの有効日数。3を指定した場合3日後まで有効');
