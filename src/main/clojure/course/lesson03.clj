(ns course.lesson03)

; PREDICATE
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

;code test section
(println (aplica-desconto? 1000.00))

(println (aplica-desconto? 100.00))

(println (valor-descontado 1000.00))

(println (valor-descontado 100.00))
