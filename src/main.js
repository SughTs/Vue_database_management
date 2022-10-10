import Vue from 'vue'
import ElementUI from 'element-ui'
import App from './App.vue'
import router from './router'
import 'element-ui/lib/theme-chalk/index.css'
import '@/assets/global.css'

Vue.config.productionTip = false

Vue.use(ElementUI);

new Vue({
  router,
  el: '#app',
  render: h => h(App)
}).$mount('#app')

