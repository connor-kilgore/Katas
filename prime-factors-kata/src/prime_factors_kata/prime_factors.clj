(ns prime-factors-kata.prime-factors)


(defn smallest-prime-factor [n]
  ; handle edge cases
  (if (< n 2)
    1
    (do
      (loop [factor 2]
        (if (= (mod n factor) 0)
          factor
          (recur (inc factor)))
        )
      )
    )
  )

(defn get-prime-factors [n]
  (loop [n n
         factors []]
    (if (> n 1)
      (do
        (recur (/ n (smallest-prime-factor n)) (conj factors (smallest-prime-factor n))))
        factors)
  )
)