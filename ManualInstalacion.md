# Manual de instalación #

Para que el plugin funcione correctamente el usuario debe instalar un compilador de C/C++ en su sistema operativo preferido.


## Mac OS ##

En Mac OS bastará con instalar Xcode.

https://itunes.apple.com/es/app/xcode/id497799835?mt=12

Es una aplicación de desarrollo gratuita que se puede descargar de la App Store, la cual incorpora un compilador de C/C++.

## Linux ##

En este caso, se han realizado las pruebas en una distribución Ubuntu, pero para las demás distribuciones el procedimiento es el mismo.

Para instalar el GNU C/C++ compiler realizaremos los siguientes comandos en la terminal:

```

$ sudo apt-get update
$ sudo apt-get upgrade
$ sudo apt-get install build-essential
$ gcc -v
$ make -v

```

(Los dos últimos comandos se realizan para comprobar que la instalación se ha realizado correctamente.)

## Windows ##

En este caso, la aplicación que se debe instalar será Cygwin:

_https://www.cygwin.com_

Se realizan exactamente los mismos pasos que en la guía que se muestra a continuación:

_http://tupdows.blogspot.com.es/2013/04/como-instalar-cygwin-windows-7.html_

En la penúltima ventana (la anterior al comienzo de la instalación) se debe buscar los siguientes paquetes e instalarlos:

_gcc-core (Devel - gcc-core: GNU Compiler Collection)_

_make (Devel - make: The GNU version of the 'make' utility)_

Finalmente, cuando se haya completado la instalación se debe exportar en la variable Path del sistema el siguiente directorio:

_C:\cygwin64\bin_