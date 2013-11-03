(ns leiningen.karma-test
  (:use [midje.sweet :refer :all ])
  (:use [leiningen.karma :refer :all ])
  (:use [leiningen.core.main :only[abort]])
  (:use [clojure.java.shell :only [sh]])
)


(fact "should  abort if karma does not work"
  (karma nil) => nil
  (provided (abort "Karma failed") => nil)
  (provided (sh "karma" "start" "karma.conf.js" "--single-run") => {:exit 1})
)


(fact "should not abort if karma works"
  (karma nil) => nil
  (provided (abort "Karma failed") => nil :times 0)
  (provided (sh "karma" "start" "karma.conf.js" "--single-run") => {:exit 0})
)
