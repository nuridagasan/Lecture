package XML

import groovy.xml.MarkupBuilder

def movieList = [
        [
                'title':'Enemy Behind',
                'type' : 'War Thriller',
                'format' : 'DVD',
                'year' : '2003',
                'rating' : 'PG',
                'score' : '9',
                'description' : 'Talk about a US-Japan war'
        ],
        [
                'title':'Transformers',
                'type' : 'Anime',
                'format' : 'DVD',
                'year' : '2007',
                'rating' : 'IMDB',
                'score' : '9.1',
                'description' : 'A scientific fiction'
        ],
        [
                'title':'Trigun',
                'type' : 'Action',
                'format' : 'DVD',
                'year' : '2011',
                'rating' : 'IMDB',
                'score' : '7.1',
                'description' : 'Vash the Stam pede'
        ],        [
                'title':'Ishtar',
                'type' : 'Comedy',
                'format' : 'DVD',
                'year' : '2017',
                'rating' : 'IMDB',
                'score' : '5.1',
                'description' : 'Viewable boredom'
        ]

]

def mB = new MarkupBuilder()

mB.collection('Shelf': 'Most Favourite Movies') {
    movieList.each {
        movie ->
            mB.movie('title': movie.title) {
                mB.type(movie.type)
                mB.format(movie.format)
                mB.year(movie.year)
                mB.rating(movie.rating)
                mB.score(movie.score)
                mB.description(movie.description)
            }
    }
}

