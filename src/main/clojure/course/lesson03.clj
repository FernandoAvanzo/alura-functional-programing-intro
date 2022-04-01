(ns course.lesson03)

;def symbol that receive  a lambda
(def mais-caro-que-100? #(> % 100))

;hight order function -> function has a parameter
(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [aplica? valor-bruto]
  (if (aplica? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

;code test section -> Lambda function or anonymous function
(println (valor-descontado mais-caro-que-100? 100))
(println (valor-descontado mais-caro-que-100? 1000))
