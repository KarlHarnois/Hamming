(ns hamming
  (:require [clojure.string :as str]))

(defn distance
  "Count the Hamming distance between two DNA strands"
  [a b]
  (when (= (count a) (count b))
    (->> (map = a b) 
         (filter false?)
         count)))
