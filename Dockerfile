FROM httpd:latest AS HTTPD
MAINTAINER Mustafa Ali (mustafaalamin.07@gmail.com)
COPY simpledl-files/public_html /usr/local/apache2/htdocs/instance/public_html/
COPY simpledl-files/data /usr/local/apache2/htdocs/instance/data/
COPY simpledl-files/db /usr/local/apache2/htdocs/instance/db/


