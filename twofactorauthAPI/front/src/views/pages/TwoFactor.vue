<template>
  <div class="app flex-row align-items-center">
    <div class="container">
      <b-row class="justify-content-center">
        <b-col md="8">
          <b-card-group>
            <b-card no-body class="p-4">
              <b-card-body>
                <b-form>
                  <h1>2要素認証</h1>
                  <p class="text-muted">認証コードを入力してください。</p>
                  <b-input-group class="mb-3">
                    <b-input-group-prepend><b-input-group-text><i class="icon-user"></i></b-input-group-text></b-input-group-prepend>
                    <b-form-input type="text" v-model="authCode" class="form-control" placeholder="認証コード" />
                  </b-input-group>
                  <b-row>
                    <b-col cols="6">
                      <b-button variant="primary" @click="twoFactorAuth" class="px-3">確認</b-button>
                    </b-col>
                  </b-row>
                </b-form>
              </b-card-body>
            </b-card>
          </b-card-group>
        </b-col>
      </b-row>
    </div>
  </div>
</template>

<script>
export default {
    name: 'twoFactor',
    components: {
    },
    data: function() {
        return {
            message: '',
            authCode: ''
        }
    },
    methods: {
        twoFactorAuth: function() {
            let _this = this;
            this.message = '';
            this.$store.dispatch('webAPI/postTwoFactorAuth', {
                data: {
                    authCode: this.authCode
                },
                successFunc: function(data) {
                    _this.$store.commit('setTwoFactor', false);
                    _this.$store.commit('setAuthorization', true);
                    _this.$store.commit("setUser", data);
                    _this.$router.push({ path: '/'});
                },
                errorFunc: function(data) {
                    _this.message = data.message;                
                },
                finallyFunc: function() {
                },
                router: this.$router,
                cookie: this.$cookie
            });
        }
    }
}
</script>