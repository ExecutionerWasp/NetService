<template>
    <v-app>
        <v-toolbar>
            <v-toolbar-title>NetService</v-toolbar-title>
            <v-spacer></v-spacer>
            <v-btn>Sign In</v-btn>
            <v-btn>Sign Up</v-btn>
        </v-toolbar>
        <router-view></router-view>
    </v-app>
</template>

<script>
    export default {
        name: "App"
    }
</script>

<style scoped>

</style>