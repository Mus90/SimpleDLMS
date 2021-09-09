# Simple DL

This is an experimental toolkit to create simple digital libraries. The goal is to abstract the installation process for Simple DL toolkit. Users will be able to create and manage instances of a simple digital library management
system.


### Step 1: Creating an instance of Simple DL

1. Clone the project repo

```
git@github.com:Mus90/SimpleDLMS.git
```

2. Build simpledl docker image.

```
docker build -t simpledl.
```

3. Run the docker container.

```
docker run --name simpledl -p 9090:80 simpledl:latest
```










