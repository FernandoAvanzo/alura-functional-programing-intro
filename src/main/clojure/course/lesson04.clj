(ns course.lesson04)
(def precos [30 700 1000])

(println "print called direct array" (precos 0))

(println "print using get function" (get precos 2))

;default value for index error
(println "print using get with error control" (get precos 17 "index error"))

;(println (conj precos 5))
;(println precos)

;sum value
(println "sum + " (+ 5 1))

;increment 5
(println "increment inc" (inc 5))

;update array with inc
(println "update array with inc" (update precos 0 inc))

;update array with dec
(println "update array with dec" (update precos 1 dec))

;my function add 1
(defn soma-1
  [valor]
  (println "somando um em " valor)
  (+ valor 1))

;calling my function
(println "updare arreay" (update precos 0 soma-1))
