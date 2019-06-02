<template>
    <v-container>
        <v-layout>
            <v-flex>
                <add-message />
            </v-flex>
            <v-flex>
                <v-btn @click="onClean">Clean</v-btn>
            </v-flex>
        </v-layout>
        <v-layout v-for="message in messages.values()">
            <v-flex xs1>
                <b>{{message.id}}</b>
            </v-flex>
            <v-flex xs3>
                <i>{{message.text}}</i>
            </v-flex>
        </v-layout>
    </v-container>
</template>

<script>
    import AddMessage from './AddMessage.vue'

    export default {
        name: "MessageList",

        components: {
            AddMessage
        },

        data(){
            return {
                messages: []
            }
        },

        created() {
            return this.$resource('/message/list').get().then(result => result.json().then(data => this.messages = data))
        },

        methods: {
            onClean(){
                this.$resource('/message/clear').save().then()
                location.reload(true)
            }
        }
    }
</script>

<style scoped>

</style>