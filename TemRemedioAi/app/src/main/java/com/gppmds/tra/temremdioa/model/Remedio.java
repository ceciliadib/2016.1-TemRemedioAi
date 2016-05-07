//MODEL
package com.gppmds.tra.temremdioa.model;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;

@ParseClassName("Medicamentos")
public class Remedio extends ParseObject {
    public String getCodSes(){
        return getString("cod_ses");
    }

    public void setCodSes(String cod_ses){
        put("cod_ses", cod_ses);
    }

    public String getMedDes(){
        return getString("med_des");
    }

    public void setMedDes(String med_des){
        put("med_des", med_des);
    }

    public String getUnid(){
        return getString("unid");
    }

    public void setUnid(String unid){
        put("unid", unid);
    }

    public String getNivelAt(){
        return getString("nivel_at");
    }

    public void setNivelAt(String nivel_at){
        put("nivel_at", nivel_at);
    }

    public static ParseQuery<Remedio> getQuery() {
        return ParseQuery.getQuery(Remedio.class);
    }


    @Override
    public String toString() {
        return getString("med_des");
    }
}
