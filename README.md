# Simple DL

This is an experimental toolkit to create simple digital libraries. The goal is to abstract the installation process for Simple DL toolkit. Users will be able to create and manage instances of a simple digital library management
system.


### Step 1: Creating an instance of Simple DL

1. Clone the project repo

```
git@github.com:Mus90/SimpleDLMS.git
```

2. Build simpledl docker image

```
docker build -t simpledl .
```

3. Run the docker container

```
docker run --name simpledl -p 9090:80 simpledl:latest
```
4. Navigate to http://localhost:9090/instance/public_html/


To add a new collection, you need to do the following:

1. Add a folder in data/spreadsheets (Example: etd2025)

2. Inside data/spreadsheets/etd2025, update the csv file to be (etd2025.csv)

3. Update collection.csv in data/spreadsheets to add a new line for the created collection.

4. In public_html/collcetion, add a new colloction folder + logo file.

5. Then run the following commands:

- perl simpledl/bin/import.pl

- perl simpledl/bin/index.pl

- perl simpledl/bin/generate.pl --website --force

- perl simpledl/bin/generate.pl --all












