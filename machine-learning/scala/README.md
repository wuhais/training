Collaborative filtering
===========================
Collaborative filtering is commonly used for recommender systems. These techniques aim to fill in the missing entries of a user-item association matrix, in our case, the user-movie rating matrix. MLlib currently supports model-based collaborative filtering, in which users and products are described by a small set of latent factors that can be used to predict missing entries. In particular, we implement the alternating least squares (ALS) algorithm to learn these latent factors.
For more details, please refer to the wiki from [here](http://ampcamp.berkeley.edu/big-data-mini-course/movie-recommendation-with-mllib.html)

## Working with Eclipse

Go through the following process to generate ```.project``` and ```.classpath``` for this project

* Make sure you have [sbt already installed](https://github.rtp.raleigh.ibm.com/cleancloudsight/cloudsight/wikis/work-with-spark#setup-spark)
* Include sbt Eclipse plugin by following 
   * For Linux user
    
    ```
    vi /root/.sbt/0.13/plugins/plugins.sbt
    ```
    Include the following content
    
    ```
    addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")

    addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.11.2")
    ```
   * For Windows user
    Open

    ```
    C:\Users\IBM_ADMIN\.sbt\0.13\plugins

    ```
    Include the following content    
    ```
    addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.4.0")

    addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.11.2")
    ```    
* Run the following commands under the project directory that contains ```build.sbt```. Once finished, you will be able to find the ```.project``` and ```.classpath``` that can be used to import into Eclipse

   ```
   sbt eclipse
   ```
