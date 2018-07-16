# RMI-java
Implementacion de Corba RMI en java
<p align="center">

  <h3 align="center">Implementación de CORBA RMI en java</h3>

</p>

## Table of contents

- [Requerimientos](#requerimientos)
- [Archivo IDL](#archivo-idl)
- [Documentation](#documentation)
- [Quick start](#quick-start)
- [Cliente python](#cliente-python)
- [Autores](#autores)

## Requerimientos

- JDK de java, hemos usado la versión: `jdk1.8.0_144`
- `idlj`, crea las clases necesarias para implementar la interfaz
- `orbd`, define el canal de comunicación para los objetos
- Dependencias para python: `python-omniorb, omniidl, omniidl-python, omniorb, omniorb-nameserver` 

## Archivo IDL

- Definir el archivo para la interfaz
`ClienteRemoto.idl`:

```
module ClienteRemoto{
              interface ClienteRem
             {
                   string Saludar(
                   in string nombre,
                   in string apellido,
                   in string cedula,
                   in string fechaNacimiento);
      };
};
```

## Quick start
- Clonar el repositorio : `git clone https://github.com/megaleunam/RMI-java.git`.
- Para el uso del lenguaje de definición de interfaz (IDL) en java es necesario usar `idlj` el cual viene incluído en el JDK de java para empezar debemos tener instalado el JDK de java, e incluir en las variables de entorno la dirección del idlj que se encuentra en `C:\Program Files\Java\{{JDK versión}}\bin`. 
- Ubicado en el directorio raíz del proyecto abrimos la consola y ejecutamos: >`idlj -fall ClienteRemoto.idl`, este comando creará un directorio con el nombre del archivo idl: `ClienteRemoto`, el cual contendrá las clases generadas a partir del archivo idl las cualés son necesarias para la implementación del objeto.
- `ClienteRemImpl.java` es una extensión del archivo: `ClienteRemPOA` ubicado en el directorio generado por el `idlj`
- Ejecutar `javac *.java` para compilar los archivos java incluyendo los archivos del repositorio: `ClienteRemoto`.
- En una terminal nueva ejecutar: `orbd -ORBInitialPort 2809` iniciar el objeto ORBD que es el canal de comunicación entre aplicaciones IDL java, estableciendo `2809` como puerto de comunicación.
- ejecutar el servidor: `java Servidor -ORBInitialPort 2809 -ORBInitialHost localhost`, pasando como referencia el objeto ORBD con el puerto de comunicación
- ejecutar el cliente: `java Cliente -ORBInitialPort 2809`, pasando como referencia el objeto ORBD con el puerto de comunicación

## Cliente python

- La implementación en python cliente fue realizada en linux usando python 2.7.
- Es necesario instalar `omniorb` para python en ubuntu, para ello ejecutamos el siguiente comando en la consola `sudo apt-get install omniorb python omniorb omniidl omniidl-python`
- Usaremos el comando omniidj de la libreria, ejecutamos este comando en un terminal > `omniidl -bpython ClienteRemoto.idl`, el cual creará los archivos necesarios para la implementación.
- Por último ejecutamos `python cliente.py`

## Documentation

Documentación de referencia usada para la impementación:

- Definición de interfaz (IDL): <https://docs.oracle.com/javase/1.5.0/docs/guide/idl/tutorial/GSIDL.html>
- Ejemplo Hola mundo (Cliente): <https://docs.oracle.com/javase/1.5.0/docs/guide/idl/tutorial/GSapp.html>
- Ejemplo Hola mundo (Servidor): <https://docs.oracle.com/javase/1.5.0/docs/guide/idl/tutorial/GSserver.html>



## Autores
- Luis M. Mariño
- Daniela Arbelaez
