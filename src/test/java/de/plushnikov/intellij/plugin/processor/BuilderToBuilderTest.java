package de.plushnikov.intellij.plugin.processor;

import de.plushnikov.intellij.plugin.AbstractLombokParsingTestCase;

import java.io.IOException;

/**
 * Unit tests for IntelliJPlugin for Lombok, based on lombok test classes
 */
public class BuilderToBuilderTest extends AbstractLombokParsingTestCase {
  @Override
  public void setUp() throws Exception {
    super.setUp();
    // Add dummy classes, which are absent in mockJDK
    myFixture.addClass("package java.util;\n  public interface NavigableMap<K,V> extends java.util.SortedMap<K,V> {}");
  }

  //  TODO implement me
  public void ignore_testBuilder$BuilderWithToBuilder() throws IOException {
    doTest(true);
  }

  //  TODO fixme
  public void ignore_testBuilder$BuilderWithToBuilderOnClass() throws IOException {
    doTest(true);
  }

  //  TODO fixme
  public void ignore_testBuilder$BuilderWithToBuilderOnConstructor() throws IOException {
    doTest(true);
  }

  //  TODO fixme
  public void ignore_testBuilder$BuilderWithToBuilderOnMethod() throws IOException {
    doTest(true);
  }
}