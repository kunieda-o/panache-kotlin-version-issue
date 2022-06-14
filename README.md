# Reproduces
```aidl
$  curl localhost:8080/create-dog
created%
$  curl localhost:8080/create-dog-with-base
created%
$  curl localhost:8080/show-dog
[{"id":"dog1","name":"foo","version":0}]%
$  curl localhost:8080/show-dog-with-base
[{"id":"dog2","name":"bar","version":0}]%
```

