package net.ensan.codest.despat.observer;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyTopicSubscriberTest {
    @Test
    public void observerTest() throws Exception {
        // create subject
        MyTopic topic = new MyTopic();

        // create observers
        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");

        // register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        // attach observer to subject
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        obj1.update();

        topic.postMessage("New Message");
    }

}