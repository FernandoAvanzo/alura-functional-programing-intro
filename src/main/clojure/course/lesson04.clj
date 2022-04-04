(ns course.lesson04)
(def precos [30.00 700.00 1000.00])

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
(defn soma-6
  [valor]
  (println "somando um em " valor)
  (+ valor 6))

;calling my function
(println "updare arreay" (update precos 0 soma-6))

;old lessons codes
(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

;using map into a array
(println "map" (map valor-descontado precos))

;using range function
(println "Using range function" (range 10))

;using filter function
(println "filter envens with range" (filter even? (range 10)))

;using filter with precos array
(println "Original aray" precos)
(println "filtred values" (filter aplica-desconto? precos))

;apply descout in filtered pricing array
(println "apply desxocut in filtered values" (map valor-descontado (filter aplica-desconto? precos)))


