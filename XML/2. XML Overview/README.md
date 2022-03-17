# 2.1 Types of XML Content

- XML document Declaration
- Elements
- Attributes
- Comments
- Character Data
- Processing Instructions
- Entity References

## The Document Declaration

The document declaration looks like this:

<code>

    <?xml version ="1.0" encoding="UTF-8" standalone = "yes"?>

</code>

**It is technically optional however the W3C recommends it**

  - Identifies the file as XML document
  - Provides a place for the encoding and standalone attributes
  - Must be at very beginning; not even whitespace before it

**The encoding attribute**

- Defaults to UTF-8 if you don't include it

**The standalone attribute**

- Indicates whether the document is complete by itself

## Elements (Tags)

**Elements must have valid names**

- They can begin with underscore "_" or letter
- Followed by letters, digits, periods, hyphens, underscores
- Cannot use the string "xml" in any case combination since the W3C reserves that

**Valid Tag Names:**

<code> 

    <_Tag1>
    <My.Tag>
    <My-Tag_Name>

</code>

**Invalid Tag Names:**

<code> 

    <1Tag> <!-- Can't begin with number -->
    <#Ta&g> <!-- Invalid characters in name -->
    <XmL> <!-- the string "xml" is reserved -->

</code>

## Attributes 

Attributes
- are specified on opening element tags
- must start with letter or underscore (can be followed by digits, letters, hyphens, periods, underscores)
- begin with "xml", are reserved
- appear only once on a given element

## Comments

**Comments embed human-readable information**
Comments
- start with `<!--`  
- end with `-->`

<code> 

    <tag>
    <!-- comment -->
    </tag>

</code>

## Character Data (CDATA)

**It is part of the document, but it is not parsed by the XML parse**

Character data
- defined as `<! [CDATA[ and ends with]] >`
- generally used to contain unescaped textual data

Example 

<code>

    <script>
        <![CDATA[
        function total(num1, num2) {
                return num1 + num2;
           }
        ]]>
    </script>

</code>

## Processing Instructions

**Special instructions to the XML parser**

Have the form ``<?targetName instruction ?>``

- the "xml" target name is reserved 
- can start with number or letter, then be followed by digits, letters, hyphens, periods, underscores

Example: your app has multiple spell-checking modes, ``<?SpellCheckMode mode="en-GB"?>``

## Entities

Entities
- help shorten and modularize XML documents
- provide markup for illegal characters

### General Entities

- replaced by parser with a full string
- Examples: ``&copyright;`` or ``&author;``

### Character Entities

Examples: ``&#065;``, ``&amp;``, ``&lt;`` or ``&quot;``

# 2.2 Proper XML Syntax

- XML documents must have a single root tag
- XML documents must be "well-formed"
- Empty tags must be closed with ``/>``
- Instead of ``<tag></tag>``, prefer ``<tag />``

**Attributes values cannot be minimized**
- ``<option selected/>`` is illegal, prefer ``<option selected="selected"/>``

**Attributes values must be inside of quotes, single or double**
- ``<elem attr=val/>`` is illegal, prefer ``<elem attr="val"/>``

**Tags must be properly nested inside each other**

# 2.3 Valid Documents

You can validate your XML file by setting certain XML syntax rules eg. element name, well-form

**Document type definitions (DTDs)**

- Simple to use, but not very powerful
- Written using a syntax that is different from XML

**XML Schema**

- Much more powerful and flexible than DTD
- Written using XML syntax rules

# 2.4 XML Namespaces

XML Namespaces provide a method to avoid element name conflicts between different languages

- Form <html xmlns = "https://example.com">