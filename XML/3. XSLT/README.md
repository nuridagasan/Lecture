# [Config Schema](./config_test.xsd) Documentation

##DESCRIBING THE GRAMMAR 
### Program (Element)
    - Contains one or more events

### Event (Element)
    - Must contain a StartTime
    - May contain LaserOn or LaserOff
    - StartTime must be the first element within
    - StartTime occurs only once
    - LaserOn or LaserOff may occur one or more times
    - LaserOn or LaserOff may occur in any order   

### StartTime (Element)
    - Contains a number in the form of text
    - Contains no child elements
    - Must have an attribute 
    - Must be either "us" or "ms"
### LaserOn (Element)
    - Contains no content at all
    - Must have an attribute called channel
        > May be any freeform text
### LaserOff (Element)
    - Identical to LaserOn in every way, but the element name

Each Element has
- Name
- Content
    - Repetition
    - Child Elements
    - Ordering
- Attribute
    - Name
    - Allowed Values/Rules
- Other desirable features
    - Re-use
    - Grouping

Parts of and XSD File
- Elements
- Attributes
- Types
    - SimpleType: numeric, string, etc.
    - ComplexType: aggregations, extensions, restrictions of SimpleType
- Content
    - SimpleContent: single rule, no aggregation
    - ComplexContent: derivatives, aggregations, etc of above
- Groups
- Annotations


### Overall Template


<code>

Each element has                           <xs:element>
- Name                                     @name
- Content                                  <xs:simpleContent><xs:complexContent>
    - Child elements                       <xs:element>
    - Ordering                             <xs:all>, <xs:sequence>, <xs:choice>
    - Repetition                           @minOccurs, @maxOccurs
- Attribute                                <xs:attribute>
    - Name                                 @name
    - Allowed Values/Rules                 @type
    - Required vs Optional                 @use="required" @use="optional"
- Other desirable features                 
    - Re-use                               <xs:complexType> with @name
    - Grouping                             <xs:group>


</code>