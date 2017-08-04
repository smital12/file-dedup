(ns file-dedup.core
  (:require [clojure.java.io :as io]))

(def file-string "./src/file_dedup/")
;(def file-string "C:/Strawberry/c/bin" )
(def usage "Usage: file-dedup dir1 dir2")


(defn find-duplicate-files [d]
  "recursively lists all files in a directory"
  (->> (file-seq (io/file d))
       (filter #(.isFile %))
       (map (fn [file] {(str (.getName file)) [file]}))
       (apply merge-with concat)
       vals
       (filter #(> (count %) 1))))


(defn file-dedup
  "list files in a directory"
  ([] usage)
  ([dir] (find-duplicate-files dir)))


;(file-dedup file-string)
(clojure.pprint/pprint (find-duplicate-files file-string))
