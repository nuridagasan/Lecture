package XML

import groovy.xml.XmlParser

def parser = new XmlParser()
def movies = parser.parse(".\\Movies.xml")

movies.each{
    movie->
            print("Movie Name: ")
            println "${movie['@title']}"

            print("Movie Type: ")
            println "${movie.type.text()}"

            print("Movie Format: ")
            println "${movie.format.text()}"

            print("Movie Year: ")
            println "${movie.year.text()}"

            print("Movie Rating: ")
            println "${movie.rating.text()}"

            print("Movie Score: ")
            println "${movie.score.text()}"

            print("Movie Description: ")
            println "${movie.description.text()}"
            println("*******************************")
}
