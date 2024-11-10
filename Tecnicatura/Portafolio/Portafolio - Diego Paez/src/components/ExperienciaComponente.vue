<script setup>
import icono1 from '/src/assets/ventas.svg';
import icono2 from '/src/assets/ecomerce.svg';
import icono3 from '/src/assets/configuracion.svg';
import icono4 from '/src/assets/uiux.svg';
import icono5 from '/src/assets/watch.svg';

import { ref } from 'vue';

const experiencias = ref([
    {
        id: 1,
        titulo: '+DA Talend - Data Engineer',
        fecha: 'Octubre - Actualidad',
        src: icono1,
        parrafo: 'Soporte en el desarrollo y automatización de modelos de machine learning'
    },
    {
        id: 2,
        titulo: 'ARKHO - Data Engineer',
        fecha: 'Febrero 2024 - Septiembre 2024',
        src: icono2,
        parrafo: 'Desarrollo, mantenimiento y mejora de modelo de predicción de stock en AWS'
    },
    {
        id: 3,
        titulo: 'BBVA - Data Engineer',
        fecha: 'Julio 2023 - Febrero 2024',
        src: icono3,
        parrafo: 'Mantenimiento y monitoreo de procesos Bach de Big Data'
    },
    {
        id: 4,
        titulo: 'Seidor Analytics - Data Engineer',
        fecha: 'Enero 2020 - Julio 2022',
        src: icono4,
        parrafo: 'Desarrollo, orquestación y automatización de procesos ETL, diseño de DW y desarrollo de tableros de control'
    },
]);
</script>

<template>
    <div class="card" v-for="experiencia in experiencias" :key="experiencia.id">
        <h3 class="titulo">{{ experiencia.titulo.toLocaleUpperCase() }}</h3>
        <p class="fecha">{{ experiencia.fecha }}</p>
        <ul class="listado">
            <li class="item">
                <img class="imagen-svg" :src="experiencia.src" width="45rem" :alt="experiencia.parrafo">
                <p>{{ experiencia.parrafo }}</p>
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
    margin-bottom: 1rem;
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
