<template>
    <AppHeader fixed>
      <SidebarToggler class="d-lg-none" display="md" mobile />
      <b-link class="navbar-brand" to="#">
        <img class="navbar-brand-full" src="/img/sharecrest_logo.svg" width="110" height="25" alt="Sharecrest Logo">
        <img class="navbar-brand-minimized" src="/img/sharecrest_logo.svg" width="30" height="30" alt="Sharecrest Logo">
      </b-link>
      <SidebarToggler class="d-md-down-none" display="lg" :defaultOpen=true />
      <!-- <b-navbar-nav class="d-md-down-none">
        <b-nav-item class="px-3" to="/dashboard">Dashboard</b-nav-item>
        <b-nav-item class="px-3" to="/users" exact>Users</b-nav-item>
        <b-nav-item class="px-3">Settings</b-nav-item>
      </b-navbar-nav> -->
      <b-navbar-nav class="ml-auto">
        <template v-if="isAuthorization">
          <b-nav-item class="d-md-down-none">
            <i class="icon-bell"></i>
            <b-badge pill variant="danger">5</b-badge>
          </b-nav-item>
          <!-- <b-nav-item class="d-md-down-none">
            <i class="icon-list"></i>
          </b-nav-item>
          <b-nav-item class="d-md-down-none">
            <i class="icon-location-pin"></i>
          </b-nav-item> -->
          <DefaultHeaderDropdownAccnt/>
        </template>
        <template v-else>
          <router-link to="/pages/login">
            <b-button pill variant="outline-info" size="sm" style="margin-right: 10px;">ログイン</b-button>
          </router-link>
        </template>
      </b-navbar-nav>
      <!-- <AsideToggler class="d-none d-lg-block" /> Aサイドメニューいらないので削除-->
      <!--<AsideToggler class="d-lg-none" mobile />-->
    </AppHeader>
</template>
<script>
import { Header as AppHeader, SidebarToggler, AsideToggler } from '@coreui/vue'
import DefaultHeaderDropdownAccnt from './DefaultHeaderDropdownAccnt'

export default {
  name: 'DefaultHeader',
  components: {
    AsideToggler,
    AppHeader,
    DefaultHeaderDropdownAccnt,
    SidebarToggler
  },
  computed: {
    isAuthorization: function() {
      return this.$store.state.isAuthorization;
    }
  }
}
</script>
