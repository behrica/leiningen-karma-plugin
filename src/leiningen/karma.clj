(ns leiningen.karma
  (:use [clojure.java.shell :only [sh]])
  (:use [leiningen.core.main :only[abort]])
  )

(defn karma
  "Runs Karma"
  [project & args]
  (let [ret (sh "karma" "start" "karma.conf.js" "--single-run")]
    (if (not (= 0 (:exit ret)))
       (abort "Karma failed")
      )
  )
)
