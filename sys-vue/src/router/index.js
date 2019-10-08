import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Hr from '@/components/system/Hr'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: '首页',
      component: Home,
      children: [
        {
          path: '/hr',
          name: '人员管理',
          component: Hr
        }
      ]
    }
  ]
})
