(ns leiningen.new.clojure-literally-chapter
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "clojure-literally-chapter"))

(defn clojure-literally-chapter
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' clojure-literally-chapter project.")
    (->files data
             ["{{sanitized}}.org" (render "chapter.org" data)]
             ["LICENSE" (render "LICENSE" data)])))
