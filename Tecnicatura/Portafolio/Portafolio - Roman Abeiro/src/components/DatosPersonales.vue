<script setup>
import instagram from '/src/assets/instagram_icon.svg';
import github from '/src/assets/github_icon.svg';

const title = 'Roman Abeiro';
const descripcion = 'Estudiante  Universitario en Programación - UTN';
const residencia = 'San Rafael, Mendoza, Argentina';
const presentacion = 'Hola, Bienvenido a mi portafolio de proyectos. Soy un estudiante de programacion de la UTN.';
const redesSociales = [
  { id: 2, name: 'Instagram', src: instagram, url: '' },
  { id: 3, name: 'github', src: github, url: '' },
];
const telefono = '+5444444444444 ';
</script>

<template>
  <section class="datos-personales">
    <div class="card">
      <h1>{{ title }}</h1>
      <h2>{{ descripcion }}</h2>
      <p>{{ presentacion }}</p>
      <ul class="container-lista">
        <li v-for="red in redesSociales" :key="red.id">
          <a :href="red.url"><img class="icon-redsocial" :src="red.src" width="35rem" :alt="red.name"></a>
        </li>
      </ul>
      <h3>☎ Mi Teléfono personal: {{ telefono }}</h3>
      <h4>{{ residencia }}</h4>
    </div>
  </section>
</template>

<style scoped>
h1, h2, h3, h4, p {
  color: rgb(36, 36, 36);
}

h1, h2, h3 {
  font-size: 2rem;
}

p {
  font-size: 1.2rem;
  font-weight: 600;
  margin-bottom: 1rem;
}

.card {
  background-color: rgba(255, 255, 255, 0.56);
  border-radius: 10px;
  padding: 10px;
  margin: 10px;
  text-align: center;
  box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
}

.container-lista {
  display: flex;
  justify-content: center;
  list-style: none;
  padding: 0;
  margin: 0;
  text-align: center;
}

.icon-redsocial {
  align-items: center;
  background-color: rgb(0, 0, 0);
  border-radius: 50%;
  padding: 1px;
  margin: 5px;
  box-shadow: 0 0 5px rgba(95, 124, 205, 0.564);
}

.icon-redsocial:hover {
  background-color: rgb(22, 106, 175);
  box-shadow: 0 0 5px rgba(251, 249, 249, 0.934);
}

h3 {
  font-size: 1.2rem;
  font-weight: 600;
}
</style>