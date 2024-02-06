(ns prime-factors-kata.prime-factors-test
  (:require [clojure.test :refer :all]
            [prime-factors-kata.prime-factors :refer :all]))

(deftest smallest-prime-factor-test
  (testing "finds smallest prime factor"
    (is (= 1 (smallest-prime-factor 1)))
    (is (= 1 (smallest-prime-factor -1)))
    (is (= 2 (smallest-prime-factor 10)))
    (is (= 2 (smallest-prime-factor 4)))
    (is (= 3 (smallest-prime-factor 9)))
    (is (= 13 (smallest-prime-factor 13)))
    ))

(deftest get-prime-factors-test
  (testing "gets a list of all prime factors of a given number"
    (is (= [13] (get-prime-factors 13)))
    (is (= [2 5] (get-prime-factors 10)))
    (is (= [2] (get-prime-factors 2)))
    (is (= [] (get-prime-factors 1)))
    (is (= [] (get-prime-factors -1)))
    (is (= [] (get-prime-factors -2)))
    (is (= [2 2 2 2 2 5 5 5 5 5 5] (get-prime-factors 500000)))
    ))