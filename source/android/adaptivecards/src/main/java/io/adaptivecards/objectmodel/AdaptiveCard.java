/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class AdaptiveCard {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected AdaptiveCard(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AdaptiveCard obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_AdaptiveCard(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AdaptiveCard() {
    this(AdaptiveCardObjectModelJNI.new_AdaptiveCard__SWIG_0(), true);
  }

  public AdaptiveCard(String version, String fallbackText, String backgroundImage, ContainerStyle style, String speak, String language) {
    this(AdaptiveCardObjectModelJNI.new_AdaptiveCard__SWIG_1(version, fallbackText, backgroundImage, style.swigValue(), speak, language), true);
  }

  public AdaptiveCard(String version, String fallbackText, String backgroundImage, ContainerStyle style, String speak, String language, BaseCardElementVector body, BaseActionElementVector actions) {
    this(AdaptiveCardObjectModelJNI.new_AdaptiveCard__SWIG_2(version, fallbackText, backgroundImage, style.swigValue(), speak, language, BaseCardElementVector.getCPtr(body), body, BaseActionElementVector.getCPtr(actions), actions), true);
  }

  public String GetVersion() {
    return AdaptiveCardObjectModelJNI.AdaptiveCard_GetVersion(swigCPtr, this);
  }

  public void SetVersion(String value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetVersion(swigCPtr, this, value);
  }

  public String GetFallbackText() {
    return AdaptiveCardObjectModelJNI.AdaptiveCard_GetFallbackText(swigCPtr, this);
  }

  public void SetFallbackText(String value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetFallbackText(swigCPtr, this, value);
  }

  public String GetBackgroundImage() {
    return AdaptiveCardObjectModelJNI.AdaptiveCard_GetBackgroundImage(swigCPtr, this);
  }

  public void SetBackgroundImage(String value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetBackgroundImage(swigCPtr, this, value);
  }

  public String GetSpeak() {
    return AdaptiveCardObjectModelJNI.AdaptiveCard_GetSpeak(swigCPtr, this);
  }

  public void SetSpeak(String value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetSpeak(swigCPtr, this, value);
  }

  public ContainerStyle GetStyle() {
    return ContainerStyle.swigToEnum(AdaptiveCardObjectModelJNI.AdaptiveCard_GetStyle(swigCPtr, this));
  }

  public void SetStyle(ContainerStyle value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetStyle(swigCPtr, this, value.swigValue());
  }

  public String GetLanguage() {
    return AdaptiveCardObjectModelJNI.AdaptiveCard_GetLanguage(swigCPtr, this);
  }

  public void SetLanguage(String value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetLanguage(swigCPtr, this, value);
  }

  public BaseCardElementVector GetBody() {
    return new BaseCardElementVector(AdaptiveCardObjectModelJNI.AdaptiveCard_GetBody(swigCPtr, this), false);
  }

  public BaseActionElementVector GetActions() {
    return new BaseActionElementVector(AdaptiveCardObjectModelJNI.AdaptiveCard_GetActions(swigCPtr, this), false);
  }

  public CardElementType GetElementType() {
    return CardElementType.swigToEnum(AdaptiveCardObjectModelJNI.AdaptiveCard_GetElementType(swigCPtr, this));
  }

  public static AdaptiveCard DeserializeFromFile(String jsonFile, double rendererVersion, ElementParserRegistration elementParserRegistration, ActionParserRegistration actionParserRegistration) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_DeserializeFromFile__SWIG_0(jsonFile, rendererVersion, ElementParserRegistration.getCPtr(elementParserRegistration), elementParserRegistration, ActionParserRegistration.getCPtr(actionParserRegistration), actionParserRegistration);
    return (cPtr == 0) ? null : new AdaptiveCard(cPtr, true);
  }

  public static AdaptiveCard DeserializeFromFile(String jsonFile, double rendererVersion, ElementParserRegistration elementParserRegistration) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_DeserializeFromFile__SWIG_1(jsonFile, rendererVersion, ElementParserRegistration.getCPtr(elementParserRegistration), elementParserRegistration);
    return (cPtr == 0) ? null : new AdaptiveCard(cPtr, true);
  }

  public static AdaptiveCard DeserializeFromFile(String jsonFile, double rendererVersion) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_DeserializeFromFile__SWIG_2(jsonFile, rendererVersion);
    return (cPtr == 0) ? null : new AdaptiveCard(cPtr, true);
  }

  public static AdaptiveCard Deserialize(JsonValue json, double rendererVersion, ElementParserRegistration elementParserRegistration, ActionParserRegistration actionParserRegistration) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_Deserialize__SWIG_0(JsonValue.getCPtr(json), json, rendererVersion, ElementParserRegistration.getCPtr(elementParserRegistration), elementParserRegistration, ActionParserRegistration.getCPtr(actionParserRegistration), actionParserRegistration);
    return (cPtr == 0) ? null : new AdaptiveCard(cPtr, true);
  }

  public static AdaptiveCard Deserialize(JsonValue json, double rendererVersion, ElementParserRegistration elementParserRegistration) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_Deserialize__SWIG_1(JsonValue.getCPtr(json), json, rendererVersion, ElementParserRegistration.getCPtr(elementParserRegistration), elementParserRegistration);
    return (cPtr == 0) ? null : new AdaptiveCard(cPtr, true);
  }

  public static AdaptiveCard Deserialize(JsonValue json, double rendererVersion) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_Deserialize__SWIG_2(JsonValue.getCPtr(json), json, rendererVersion);
    return (cPtr == 0) ? null : new AdaptiveCard(cPtr, true);
  }

  public static AdaptiveCard DeserializeFromString(String jsonString, double rendererVersion, ElementParserRegistration elementParserRegistration, ActionParserRegistration actionParserRegistration) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_DeserializeFromString__SWIG_0(jsonString, rendererVersion, ElementParserRegistration.getCPtr(elementParserRegistration), elementParserRegistration, ActionParserRegistration.getCPtr(actionParserRegistration), actionParserRegistration);
    return (cPtr == 0) ? null : new AdaptiveCard(cPtr, true);
  }

  public static AdaptiveCard DeserializeFromString(String jsonString, double rendererVersion, ElementParserRegistration elementParserRegistration) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_DeserializeFromString__SWIG_1(jsonString, rendererVersion, ElementParserRegistration.getCPtr(elementParserRegistration), elementParserRegistration);
    return (cPtr == 0) ? null : new AdaptiveCard(cPtr, true);
  }

  public static AdaptiveCard DeserializeFromString(String jsonString, double rendererVersion) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_DeserializeFromString__SWIG_2(jsonString, rendererVersion);
    return (cPtr == 0) ? null : new AdaptiveCard(cPtr, true);
  }

  public static AdaptiveCard MakeFallbackTextCard(String fallbackText, String language) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_MakeFallbackTextCard(fallbackText, language);
    return (cPtr == 0) ? null : new AdaptiveCard(cPtr, true);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.AdaptiveCard_SerializeToJsonValue(swigCPtr, this), true);
  }

  public String Serialize() {
    return AdaptiveCardObjectModelJNI.AdaptiveCard_Serialize(swigCPtr, this);
  }

}
