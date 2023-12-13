/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class RichTextBlock extends BaseCardElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected RichTextBlock(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.RichTextBlock_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RichTextBlock obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_RichTextBlock(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RichTextBlock() {
    this(AdaptiveCardObjectModelJNI.new_RichTextBlock__SWIG_0(), true);
  }

  public RichTextBlock(RichTextBlock arg0) {
    this(AdaptiveCardObjectModelJNI.new_RichTextBlock__SWIG_1(RichTextBlock.getCPtr(arg0), arg0), true);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.RichTextBlock_SerializeToJsonValue(swigCPtr, this), true);
  }

  public @androidx.annotation.Nullable HorizontalAlignment GetHorizontalAlignment() {
    StdOptionalHorizontalAlignment optvalue = new StdOptionalHorizontalAlignment(AdaptiveCardObjectModelJNI.RichTextBlock_GetHorizontalAlignment(swigCPtr, this), false);
    return optvalue.has_value() ? optvalue.value() : null;
  }

  public void SetHorizontalAlignment(@androidx.annotation.Nullable HorizontalAlignment value) {
    StdOptionalHorizontalAlignment optvalue = (value == null) ? new StdOptionalHorizontalAlignment() : new StdOptionalHorizontalAlignment(value);
    {
      AdaptiveCardObjectModelJNI.RichTextBlock_SetHorizontalAlignment(swigCPtr, this, StdOptionalHorizontalAlignment.getCPtr(optvalue), optvalue);
    }
  }

  public InlineVector GetInlines() {
    return new InlineVector(AdaptiveCardObjectModelJNI.RichTextBlock_GetInlines__SWIG_0(swigCPtr, this), false);
  }

  public static RichTextBlock dynamic_cast(BaseCardElement baseCardElement) {
    long cPtr = AdaptiveCardObjectModelJNI.RichTextBlock_dynamic_cast(BaseCardElement.getCPtr(baseCardElement), baseCardElement);
    return (cPtr == 0) ? null : new RichTextBlock(cPtr, true);
  }

}
