package com.dexvis.simple.transform;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.simpleframework.xml.transform.Transform;

import java.util.ArrayList;

public class StringListTransform implements Transform<ArrayList<String>>
{

  public ArrayList<String> read(String value) throws Exception
  {
    XStream xstream = new XStream(new DomDriver());
    return (ArrayList<String>) xstream.fromXML(value);
  }

  @Override
  public String write(ArrayList<String> value) throws Exception
  {
    XStream xstream = new XStream(new DomDriver());
    return xstream.toXML(value);
  }
}
