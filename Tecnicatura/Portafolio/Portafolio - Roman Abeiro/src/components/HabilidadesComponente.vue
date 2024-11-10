<script setup>
import img1 from '/src/components/icons/js.svg';
import img2 from '/src/components/icons/python.svg';
import img3 from '/src/components/icons/html-css.svg';
import img4 from '/src/components/icons/java.svg';
import img5 from '/src/components/icons/sql.svg';
import img7 from '/src/components/icons/vue.svg';
import img8 from '/src/components/icons/node.svg';
import img10 from '/src/components/icons/bootstrap.svg';
import img11 from '/src/components/icons/git.svg';
import img15 from '/src/components/icons/visual.svg';
import img17 from '/src/components/icons/mysql.svg';
import img18 from '/src/components/icons/postgres.svg';
import img19 from '/src/components/icons/arg.svg';
import img20 from '/src/components/icons/eeuu.svg';
import img21 from '/src/components/icons/photoshop.svg'; 
import img22 from '/src/components/icons/davinci.svg';      
import img23 from '/src/components/icons/arduino.svg'; 


import { ref } from 'vue';

const habilidades = ref([
    {
        id: 1, nombre: 'Lenguajes de Programación', habilidades: [
            { id: 1, nombre: 'JavaScript', nivel: 'Avanzado', icono: img1 },
            { id: 2, nombre: 'Python', nivel: 'Intermedio', icono: img2 },
            { id: 3, nombre: 'HTML/CSS', nivel: 'Avanzado', icono: img3 },
            { id: 4, nombre: 'Java', nivel: 'Intermedio', icono: img4 },
            { id: 5, nombre: 'SQL', nivel: 'Intermedio', icono: img5 },
            { id: 23, nombre: 'Arduino', nivel: 'Intermedio', icono: img23 }
        ]
    },
    {
        id: 2, nombre: 'Frameworks', habilidades: [          
            { id: 7, nombre: 'Vue.js', nivel: 'Basico', icono: img7 },
            { id: 8, nombre: 'Node.js', nivel: 'Basico', icono: img8 },
            { id: 10, nombre: 'Bootstrap', nivel: 'Intermedio', icono: img10 }
        ]
    },
    {
        id: 3, nombre: 'Herramientas', habilidades: [
            { id: 11, nombre: 'Git', nivel: 'Intermedio', icono: img11 },
            { id: 15, nombre: 'Visual Studio Code', nivel: 'Avanzado', icono: img15 },
            { id: 21, nombre: 'Photoshop', nivel: 'Intermedio', icono: img21 },
            { id: 22, nombre: 'DaVinci Resolve', nivel: 'Básico', icono: img22 },
        ]
    },
    {
        id: 4, nombre: 'Bases de Datos', habilidades: [
            { id: 17, nombre: 'MySQL', nivel: 'Basico', icono: img17 },
            { id: 18, nombre: 'PostgreSQL', nivel: 'Básico', icono: img18 }
        ]
    },
    {
        id: 5, nombre: 'Idiomas', habilidades: [
            { id: 19, nombre: 'Español', nivel: 'Nativo', icono: img19 },
            { id: 20, nombre: 'Inglés', nivel: 'Intermedio', icono: img20 }
        ]
    }
]);
</script>

<template>
    <div class="habilidades">
        <div class="habilidad" v-for="habilidad in habilidades" :key="habilidad.id">
            <h3>{{ habilidad.nombre }}</h3>
            <div class="habilidad-items">
                <div class="habilidad-item" v-for="item in habilidad.habilidades" :key="item.id">
                    <img :src="item.icono" :alt="item.nombre" class="icono-habilidad" />
                    <p>{{ item.nombre }} - <span>{{ item.nivel }}</span></p>
                </div>
            </div>
        </div>
    </div>
</template>

<style scoped>
.habilidades {
    background-color: rgba(255, 255, 255, 0.56);
    display: flex;
    flex-direction: column;
    gap: 2rem;
    border-radius: 10px; 
    padding: 1rem;
    box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
    color: black; 
    font-size: 0.7rem;
}
h3{
    color: black;
    text-align: center;
    font-weight: bold;
    font-size: 1rem;
}
.habilidad {
    display: flex;
    flex-direction: column;
    gap: 1rem;
}

.habilidad-items {
    display: grid;
    grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));
    gap: 1rem;
}

.habilidad-item {
    display: flex;
    align-items: center;
    gap: 1rem;
    border-radius: 10px;
    transition: background-color 0.3s ease,padding 0.3s ease;
}

.icono-habilidad {
    width: 40px;
    height: 40px;
}
.habilidad-item:hover {
  background-color: #e4e4e4;
  padding: 5px;
}

span {
    font-weight: bold;
}
</style>
