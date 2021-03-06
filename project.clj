(defproject clj-hex-grid "0.1.1-SNAPSHOT"
  :description "A basic Clojure library for working with hexagonal grids"
  :url "https://github.com/jprudent/clj-hex-grid/"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:dev {:dependencies [[midje "1.9.9"]
                                  [compojure "1.6.2"]]
                   :plugins      [[lein-midje "3.1.3"]]
                   :global-vars {*warn-on-reflection* true}}}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/data.priority-map "1.0.0"]])
