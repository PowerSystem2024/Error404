<script setup>
import img1 from '/src/components/icons/c-sharp.svg';
import img2 from '/src/components/icons/typescript.svg';
import img3 from '/src/components/icons/sql-server.svg';
import img4 from '/src/components/icons/python.svg';
import img5 from '/src/components/icons/react-native.svg';
import img6 from '/src/components/icons/react.svg';
import img7 from '/src/components/icons/angular.svg';
import img8 from '/src/components/icons/node.svg';
import img9 from '/src/components/icons/dotnet.svg';
import img11 from '/src/components/icons/git.svg';
import img12 from '/src/components/icons/docker.svg';
import img13 from '/src/components/icons/spring.svg';
import img14 from '/src/components/icons/gitea.svg';
import img15 from '/src/components/icons/gitlab.svg';
import img17 from '/src/components/icons/mysql.svg';
import img18 from '/src/components/icons/postgres.svg';
import img19 from '/src/components/icons/arg.svg';
import img20 from '/src/components/icons/eeuu.svg';
import img21 from '/src/components/icons/aws.svg';
import img22 from '/src/components/icons/cloud_formation.svg';
import img23 from '/src/components/icons/dynamo.svg';
import img24 from '/src/components/icons/glue.svg';
import img25 from '/src/components/icons/lambda.svg';
import img26 from '/src/components/icons/pandas.svg';
import img27 from '/src/components/icons/s3.svg';
import img28 from '/src/components/icons/sf.svg';
import img29 from '/src/components/icons/spark.svg';

// Se importa ref de vue para poder usarlo
import { ref } from 'vue';

// Se crea un array de objetos con las habilidades
const habilidades = ref([
  {
    id: 1,
    nombre: 'Lenguajes de Programación',
    habilidades: [
      { id: 1, nombre: 'Python', nivel: 'Avanzado', icono: img4 }
    ]
  },
  {
    id: 2,
    nombre: 'Bases de Datos',
    habilidades: [
      { id: 1, nombre: 'SQL Server', nivel: 'Intermedio', icono: img3 },
      { id: 2, nombre: 'MySQL', nivel: 'Intermedio', icono: img17 },
      { id: 3, nombre: 'PostgreSQL', nivel: 'Intermedio', icono: img18 }
    ]
  },
  {
    id: 3,
    nombre: 'Frameworks y Librerías',
    habilidades: [
      { id: 1, nombre: 'Pandas', nivel: 'Avanzado', icono: img26 },
      { id: 2, nombre: 'PySpark', nivel: 'Avanzado', icono: img29 }
    ]
  },
  {
    id: 4,
    nombre: 'Herramientas',
    habilidades: [
      { id: 1, nombre: 'AWS', nivel: 'Intermedio', icono: img21 },
      { id: 2, nombre: 'Cloud Formation', nivel: 'Avanzado', icono: img22 },
      { id: 3, nombre: 'DynamoDB', nivel: 'Avanzado', icono: img23 },
      { id: 4, nombre: 'Glue', nivel: 'Intermedio', icono: img24 },
      { id: 5, nombre: 'Lambda', nivel: 'Intermedio', icono: img25 },
      { id: 4, nombre: 'S3', nivel: 'Intermedio', icono: img27 },
      { id: 5, nombre: 'Step Function', nivel: 'Intermedio', icono: img28 },
      { id: 5, nombre: 'Git', nivel: 'Intermedio', icono: img11 }
    ]
  },
  {
    id: 5,
    nombre: 'Idiomas',
    habilidades: [
      { id: 2, nombre: 'Inglés', nivel: 'B2', icono: img20 }
    ]
  }
]);
</script>

<template>
  <div class="skills-contenedor">
    <div v-for="categoria in habilidades" :key="categoria.id" class="skills-categoria">
      <h3>{{ categoria.nombre }}</h3>
      <ul class="skills">
        <li v-for="habilidad in categoria.habilidades" :key="habilidad.id" class="skill">
          <img :src="habilidad.icono" :alt="habilidad.nombre" />
          <span>{{ habilidad.nombre }}: {{ habilidad.nivel }}</span>
        </li>
      </ul>
    </div>
  </div>
</template>

<style scoped>
.skills-contenedor {
  padding: 2rem;
  background: linear-gradient(-45deg, #021526, #03346E, #6EACDA, #E2E2B6);
}

.skills-categoria {
  margin-bottom: 20px;
}

.skills-categoria h3 {
  display: flex;
  justify-content: left;
  margin-bottom: 10px;
  font-size: 1.5em;
  color: aliceblue;
  font-weight: bold;
}

.skills {
  display: flex;
  justify-content: space-evenly;
  flex-wrap: wrap;
  gap: 20px;
}

.skill {
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 10px;
  background-color: rgba(241, 245, 243, 0.856);
  padding: 0.3em;
  border-radius: 8px;
  box-shadow: 0px 4px 12px rgba(2, 151, 151, 0.963);
  flex: 1 1 200px;
  max-width: 250px;
}

.skill:hover {
  background-color: rgba(2, 151, 151, 0.963);
  font-size: 1.3em;
  transition: 2s ease;
}

.skill img {
  width: 35px;
  height: 35px;
}

.skill span {
  font-size: 1em;
  color: #333;
}

@media (max-width: 768px) {
  .skills-categoria h3 {
    justify-content: center;
  }
  .skill {
    justify-content: center;
  }
}
</style>
