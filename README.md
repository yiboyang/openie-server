# openie-server
Simple JSON server for [Open IE system by the University of Washington](http://knowitall.github.io/openie/).
Currently supports openie v4.1 and Java 8.

Usage:
* Step 1: If you don't have the openie jar already, [grab it](http://knowitall.cs.washington.edu/openie/release/openie-4.1.jar) and put it in current directory; otherwise make a symlink to your existing jar in current directory.
* Step 2: `make`
* Step 3: `bash ./server_up` (Windows users have to run the Java command themselves)
* Step 4: Up and running. Python example:
```
>>> import requests
>>> r=requests.get('http://localhost:9001',
    params={'text':"Some people think President Obama was born in Kenya."})
>>> print(r.json())
>>> [{'arg1': 'Some people',
    'arg2s': ['President Obama was born in Kenya'],
    'confidence': 0.9225110574705064,
    'context': 'None',
    'negated': 0,
    'passive': 0,
    'rel': 'think',
    'string': '(Some people; think; President Obama was born in Kenya)'},
    {'arg1': 'President Obama',
    'arg2s': ['in Kenya'],
    'confidence': 0.9240540007105948,
    'context': 'Some(Some people think)',
    'negated': 0,
    'passive': 1,
    'rel': 'was born',
    'string': 'Some people think:(President Obama; was born; in Kenya)'}]
```


