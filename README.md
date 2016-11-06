# openie-server
A simple JSON server for [knowitall Open IE](http://knowitall.github.io/openie/).

Usage: 
* Step 1: Set the path to your openie jar (currently for v4.1) in `Makefile` and `server_up` (if you don't have the jar already, [grab it](http://knowitall.cs.washington.edu/openie/release/openie-4.1.jar) and put it in current directory).
* Step 2: `make`
* Step 3: `./server_up` (Windows users have to run the Java command themselves)
* Step 4: Up and running. Python example:
```
>>> import requests
>>> r=requests.get('http://localhost:9001', 
    params={'text':"Some people think President Obama was born in Kenya."})
>>> print(r.json())
>>> [{'arg1': 'Some people',
    'arg2s': ['President Obama was born in Kenya'],
    'confidence': 0.9225110574705064,
    'rel': 'think'},
    {'arg1': 'President Obama',
    'arg2s': ['in Kenya'],
    'confidence': 0.9240540007105948,
    'rel': 'was born'}]
```


