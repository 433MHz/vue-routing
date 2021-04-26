<template>
  <h1>Jobs details</h1>

    <div v-for="job in jobs" :key="job.id" class="jobsDetails">
        <router-link :to="{name: 'JobDetails', params: {id:job.id}}" class="routerLink">
        <h3>{{job.name}}</h3>  <h2>Salary: {{job.salary}}</h2>
        </router-link>
    </div>
</template>

<script>
export default {
    data(){
        return{
            jobs:[]
        }
    },

    mounted(){
        fetch('http://localhost:8081/getJobs')
        .then(res => res.json())
        .then(data => this.jobs = data)
        .catch(err => console.log(err.message))
    }
}
</script>

<style scoped>
    .jobsDetails{
        border: solid 3px chocolate;
        border-radius: 15px;
        width: 40%;
        margin: auto;
        margin-bottom: 5px;
    }

    .jobsDetails:hover{
        background-color: chocolate;
        cursor: pointer;
    }
    .routerLink{
        color: black;
        text-decoration: none;
    }
    
</style>