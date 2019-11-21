(ns two-fer.core
  (:gen-class))

(defn two-fer 
  ([] (two-fer "you"))
  ([name] (str "One for " name ", one for me.")))

(defn -main
  [& args]
  (println (two-fer)))
