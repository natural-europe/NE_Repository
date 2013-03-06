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
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dc:title>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:date">
				<dcterms:created>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:created>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:subject">
				<dc:subject>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>

				</dc:subject>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:temporal">
				<dcterms:temporal>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:temporal>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:spatial">
				<dcterms:spatial>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:spatial>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:type">
				<dc:type>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dc:type>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:medium">
				<dcterms:medium>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:medium>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:contributor">
				<dc:contributor>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dc:contributor>
			</xsl:for-each>

			<dc:title>

				<xsl:choose>
					<xsl:when test="@xml:lang">
						<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
						<xsl:value-of select="ne:metadata/ne:scientificName" />
					</xsl:when>
					<xsl:otherwise>
						<xsl:value-of select="ne:metadata/ne:scientificName" />
					</xsl:otherwise>
				</xsl:choose>

			</dc:title>

			<xsl:for-each select="ne:metadata/ne:alternative">
				<dcterms:alternative>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:alternative>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:description">
				<dc:description>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dc:description>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:created">
				<dcterms:issued>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:issued>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:identifier">
				<dc:identifier>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dc:identifier>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:creator">
				<dc:creator>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dc:creator>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:language">
				<dc:language>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
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
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>

				</dc:format>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:extent">
				<dcterms:extent>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:extent>
			</xsl:for-each>

			<europeana:rights>
				<xsl:value-of select="ne:metadata/ne:licenseUri" />
			</europeana:rights>
			<xsl:for-each select="ne:metadata/ne:rights">
				<dc:rights>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dc:rights>
			</xsl:for-each>

			<dc:rights>
				<xsl:choose>
					<xsl:when test="@xml:lang">
						<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
						<xsl:value-of select="ne:header/ne:access" />
					</xsl:when>
					<xsl:otherwise>
						<xsl:value-of select="ne:header/ne:access" />
					</xsl:otherwise>
				</xsl:choose>

			</dc:rights>

			<xsl:for-each select="ne:metadata/ne:isPartOf">
				<dcterms:isPartOf>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:isPartOf>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:source">
				<dc:source>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dc:source>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:relation">
				<dc:relation>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dc:relation>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:conformsTo">
				<dcterms:conformsTo>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:conformsTo>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:hasFormat">
				<dcterms:hasFormat>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:hasFormat>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:isFormatOf">
				<dcterms:isFormatOf>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:isFormatOf>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:hasVersion">
				<dcterms:hasVersion>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:hasVersion>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:isVersionOf">
				<dcterms:isVersionOf>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:isVersionOf>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:hasPart">
				<dcterms:hasPart>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:hasPart>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:isReferencedBy">
				<dcterms:isReferencedBy>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:isReferencedBy>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:references">
				<dcterms:references>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:references>
			</xsl:for-each>


			<xsl:for-each select="ne:metadata/ne:isReplacedBy">
				<dcterms:isReplacedBy>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:isReplacedBy>
			</xsl:for-each>

			<xsl:for-each select="ne:metadata/ne:replaces">
				<dcterms:replaces>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:replaces>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:isRequiredBy">
				<dcterms:isRequiredBy>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
				</dcterms:isRequiredBy>
			</xsl:for-each>
			<xsl:for-each select="ne:metadata/ne:requires">
				<dcterms:requires>
					<xsl:choose>
						<xsl:when test="@xml:lang">
							<xsl:attribute name="xml:lang">
								<xsl:value-of select="@xml:lang" />
							</xsl:attribute>
							<xsl:value-of select="." />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="." />
						</xsl:otherwise>
					</xsl:choose>
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