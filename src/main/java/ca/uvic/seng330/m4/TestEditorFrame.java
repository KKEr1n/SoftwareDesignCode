package ca.uvic.seng330.m4;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

public class TestEditorFrame {
  private Method aCreateFileFilter;
  private EditorFrame aEditorFrame;

  @Before
  public void setup() throws Exception {
    aCreateFileFilter = EditorFrame.class.getDeclaredMethod("createFileFilter", String.class);
    aCreateFileFilter.setAccessible(true);
    aEditorFrame = new EditorFrame(UMLEditor.class);
  }

  @Test
  public void testCreateFileFilterAcceptDirectory()
  {
    FileFilter filter = createFileFilter("PNG");
    File temp = new File("foo");
    temp.mkdir();
    assertTrue(temp.isDirectory());
    assertTrue(filter.accept(temp));
    temp.delete();
  }

  private FileFilter createFileFilter(String pFormat) {
    try {
      return (FileFilter) aCreateFileFilter.invoke(aEditorFrame, pFormat);
    } catch (InvocationTargetException | IllegalAccessException pException) {
      TestCase.fail();
      return null;
    }
  }
}