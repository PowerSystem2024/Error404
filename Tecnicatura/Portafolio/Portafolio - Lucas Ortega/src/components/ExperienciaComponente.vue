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
        titulo: 'Desarrollador Backend en FonteSoft', 
        fecha: 'Octubre 2024 - Actualidad', 
        src: icono1, 
        parrafo: 'Desarrollé soluciones backend en un entorno remoto, contribuyendo a la arquitectura de software y optimización de la base de datos.'
    },
    { 
        id: 2, 
        titulo: 'Data Entry / Administrativo Técnico en Hospital Central de Mendoza', 
        fecha: 'Septiembre 2024', 
        src: icono2, 
        parrafo: 'Gestión y actualización de bases de datos de equipamiento médico, documentación técnica y mantenimiento de registros en software especializado.' 
    },
    { 
        id: 3, 
        titulo: 'Desarrollador Backend en DESTORED', 
        fecha: 'Marzo 2024 - Mayo 2024', 
        src: icono3, 
        parrafo: 'Desarrollo de API RESTful con Node.js, Express.js y PostgreSQL, incluyendo autenticación JWT y ORM Sequelize para manejo de datos eficiente.' 
    },
    { 
        id: 4, 
        titulo: 'Desarrollador Full Stack en Quinto Impacto', 
        fecha: 'Noviembre 2023 - Enero 2024', 
        src: icono4, 
        parrafo: 'Desarrollo full-stack con React y Spring Boot, implementación de API RESTful y autenticación OAuth 2.0.' 
    },
    { 
        id: 5, 
        titulo: 'Desarrollador Full Stack en Colsa S.A.', 
        fecha: 'Marzo 2023 - Septiembre 2024', 
        src: icono5, 
        parrafo: 'Desarrollo de aplicaciones web con C# y .NET 7.0, APIs RESTful, aplicaciones móviles con React Native, y uso de Docker y CI/CD.' 
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
