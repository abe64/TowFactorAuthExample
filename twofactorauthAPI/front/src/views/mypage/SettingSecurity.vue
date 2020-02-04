<template>
    <div class="animated fadeIn">
        <template v-if="isAuthCheck === false">
            <b-row>
                <b-col sm="6">
                    <b-card>
                        <div slot="header">
                            セキュリティ
                        </div>
                        <b-form>
                            <b-form-group>
                                <b-form-checkbox v-model="info.twoFactorUse">2段階認証を使用する。</b-form-checkbox>
                            </b-form-group>
                            <div>認証方法を選択してください</div>
                            <b-form-group label="認証方法" label-for="twoFactorType" :label-cols="3">
                                <b-form-radio v-model="info.twoFactorType" name="twoFactorType" value="HOTP_MAIL">メール</b-form-radio>
                                <b-form-radio v-model="info.twoFactorType" name="twoFactorType" value="HOTP_SMS">SMS (ショートメール)</b-form-radio>
                                <b-form-radio v-model="info.twoFactorType" name="twoFactorType" value="TOTP">アプリケーション</b-form-radio>
                            </b-form-group>
                        </b-form>
                        <div slot="footer">
                            <b-button size="sm" variant="primary" @click="check"><i class="fa fa-dot-circle-o"></i> 確認</b-button>
                        </div>
                    </b-card>
                </b-col>
            </b-row>
        </template>
        <template v-else>
            <b-row>
                <b-col sm="6">
                    <b-card>
                        <div slot="header">
                            <div v-if="info.twoFactorType === 'TOTP'">
                                <img :src="getQrImgUrl">
                            </div>
                            <div>
                                認証コードを入力してください。
                            </div>
                        </div>
                        <b-form>
                            <b-form-group validated
                                label="認証コード"
                                label-for="authCode"
                                description="送信されたか上記のQRコードで取得できた認証コードを入力してください。">
                                <b-form-input id="authCode" type="text" required v-model="info.authCode"></b-form-input>
                            </b-form-group>
                        </b-form>
                        <div slot="footer">
                            <b-button size="sm" variant="primary" @click="update"><i class="fa fa-dot-circle-o"></i> 確認</b-button>
                        </div>
                    </b-card>
                </b-col>
            </b-row>
        </template>
    </div>
</template>

<script>
var self;

export default {
    name: 'settingSecurity',
    components: {
    },
    data: function() {
        return {
            message: '',
            info: {
                twoFactorUse: false,
                twoFactorType: 'HOTP_MAIL',
                telNo: '',
                authCode: ''
            },
            isAuthCheck: false,              // 認証コード入力待ち
            isComplete: false
        }
    },
    mounted: function() {
        this.$nextTick(function() {
            this.getSecurityInfo();
        });
    },
    computed: {
        checkInput: function() {
            self = this;
            return function (target) {
                if (target === 'first') {
                    return {
                        'displayNone' : self.isAuthCheck === true
                    };
                } else {
                    return {
                        'displayNone' : self.isAuthCheck === false
                    }
                }
            }
        },
        getQrImgUrl: function() {
            if (this.isAuthCheck) {
                return "/api/v1/users/auth_qr?check=true";            
            }
            return "";            
        }
    },
    methods: {
        getSecurityInfo: function() {
            let _this = this;
            this.message = '';
            this.$store.dispatch('webAPI/getSecurityInfo', {
                successFunc: function(data) {
                    _this.info = data;
                    _this.info.authCode = '';
                },
                errorFunc: function(data) {
                    _this.message = data.message;                
                },
                finallyFunc: function() {
                },
                router: this.$router,
                cookie: this.$cookie
            });
        },
        check: function() {
            let _this = this;
            this.message = '';
            this.isComplete = false;
            this.$store.dispatch('webAPI/postSecurityUpdateCheck', {
                data: this.info,
                successFunc: function() {
                    _this.isAuthCheck = true;
                    if (!_this.info.twoFactorUse) {
                        // 2段階認証を使用しないに変更された場合はこの時点で更新する
                        _this.update();
                    }
                },
                errorFunc: function(data) {
                    _this.isAuthCheck = false;
                    _this.message = data.message;                
                },
                finallyFunc: function() {
                },
                router: this.$router,
                cookie: this.$cookie
            });
        },
        update: function() {
            let _this = this;
            this.message = '';
            this.$store.dispatch('webAPI/putSecurityUpdate', {
                data: this.info,
                successFunc: function() {
                    _this.isComplete = true;
                },
                errorFunc: function(data) {
                    _this.message = data.message;                
                },
                finallyFunc: function() {
                    _this.isAuthCheck = false;
                },
                router: this.$router,
                cookie: this.$cookie
            });
        }
    }
}
</script>
