<template>
    <v-app>
        <v-toolbar>
            <v-toolbar-title>NetService</v-toolbar-title>
            <v-spacer></v-spacer>
            <div v-if="!profile">
                You must to authorize by
                <v-btn href="/login">Google</v-btn>
            </div>
            <div v-else>
                {{profile.name}}&nbsp;<v-btn href="/logout">Sign Out</v-btn>
            </div>
        </v-toolbar>
        <router-view v-if="profile"></router-view>
    </v-app>
</template>

<script>
    export default {
        name: "App",
        data() {
            return {
                profile: frontData.profile,
                messages: frontData.messages
            }
        }
    }
</script>

<style scoped>

</style>