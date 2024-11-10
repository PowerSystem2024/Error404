<script setup>
import proyecto1 from '/src/assets/punto_venta.png';
import proyecto2 from '/src/assets/microservices.png';
import proyecto3 from '/src/assets/crud.png';
import proyecto4 from '/src/assets/ecommers.png';
import proyecto5 from '/src/assets/games_auth.png';

import { ref } from 'vue';

const misProyectos = ref([
    {
        id: 1,
        src: proyecto1,
        titulo: "Sistema de Punto de Venta",
        descripcion: "Aplicación para la gestión de ventas desarrollada en TypeScript con Angular y Node.js, incluyendo un backend robusto y una interfaz de usuario intuitiva.",
        proyectoLink: "https://www.google.com.ar",
        githubLink: "https://github.com/LucOrt91/punto_venta"
    },
    {
        id: 2,
        src: proyecto2,
        titulo: "Demo de Microservicios en Java",
        descripcion: "Ejemplo de microservicios utilizando Spring Boot y Eureka Server para gestión de servicios y escalabilidad.",
        proyectoLink: "https://www.google.com.ar",
        githubLink: "https://github.com/LucOrt91/JavaMicroservicesDemo"
    },
    {
        id: 3,
        src: proyecto3,
        titulo: "CRUD Completo con Angular y Node",
        descripcion: "Aplicación CRUD creada con Angular, Node.js y Sequelize para gestionar datos en una base de datos MySQL.",
        proyectoLink: "https://www.google.com.ar",
        githubLink: "https://github.com/LucOrt91/CRUD-ANGULAR-NODE-EXPRESS-TYPESCRIPT-SEQUELIZE-MYSQL"
    },
    {
        id: 4,
        src: proyecto4,
        titulo: "E-commerce con Microservicios en Java",
        descripcion: "Backend de e-commerce desarrollado en Java utilizando arquitectura de microservicios, con varias bases de datos.",
        proyectoLink: "https://www.google.com.ar",
        githubLink: "https://github.com/LucOrt91/Ecommers-Java-Microservice"
    },
    {
        id: 5,
        src: proyecto5,
        titulo: "API de Autenticación para Juegos",
        descripcion: "API de autenticación para juegos desarrollada con Spring Boot y Spring Security, implementando JWT y conexión a MySQL.",
        proyectoLink: "https://www.google.com.ar",
        githubLink: "https://github.com/LucOrt91/DemoVeinsOfGames"
    }
]);
</script>

<template>
    <div class="galeria">
        <li class="proyecto" v-for="proyecto in misProyectos" :key="proyecto.id">
            <img :src="proyecto.src" :alt="proyecto.titulo">
            <div class="proyecto-info">
                <h3>{{ proyecto.titulo }}</h3>
                <p>{{ proyecto.descripcion }}</p>
                <div class="proyecto-links">
                    <a :href="proyecto.proyectoLink" class="btn-ver-mas" target="_blank" rel="noopener noreferrer">Ver Proyecto</a>
                    <a :href="proyecto.githubLink" class="github-link" target="_blank" rel="noopener noreferrer">Ver Código en GitHub</a>
                </div>
            </div>
        </li>
    </div>
</template>

<style scoped>
.galeria {
    width: 100%;
    height: 100%;
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
    padding: 20px;
    justify-content: center;
    background: linear-gradient(-45deg, #021526, #03346E, #6EACDA, #E2E2B6);
    background-size: 400% 400%;
    animation: gradient 15s ease infinite;
}

@keyframes gradient {
    0% {
        background-position: 0% 50%;
    }
    50% {
        background-position: 100% 50%;
    }
    100% {
        background-position: 0% 50%;
    }
}

.proyecto {
    display: flex;
    flex-direction: column;
    border: 2px solid #ddd;
    border-radius: 8px;
    overflow: hidden;
    background-color: #f9f9f9;
    max-width: 222px;
    flex: 1 1 300px;
}

.proyecto img {
    width: 100%;
    height: auto;
    display: block;
}

.proyecto-info {
    padding: 15px;
    text-align: center;
}

.proyecto-info h3 {
    margin: 10px 0;
    font-size: 1.3em;
    color: #333;
}

.proyecto-info p {
    margin: 10px 0;
    font-size: 1em;
    color: #666;
}

.proyecto-links {
    display: flex;
    flex-direction: column;
    gap: 10px;
    margin-top: 30px;
}

.proyecto-links .btn-ver-mas {
    background-color: #007BFF;
    color: #fff;
    padding: 10px 15px;
    border-radius: 5px;
    text-decoration: none;
    transition: background-color 0.3s;
    margin-top: 1rem;
}

.proyecto-links .btn-ver-mas:hover {
    background-color: #0056b3;
}

.proyecto-links .github-link {
    color: #333;
    text-decoration: none;
    font-size: 0.9em;
}

.proyecto-links .github-link:hover {
    text-decoration: underline;
}
</style>
