import Vue from 'vue'
import VueResource from 'vue-resource'
import App from './App.vue'
import router from 'router/router'
import Vuetify from 'vuetify'
import 'vuetify/dist/vuetify.min.css'

Vue.use(Vuetify)
Vue.use(VueResource)

Vue.config.productionTip = false

new Vue({
    el: "#app",
    router,
    render: a => a(App)
})