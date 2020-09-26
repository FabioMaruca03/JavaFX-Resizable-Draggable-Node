package sample;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.scene.layout.Pane;

public class ResizablePane extends Pane {

    private DoubleProperty h = new SimpleDoubleProperty();
    private DoubleProperty w = new SimpleDoubleProperty();

    public ResizablePane(double h, double w) {
        setHeight(h);
        setWidth(w);
    }

    @Override
    public void setWidth(double v) {
        super.setWidth(v);
        setPrefWidth(v);
        w.setValue(v);
    }

    @Override
    public void setHeight(double v) {
        super.setHeight(v);
        setPrefHeight(v);
        h.setValue(v);
    }

    public double getH() {
        return h.get();
    }

    public DoubleProperty hProperty() {
        return h;
    }

    public double getW() {
        return w.get();
    }

    public DoubleProperty wProperty() {
        return w;
    }
}
