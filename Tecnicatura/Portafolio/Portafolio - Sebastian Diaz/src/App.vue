<script setup>
import NavBar from './components/NavBar.vue';
import DatosPersonales from './components/DatosPersonales.vue';
import EducacionComponente from './components/EducacionComponente.vue';
import ExperienciaComponente from './components/ExperienciaComponente.vue';
import ProyectosComponente from './components/ProyectosComponente.vue';
import HabilidadesComponente from './components/HabilidadesComponente.vue';
import InteresesComponente from './components/InteresesComponente.vue';
</script>

<template>
<header>
    <!-- Barra de Navegacion-->
    <NavBar />
    <!-- Componente Datos Personales-->
    <DatosPersonales />
   
</header>  
<main>
    <!-- El estillo css de edicion se encuentra en base.css-->
    <section id="educacion"><h2>Educacion - Cursos </h2></section>
    <EducacionComponente />
    <section id="experiencia"><h2>Experiencia </h2></section>
    <ExperienciaComponente />
    <section id="Proyectos"><h2>Proyectos </h2></section>
    <ProyectosComponente />
    <section id="Habilidades"><h2>Habilidades </h2></section>
    <HabilidadesComponente />
    <section id="Intereses"><h2>Intereses </h2></section>
    <InteresesComponente />
</main>

<footer>
    <a href="#top">Inicio</a>
    <p>ⓢ 2024 Sebastian Diaz</p>
</footer>
</template>

<style scoped>

</style>
