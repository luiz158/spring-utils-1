package org.ninjaapps.events.shapes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Author: Daniel
 */
@Component
public class Circle implements Shape {
    @Autowired
    @Qualifier("center")
    private Point center;

    @Override
    public void draw() {
        System.out.println("Drawing circle:");
        String text = String.format("center point = (%d,%d)", center.getX(), center.getY());
        System.out.println(text);
    }

    @PostConstruct
    public void initializeCircle() {
        System.out.println("Init of Circle");
    }

    @PreDestroy
    public void destroyCircle() {
        System.out.println("Destroy of Circle");
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
