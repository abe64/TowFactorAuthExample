export default {
  items: [
    {
      name: 'ホーム',
      url: '/dashboard',
      icon: 'icon-speedometer',
      // badge: {
      //   variant: 'primary',
      //   text: 'NEW'
      // }
    },
    {
      title: true,
      name: '大項目',
      class: '',
      wrapper: {
        element: '',
        attributes: {}
      }
    },
    {
      name: 'メニュー01',
      url: '/theme/colors',
      icon: 'icon-drop'
    },
    {
      name: 'メニュー02',
      url: '/theme/typography',
      icon: 'icon-pencil'
    },
    {
      title: true,
      name: '大項目2',
      class: '',
      wrapper: {
        element: '',
        attributes: {}
      }
    },
    {
      name: 'メニュー11',
      url: '/base',
      icon: 'icon-puzzle',
      children: [
        {
          name: 'メニュー112',
          url: '/base/breadcrumbs',
          icon: 'icon-puzzle'
        },
        {
          name: 'メニュー113',
          url: '/base/cards',
          icon: 'icon-puzzle'
        },
        {
          name: 'メニュー114',
          url: '/base/carousels',
          icon: 'icon-puzzle'
        },
        {
          name: 'メニュー115',
          url: '/base/collapses',
          icon: 'icon-puzzle'
        },
        {
          name: 'メニュー116',
          url: '/base/forms',
          icon: 'icon-puzzle'
        },
        {
          name: 'メニュー117',
          url: '/base/jumbotrons',
          icon: 'icon-puzzle'
        },
        {
          name: 'メニュー118',
          url: '/base/list-groups',
          icon: 'icon-puzzle'
        },
        {
          name: 'メニュー119',
          url: '/base/navs',
          icon: 'icon-puzzle'
        },
        {
          name: 'メニュー1110',
          url: '/base/navbars',
          icon: 'icon-puzzle'
        },
        {
          name: 'メニュー1111',
          url: '/base/paginations',
          icon: 'icon-puzzle'
        },
        {
          name: 'メニュー1112',
          url: '/base/popovers',
          icon: 'icon-puzzle'
        },
        {
          name: 'メニュー1113',
          url: '/base/progress-bars',
          icon: 'icon-puzzle'
        },
        {
          name: 'メニュー1114',
          url: '/base/switches',
          icon: 'icon-puzzle'
        },
        {
          name: 'メニュー1115',
          url: '/base/tables',
          icon: 'icon-puzzle'
        },
        {
          name: 'メニュー1116',
          url: '/base/tabs',
          icon: 'icon-puzzle'
        },
        {
          name: 'メニュー1117',
          url: '/base/tooltips',
          icon: 'icon-puzzle'
        }
      ]
    },
    {
      name: 'メニュー12',
      url: '/buttons',
      icon: 'icon-cursor',
      children: [
        {
          name: 'メニュー121',
          url: '/buttons/standard-buttons',
          icon: 'icon-cursor'
        },
        {
          name: 'メニュー122',
          url: '/buttons/dropdowns',
          icon: 'icon-cursor'
        },
        {
          name: 'メニュー123',
          url: '/buttons/button-groups',
          icon: 'icon-cursor'
        },
        {
          name: 'メニュー124',
          url: '/buttons/brand-buttons',
          icon: 'icon-cursor'
        }
      ]
    },
    {
      name: 'メニュー13',
      url: '/charts',
      icon: 'icon-pie-chart'
    },
    {
      name: 'メニュー14',
      url: '/icons',
      icon: 'icon-star',
      children: [
        {
          name: 'メニュー141',
          url: '/icons/coreui-icons',
          icon: 'icon-star',
          badge: {
            variant: 'info',
            text: 'NEW'
          }
        },
        {
          name: 'メニュー142',
          url: '/icons/flags',
          icon: 'icon-star'
        },
        {
          name: 'メニュー143',
          url: '/icons/font-awesome',
          icon: 'icon-star',
          badge: {
            variant: 'secondary',
            text: '4.7'
          }
        },
        {
          name: 'メニュー144',
          url: '/icons/simple-line-icons',
          icon: 'icon-star'
        }
      ]
    },
    {
      name: 'メニュー15',
      url: '/notifications',
      icon: 'icon-bell',
      children: [
        {
          name: 'メニュー151',
          url: '/notifications/alerts',
          icon: 'icon-bell'
        },
        {
          name: 'メニュー152',
          url: '/notifications/badges',
          icon: 'icon-bell'
        },
        {
          name: 'メニュー153',
          url: '/notifications/modals',
          icon: 'icon-bell'
        }
      ]
    },
    {
      name: 'メニュー16',
      url: '/widgets',
      icon: 'icon-calculator',
      badge: {
        variant: 'primary',
        text: 'NEW'
      }
    },
    {
      divider: true
    },
    {
      title: true,
      name: 'その他'
    },
    {
      name: '各種ページ',
      url: '/pages',
      icon: 'icon-star',
      children: [
        {
          name: 'ログインページ',
          url: '/pages/login',
          icon: 'icon-star'
        },
        {
          name: '新規会員登録',
          url: '/pages/register',
          icon: 'icon-star'
        },
        {
          name: 'Error 404',
          url: '/pages/404',
          icon: 'icon-star'
        },
        {
          name: 'Error 500',
          url: '/pages/500',
          icon: 'icon-star'
        }
      ]
    },
    {
      name: '無効メニュー',
      url: '/dashboard',
      icon: 'icon-ban',
      badge: {
        variant: 'secondary',
        text: 'NEW'
      },
      attributes: { disabled: true },
    },
    // {
    //   name: 'Download CoreUI',
    //   url: 'http://coreui.io/vue/',
    //   icon: 'icon-cloud-download',
    //   class: 'mt-auto',
    //   variant: 'success',
    //   attributes: { target: '_blank', rel: 'noopener' }
    // },
    // {
    //   name: 'Try CoreUI PRO',
    //   url: 'http://coreui.io/pro/vue/',
    //   icon: 'icon-layers',
    //   variant: 'danger',
    //   attributes: { target: '_blank', rel: 'noopener' }
    // },
  ]
}
