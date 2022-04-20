(ns course.lesson06)

;def map structure
(def pedido {:mochila  {:quantidade 2 :preco 80}
             :camiseta {:quantidade 3 :preco 40}})

;create my function to understand the map interation
(defn imprime-e-15 [valor]
  (println "valor" (class valor) valor)
  15)

;test the implementation
(println (map imprime-e-15 pedido))


