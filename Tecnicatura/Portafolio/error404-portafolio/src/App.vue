<script setup>
import NavBar from './components/NavBar.vue';
import Educacion from './components/Educacion.vue';
import DatosPersonales from './components/DatosPersonales.vue';
</script>

<template>
    <header>
        <!--Barra de Navegacion-->
        <NavBar />
        <!--Componente Datos Personales-->    
        <DatosPersonales />
    </header>
    <main>
        <!--el estilo css de section se encuentra en base.css-->
        <section id="educacion"><h2>Educación - Cursos</h2>
        <Educacion />
        </section>
        <section id="experiencia"><h2>Experiencia</h2></section>
        <section id="proyectos"><h2>Proyectos</h2></section>
        <section id="habilidades"><h2>Habilidades</h2></section>
        <section id="intereses"><h2>Intereses</h2></section>
    </main>
</template>

<style scoped>

</style>