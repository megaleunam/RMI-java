# RMI-java
Implementacion de Corba RMI en java
<p align="center">

  <h3 align="center">Implementación de CORBA RMI en java</h3>

</p>

## Table of contents

- [Requerimientos](#requerimientos)
- [Documentation](#documentation)
- [Quick start](#quick-start)

## Requerimientos

- JDK de java, hemos usado la versión: `jdk1.8.0_144`
- idlj

## Quick start
- Clonar el repositorio : `git clone https://github.com/megaleunam/RMI-java.git`.
- Para el uso del lenguaje de definición de interfaz (IDL) en java es necesario usar idlj el cual viene incluído en el JDK de java para empezar debemos tener instalado el JDK de java, e incluir en las variables de entorno la dirección del idlj que se encuentra en `C:\Program Files\Java\{{JDK versión}}\bin`. 
- Ubicado en el directorio raíz del proyecto abrimos la consola y ejecutamos: >`idlj -fall ClienteRemoto.idl`, este comando creará un directorio con el nombre del archivo idl: `ClienteRemoto`, el cual contendrá las clases generadas a partir del archivo idl las cualés son necesarias para la implementación del objeto.
- `ClienteRemImpl.java` es una extensión del archivo: `ClienteRemPOA` ubicado en el directorio generado por el `idlj`
- Ejecutar `javac *.java` para compilar los archivos java incluyendo los archivos del repositorio: `ClienteRemoto`.
- En una terminal nueva ejecutar: `orbd -ORBInitialPort 7890` iniciar el objeto ORBD que es el canal de comunicación entre aplicaciones IDL java, estableciendo `7890` como puerto de comunicación.
- ejecutar el servidor: `java Servidor -ORBInitialPort 7890`, pasando como referencia el objeto ORBD con el puerto de comunicación
- ejecutar el cliente: `java Cliente -ORBInitialPort 7890`, pasando como referencia el objeto ORBD con el puerto de comunicación


## Documentation

Documentación de referencia usada para la impementación:

- Definición de interfaz (IDL): <https://docs.oracle.com/javase/1.5.0/docs/guide/idl/tutorial/GSIDL.html>
- Ejemplo Hola mundo (Cliente): <https://docs.oracle.com/javase/1.5.0/docs/guide/idl/tutorial/GSapp.html>
- Ejemplo Hola mundo (Servidor): <https://docs.oracle.com/javase/1.5.0/docs/guide/idl/tutorial/GSserver.html>



```

```

