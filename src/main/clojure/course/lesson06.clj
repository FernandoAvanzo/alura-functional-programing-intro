(ns course.lesson06)

;def map structure
(def pedido {:mochila  {:quantidade 2 :preco 80}
             :camiseta {:quantidade 3 :preco 40}})

;create my function to understand the map interation
;function with one param of kind key value
(defn imprime-e-15 [[chave valor]]
  (println  chave "e"  valor)
  valor)

;calc product price
;when i dont need of one value in the destruct i can replace the unsed value for undesrcore (_)
(defn preco-total-do-produto [produto]
  (* (:quantidade produto) (:preco produto)))

;sum the produt values
;using a thread last the turn the read more easy
(defn total-do-pedido
  [pedido]
  (->> pedido
       vals
      (map preco-total-do-produto)
      (reduce +)))


;test the implementation
(println (map imprime-e-15 pedido))

;prodct prices
(println (total-do-pedido pedido))



