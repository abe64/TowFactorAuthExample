<template>
  <div class="app flex-row align-items-center">
    <div class="container">
      <b-row class="justify-content-center">
        <b-col md="8">
          <b-card-group>
            <b-card no-body class="p-4">
              <b-card-body>
                <b-form>
                  <h1>ログイン</h1>
                  <p class="text-muted">アカウントを入力してください。</p>
                  <b-input-group class="mb-3">
                    <b-input-group-prepend><b-input-group-text><i class="icon-user"></i></b-input-group-text></b-input-group-prepend>
                    <b-form-input type="text" v-model="account" class="form-control" placeholder="E-mail" autocomplete="username email" />
                  </b-input-group>
                  <b-input-group class="mb-4">
                    <b-input-group-prepend><b-input-group-text><i class="icon-lock"></i></b-input-group-text></b-input-group-prepend>
                    <b-form-input type="password" v-model="password" class="form-control" placeholder="Password" autocomplete="current-password" />
                  </b-input-group>
                  <b-row>
                    <b-col class="text-center">
                      <vue-recaptcha @verify="googleCaptcha" class="m-1" sitekey="6Ldv_9IUAAAAALEfEVkPxP884AJOh_rETKR_hXz2" ref="invisibleRecaptcha"></vue-recaptcha>
                      <b-button variant="primary" @click="login" class="px-3">ログイン</b-button>
                    </b-col>
                  </b-row>
                  <b-row>
                    <b-col class="text-center">
                      パスワードを忘れた方は<router-link to="/pages/repassword">再発行の手続き</router-link>へ
                    </b-col>
                  </b-row>
                </b-form>
              </b-card-body>
            </b-card>
            <b-card no-body class="text-white bg-primary py-5 d-md-down-none" style="width:44%">
              <b-card-body class="text-center">
                <div>
                  <h2>新規会員登録</h2>
                  <p>はじめての方は登録手続きへお進みください。</p>
                  <router-link to="/pages/register">
                    <b-button variant="primary" class="active mt-3">新規会員登録</b-button>
                  </router-link>
                </div>
              </b-card-body>
            </b-card>
          </b-card-group>
        </b-col>
      </b-row>
    </div>
  </div>
</template>

<script>
import VueRecaptcha from 'vue-recaptcha';

export default {
  name: 'Login',
  components: {
    VueRecaptcha
  },
  data: function() {
    return {
      message: '',
      account: '',
      password: '',
      googleCaptchaToken: '',
    }
  },
  computed: {
  },
  methods: {
    googleCaptcha: function(res) {
      this.googleCaptchaToken = res;
    },
    login: function() {
      let _this = this;
      this.message = '';
      this.$store.dispatch('webAPI/postLogin', {
        data: {
          account: this.account,
          password: this.password,
          googleCaptchaToken: this.googleCaptchaToken
        },
        successFunc: function(data) {
          if (data.twoFactorUse) {
            _this.$store.commit('setTwoFactor', true);
            _this.$router.push({ path: '/pages/twofactor'});
          } else {
            _this.$store.commit('setAuthorization', true);
            _this.$store.commit('setUser', data);
            _this.$router.push( { path: '/' });
          }
        },
        errorFunc: function(data) {
          _this.$store.commit('setAuthorization', false);
          _this.$store.commit('setTwoFactor', false);
          _this.message = data.message;
        },
        finallyFunc: function() {
        },
        router: this.$router,
        cookie: this.$cookie
      })
    }
  }
}
</script>
