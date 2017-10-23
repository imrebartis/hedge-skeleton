  (set-env! :source-paths #{"src"}
          :resource-paths #{"resources"}
          :dependencies (quote [[siili/boot-hedge "0.0.2-SNAPSHOT" :scope
                                 "test"] [siili/hedge "0.0.2-SNAPSHOT"]]))

(require (quote [boot-hedge.core :refer :all]))