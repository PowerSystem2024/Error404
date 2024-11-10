<template>
    <nav class="navbar">
        <div class="navbar-menu">
            <ul>
                <a v-for="nav in navegacion" :key="nav.nombre" :href="nav.enlace" class="nav-item">{{ nav.nombre }}</a>
            </ul>
        </div>
    </nav>
</template>

<script setup>
import { ref } from 'vue';
const navegacion = ref([
    { id: 1, nombre: 'Educación', enlace: '#educacion' },
    { id: 4, nombre: 'Habilidades', enlace: '#habilidades' },
    { id: 5, nombre: 'Intereses', enlace: '#intereses' },
    { id: 5, nombre: 'Proyectos', enlace: '#proyectos' }
]);
</script>

<style scoped>
.navbar {
    color: #fff;
    padding: 0.5rem 1rem;
    align-items: center;
}

.navbar-item {
    color: #fff;
    text-decoration: none;

}

.navbar-menu {
    display: flex;
    justify-content: center;
}

a {
    border: 3px solid;
    border-color: hsla(0, 0%, 96%, 0.861);
    border-radius: 5px;
    text-decoration: none;
    transition: 0.4s;
    padding: 5px;
    margin-right: 1rem;
    margin-left: 1rem;
}

a:hover {
    background-color: hsla(160, 100%, 37%, 0.2);
}

@media (max-width: 768px) {
    .navbar-menu {
        display: flex;
        justify-content: flex-end;
        width: 100%;
    }
}
</style>
