# Namespaces

The purpose of namespaces is to provide containers  for the names used in XML. A name, such as table, can have several
meanings. Its meaning in XHTML is very different from its meaning  in a hypothetical language for describing office 
furniture, FurnitureML. An element or attribute name in an instance can be declared to be in  a namespace, which 
provides context and identifies the XML vocabulary to which the element or attribute belongs.

The main purpose of a namespace is not to point to a location where a resource resides. Instead, much like a Java 
package name, it is intended to provide a unique name that can be associated with a particular person or organization. 
Therefore, namespace names are not required to be dereferencable.

- Namespace names are case-sensitive.
- An instance may include one or more namespace declarations that relate elements and attributes to namespaces.
- A namespace is declared using a special attribute whose name starts with the letters xmlns. 

## Namespace Declaration

### Single Namespace Declaration

- Below example shows an instance whose root element has a namespace declaration.
- This declaration maps the namespace http://example.com/prod to the prefix prod. All element names in the
  document, namely product, number, and size, are prefixed with prod.
- Prefixes are convenient because they are generally shorter than namespace names, so they make the document more readable.

<code>

    <prod:product xmlns:prod="http://example.com/prod">
        <prod:number>557</prod:number>
        <prod:size system="US-DRESS">10</prod:size>
    </prod:product>

</code>

- The xsl prefix is usually mapped to the Extensible Stylesheet Language (XSL) namespace.
- For the XML Schema Namespace, the commonly used prefixes are xsd and xs.
- More than one namespace can be declared in the same instance

### Multiple Namespace Declaration

- Number tag appears twice, with two different prefixes.
- The usefulness of namespaces which make it obvious whether it is a product number or an order number

<code>

    <ord:order xmlns:ord="http://datypic.com/ord"
                    xmlns:prod="http://datypic.com/prod">
    <ord:number>123ABBCC123</ord:number>
        <ord:items>
            <prod:product>
                <prod:number>557</prod:number>
                <prod:size system="US-DRESS">10</prod:size>
            </prod:product>
        </ord:items>
    </ord:order>

</code>

### Default Namespace Declaration

- An instance may also include a default namespace declaration that maps unprefixed element names to a namespace.
- The default namespace declaration uses the attribute xmlns, with no colon or prefix.
- Check below example

<code>

    <order xmlns="http://datypic.com/ord"
                xmlns:prod="http://datypic.com/prod">
    <number>123ABBCC123</number>
        <items>
            <prod:product>
                <prod:number>557</prod:number>
                <prod:size system="US-DRESS">10</prod:size>
            </prod:product>
        </items>
    </order>

</code>

### Overriding Namespace Declarations

- Namespace declarations can also be overridden.
- If a namespace declaration appears within the scope of another namespace declaration with the same prefix, it overrides it.

Overriding a namespace declaration:

<code>

    <order xmlns="http://datypic.com/ord"
        xmlns:prod="http://datypic.com/prod">
    <number>123ABBCC123</number>
    <items>
        <prod:product>
            <prod:number xmlns:prod="http://datypic.com/prod2">557</prod:number>
            <prod:size system="US-DRESS">10</prod:size>
        </prod:product>
    </items>
    </order>

</code>

### A Summary Namespace Declaration Example



<code>

    <envelope>
        <order xmlns="http://datypic.com/ord"
        xmlns:prod="http://datypic.com/prod">
        <number>123ABBCC123</number>
        <items>
            <product xmlns="http://datypic.com/prod">
            <number prod:id="prod557">557</number>
            <name xmlns="">Short-Sleeved Linen Blouse</name>
            <prod:size system="US-DRESS">10</prod:size>
            <prod:color xmlns:prod="http://datypic.com/prod2"
                        prod:value="blue"/>
            </product>
        </items>
        </order>
    </envelope>

</code>

## The relationship between namespaces and schemas

- Namespaces and schemas have a many-to-many relationship.

## Using namespaces in schemas

### Target namespaces

- Each schema document can declare and define components for one namespace, known as its target namespace.
- Every globally declared or defined component (element, attribute, type, named group, or notation) is associated with 
that target namespace.
- XML Schema Namespace can be mapped to a prefix such as xsd or xs, and make the target namespace the default namespace.
- Its advantage is that it makes it clear which components are defined by XML Schema, especially when it comes to 
referencing built-in types.
Declaring a target namespace:

<code>

    <xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
                    xmlns="http://datypic.com/prod"
                    targetNamespace="http://datypic.com/prod">
    <xs:element name="product" type="ProductType"/>
    <xs:element name="number" type="xs:integer"/>
    <xs:element name="size" type="SizeType"/>
    <xs:complexType name="ProductType">
        <xs:sequence>
            <xs:element ref="number"/>
            <xs:element ref="size"/>
        </xs:sequence>
    </xs:complexType>
    <!--...-->
    </xs:schema>

</code>

- Adding a target namespace to a schema is not just informational; the target namespace becomes an important part of
the names, and it must be reflected in the instance documents.
- Since they are associated with the http://datypic.com/prod namespace, they must be qualified in some way, either 
through a prefix or by a default namespace declaration.

  
Prefixed names in an instance:

<code>

    <prod:product xmlns:prod="http://datypic.com/prod">
        <prod:number>557</prod:number>
        <prod:size>10</prod:size>
    </prod:product>

</code>

