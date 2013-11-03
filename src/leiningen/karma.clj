(ns leiningen.karma
  (:use [clojure.java.shell :only [sh]])
  (:use [leiningen.core.main :only[abort]])
  (:use [clojure.pprint :only[pprint]])
  )

(defn karma
  "Runs Karma"
  [project & args]
  (let [ret (sh "karma" "start" "resources/karma.conf.js" "--single-run")]
    (println (:out ret))
    (if (not (= 0 (:exit ret)))
       (abort "Karma failed")
      )
  )
)
