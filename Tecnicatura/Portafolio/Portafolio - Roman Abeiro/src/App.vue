<script setup>
import NavBar from './components/NavBar.vue';
import DatosPersonales from './components/DatosPersonales.vue';
import Educacion from './components/EducacionComponente.vue';
import HabilidadesComponente from './components/HabilidadesComponente.vue';
import InteresesComponente from './components/InteresesComponente.vue';
import ProyectosComponente from './components/ProyectosComponente.vue';

</script>

<template>
    <header id="top">
        <!-- Barra de Navegación -->
        <NavBar />
        <!-- Componente Datos Personales -->
        <DatosPersonales />
    </header>
    <main>
        <section id="educacion">
            <h2>Educación - Cursos</h2>
            <!-- Componente Educación -->
            <Educacion />
        </section>
    
        <section id="habilidades">
            <h2>Habilidades</h2>
            <!-- Componente Habilidades -->
            <HabilidadesComponente />
        </section>
        <section id="proyectos">
          <h2>proyectos</h2>
          <ProyectosComponente />   

        </section>
        <section id="intereses">
            <!-- Componente Intereses -->
            <InteresesComponente />
        </section>
    </main>
    <footer>
        <a href="#top">Inicio</a>
        <p>© 2024 Juan Roman Abeiro - Portafolio web - UTN FRSR</p>
    </footer>
</template>

<style scoped>
#app {
  margin: 0;
  height: 100vh;
  background: linear-gradient(45deg, #00856F, #274C77, #00A9A5, #00856F);
  background-size: 400% 400%; /* Hace que el gradiente cubra más espacio */
  animation: gradient-animation 10s ease infinite; /* Animación del gradiente */
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
  font-family: Arial, sans-serif; /* Fuente de la página */
  color: white; /* Cambiar el color del texto a blanco para hacerlo visible */
}

/* Animación de marea */
@keyframes gradient-animation {
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
footer {
    display: flex;
    flex-direction: column;
    align-items: center;
    padding: 2rem;
    font-size: 1.3rem;
}
</style>
