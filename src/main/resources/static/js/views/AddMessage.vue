<template>
    <v-container>
        <v-layout>
            <v-flex>
                <v-text-field placeholder="Message..." :model="text"></v-text-field>
            </v-flex>
            <v-flex>
                <v-btn icon @click="onSend">
                    <v-icon>send</v-icon>
                </v-btn>
            </v-flex>
        </v-layout>
    </v-container>
</template>

<script>
    export default {
        name: "AddMessage",
        data(){
            return {
                text: ''
            }
        },

        methods: {
            onSend(){
                this.$resource('/message').save(this.text).then()
            }
        }
    }
</script>

<style scoped>

</style>