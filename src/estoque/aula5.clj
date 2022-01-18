(ns estoque.aula5)

;sem virgula
(def estoque {"mochila" 10 "camiseta " 5})
(println estoque)

;com virgula

(def estoque {"mochila" 10, "camiseta " 5})
(println estoque)

(println "temos" (count estoque) "elementos")
(println "Chaves" (keys estoque))
(println "valores" (vals estoque))

;com key words.
(def estoque {:mochila 10, :camiseta 5})
(println estoque)

;com asoc.
(println (assoc estoque :cadeira 3))
(println estoque)

(println (assoc estoque :mochila 13))
(println estoque)

(println (update estoque :mochila inc))
(println estoque)

(println (dissoc estoque :mochila))
(println estoque)

(def pedido {:mochila {:quantidade 2, :preco 80},
             :camiseta {:quantidade 5, :preco 60}})
(println pedido)
(println (pedido :mochila))
(println (get pedido :mochila))
(println (get pedido :cadeira))
(println (get pedido :cadeira {}))

(println (:camiseta pedido))
(println (:cadeira pedido))
(println (:cadeira pedido {}))

(println (:quantidade (:mochila pedido)))
(println (update-in pedido [:mochila :quantidade] inc))

(println (-> pedido :mochila :quantidade))

(-> pedido :camiseta :preco println)