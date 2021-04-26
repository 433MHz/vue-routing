<template>
<div>
  <router-link :to="{name: 'Home'}" class="routerLink">Home</router-link> 
  <div class="border"></div>
  <router-link :to="{name: 'About'}" class="routerLink">About</router-link> 
  <div class="border"></div>
  <router-link to="/jobs" class="routerLink">Jobs</router-link><br>

  <button @click="redirect">Main page</button>
  <button @click="goBack">Back</button>
  <button @click="goForward">Forward</button>

  <router-view></router-view>

</div>
</template>

<script>
export default {
  methods:{
    redirect(){
      this.$router.push({name: 'Home'})
    },

    goBack(){
      this.$router.go(-1)
    },

    goForward(){
      this.$router.go(1)
    }
  }
}
</script>

<style scoped>
  .router-link-active{
    padding: 10px;
    background-color: chocolate;
    border-radius: 10px;
    font-size: 30px;
    text-decoration: none;
    color: black;
    margin: 5px;
    display: inline-block;
  }

  .routerLink{
    padding: 10px;
    font-size: 30px;
    text-decoration: none;
    color: black;
    margin: 5px;
    display: inline-block;
  }

  .border{
    display: inline-block;
    border-right: 2px black solid;
    height: 20px;
    margin-bottom: -2px;
  }
</style>