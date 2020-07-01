package org.sushanth

class Sushanth implements Serializable {

     def class_name
     def class_script
     
     Sushanth(script,name) {
         this.class_name = name
         this.class_script = script
     }
     
     def print() {
         this.class_script.sh(script: """
              echo 'Hi'
              echo 'Hello'
              """)
     }
}
