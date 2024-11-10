<script setup>
import { ref } from 'vue';
import FondoLava from './FondoLava.vue';

const intereses = ref([
    'Innovación en Desarrollo de Software: Me apasiona crear soluciones tecnológicas con impacto positivos en las empresas',
    'Exploración al Aire Libre: Desde rutas de senderismo en montañas hasta recorridos en bicicleta por senderos desconocidos, me encanta descubrir nuevos paisajes y desafiar mis límites físicos y mentales.',
    'Avances Tecnológicos: Siempre a la vanguardia, disfruto aprender sobre servicios de computo en la nube de AWS, inteligencia artificial, machine learning y el impacto de las nuevas tecnologías en la vida cotidiana.'
]);

</script>

<template>
    <div class="intereses-contenedor">
        <FondoLava />
        <ul class="contenedor-lista">
            <li class="item" v-for="interes in intereses" :key="interes">
                {{ interes }}
            </li>
        </ul>
    </div>
</template>

<style scoped>
.intereses-contenedor {
    display: flex;
    position: relative;
    margin: 0 auto;
    max-width: 85%;
    padding: 1rem;
}

.contenedor-lista {
    list-style-type: none;
    padding: 1rem;
    margin-bottom: .5rem;
    color: var(--vt-c-white-soft);
    font-size: 1.4rem;
    text-shadow: 3px 3px 6px rgba(0, 0, 0, 1);
}

.item {
    margin-bottom: 1rem;
}
</style>
