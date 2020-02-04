/*
 * API呼び出しスタブ
 */
import axios from 'axios'

const state = {
}

const getConfig = function (state, getters, rootState, cookie) {
    return {
        headers: {
            "Content-Type": "application/json;charset=UTF-8",
            "X-XSRF-TOKEN": cookie.get("XSRF-TOKEN")
        },
        data: {}
    }
}

const successFunction = function (response, successFunc) {
    if (successFunc) {
        successFunc(response.data);
    }
}

const errorFunction = function (error, errorFunc, commit, router) {
    if (errorFunc) {
        errorFunc(error.response.data);
    }
}

const finallyFunction = function (finallyFunc) {
    if (finallyFunc) {
        finallyFunc();
    }    
}

const actions = {
    // サインアップ
    postUsersSignup: function({ state, getters, commit, rootState }, { data, successFunc, errorFunc, finallyFunc, router, cookie }) {
        axios
            .post('/api/v1/users/signup', data, getConfig(state, getters, rootState, cookie))
            .then(response => successFunction(response, successFunc))
            .catch(error => errorFunction(error, errorFunc, commit, router))
            .finally(() => finallyFunction(finallyFunc));
    },
    // 仮登録
    postUsersProvisional: function({ state, getters, commit, rootState }, { data, successFunc, errorFunc, finallyFunc, router, cookie }) {
        axios
            .post('/api/v1/users/provisional', data, getConfig(state, getters, rootState, cookie))
            .then(response => successFunction(response, successFunc))
            .catch(error => errorFunction(error, errorFunc, commit, router))
            .finally(() => finallyFunction(finallyFunc));
    },
    // 本登録
    postUsersCommit: function({ state, getters, commit, rootState }, { data, successFunc, errorFunc, finallyFunc, router, cookie }) {
        axios
            .post('/api/v1/users/init_update', data, getConfig(state, getters, rootState, cookie))
            .then(response => successFunction(response, successFunc))
            .catch(error => errorFunction(error, errorFunc, commit, router))
            .finally(() => finallyFunction(finallyFunc));
    },
    // ログイン
    postLogin: function({ state, getters, commit, rootState }, { data, successFunc, errorFunc, finallyFunc, router, cookie }) {
        try {
            axios
            .post('/api/login', data, getConfig(state, getters, rootState, cookie))
            .then(response => successFunction(response, successFunc))
            .catch(error => errorFunction(error, errorFunc, commit, router))
            .finally(() => finallyFunction(finallyFunc));
        } catch (error2) {
            console.log("エラー内容:" + error2)
        }
    },
    // ログアウト
    postLogout: function({ state, getters, commit, rootState }, { successFunc, errorFunc, finallyFunc, router, cookie }) {
        axios
            .post('/api/logout', null, getConfig(state, getters, rootState, cookie))
            .then(response => successFunction(response, successFunc))
            .catch(error => errorFunction(error, errorFunc, commit, router))
            .finally(() => finallyFunction(finallyFunc));
    },
    // 2段階認証 (認証コード確認)
    postTwoFactorAuth: function({ state, getters, commit, rootState }, { data, successFunc, errorFunc, finallyFunc, router, cookie }) {
        axios
            .post('/api/auth', data, getConfig(state, getters, rootState, cookie))
            .then(response => successFunction(response, successFunc))
            .catch(error => errorFunction(error, errorFunc, commit, router))
            .finally(() => finallyFunction(finallyFunc));
    },
    // ユーザー情報
    getLoginUser: function({ state, getters, commit, rootState }, { successFunc, errorFunc, finallyFunc, router, cookie }) {
        axios
            .get('/api/v1/users/login', getConfig(state, getters, rootState, cookie))
            .then(response => successFunction(response, successFunc))
            .catch(error => errorFunction(error, errorFunc, commit, router))
            .finally(() => finallyFunction(finallyFunc));
    },
    // ADMINテスト
    getAdminOnly: function({ state, getters, commit, rootState }, { successFunc, errorFunc, finallyFunc, router, cookie }) {
        axios
            .get('/api/v1/users/admin_only', getConfig(state, getters, rootState, cookie))
            .then(response => successFunction(response, successFunc))
            .catch(error => errorFunction(error, errorFunc, commit, router))
            .finally(() => finallyFunction(finallyFunc));
    },
    // セキュリティ設定取得
    getSecurityInfo: function({ state, getters, commit, rootState }, { successFunc, errorFunc, finallyFunc, router, cookie }) {
        axios
            .get('/api/v1/users/security_info', getConfig(state, getters, rootState, cookie))
            .then(response => successFunction(response, successFunc))
            .catch(error => errorFunction(error, errorFunc, commit, router))
            .finally(() => finallyFunction(finallyFunc));
    },
    // セキュリティ情報変更チェック
    postSecurityUpdateCheck: function({ state, getters, commit, rootState }, { data, successFunc, errorFunc, finallyFunc, router, cookie }) {
        axios
            .post('/api/v1/users/check_update_security', data, getConfig(state, getters, rootState, cookie))
            .then(response => successFunction(response, successFunc))
            .catch(error => errorFunction(error, errorFunc, commit, router))
            .finally(() => finallyFunction(finallyFunc));
    },
    // セキュリティ情報変更
    putSecurityUpdate: function({ state, getters, commit, rootState }, { data, successFunc, errorFunc, finallyFunc, router, cookie }) {
        axios
            .put('/api/v1/users/update_security', data, getConfig(state, getters, rootState, cookie))
            .then(response => successFunction(response, successFunc))
            .catch(error => errorFunction(error, errorFunc, commit, router))
            .finally(() => finallyFunction(finallyFunc));
    },
}

export default {
    namespaced: true,
    state,
    actions
}
