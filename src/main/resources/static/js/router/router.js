import Vue from 'vue'
import VueRouter from 'vue-router'
import MessageList from 'views/MessageList.vue'

Vue.use(VueRouter)

const routes = [
    {path: '/', component: MessageList},
    {path: '*', component: MessageList}
]

export default new VueRouter({
    mode: 'history',
    routes
})