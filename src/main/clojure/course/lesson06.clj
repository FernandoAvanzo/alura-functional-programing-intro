(ns course.lesson06)

;def map structure
(def pedido {:mochila  {:quantidade 2 :preco 80}
             :camiseta {:quantidade 3 :preco 40}
             :chaveiro {:quantidade 1}})

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

;function free iten
;if the keyword is not finded thne return 0
(defn gratuito? [item]
     (<= (get item :preco 0) 0))

;comp function paid
(def pago? (comp not gratuito?))

;test the implementation
;(println (map imprime-e-15 pedido))

;prodct prices
;(println (total-do-pedido pedido))

;filter itens
(println "filtrando gratuitos")
(println (filter gratuito? (vals pedido)))

;a lot of way the return the free item
(println (filter (fn [[chave item]] (gratuito? item)) pedido))
(println (filter #(gratuito? (second %)) pedido))

;quick test paid fuynction
(println (pago? {:preco 50}))
(println (pago? {:preco 0}))

;comp function sample
(println ((comp not gratuito?) {:preco 50}))

;excercises -> count total certificates
(def clientes [
               { :nome "Guilherme"
                :certificados ["Clojure" "Java" "Machine Learning"] }
               { :nome "Paulo"
                :certificados ["Java" "Ciência da Computação"] }
               { :nome "Daniela"
                :certificados ["Arquitetura" "Gastronomia"] }])
;awnser
(println "Total certs" (->> clientes (map :certificados) (map count) (reduce +)))



