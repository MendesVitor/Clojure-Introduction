(ns estoque.aula4)

(def precos [30 700 1000])
(println (precos 0))
(println (get precos 0))
(println (get precos 2))
;(println (precos 17))
;nulo
(println (get precos 17))
;numero padrao
(println (get precos 17 0))

(println (conj precos 5))
(print precos)

(println (+ 5 1))
(println (inc 5))
(println (update precos 0 inc))
(println (update precos 1 dec))

(defn soma-3
  [valor]
   (println "Soma-3")
   (+ valor 3))


(println (update precos 0 soma-3))

(defn aplicar-desconto?
  [valor-bruto]
  (> valor-bruto 100))


(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (aplicar-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println(map valor-descontado precos))

(println(map valor-descontado precos))

(println(map valor-descontado (filter aplicar-desconto? precos)))