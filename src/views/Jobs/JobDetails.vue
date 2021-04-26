<template>
  <h1>Job with id: {{job.id}}</h1>
  <h1>And name: {{job.name}}</h1>
  <h1>And salary: {{job.salary}}</h1>

</template>

<script>
export default {
    props:['id'],

    data(){
        return{
            job:[]
        }
    },

    mounted(){
        fetch('http://localhost:8081/getJob?id=' + this.id)
        .then(res => res.json())
        .then(data => this.job = data)
        .catch(err => console.log(err.message))
    }
}
</script>

<style>

</style>