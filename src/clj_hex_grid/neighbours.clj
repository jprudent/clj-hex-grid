(ns clj-hex-grid.neighbours)

(def neighbours {:north {:x 0 :y 1 :z -1} :south {:x 0 :y -1 :z 1}})

(defn neighbour_for
	""
	[{x :x y :y z :z} orientation]
	(let [offsets (get neighbours orientation)]
		; (println offsets)
		{	:x (+ x (get offsets :x)) 
			:y (+ y (get offsets :y)) 
			:z (+ z (get offsets :z))}))