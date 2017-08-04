(ns file-dedup.core
  (:require [clojure.java.io :as io]))

(def usage "Usage: file-dedup dir1 dir2")

(defn get-files-in-dir [d]
  "lists the files in a directory"
  (->> (file-seq (io/file d))
       (filter #(.isFile %))))


(defn file-dedup
  "list files in a directory"
  ([] usage)
  ([dir]
   (clojure.pprint/pprint ( get-files-in-dir dir ))))

(file-dedup "C:/Users/c17722/Documents/workspace/clojure/file-dedup/src/file_dedup/")
