package io.fabianterhorst.fastlayout.processor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.fabianterhorst.fastlayout.converters.LayoutAttribute;

public class LayoutEntity {

    private String id;

    private String name;

    private List<LayoutEntity> children;

    private LayoutParam layoutParams;

    private boolean hasChildren;

    private Map<Object, LayoutParamEntry> layoutParamsList;

    private List<LayoutAttribute> attributes;

    private boolean relative;

    private String rootLayout;

    public LayoutEntity() {
        children = new ArrayList<>();
        //Todo : ArrayMap ? !
        layoutParamsList = new HashMap<>();
        attributes = new ArrayList<>();
        hasChildren = false;
        relative = false;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public void setRootLayout(String rootLayout) {
        this.rootLayout = rootLayout;
    }

    public void addAttribute(LayoutAttribute attribute) {
        this.attributes.add(attribute);
    }

    public void addAllAttributes(List<LayoutAttribute> attributes) {
        this.attributes.addAll(attributes);
    }

    public void addLayoutParam(Object name, Object value, boolean paramValue, boolean rule) {
        layoutParamsList.put(name, new LayoutParamEntry(value, paramValue, rule));
    }

    public void addLayoutParam(Object name, Object value, boolean paramValue, boolean rule, boolean number) {
        layoutParamsList.put(name, new LayoutParamEntry(value, paramValue, rule, number));
    }

    public void addLayoutParam(Object name, Object value, boolean paramValue, boolean rule, boolean number, boolean setter) {
        layoutParamsList.put(name, new LayoutParamEntry(value, paramValue, rule, number, setter));
    }

    public void setLayoutParams(LayoutParam layoutParams) {
        this.layoutParams = layoutParams;
    }

    public void addChild(LayoutEntity child) {
        children.add(child);
    }

    public void addChildren(List<LayoutEntity> child) {
        children.addAll(child);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LayoutParam getLayoutParams() {
        return layoutParams;
    }

    public Map<Object, LayoutParamEntry> getLayoutParamsList() {
        return layoutParamsList;
    }

    public List<LayoutEntity> getChildren() {
        return children;
    }

    public String getRootLayout() {
        return rootLayout;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setRelative(boolean relative) {
        this.relative = relative;
    }

    public boolean isRelative() {
        return relative;
    }

    public List<LayoutAttribute> getAttributes() {
        return attributes;
    }
}
