import Vue from 'vue'
import Vuex, { Store } from 'vuex'
import createPersistedState from "vuex-persistedstate"    // ストア永続化
import webAPI from './modules/webAPI'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    isAuthorization: false,     // true=認証済み (isTwoFactor=trueの場合は必ずfalseです)
    isTwoFactor: false,         // true=2段階認証中 (認証コードの入力待ちの状態です)
    user: {                     // ログインユーザー情報
      id: 0,
      account: '',
      name: '',
      roles: [],
      twoFactorUse: false,
      twoFactorType: ''
    }
  },
  strict: true,
  plugins: [createPersistedState({
    key: 'two-factor-auth-test',
    storage: window.localStorage
  })],
  getters: {
  },
  mutations: {
    setAuthorization: function(state, authorization) {
      state.isAuthorization = authorization;
    },
    setTwoFactor: function(state, twoFactor) {
      state.isTwoFactor = twoFactor;
      if (twoFactor) {
        state.isAuthorization = false;
      }
    },
    initUser: function(state) {
      state.user = {
        id: 0,
        account: '',
        name: '',
        roles: [],
        twoFactorUse: false,
        twoFactorType: ''
      };
    },
    setUser: function(state, user) {
      state.user = user;
    }
  },
  actions: {
  },
  modules: {
    webAPI
  }
})
