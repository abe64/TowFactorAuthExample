-- ユーザー
create table user (
  user_id int(11) auto_increment not null comment 'ユーザーID'
  , name varchar(256) not null comment 'ユーザー名'
  , account varchar(256) not null unique comment 'アカウント'
  , password varchar(256) not null comment 'パスワード'
  , telno varchar(12) comment '電話番号'
  , secret varchar(16) comment 'シークレット情報'
  , unlocked boolean not null comment 'ロック状態:true=unlock'
  , role varchar(256) comment 'ロール:"ROLE_ADMIN" or "ROLE_USER"'
  , two_factor_use boolean not null default false comment '2段階認証:true=有効'
  , two_factor_type varchar(32) comment '2段階認証タイプ'
  , login_count int(11) not null default 0 comment 'ログイン回数'
  , status varchar(32) not null comment 'ステータス'
  , constraint user_PKC primary key (user_id)
) comment 'ユーザー' ;

-- 定型メール
create table fixed_mail (
  fixed_mail_id int(11) auto_increment not null comment '定型メールID'
  , code varchar(256) not null unique comment '定型メールコード'
  , name varchar(256) not null comment '定型メール名'
  , description varchar(512) comment '説明'
  , subject text comment '件名'
  , body text comment '本文'
  , constraint fixed_mail_PKC primary key (fixed_mail_id)
) comment '定型メール';

-- オプション
create table option_data (
  option_data_id int(11) auto_increment not null comment 'オプションID'
  , key_code varchar(256) not null unique comment 'キーコード'
  , value varchar(512) comment 'データ'
  , description varchar(512) comment '説明'
  , constraint option_PKC primary key (option_data_id)
) comment 'オプション'; 
