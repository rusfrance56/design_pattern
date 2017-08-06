package design_pattern.observer.custom;

import junit.framework.TestCase;

public class ConcreteObserverImplTest extends TestCase {

    private ConcreteSubjectImpl subject;
    private ConcreteObserverImpl observer;

    public void setUp() throws Exception {
        super.setUp();
        subject = new ConcreteSubjectImpl();
        observer = new ConcreteObserverImpl(subject);
    }

    public void testDisplay() throws Exception {
        assertEquals("HELLO! 0 0", observer.display());
        subject.subjectChanged(2, 2);
        assertEquals("HELLO! 2 2", observer.display());
    }
}