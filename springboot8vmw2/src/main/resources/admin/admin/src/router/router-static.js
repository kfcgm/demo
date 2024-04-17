import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import huifuxinxi from '@/views/modules/huifuxinxi/list'
    import discussjiancaishangpin from '@/views/modules/discussjiancaishangpin/list'
    import jiancaileixing from '@/views/modules/jiancaileixing/list'
    import zhuangxiutaocan from '@/views/modules/zhuangxiutaocan/list'
    import storeup from '@/views/modules/storeup/list'
    import xuangouxinxi from '@/views/modules/xuangouxinxi/list'
    import forum from '@/views/modules/forum/list'
    import yonghu from '@/views/modules/yonghu/list'
    import gongjiang from '@/views/modules/gongjiang/list'
    import jiancaishangpin from '@/views/modules/jiancaishangpin/list'
    import discusszhuangxiutaocan from '@/views/modules/discusszhuangxiutaocan/list'
    import orders from '@/views/modules/orders/list'
    import lianxixinxi from '@/views/modules/lianxixinxi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '资讯信息',
        component: news
      }
          ,{
	path: '/huifuxinxi',
        name: '回复信息',
        component: huifuxinxi
      }
          ,{
	path: '/discussjiancaishangpin',
        name: '建材商品评论',
        component: discussjiancaishangpin
      }
          ,{
	path: '/jiancaileixing',
        name: '建材类型',
        component: jiancaileixing
      }
          ,{
	path: '/zhuangxiutaocan',
        name: '装修套餐',
        component: zhuangxiutaocan
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/xuangouxinxi',
        name: '选购信息',
        component: xuangouxinxi
      }
          ,{
	path: '/forum',
        name: '交流论坛',
        component: forum
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/gongjiang',
        name: '工匠',
        component: gongjiang
      }
          ,{
	path: '/jiancaishangpin',
        name: '建材商品',
        component: jiancaishangpin
      }
          ,{
	path: '/discusszhuangxiutaocan',
        name: '装修套餐评论',
        component: discusszhuangxiutaocan
      }
          ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
          ,{
	path: '/lianxixinxi',
        name: '联系信息',
        component: lianxixinxi
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
