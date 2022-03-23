import groovy.json.JsonSlurper
import groovy.xml.MarkupBuilder

//JSON Data Parser
def jsonSlurper = new JsonSlurper()
def object = jsonSlurper.parseText(data())


//XML Markup Builder
def writer = new FileWriter("data.xml" )
def mB = new MarkupBuilder(writer)
mB.doubleQuotes = true
mB.mkp.xmlDeclaration(version:"1.0", encoding:"utf-8")
mB."db:${object.Data.Root}"('xmlns:db' : object.Data.NameSpace) {
        "db:ProductDetails"('db:productName': object.Data.ProductDetails.productName,
                       'db:productID' : object.Data.ProductDetails.productID)
        "db:ProductionDate"(object.Data.ProductionDate)
        "db:Quantity"(object.Data.Quantity)
        "db:Size"('db:length':object.Data.Size.length,
            'db:width':object.Data.Size.width)
}


def data() {
        return """{
  "Data": {
    "Root": "Product",
    "NameSpace": "http://www.example.com/schema.xsd",
    "ProductDetails": {
      "productName": "Fridge",
      "productID": 15
    },
    "ProductionDate": "2022-03-18",
    "Quantity": 25,
    "Size": {
       "length" : "12",
       "width" : 16
    }
  }
}"""
}