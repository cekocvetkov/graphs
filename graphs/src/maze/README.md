Maze problem
```ruby
[
[1,1,1,1,1],
[1,2,0,1,1],
[1,1,0,1,1],
[1,1,0,0,0],
[1,1,1,1,3],
]
```
So we have a map like this

integer 1 represents walls

integer 2 is the starting point

integer 3 is the destination (so this is what we are looking for)

integer 0 represents the states we can consider (so the solution contains one or more 0 states)

So the solution should be something like this (S represents the states in the solution set):
```ruby
[
[-,-,-,-,-],
[-,2,S,-,-],
[-,-,S,-,-],
[-,-,S,S,S],
[-,-,-,-,3],
]
```