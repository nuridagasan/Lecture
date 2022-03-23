# Simple Types
## Builtin Simple Types

| Category          | Built-in types                                                                                                                                                                                        |
|-------------------|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Strings and names | string, normalizedString, token, Name, NCName, QName, language                                                                                                                                        |
| Numeric           | float, double, decimal, integer, long, int, short, byte, positiveInteger, nonPositiveInteger,<br> negativeInteger, nonNegativeInteger,unsignedLong, unsignedInt, unsignedShort,unsignedByte           |
| Date and time     | duration, dateTime, date, time, gYear, gYearMonth, gMonth, gMonthDay, gDay,<br> 1.1 dayTimeDuration, 1.1 yearMonthDuration, 1.1 dateTimeStamp                                                         |
| XML DTD types     | ID, IDREF, IDREFS, ENTITY, ENTITIES, NMTOKEN, NMTOKENS, NOTATION                                                                                                                                      |
| Other             | boolean, hexBinary, base64Binary, anyURI                                                                                                                                                              |

## Restricting Simple Types

| Category               | Facets                                                                |
|------------------------|:----------------------------------------------------------------------|
| Bound                  | minInclusive, maxInclusive, minExclusive, maxExclusive                |
| Length                 | length, minLength, maxLength                                          |
| Precision              | totalDigits, fractionDigits                                           |
| Enumerated Values      | enumeration                                                           |
| Pattern Matching       | pattern                                                               |
| Whitespace Processing  | whiteSpace                                                            |
| XPath-based Assertions | assertion                                                             |
| Timezone Requirements  | explicitTimezone                                                      |

## Content Models

The order and structure of the child elements of a complex type are known as its content model.
- Sequence groups require that the child elements appear in the
order specified.
- Choice groups allow any one of several child elements to appear.
- All groups allow child elements to appear in any order.
 
## Deriving Complex Types

Restriction: restricts the valid contents of a type. The values for the new type are a subset of those for the base type. All values of the restricted type are also valid according to the base type.
Extension: allows for adding additional child elements and/or attributes to a type, thus extending the contents of the type. Values of the base type are not necessarily valid for the extended type, since required elements or attributes may be added.

<code>

    <xs:complexType name="ShirtType">
        <xs:complexContent>
            <xs:extension base="ProductType">
                <xs:sequence>
                    <xs:element name="color" type="ColorType"/>
                </xs:sequence>
                <xs:attribute name="id" type="xs:ID" use="required"/>
            </xs:extension>
        </xs:complexContent>
    </xs:complexType>

</code>