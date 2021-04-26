<template>
  <h1>App component</h1>
  <router-link :to="{name:'About'}">Link to about</router-link><br>
  <router-link :to="{name:'Home'}">Link to home component</router-link><br>

  <router-view></router-view>
</template>

<script>
export default {

}
</script>

<style>

</style>