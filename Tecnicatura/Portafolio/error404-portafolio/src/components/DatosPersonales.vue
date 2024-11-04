<script setup>
import github from '/src/assets/github_icon.svg';

const title = 'Error404';
const descripcion = 'Equipo de Desarrollo Web Full Stack - UTN FRSR';
const residencia = 'Argentina';
const presentacion = 'Bienvenidos al portafolio de Error404, un equipo elite de desarrolladores web formados en la Universidad Tecnológica Nacional. Nos especializamos en crear soluciones digitales innovadoras que combinan diseño atractivo con funcionalidad robusta. Nuestro equipo domina las últimas tecnologías en desarrollo web y móvil, permitiéndonos ofrecer productos de alta calidad que satisfacen las necesidades específicas de cada cliente.';
const redesSociales = [
  { 
    id: 1, 
    name: 'Github', 
    src: github, 
    url: 'https://github.com/PowerSystem2024/Error404' 
  },
];
</script>

<template>
  <section class="datos-personales">
    <div class="card">
      <h1>{{ title }}</h1>
      <h2>{{ descripcion }}</h2>
      <p>{{ presentacion }}</p>
      <ul class="container-lista">
        <li v-for="red in redesSociales" :key="red.id">
          <a :href="red.url" target="_blank" rel="noopener noreferrer">
            <img class="icon-redsocial" :src="red.src" width="35rem" :alt="red.name">
          </a>
        </li>
      </ul>
      <div class="contacto">
        <h4>{{ residencia }}</h4>
      </div>
    </div>
  </section>
</template>

<style scoped>
h1 {
  font-size: 2.5rem;
  color: coral;
  margin-bottom: 0.5rem;
}

h2 {
  font-size: 1.5rem;
  color: burlywood;
  margin-bottom: 1.5rem;
}

p {
  font-size: 1.2rem;
  font-weight: 400;
  margin-bottom: 2rem;
  line-height: 1.6;
  max-width: 800px;
  margin-left: auto;
  margin-right: auto;
}

.card {
  background-color: rgb(28, 41, 52);
  border-radius: 15px;
  padding: 2.5rem;
  margin: 1rem;
  text-align: center;
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

.container-lista {
  display: flex;
  justify-content: center;
  gap: 1.5rem;
  list-style: none;
  padding: 0;
  margin: 0 0 2rem 0;
}

.icon-redsocial {
  align-items: center;
  background-color: aliceblue;
  border-radius: 50%;
  padding: 0.5rem;
  transition: all 0.3s ease;
  box-shadow: 0 0 5px rgba(95, 124, 205, 0.934);
}

.icon-redsocial:hover {
  background-color: rgb(28, 41, 52);
  box-shadow: 0 0 10px rgba(251, 249, 249, 0.934);
  transform: scale(1.1);
}

.contacto {
  border-top: 1px solid rgba(255, 255, 255, 0.1);
  padding-top: 1.5rem;
}

.contacto h4 {
  font-size: 1.2rem;
  color: burlywood;
  margin-bottom: 0.5rem;
}
</style>