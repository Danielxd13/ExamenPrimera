#genera una imagen ubuntu
FROM ubuntu:latest
WORKDIR /
#intalar php, apache, y exponer al puerto 80
RUN apt-get update -y 
RUN DEBIAN_FRONTEND=noninteractive apt-get install -y tzdata
RUN apt-get install apache2 git php libapache2-mod-php apache2-utils -y
EXPOSE 80
RUN mkdir crud
WORKDIR /crud
RUN git clone https://github.com/configuroweb/crud-php.git
RUN cp -r /crud/crud-php /var/www/html/
CMD ["/usr/sbin/apache2ctl" , "-D" , "FOREGROUND"]
