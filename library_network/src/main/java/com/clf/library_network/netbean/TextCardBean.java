package com.clf.library_network.netbean;

import com.clf.library_base.base.BaseCustomViewModel;

public class TextCardBean extends BaseCustomViewModel {
    /**
     * type : textCard
     * data : {"dataType":"TextCard","id":0,"type":"header5","text":"喵星人","actionUrl":"eyepetizer://tag/538/?title=%E5%96%B5%E6%98%9F%E4%BA%BA"}
     * id : 0
     * adIndex : -1
     */

    private String type;
    private DataBean data;
    private int id;
    private int adIndex;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdIndex() {
        return adIndex;
    }

    public void setAdIndex(int adIndex) {
        this.adIndex = adIndex;
    }

    public static class DataBean {
        /**
         * dataType : TextCard
         * id : 0
         * type : header5
         * text : 喵星人
         * actionUrl : eyepetizer://tag/538/?title=%E5%96%B5%E6%98%9F%E4%BA%BA
         */

        private String dataType;
        private int id;
        private String type;
        private String text;
        private String actionUrl;

        public String getDataType() {
            return dataType;
        }

        public void setDataType(String dataType) {
            this.dataType = dataType;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getActionUrl() {
            return actionUrl;
        }

        public void setActionUrl(String actionUrl) {
            this.actionUrl = actionUrl;
        }
    }
}
