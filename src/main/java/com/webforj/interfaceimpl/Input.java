package com.webforj.interfaceimpl;

import com.webforj.component.element.ElementComposite;
import com.webforj.component.element.PropertyDescriptor;
import com.webforj.component.element.annotation.NodeName;
import com.webforj.concern.HasPlaceholder;

@NodeName("dwc-input")
public class Input extends ElementComposite implements HasPlaceholder<Input> {
  private final PropertyDescriptor<String> placeholderProp = PropertyDescriptor.property("placeholder", null);
}
