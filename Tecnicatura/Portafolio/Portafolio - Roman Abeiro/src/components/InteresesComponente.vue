<script setup>
import { ref } from 'vue';

const intereses = ref([
    'Desarrollo de aplicaciones web',
    'Desarrollo móvil',
    'Inteligencia Artificial y Machine Learning',
    'Desarrollo en la nube',
    'Automatización de procesos'
]);
</script>

<template>
    <section class="intereses-contenedor">
        <div class="card">
            <h2>Mis Intereses</h2>
            <p>
                A lo largo de mi carrera, me he interesado especialmente en el desarrollo de aplicaciones web y móviles, utilizando tecnologías como JavaScript, Vue.js y Node.js. 
                Además, me apasiona aprender sobre inteligencia artificial y machine learning, y me gustaría contribuir al avance de estas tecnologías en el futuro. 
                Mi meta es continuar mejorando mis habilidades en la programación, mientras exploro nuevas áreas como el desarrollo de aplicaciones en la nube y la automatización de procesos(inventado).
            </p>
            <ul class="contenedor-lista">
                <li class="item" v-for="interes in intereses" :key="interes">
                    {{ interes }}
                </li>
            </ul>
        </div>
    </section>
</template>

<style scoped>

.intereses-contenedor {
    display: flex;
    border: 0px;
    justify-content: center;
    margin: 2rem auto;
    max-width: 85%;
    padding: 2rem;
    background-color: rgba(255, 255, 255, 0); 
    border-radius: 10px; 
}


.card {
    display: flex;
    flex-direction: column;
    align-items: center;
    text-align: center;
    padding: 1.5rem;
    max-width: 100%;
    background-color: rgba(255, 255, 255, 0.56);
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

h2 {
    font-size: 2rem;
    color: #333;
    margin-bottom: 1rem;
}

p {
    font-size: 1rem;
    color: #333;
    font-weight: 400;
    margin-bottom: 1.5rem;
    line-height: 1.6;
}

.contenedor-lista {
    list-style-type: none;
    padding: 0;
}

.item {
    font-size: 1.1rem;
    margin-bottom: 0.8rem;
    color: #333;
    font-weight: 500;
}

.item::before {
    content: "•";
    margin-right: 10px;
    color: #4caf50; 
    font-size: 1.3rem;
}

@media (max-width: 768px) {
    .intereses-contenedor {
        padding: 1rem;
        max-width: 90%;
    }

    .card {
        padding: 1rem;
    }
}
</style>