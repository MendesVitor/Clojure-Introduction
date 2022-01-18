(ns estoque.aula3)

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println(valor-descontado 1000))
(valor-descontado 100)

;if else
(defn aplicar-desconto?
  [valor-bruto]
   (if (> valor-bruto 100)
     true
     false))

(println (aplicar-desconto? 100))
(println (aplicar-desconto? 1000))

;if
(defn aplicar-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true))

;when
(defn aplicar-desconto?
  [valor-bruto]
  (when (> valor-bruto 100)
    true))

;direto
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

(println(valor-descontado 1000))

;função como parametro
(defn mais-caro-que-100?
  [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [aplica?,valor-bruto]
  (if (aplica? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println(valor-descontado mais-caro-que-100? 1000))

; HIGHER ORDER FUNCTIONS
; IMUTABILIBIDADe

(defn mais-caro-que-100? [valor-bruto] (> valor-bruto 100))

(println "função sem nome. anonima")
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 1000))
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 100))
(println (valor-descontado (fn [v] (> v 100)) 1000))
(println (valor-descontado (fn [v] (> v 100)) 100))
(println (valor-descontado #(> %1 100) 1000))
(println (valor-descontado #(> %1 100) 100))
(println (valor-descontado #(> % 100) 1000))
(println (valor-descontado #(> % 100) 100))

(def mais-caro-que-100? (fn [valor-bruto] (> valor-bruto 100)))
(def mais-caro-que-100? #(> % 100))
(println (valor-descontado mais-caro-que-100? 1000))
(println (valor-descontado mais-caro-que-100? 100))
