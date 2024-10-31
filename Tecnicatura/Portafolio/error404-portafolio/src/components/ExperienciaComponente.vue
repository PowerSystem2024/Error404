<script setup>
import icono1 from '/src/assets/ventas.svg';
import icono2 from '/src/assets/ecomerce.svg';
import icono3 from '/src/assets/configuracion.svg';
import icono4 from '/src/assets/uiux.svg';
import icono5 from '/src/assets/watch.svg';

import { ref } from 'vue';
const titulo = 'Desarrolladores Full Stack';
const fecha = 'Desde Marzo 2024 / Actualidad';
const experiencias = ref([
    { 
        id: 1, 
        src: icono1, 
        parrafo: 'Somos un equipo multidisciplinario de 4 desarrolladores web especializados en diferentes áreas del desarrollo de software. Nuestra experiencia abarca todo el stack tecnológico, desde el desarrollo frontend para crear interfaces intuitivas y responsive, hasta la implementación de robustas soluciones backend, gestión eficiente de bases de datos y prácticas DevOps.' 
    },
    { 
        id: 2, 
        src: icono2, 
        parrafo: 'Desarrollo Frontend: Creamos interfaces modernas y experiencias de usuario excepcionales utilizando Vue.js, React y tecnologías web actuales. Nos enfocamos en diseños responsive y optimización del rendimiento.' 
    },
    { 
        id: 3, 
        src: icono3, 
        parrafo: 'Desarrollo Backend: Implementamos arquitecturas robustas y APIs escalables utilizando Java, Python y bases de datos SQL/NoSQL. Garantizamos la seguridad y eficiencia de nuestras soluciones.' 
    },
    { 
        id: 4, 
        src: icono4, 
        parrafo: 'Bases de Datos: Diseñamos y optimizamos estructuras de datos para garantizar un rendimiento óptimo y una gestión eficiente de la información, utilizando MongoDB, PostgreSQL y otras tecnologías según las necesidades del proyecto.' 
    },
    { 
        id: 5, 
        src: icono5, 
        parrafo: 'DevOps: Implementamos prácticas de integración y despliegue continuo (CI/CD), utilizando Docker y otras herramientas para automatizar procesos y garantizar deployments seguros y eficientes.' 
    },
]);
</script>

<template>
    <div class="card">
        <h3 class="titulo">{{ titulo.toLocaleUpperCase() }}</h3>
        <p class="fecha">{{ fecha }}</p>
        <ul class="listado">
            <li class="item" v-for="experencia in experiencias" :key="experencia.id">
                <img class="imagen-svg" :src="experencia.src" width="45rem" :alt="experencia.parrafo">
                <p>{{ experencia.parrafo }}</p>
            </li>
        </ul>
    </div>
</template>

<style scoped>
.card {
    display: flex;
    flex-direction: column;
    padding: 2rem;
    background-color: rgb(28, 41, 52);
    border-radius: 15px;
}

.titulo {
    font-size: 1.5rem;
    color: coral;
}

.fecha {
    font-size: 1rem;
    color: burlywood;
    margin-bottom: 1rem;
}

.listado {
    display: flex;
    flex-direction: column;
}

.item {
    align-items: center;
    display: flex;
    padding: 1rem;
    gap: 1.5rem;
}
</style>