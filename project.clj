(defproject lein-karma "0.1.1-SNAPSHOT"
  :description "A leiningen plugin for running javascript tests with karma"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :lein-release {:deploy-via :lein-install}


  :profiles {:dev {
                     :dependencies [[midje "1.5.1"]
                                    ]
                     :plugins [[lein-midje "3.1.1"][lein-release "1.0.5"]
                               ]}
              }
)
