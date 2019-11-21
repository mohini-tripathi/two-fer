(ns two-fer.core-test
  (:require [clojure.test :refer :all]
            [two-fer.core :refer :all]))

; (defn [&args]
;   (let [sent (two-fer)]))
(deftest a-test
  (testing "For no input given")
  (is (= "One for you, one for me." (two-fer))))

(deftest b-test
  (testing "For one input given")
  (is (= "One for Alice, one for me." (two-fer "Alice"))))

(deftest c-test
  (testing "For one input given")
  (is (= "One for Bob, one for me." (two-fer "Bob"))))

(deftest d-test
  (testing "For one input given")
  (is (= "One for Zaphod, one for me." (two-fer "Zaphod"))))

(run-tests)
