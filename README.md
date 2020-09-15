# clj-hex-grid

A Clojure library implementing the algorithms specified in http://www.redblobgames.com/grids/hexagons/.

## Features

1. Angles, size, spacing - Done
1. Coordinate systems - To do
1. Conversions - Done (offset to/from cube only, no axial)
1. Neighbours - Done (cube and offset, no axials, no diagonals)
1. Distances - Done (cube and offset coordinates)
1. Line drawing - Done (cube coordinates)
1. Range - In progress
1. Rotation - To do
1. Rings - To do
1. Field of view - To do
1. Hex to pixel - To do
1. Pixel to hex - To do
1. Rounding - To do
1. Map storage - To do
1. Wraparound maps - To do
1. Pathfinding - Done (cube coordinates)


## Contributing

### Run tests

Tests rely on [Midje](https://github.com/marick/Midje) and
integrated through a plugin to Leiningen.

To run tests on development mode

```shell script
lein midje :autotest
```

## License

Distributed under the Eclipse Public License, the same as Clojure.
