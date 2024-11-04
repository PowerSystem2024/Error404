# Comandos Git

Lista de comandos de Git vistos en clase ordenados de manera lógica, con una breve descripción de lo que hace cada uno.

## 1. Inicialización y Clonación

### `git clone <url_del_repositorio>`
Clona un repositorio remoto a tu máquina local, descargando todos los archivos y el historial de cambios.

## 2. Gestión de Remotos

### `git remote`
Muestra o gestiona los remotos (repositorios asociados).

### `git remote -v`
Lista los remotos actuales con sus URLs (generalmente muestra `origin`).

## 3. Actualización del Repositorio

### `git fetch`
Obtiene los últimos cambios desde el remoto, pero no los fusiona en tu rama de trabajo actual.

### `git pull`
Descarga y fusiona los cambios desde el remoto a tu rama actual en un solo paso. Es equivalente a hacer `git fetch` seguido de `git merge`.

## 4. Estado del Repositorio

### `git status`
Muestra el estado actual de los archivos en el repositorio. Te indica qué archivos han sido modificados, agregados o eliminados, y si están preparados para ser confirmados (`staged`).

## 5. Agregar Cambios

### `git add <archivo>`
Agrega cambios de un archivo específico al área de preparación (staging area) para ser confirmados. También se puede usar `git add .` para agregar todos los archivos modificados.

## 6. Confirmar Cambios

### `git commit -m "mensaje"`
Confirma los cambios agregados al área de preparación con un mensaje descriptivo.

### `git commit --amend`
Modifica el último commit, permitiendo corregir el mensaje o agregar archivos que se olvidaron en la confirmación anterior.

## 7. Fusiones y Resolución de Conflictos

### `git merge <rama>`
Fusiona los cambios de la rama especificada en la rama actual. Puede generar conflictos si los mismos archivos han sido modificados en ambas ramas.

## 8. Ramas

### `git branch`
Muestra las ramas disponibles o crea una nueva rama. Para crear una rama, usá `git branch <nombre_de_rama>`.

### `git checkout <rama>`
Cambia a la rama especificada. También se puede usar para restaurar archivos individuales a un estado anterior.

### `git checkout -b <nueva_rama>`
Crea una nueva rama y cambia a ella en un solo paso.

## 9. Deshacer Cambios

### `git reset <archivo>`
Quita un archivo del área de preparación sin eliminar los cambios del disco.

### `git reset --hard`
Vuelve el repositorio al estado del último commit, eliminando todos los cambios no confirmados. **¡Hay que tener cuidado!** Se pierden los cambios definitivamente.

## 10. Etiquetas (Tags)

### `git tag <nombre_etiqueta>`
Crea una etiqueta para marcar un commit específico, por ejemplo, para versiones de un proyecto.

### `git push origin <nombre_etiqueta>`
Envía una etiqueta al repositorio remoto.

## 11. Historial

### `git log`
Muestra el historial de commits en la rama actual, con detalles como el autor, la fecha y el mensaje de cada commit.

### Variantes de `git log`:
- `git log --oneline`: Muestra cada commit en una sola línea, con el hash abreviado y el mensaje de commit.
- `git log --graph`: Muestra un gráfico ASCII con la estructura del historial de ramas y fusiones.
- `git log --decorate`: Añade información sobre ramas y etiquetas al log.
- `git log --stat`: Muestra estadísticas de los cambios en cada commit (líneas agregadas/eliminadas).
- `git log --pretty=format:"%h - %an, %ar : %s"`: Personaliza el formato del log mostrando el hash abreviado (`%h`), el autor (`%an`), el tiempo relativo (`%ar`), y el mensaje del commit (`%s`).
- `git log --since="2 weeks ago"`: Muestra solo los commits realizados desde una fecha o período específicos.
- `git log --author="nombre_del_autor"`: Filtra los commits por autor.
- `git log --name-only`: Muestra los archivos modificados en cada commit sin detalles adicionales.
- `git log --patch`: Muestra los cambios específicos realizados en cada commit (un diff por commit).