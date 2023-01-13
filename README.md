# Backend del trabajo integrado de #YoProgramo

## API

Dirección: https://back-yo-programo-production.up.railway.app/api/v1

- **GET** `/about-me`: Devuelve el texto de la sección "Sobre mí".
- **GET** `/contact`: Devuelve el texto de la sección contacto.
- **POST** `/auth/login`: Devuelve si y el usuario y la contraseña son correctos.
- **POST** `/update/about-me`: Actualiza el campo acerca de mí del usuario.
- **POST** `/update/contact`: Actualiza el campo contacto del usuario.
- **GET** `/projects`: Devuelve todos los proyectos.
- **POST** `/save/project`: Actualiza los datos de un proyecto.
- **POST** `/delete/project`: Elimina el proyecto.
- **GET** `/knowledges`: Devuelve todas las tecnologías practicadas.
- **POST** `/save/knowledge`: Actualiza los datos de una tecnología.
- **POST** `/delete/knowledge`: Elimina una tecnología.
