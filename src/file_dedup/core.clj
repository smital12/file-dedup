(ns file-dedup.core
  (:require [ clojure.java.io :as io ]))

(defn file-dedup
  "list files in a directory"
  [& args]
  (printf "here: %s" 
          (if (nil? args)
            ""
            (first args)))

(file-dedup "hi")
