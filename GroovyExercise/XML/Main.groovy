package XML

import groovy.xml.MarkupBuilder
/**
 * In the below example, the following things need to be noted −
 * mB.collection() − This is a markup generator that creates the head XML tag of <collection></collection>
 * movie(title : 'The Shawshank Redemption') − These pseudo-methods create the child tags with this method creating
 the tag with the value. By specifying a value called title, this actually indicates that an attribute needs to be created for the element.
 * A closure is provided to the pseudo-method to create the remaining elements of the XML document.
 * The default constructor for the class MarkupBuilder is initialized so that the generated XML
 is issued to the standard output stream
 */

//XML Markup Builder

def mB = new MarkupBuilder()
mB.doubleQuotes = true
mB.mkp.xmlDeclaration(version:"1.0", encoding:"utf-8")
mB.'db:collection'(shelf : 'IMDB Top 5 Movie') {
    movie(title: 'The Shawshank Redemption') {
    type('Drama')
    format('DVD, Online')
    year('1994')
    rating('IMDB')
    starts(9.3)
    description('Two imprisoned men bond over a number of years,' +
            'finding solace and eventual redemption through acts of common decency.')
    }
}
print(mB)

