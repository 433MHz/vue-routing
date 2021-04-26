<template>
    <h1>About me</h1>
    {{name1}}
    {{age1}}

</template>

<script>
export default {
    setup(){
       var name = "Krystian"
       var age = 21

       return{ name1: name, age1: age}
    }
}
</script>

<style>

</style>