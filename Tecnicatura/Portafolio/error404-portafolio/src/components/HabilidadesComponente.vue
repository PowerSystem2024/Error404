<script setup>
import img1 from '/src/components/icons/js.svg';
import img2 from '/src/components/icons/python.svg';
import img3 from '/src/components/icons/html-css.svg';
import img4 from '/src/components/icons/java.svg';
import img5 from '/src/components/icons/sql.svg';
import img6 from '/src/components/icons/react.svg';
import img7 from '/src/components/icons/vue.svg';
import img9 from '/src/components/icons/django.svg';
import img11 from '/src/components/icons/git.svg';
import img12 from '/src/components/icons/docker.svg';
import img15 from '/src/components/icons/visual.svg';
import img17 from '/src/components/icons/mysql.svg';
import img18 from '/src/components/icons/postgres.svg';

import { ref } from 'vue';

const habilidades = ref([
    {
        id: 1, 
        nombre: 'Lenguajes de Programación', 
        habilidades: [
            { id: 1, nombre: 'JavaScript', nivel: 'Medio', icono: img1 },
            { id: 2, nombre: 'Python', nivel: 'Medio', icono: img2 },
            { id: 3, nombre: 'HTML/CSS', nivel: 'Medio', icono: img3 },
            { id: 4, nombre: 'Java', nivel: 'Medio', icono: img4 },
            { id: 5, nombre: 'SQL', nivel: 'Medio', icono: img5 }
        ]
    },
    {
        id: 2, 
        nombre: 'Frameworks y Tecnologías', 
        habilidades: [
            { id: 1, nombre: 'React.js', nivel: 'Medio', icono: img6 },
            { id: 2, nombre: 'Vue.js', nivel: 'Medio', icono: img7 },
            { id: 4, nombre: 'Django', nivel: 'Medio', icono: img9 }
        ]
    },
    {
        id: 3, 
        nombre: 'DevOps y Herramientas', 
        habilidades: [
            { id: 1, nombre: 'Git', nivel: 'Medio', icono: img11 },
            { id: 2, nombre: 'Docker', nivel: 'Medio', icono: img12 },
            { id: 3, nombre: 'VS Code', nivel: 'Medio', icono: img15 }
        ]
    },
    {
        id: 4, 
        nombre: 'Bases de Datos', 
        habilidades: [
            { id: 1, nombre: 'MySQL', nivel: 'Medio', icono: img17 },
            { id: 2, nombre: 'PostgreSQL', nivel: 'Medio', icono: img18 }
        ]
    }
]);
</script>

<template>
    <div class="skills-contenedor">
        <div v-for="habilidad in habilidades" :key="habilidad.id" class="skills-categoria">
            <h3>{{ habilidad.nombre }}</h3>
            <ul class="skills">
                <li v-for="skill in habilidad.habilidades" 
                    :key="skill.id" 
                    class="skill">
                    <img :src="skill.icono" :alt="skill.nombre">
                    <span>{{ skill.nombre }}: {{ skill.nivel }}</span>
                </li>
            </ul>
        </div>
    </div>
</template>

<style scoped>
.skills-contenedor {
    padding: 2rem;
    background: linear-gradient(-45deg, #021526, #03346E, #6EACDA, #E2E2B6);
    border-radius: 15px;
}

.skills-categoria {
    margin-bottom: 2rem;
}

.skills-categoria h3 {
    display: flex;
    justify-content: left;
    margin-bottom: 1.5rem;
    font-size: 1.5rem;
    color: aliceblue;
    font-weight: bold;
    text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3);
}

.skills {
    display: flex;
    justify-content: flex-start;
    flex-wrap: wrap;
    gap: 1.5rem;
}

.skill {
    display: flex;
    justify-content: flex-start;
    align-items: center;
    gap: 1rem;
    background-color: rgba(241, 245, 243, 0.9);
    padding: 0.8rem 1.2rem;
    border-radius: 8px;
    box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2);
    flex: 1 1 200px;
    max-width: 250px;
    transition: all 0.3s ease;
}

.skill:hover {
    background-color: rgba(2, 151, 151, 0.9);
    transform: translateY(-3px);
}

.skill img {
    width: 35px;
    height: 35px;
}

.skill span {
    font-size: 1rem;
    color: #333;
    font-weight: 500;
}

.skill:hover span {
    color: white;
}

@media (max-width: 768px) {
    .skills-categoria h3 {
        justify-content: center;
    }

    .skills {
        justify-content: center;
    }

    .skill {
        justify-content: center;
    }
}
</style>