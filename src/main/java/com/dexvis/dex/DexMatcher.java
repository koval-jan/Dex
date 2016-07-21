package com.dexvis.dex;

import com.dexvis.simple.transform.*;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.*;
import javafx.scene.web.HTMLEditor;
import org.controlsfx.control.ListSelectionView;
import org.controlsfx.control.PropertySheet;
import org.simpleframework.xml.transform.Matcher;
import org.simpleframework.xml.transform.Transform;

import java.util.ArrayList;

public class DexMatcher implements Matcher
{
  @Override
  @SuppressWarnings("unchecked")
  public Transform match(Class type) throws Exception
  {
    if (type.equals(StringProperty.class)
        || type.equals(SimpleStringProperty.class))
    {
      return new StringPropertyTransform();
    }
    else if (type.equals(BooleanProperty.class)
        || type.equals(SimpleBooleanProperty.class))
    {
      return new BooleanPropertyTransform();
    }
    else if (type.equals(PropertySheet.class))
    {
      return new PropertySheetTransform();
    }
    else if (type.equals(ArrayList.class))
    {
      return new StringListTransform();
    }
    else if (type.equals(TextArea.class))
    {
      return new TextAreaTransform();
    }
    else if (type.equals(TextField.class))
    {
      return new TextFieldTransform();
    }
    else if (type.equals(ListView.class))
    {
      return new ListViewTransform();
    }
    else if (type.equals(ListSelectionView.class))
    {
      return new ListSelectionViewTransform();
    }
    else if (type.equals(RadioButton.class))
    {
      return new RadioButtonTransform();
    }
    else if (type.equals(Label.class))
    {
      return new LabelTransform();
    }
    else if (type.equals(ChoiceBox.class))
    {
      return new ChoiceBoxTransform();
    }
    else if (type.equals(CheckBox.class))
    {
      return new CheckBoxTransform();
    }
    else if (type.equals(HTMLEditor.class))
    {
      return new HTMLEditorTransform();
    }

    return null;
  }
}
