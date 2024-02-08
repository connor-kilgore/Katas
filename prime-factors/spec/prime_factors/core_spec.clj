(ns prime-factors.core-spec
  (:require [speclj.core :refer :all]
            [prime-factors.core :refer :all]))

(describe "Will produce the smallest prime factor of an integer"
  (it "will return a prime number input"
    (should= 2(get-smallest-prime-factor 2))
    (should= 3(get-smallest-prime-factor 3)))
  (it "will return nil for a number less than 2"
    (should= nil(get-smallest-prime-factor 1))
    (should= nil(get-smallest-prime-factor 0)))
  (it "will return the smallest factor of a non-prime integer"
    (should= 2(get-smallest-prime-factor 4))
    (should= 2(get-smallest-prime-factor 10)))
  )

(describe "Will produce a list of prime factors of an integer"
  (it "will return numbers if single prime numbers"
    (should= [2](prime-factors 2))
    (should= [3](prime-factors 3))
    (should= [13](prime-factors 13)))
  (it "will return nil for numbers less than 2"
    (should= [](prime-factors 1))
    (should= [](prime-factors 0)))

  ;need supporting function
  (it "will return every prime factor of non-primes"
    (should= [2 3](prime-factors 6))
    (should= [2 5](prime-factors 10))
    (should= [2 2 5](prime-factors 20))
    )
  )
