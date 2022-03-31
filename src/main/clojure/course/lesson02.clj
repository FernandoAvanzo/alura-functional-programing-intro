;Function copy paste from the couser
(defn valor-descontado
  "Retorna o valor com desconto de 10%."
  [valor-bruto]
  (let [desconto (/ 10 100)]
    (println "Calculando desconto de" desconto)
    (* valor-bruto (- 1 desconto))
    )
  )

