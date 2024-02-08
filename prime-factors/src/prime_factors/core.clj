(ns prime-factors.core)

(defn get-smallest-prime-factor [n]
  (first (filter (fn [x] (= (mod n x) 0)) (range 2 (inc n)))))

(defn prime-factors [n]
  (loop [n n
         factors []]
    (let [factor (get-smallest-prime-factor n)]
    (if (= factor nil) factors (recur (/ n factor) (conj factors factor))))))

(defn -main
  [& args]
  (println "Hello World"))
