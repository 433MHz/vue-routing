<template>
<div>
  <router-link :to="{name: 'Home'}" class="routerLink">Home</router-link> 
  <div class="border"></div>
  <router-link :to="{name: 'About'}" class="routerLink">About</router-link> 
  <div class="border"></div>
  <router-link to="/jobs/66" class="routerLink">Jobs</router-link><br>

  <router-view></router-view>

</div>
</template>

<script>
export default {

}
</script>

<style>
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