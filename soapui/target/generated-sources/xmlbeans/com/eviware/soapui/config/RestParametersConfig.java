/*
 * XML Type:  RestParameters
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RestParametersConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML RestParameters(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface RestParametersConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RestParametersConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("restparametersca32type");
    
    /**
     * Gets a List of "parameter" elements
     */
    java.util.List<com.eviware.soapui.config.RestParameterConfig> getParameterList();
    
    /**
     * Gets array of all "parameter" elements
     * @deprecated
     */
    com.eviware.soapui.config.RestParameterConfig[] getParameterArray();
    
    /**
     * Gets ith "parameter" element
     */
    com.eviware.soapui.config.RestParameterConfig getParameterArray(int i);
    
    /**
     * Returns number of "parameter" element
     */
    int sizeOfParameterArray();
    
    /**
     * Sets array of all "parameter" element
     */
    void setParameterArray(com.eviware.soapui.config.RestParameterConfig[] parameterArray);
    
    /**
     * Sets ith "parameter" element
     */
    void setParameterArray(int i, com.eviware.soapui.config.RestParameterConfig parameter);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameter" element
     */
    com.eviware.soapui.config.RestParameterConfig insertNewParameter(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameter" element
     */
    com.eviware.soapui.config.RestParameterConfig addNewParameter();
    
    /**
     * Removes the ith "parameter" element
     */
    void removeParameter(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.RestParametersConfig newInstance() {
          return (com.eviware.soapui.config.RestParametersConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.RestParametersConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.RestParametersConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.RestParametersConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestParametersConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.RestParametersConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestParametersConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.RestParametersConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestParametersConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.RestParametersConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestParametersConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.RestParametersConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestParametersConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.RestParametersConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestParametersConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.RestParametersConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestParametersConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.RestParametersConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestParametersConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.RestParametersConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestParametersConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.RestParametersConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestParametersConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.RestParametersConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestParametersConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.RestParametersConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestParametersConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.RestParametersConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestParametersConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.RestParametersConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestParametersConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.RestParametersConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.RestParametersConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.RestParametersConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.RestParametersConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
