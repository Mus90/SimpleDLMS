FROM httpd:latest AS HTTPD
MAINTAINER Mustafa Ali (mustafaalamin.07@gmail.com)

# Copy samplepublic_html, sampledata and sampledb to the docker httpd image in this location /usr/local/apache2/htdocs/
COPY samplepublic_html.tgz /usr/local/apache2/htdocs/instance/samplepublic_html.tgz
COPY sampledata.tgz /usr/local/apache2/htdocs/instance/sampledata.tgz
COPY sampledb.tgz /usr/local/apache2/htdocs/instance/sampledb.tgz

# unzip files
WORKDIR /usr/local/apache2/htdocs/instance/
RUN gzip -cd sampledata.tgz | tar -xf -
RUN gzip -cd sampledb.tgz | tar -xf -
RUN gzip -cd samplepublic_html.tgz | tar -xf -

