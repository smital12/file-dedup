(ns file-dedup.core-test
  (:require [clojure.test :refer :all]
            [file-dedup.core :refer :all]))

(deftest zero-arity
  (testing "file-dedup with no arguments"
    (let [usage "Usage: file-dedup dir1 dir2"]
    (is (= usage (file-dedup))))))


(deftest open-dir
  (testing "file-dedup on a directory")
  (is (= "core.clj" (file-dedup "C:/Users/c17722/Documents/workspace/clojure/file-dedup/src/file_dedup")))
  )
