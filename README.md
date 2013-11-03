# lein-karma

A Leiningen plugin to execute javscript tests with Karma (<http://karma-runner.github.io>)

## Usage

Put `[lein-karma "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your project.clj.

    $ lein karma

It assumes that "karma" executable is on the path and a configuration file exists in "resources/karma.conf.js".
The stdout of the karma process is printed only after the karma run ends, no progress is printed during karma run.

## License

Copyright © 2013 Carsten Behring

Distributed under the Eclipse Public License, the same as Clojure.
