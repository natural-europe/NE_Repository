<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:europeana="http://www.europeana.eu/schemas/ese/"
	xmlns:ne="http://www.natural-europe.eu/nhm/" xmlns:dcterms="http://purl.org/dc/terms/"
	xmlns:dc="http://purl.org/dc/elements/1.1/" xmlns="http://www.europeana.eu/schemas/ese/"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.europeana.eu/schemas/ese/ http://www.europeana.eu/schemas/ese/ESE-V3.4.xsd">
	<!-- -->
	<xsl:output method="xml" indent="yes" omit-xml-declaration="yes" />
	<xsl:template match="ne:record">
		<!-- TODO: Auto-generated template -->

		<!-- <ese:metadata> -->
		<record>
			<xsl:for-each select="ne:metadata/ne:title">
				<dc:title>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dc:title>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:date">
				<dcterms:created>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:created>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:subject">
				<dc:subject>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />

				</dc:subject>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:temporal">
				<dcterms:temporal>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:temporal>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:spatial">
				<dcterms:spatial>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:spatial>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:type">
				<dc:type>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dc:type>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:medium">
				<dcterms:medium>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:medium>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:contributor">
				<dc:contributor>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dc:contributor>
			</xsl:for-each>

			<dc:title>
				<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
				<xsl:value-of select="ne:metadata/ne:scientificName" />
			</dc:title>

			<xsl:for-each select="ne:metadata/ne:alternative">
				<dcterms:alternative>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:alternative>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:description">
				<dc:description>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dc:description>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:created">
				<dcterms:issued>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:issued>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:identifier">
				<dc:identifier>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dc:identifier>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:creator">
				<dc:creator>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dc:creator>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:language">
				<dc:language>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dc:language>
			</xsl:for-each>

			<europeana:isShownBy>
				<xsl:value-of select="ne:metadata/ne:objectUri" />
			</europeana:isShownBy>
			<europeana:isShownAt>
				<xsl:value-of select="ne:metadata/ne:contextUri" />
			</europeana:isShownAt>
			<europeana:type>
					<xsl:value-of select="ne:metadata/ne:contentType" />
				</europeana:type>
			<xsl:for-each select="ne:metadata/ne:format">
				<dc:format>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dc:format>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:extent">
				<dcterms:extent>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:extent>
			</xsl:for-each>

			<europeana:rights>
				<xsl:value-of select="ne:metadata/ne:licenseUri" />
			</europeana:rights>
			<xsl:for-each select="ne:metadata/ne:rights">
				<dc:rights>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dc:rights>
			</xsl:for-each>

			<dc:rights>
				<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
				<xsl:value-of select="ne:header/ne:access" />
			</dc:rights>

			<xsl:for-each select="ne:metadata/ne:isPartOf">
				<dcterms:isPartOf>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:isPartOf>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:source">
				<dc:source>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dc:source>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:relation">
				<dc:relation>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dc:relation>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:conformsTo">
				<dcterms:conformsTo>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:conformsTo>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:hasFormat">
				<dcterms:hasFormat>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:hasFormat>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:isFormatOf">
				<dcterms:isFormatOf>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:isFormatOf>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:hasVersion">
				<dcterms:hasVersion>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:hasVersion>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:isVersionOf">
				<dcterms:isVersionOf>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:isVersionOf>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:hasPart">
				<dcterms:hasPart>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:hasPart>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:isReferencedBy">
				<dcterms:isReferencedBy>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:isReferencedBy>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:references">
				<dcterms:references>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:references>
			</xsl:for-each>


			<xsl:for-each select="ne:metadata/ne:isReplacedBy">
				<dcterms:isReplacedBy>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:isReplacedBy>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:replaces">
				<dcterms:replaces>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:replaces>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:isRequiredBy">
				<dcterms:isRequiredBy>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:isRequiredBy>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:requires">
				<dcterms:requires>
					<xsl:attribute name="xml:lang">
						<xsl:value-of select="@xml:lang" />
					</xsl:attribute>
					<xsl:value-of select="." />
				</dcterms:requires>
			</xsl:for-each>

			<europeana:dataProvider>
					<xsl:value-of select="ne:metadata/ne:dataProvider" />
				</europeana:dataProvider>

			<europeana:provider>
						<xsl:value-of select="ne:metadata/ne:provider" />
				</europeana:provider>

		</record>
		<!-- </ese:metadata> -->

	</xsl:template>
</xsl:stylesheet>