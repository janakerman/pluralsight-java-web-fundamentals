package com.pluralsight;

/**
 * Created by jakerman on 08/02/2017.
 */
public class ApplicationSettings {

    private CSSClass formCssClass;
    private String[] tabNames;

    public CSSClass getFormCssClass() {
        return formCssClass;
    }

    public void setFormCssClass(CSSClass fromCssClass) {
        this.formCssClass = fromCssClass;
    }

    public String[] getTabNames() {
        return tabNames;
    }

    public void setTabNames(String[] tabNames) {
        this.tabNames = tabNames;
    }
}
