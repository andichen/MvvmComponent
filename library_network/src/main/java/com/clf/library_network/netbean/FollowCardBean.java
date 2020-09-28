package com.clf.library_network.netbean;

import com.clf.library_base.base.BaseCustomViewModel;

import java.util.List;

public class FollowCardBean extends BaseCustomViewModel {
    /**
     * type : followCard
     * data : {"dataType":"FollowCard","header":{"id":194757,"title":"The Dodo","textAlign":"left","actionUrl":"eyepetizer://pgc/detail/1922/?title=The%20Dodo&userType=PGC&tabIndex=1","icon":"http://img.kaiyanapp.com/4a62ac0a9a71ef34844802a544e5ae70.jpeg?imageMogr2/quality/60/format/jpg","iconType":"round","description":"#萌宠","time":1589722731000,"showHateVideo":false},"content":{"type":"video","data":{"dataType":"VideoBeanForClient","id":194757,"title":"小女孩与她的猫有最特殊的关系","description":"在Facebook上继续关注Carrot：thedo.do/thecatnamedcarrot，在Instagram上保持联系Carrot：thedo.do/catnamedcarrot。","library":"NOT_RECOMMEND","tags":[{"id":538,"name":"喵星人","actionUrl":"eyepetizer://tag/538/?title=%E5%96%B5%E6%98%9F%E4%BA%BA","desc":"","bgPicture":"http://img.kaiyanapp.com/e2b82549f60051d85ffb552d2efe8c07.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/e2b82549f60051d85ffb552d2efe8c07.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","haveReward":false,"ifNewest":false,"communityIndex":0},{"id":32,"name":"萌宠","actionUrl":"eyepetizer://tag/32/?title=%E8%90%8C%E5%AE%A0","desc":"来自汪星、喵星、蠢萌星的你","bgPicture":"http://img.kaiyanapp.com/bd689302a738a5d2156243a2b74f15d1.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/1ea685a0d2757701741a4a9be0f7e269.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","haveReward":false,"ifNewest":false,"communityIndex":0}],"consumption":{"collectionCount":18,"shareCount":52,"replyCount":0,"realCollectionCount":6},"resourceType":"video","provider":{"name":"定制来源","alias":"CustomSrc","icon":""},"category":"萌宠","author":{"id":1922,"icon":"http://img.kaiyanapp.com/4a62ac0a9a71ef34844802a544e5ae70.jpeg?imageMogr2/quality/60/format/jpg","name":"The Dodo","description":"与每一位爱动物，关心动物的人分享这些有趣的视频。","link":"","latestReleaseTime":1594565440000,"videoNum":81,"follow":{"itemType":"author","itemId":1922,"followed":false},"shield":{"itemType":"author","itemId":1922,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false},"cover":{"feed":"http://img.kaiyanapp.com/fde8e69a836529ffddef0f4f77dba101.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/fde8e69a836529ffddef0f4f77dba101.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/a3d4de91152abd30ffe91810a2364dd5.jpeg?imageMogr2/quality/60/format/jpg"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194757&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss","duration":201,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=194757","forWeibo":"http://www.eyepetizer.net/detail.html?vid=194757&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1589722731000,"playInfo":[],"ad":false,"adTrack":[],"type":"NORMAL","titlePgc":"小女孩与她的猫有最特殊的关系","descriptionPgc":"在Facebook上继续关注Carrot：thedo.do/thecatnamedcarrot，在Instagram上保持联系Carrot：thedo.do/catnamedcarrot。","ifLimitVideo":false,"searchWeight":0,"videoPosterBean":{},"idx":0,"date":1589722731000,"labelList":[],"descriptionEditor":"","collected":false,"reallyCollected":false,"played":false,"subtitles":[],"src":7,"recallSource":""},"id":0,"adIndex":-1},"adTrack":[]}
     * id : 0
     * adIndex : -1
     */

    private String type;
    private DataBeanX data;
    private int id;
    private int adIndex;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
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

    public static class DataBeanX {
        /**
         * dataType : FollowCard
         * header : {"id":194757,"title":"The Dodo","textAlign":"left","actionUrl":"eyepetizer://pgc/detail/1922/?title=The%20Dodo&userType=PGC&tabIndex=1","icon":"http://img.kaiyanapp.com/4a62ac0a9a71ef34844802a544e5ae70.jpeg?imageMogr2/quality/60/format/jpg","iconType":"round","description":"#萌宠","time":1589722731000,"showHateVideo":false}
         * content : {"type":"video","data":{"dataType":"VideoBeanForClient","id":194757,"title":"小女孩与她的猫有最特殊的关系","description":"在Facebook上继续关注Carrot：thedo.do/thecatnamedcarrot，在Instagram上保持联系Carrot：thedo.do/catnamedcarrot。","library":"NOT_RECOMMEND","tags":[{"id":538,"name":"喵星人","actionUrl":"eyepetizer://tag/538/?title=%E5%96%B5%E6%98%9F%E4%BA%BA","desc":"","bgPicture":"http://img.kaiyanapp.com/e2b82549f60051d85ffb552d2efe8c07.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/e2b82549f60051d85ffb552d2efe8c07.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","haveReward":false,"ifNewest":false,"communityIndex":0},{"id":32,"name":"萌宠","actionUrl":"eyepetizer://tag/32/?title=%E8%90%8C%E5%AE%A0","desc":"来自汪星、喵星、蠢萌星的你","bgPicture":"http://img.kaiyanapp.com/bd689302a738a5d2156243a2b74f15d1.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/1ea685a0d2757701741a4a9be0f7e269.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","haveReward":false,"ifNewest":false,"communityIndex":0}],"consumption":{"collectionCount":18,"shareCount":52,"replyCount":0,"realCollectionCount":6},"resourceType":"video","provider":{"name":"定制来源","alias":"CustomSrc","icon":""},"category":"萌宠","author":{"id":1922,"icon":"http://img.kaiyanapp.com/4a62ac0a9a71ef34844802a544e5ae70.jpeg?imageMogr2/quality/60/format/jpg","name":"The Dodo","description":"与每一位爱动物，关心动物的人分享这些有趣的视频。","link":"","latestReleaseTime":1594565440000,"videoNum":81,"follow":{"itemType":"author","itemId":1922,"followed":false},"shield":{"itemType":"author","itemId":1922,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false},"cover":{"feed":"http://img.kaiyanapp.com/fde8e69a836529ffddef0f4f77dba101.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/fde8e69a836529ffddef0f4f77dba101.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/a3d4de91152abd30ffe91810a2364dd5.jpeg?imageMogr2/quality/60/format/jpg"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194757&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss","duration":201,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=194757","forWeibo":"http://www.eyepetizer.net/detail.html?vid=194757&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1589722731000,"playInfo":[],"ad":false,"adTrack":[],"type":"NORMAL","titlePgc":"小女孩与她的猫有最特殊的关系","descriptionPgc":"在Facebook上继续关注Carrot：thedo.do/thecatnamedcarrot，在Instagram上保持联系Carrot：thedo.do/catnamedcarrot。","ifLimitVideo":false,"searchWeight":0,"videoPosterBean":{},"idx":0,"date":1589722731000,"labelList":[],"descriptionEditor":"","collected":false,"reallyCollected":false,"played":false,"subtitles":[],"src":7,"recallSource":""},"id":0,"adIndex":-1}
         * adTrack : []
         */

        private String dataType;
        private HeaderBean header;
        private ContentBean content;
        private List<?> adTrack;

        public String getDataType() {
            return dataType;
        }

        public void setDataType(String dataType) {
            this.dataType = dataType;
        }

        public HeaderBean getHeader() {
            return header;
        }

        public void setHeader(HeaderBean header) {
            this.header = header;
        }

        public ContentBean getContent() {
            return content;
        }

        public void setContent(ContentBean content) {
            this.content = content;
        }

        public List<?> getAdTrack() {
            return adTrack;
        }

        public void setAdTrack(List<?> adTrack) {
            this.adTrack = adTrack;
        }

        public static class HeaderBean extends BaseCustomViewModel{
            /**
             * id : 194757
             * title : The Dodo
             * textAlign : left
             * actionUrl : eyepetizer://pgc/detail/1922/?title=The%20Dodo&userType=PGC&tabIndex=1
             * icon : http://img.kaiyanapp.com/4a62ac0a9a71ef34844802a544e5ae70.jpeg?imageMogr2/quality/60/format/jpg
             * iconType : round
             * description : #萌宠
             * time : 1589722731000
             * showHateVideo : false
             */

            private int id;
            private String title;
            private String textAlign;
            private String actionUrl;
            private String icon;
            private String iconType;
            private String description;
            private long time;
            private boolean showHateVideo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTextAlign() {
                return textAlign;
            }

            public void setTextAlign(String textAlign) {
                this.textAlign = textAlign;
            }

            public String getActionUrl() {
                return actionUrl;
            }

            public void setActionUrl(String actionUrl) {
                this.actionUrl = actionUrl;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getIconType() {
                return iconType;
            }

            public void setIconType(String iconType) {
                this.iconType = iconType;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public long getTime() {
                return time;
            }

            public void setTime(long time) {
                this.time = time;
            }

            public boolean isShowHateVideo() {
                return showHateVideo;
            }

            public void setShowHateVideo(boolean showHateVideo) {
                this.showHateVideo = showHateVideo;
            }
        }

        public static class ContentBean {
            /**
             * type : video
             * data : {"dataType":"VideoBeanForClient","id":194757,"title":"小女孩与她的猫有最特殊的关系","description":"在Facebook上继续关注Carrot：thedo.do/thecatnamedcarrot，在Instagram上保持联系Carrot：thedo.do/catnamedcarrot。","library":"NOT_RECOMMEND","tags":[{"id":538,"name":"喵星人","actionUrl":"eyepetizer://tag/538/?title=%E5%96%B5%E6%98%9F%E4%BA%BA","desc":"","bgPicture":"http://img.kaiyanapp.com/e2b82549f60051d85ffb552d2efe8c07.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/e2b82549f60051d85ffb552d2efe8c07.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","haveReward":false,"ifNewest":false,"communityIndex":0},{"id":32,"name":"萌宠","actionUrl":"eyepetizer://tag/32/?title=%E8%90%8C%E5%AE%A0","desc":"来自汪星、喵星、蠢萌星的你","bgPicture":"http://img.kaiyanapp.com/bd689302a738a5d2156243a2b74f15d1.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/1ea685a0d2757701741a4a9be0f7e269.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","haveReward":false,"ifNewest":false,"communityIndex":0}],"consumption":{"collectionCount":18,"shareCount":52,"replyCount":0,"realCollectionCount":6},"resourceType":"video","provider":{"name":"定制来源","alias":"CustomSrc","icon":""},"category":"萌宠","author":{"id":1922,"icon":"http://img.kaiyanapp.com/4a62ac0a9a71ef34844802a544e5ae70.jpeg?imageMogr2/quality/60/format/jpg","name":"The Dodo","description":"与每一位爱动物，关心动物的人分享这些有趣的视频。","link":"","latestReleaseTime":1594565440000,"videoNum":81,"follow":{"itemType":"author","itemId":1922,"followed":false},"shield":{"itemType":"author","itemId":1922,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false},"cover":{"feed":"http://img.kaiyanapp.com/fde8e69a836529ffddef0f4f77dba101.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/fde8e69a836529ffddef0f4f77dba101.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/a3d4de91152abd30ffe91810a2364dd5.jpeg?imageMogr2/quality/60/format/jpg"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194757&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss","duration":201,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=194757","forWeibo":"http://www.eyepetizer.net/detail.html?vid=194757&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1589722731000,"playInfo":[],"ad":false,"adTrack":[],"type":"NORMAL","titlePgc":"小女孩与她的猫有最特殊的关系","descriptionPgc":"在Facebook上继续关注Carrot：thedo.do/thecatnamedcarrot，在Instagram上保持联系Carrot：thedo.do/catnamedcarrot。","ifLimitVideo":false,"searchWeight":0,"videoPosterBean":{},"idx":0,"date":1589722731000,"labelList":[],"descriptionEditor":"","collected":false,"reallyCollected":false,"played":false,"subtitles":[],"src":7,"recallSource":""}
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
                 * dataType : VideoBeanForClient
                 * id : 194757
                 * title : 小女孩与她的猫有最特殊的关系
                 * description : 在Facebook上继续关注Carrot：thedo.do/thecatnamedcarrot，在Instagram上保持联系Carrot：thedo.do/catnamedcarrot。
                 * library : NOT_RECOMMEND
                 * tags : [{"id":538,"name":"喵星人","actionUrl":"eyepetizer://tag/538/?title=%E5%96%B5%E6%98%9F%E4%BA%BA","desc":"","bgPicture":"http://img.kaiyanapp.com/e2b82549f60051d85ffb552d2efe8c07.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/e2b82549f60051d85ffb552d2efe8c07.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","haveReward":false,"ifNewest":false,"communityIndex":0},{"id":32,"name":"萌宠","actionUrl":"eyepetizer://tag/32/?title=%E8%90%8C%E5%AE%A0","desc":"来自汪星、喵星、蠢萌星的你","bgPicture":"http://img.kaiyanapp.com/bd689302a738a5d2156243a2b74f15d1.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/1ea685a0d2757701741a4a9be0f7e269.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","haveReward":false,"ifNewest":false,"communityIndex":0}]
                 * consumption : {"collectionCount":18,"shareCount":52,"replyCount":0,"realCollectionCount":6}
                 * resourceType : video
                 * provider : {"name":"定制来源","alias":"CustomSrc","icon":""}
                 * category : 萌宠
                 * author : {"id":1922,"icon":"http://img.kaiyanapp.com/4a62ac0a9a71ef34844802a544e5ae70.jpeg?imageMogr2/quality/60/format/jpg","name":"The Dodo","description":"与每一位爱动物，关心动物的人分享这些有趣的视频。","link":"","latestReleaseTime":1594565440000,"videoNum":81,"follow":{"itemType":"author","itemId":1922,"followed":false},"shield":{"itemType":"author","itemId":1922,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false}
                 * cover : {"feed":"http://img.kaiyanapp.com/fde8e69a836529ffddef0f4f77dba101.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/fde8e69a836529ffddef0f4f77dba101.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/a3d4de91152abd30ffe91810a2364dd5.jpeg?imageMogr2/quality/60/format/jpg"}
                 * playUrl : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194757&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss
                 * duration : 201
                 * webUrl : {"raw":"http://www.eyepetizer.net/detail.html?vid=194757","forWeibo":"http://www.eyepetizer.net/detail.html?vid=194757&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"}
                 * releaseTime : 1589722731000
                 * playInfo : []
                 * ad : false
                 * adTrack : []
                 * type : NORMAL
                 * titlePgc : 小女孩与她的猫有最特殊的关系
                 * descriptionPgc : 在Facebook上继续关注Carrot：thedo.do/thecatnamedcarrot，在Instagram上保持联系Carrot：thedo.do/catnamedcarrot。
                 * ifLimitVideo : false
                 * searchWeight : 0
                 * videoPosterBean : {}
                 * idx : 0
                 * date : 1589722731000
                 * labelList : []
                 * descriptionEditor :
                 * collected : false
                 * reallyCollected : false
                 * played : false
                 * subtitles : []
                 * src : 7
                 * recallSource :
                 */

                private String dataType;
                private int id;
                private String title;
                private String description;
                private String library;
                private ConsumptionBean consumption;
                private String resourceType;
                private ProviderBean provider;
                private String category;
                private AuthorBean author;
                private CoverBean cover;
                private String playUrl;
                private int duration;
                private WebUrlBean webUrl;
                private long releaseTime;
                private boolean ad;
                private String type;
                private String titlePgc;
                private String descriptionPgc;
                private boolean ifLimitVideo;
                private int searchWeight;
                private VideoPosterBeanBean videoPosterBean;
                private int idx;
                private long date;
                private String descriptionEditor;
                private boolean collected;
                private boolean reallyCollected;
                private boolean played;
                private int src;
                private String recallSource;
                private List<TagsBean> tags;
                private List<?> playInfo;
                private List<?> adTrack;
                private List<?> labelList;
                private List<?> subtitles;

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

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getLibrary() {
                    return library;
                }

                public void setLibrary(String library) {
                    this.library = library;
                }

                public ConsumptionBean getConsumption() {
                    return consumption;
                }

                public void setConsumption(ConsumptionBean consumption) {
                    this.consumption = consumption;
                }

                public String getResourceType() {
                    return resourceType;
                }

                public void setResourceType(String resourceType) {
                    this.resourceType = resourceType;
                }

                public ProviderBean getProvider() {
                    return provider;
                }

                public void setProvider(ProviderBean provider) {
                    this.provider = provider;
                }

                public String getCategory() {
                    return category;
                }

                public void setCategory(String category) {
                    this.category = category;
                }

                public AuthorBean getAuthor() {
                    return author;
                }

                public void setAuthor(AuthorBean author) {
                    this.author = author;
                }

                public CoverBean getCover() {
                    return cover;
                }

                public void setCover(CoverBean cover) {
                    this.cover = cover;
                }

                public String getPlayUrl() {
                    return playUrl;
                }

                public void setPlayUrl(String playUrl) {
                    this.playUrl = playUrl;
                }

                public int getDuration() {
                    return duration;
                }

                public void setDuration(int duration) {
                    this.duration = duration;
                }

                public WebUrlBean getWebUrl() {
                    return webUrl;
                }

                public void setWebUrl(WebUrlBean webUrl) {
                    this.webUrl = webUrl;
                }

                public long getReleaseTime() {
                    return releaseTime;
                }

                public void setReleaseTime(long releaseTime) {
                    this.releaseTime = releaseTime;
                }

                public boolean isAd() {
                    return ad;
                }

                public void setAd(boolean ad) {
                    this.ad = ad;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getTitlePgc() {
                    return titlePgc;
                }

                public void setTitlePgc(String titlePgc) {
                    this.titlePgc = titlePgc;
                }

                public String getDescriptionPgc() {
                    return descriptionPgc;
                }

                public void setDescriptionPgc(String descriptionPgc) {
                    this.descriptionPgc = descriptionPgc;
                }

                public boolean isIfLimitVideo() {
                    return ifLimitVideo;
                }

                public void setIfLimitVideo(boolean ifLimitVideo) {
                    this.ifLimitVideo = ifLimitVideo;
                }

                public int getSearchWeight() {
                    return searchWeight;
                }

                public void setSearchWeight(int searchWeight) {
                    this.searchWeight = searchWeight;
                }

                public VideoPosterBeanBean getVideoPosterBean() {
                    return videoPosterBean;
                }

                public void setVideoPosterBean(VideoPosterBeanBean videoPosterBean) {
                    this.videoPosterBean = videoPosterBean;
                }

                public int getIdx() {
                    return idx;
                }

                public void setIdx(int idx) {
                    this.idx = idx;
                }

                public long getDate() {
                    return date;
                }

                public void setDate(long date) {
                    this.date = date;
                }

                public String getDescriptionEditor() {
                    return descriptionEditor;
                }

                public void setDescriptionEditor(String descriptionEditor) {
                    this.descriptionEditor = descriptionEditor;
                }

                public boolean isCollected() {
                    return collected;
                }

                public void setCollected(boolean collected) {
                    this.collected = collected;
                }

                public boolean isReallyCollected() {
                    return reallyCollected;
                }

                public void setReallyCollected(boolean reallyCollected) {
                    this.reallyCollected = reallyCollected;
                }

                public boolean isPlayed() {
                    return played;
                }

                public void setPlayed(boolean played) {
                    this.played = played;
                }

                public int getSrc() {
                    return src;
                }

                public void setSrc(int src) {
                    this.src = src;
                }

                public String getRecallSource() {
                    return recallSource;
                }

                public void setRecallSource(String recallSource) {
                    this.recallSource = recallSource;
                }

                public List<TagsBean> getTags() {
                    return tags;
                }

                public void setTags(List<TagsBean> tags) {
                    this.tags = tags;
                }

                public List<?> getPlayInfo() {
                    return playInfo;
                }

                public void setPlayInfo(List<?> playInfo) {
                    this.playInfo = playInfo;
                }

                public List<?> getAdTrack() {
                    return adTrack;
                }

                public void setAdTrack(List<?> adTrack) {
                    this.adTrack = adTrack;
                }

                public List<?> getLabelList() {
                    return labelList;
                }

                public void setLabelList(List<?> labelList) {
                    this.labelList = labelList;
                }

                public List<?> getSubtitles() {
                    return subtitles;
                }

                public void setSubtitles(List<?> subtitles) {
                    this.subtitles = subtitles;
                }

                public static class ConsumptionBean {
                    /**
                     * collectionCount : 18
                     * shareCount : 52
                     * replyCount : 0
                     * realCollectionCount : 6
                     */

                    private int collectionCount;
                    private int shareCount;
                    private int replyCount;
                    private int realCollectionCount;

                    public int getCollectionCount() {
                        return collectionCount;
                    }

                    public void setCollectionCount(int collectionCount) {
                        this.collectionCount = collectionCount;
                    }

                    public int getShareCount() {
                        return shareCount;
                    }

                    public void setShareCount(int shareCount) {
                        this.shareCount = shareCount;
                    }

                    public int getReplyCount() {
                        return replyCount;
                    }

                    public void setReplyCount(int replyCount) {
                        this.replyCount = replyCount;
                    }

                    public int getRealCollectionCount() {
                        return realCollectionCount;
                    }

                    public void setRealCollectionCount(int realCollectionCount) {
                        this.realCollectionCount = realCollectionCount;
                    }
                }

                public static class ProviderBean {
                    /**
                     * name : 定制来源
                     * alias : CustomSrc
                     * icon :
                     */

                    private String name;
                    private String alias;
                    private String icon;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getAlias() {
                        return alias;
                    }

                    public void setAlias(String alias) {
                        this.alias = alias;
                    }

                    public String getIcon() {
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                    }
                }

                public static class AuthorBean {
                    /**
                     * id : 1922
                     * icon : http://img.kaiyanapp.com/4a62ac0a9a71ef34844802a544e5ae70.jpeg?imageMogr2/quality/60/format/jpg
                     * name : The Dodo
                     * description : 与每一位爱动物，关心动物的人分享这些有趣的视频。
                     * link :
                     * latestReleaseTime : 1594565440000
                     * videoNum : 81
                     * follow : {"itemType":"author","itemId":1922,"followed":false}
                     * shield : {"itemType":"author","itemId":1922,"shielded":false}
                     * approvedNotReadyVideoCount : 0
                     * ifPgc : true
                     * recSort : 0
                     * expert : false
                     */

                    private int id;
                    private String icon;
                    private String name;
                    private String description;
                    private String link;
                    private long latestReleaseTime;
                    private int videoNum;
                    private FollowBean follow;
                    private ShieldBean shield;
                    private int approvedNotReadyVideoCount;
                    private boolean ifPgc;
                    private int recSort;
                    private boolean expert;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getIcon() {
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public String getLink() {
                        return link;
                    }

                    public void setLink(String link) {
                        this.link = link;
                    }

                    public long getLatestReleaseTime() {
                        return latestReleaseTime;
                    }

                    public void setLatestReleaseTime(long latestReleaseTime) {
                        this.latestReleaseTime = latestReleaseTime;
                    }

                    public int getVideoNum() {
                        return videoNum;
                    }

                    public void setVideoNum(int videoNum) {
                        this.videoNum = videoNum;
                    }

                    public FollowBean getFollow() {
                        return follow;
                    }

                    public void setFollow(FollowBean follow) {
                        this.follow = follow;
                    }

                    public ShieldBean getShield() {
                        return shield;
                    }

                    public void setShield(ShieldBean shield) {
                        this.shield = shield;
                    }

                    public int getApprovedNotReadyVideoCount() {
                        return approvedNotReadyVideoCount;
                    }

                    public void setApprovedNotReadyVideoCount(int approvedNotReadyVideoCount) {
                        this.approvedNotReadyVideoCount = approvedNotReadyVideoCount;
                    }

                    public boolean isIfPgc() {
                        return ifPgc;
                    }

                    public void setIfPgc(boolean ifPgc) {
                        this.ifPgc = ifPgc;
                    }

                    public int getRecSort() {
                        return recSort;
                    }

                    public void setRecSort(int recSort) {
                        this.recSort = recSort;
                    }

                    public boolean isExpert() {
                        return expert;
                    }

                    public void setExpert(boolean expert) {
                        this.expert = expert;
                    }

                    public static class FollowBean {
                        /**
                         * itemType : author
                         * itemId : 1922
                         * followed : false
                         */

                        private String itemType;
                        private int itemId;
                        private boolean followed;

                        public String getItemType() {
                            return itemType;
                        }

                        public void setItemType(String itemType) {
                            this.itemType = itemType;
                        }

                        public int getItemId() {
                            return itemId;
                        }

                        public void setItemId(int itemId) {
                            this.itemId = itemId;
                        }

                        public boolean isFollowed() {
                            return followed;
                        }

                        public void setFollowed(boolean followed) {
                            this.followed = followed;
                        }
                    }

                    public static class ShieldBean {
                        /**
                         * itemType : author
                         * itemId : 1922
                         * shielded : false
                         */

                        private String itemType;
                        private int itemId;
                        private boolean shielded;

                        public String getItemType() {
                            return itemType;
                        }

                        public void setItemType(String itemType) {
                            this.itemType = itemType;
                        }

                        public int getItemId() {
                            return itemId;
                        }

                        public void setItemId(int itemId) {
                            this.itemId = itemId;
                        }

                        public boolean isShielded() {
                            return shielded;
                        }

                        public void setShielded(boolean shielded) {
                            this.shielded = shielded;
                        }
                    }
                }

                public static class CoverBean {
                    /**
                     * feed : http://img.kaiyanapp.com/fde8e69a836529ffddef0f4f77dba101.jpeg?imageMogr2/quality/60/format/jpg
                     * detail : http://img.kaiyanapp.com/fde8e69a836529ffddef0f4f77dba101.jpeg?imageMogr2/quality/60/format/jpg
                     * blurred : http://img.kaiyanapp.com/a3d4de91152abd30ffe91810a2364dd5.jpeg?imageMogr2/quality/60/format/jpg
                     */

                    private String feed;
                    private String detail;
                    private String blurred;

                    public String getFeed() {
                        return feed;
                    }

                    public void setFeed(String feed) {
                        this.feed = feed;
                    }

                    public String getDetail() {
                        return detail;
                    }

                    public void setDetail(String detail) {
                        this.detail = detail;
                    }

                    public String getBlurred() {
                        return blurred;
                    }

                    public void setBlurred(String blurred) {
                        this.blurred = blurred;
                    }
                }

                public static class WebUrlBean {
                }

                public static class VideoPosterBeanBean {
                }

                public static class TagsBean {
                    /**
                     * id : 538
                     * name : 喵星人
                     * actionUrl : eyepetizer://tag/538/?title=%E5%96%B5%E6%98%9F%E4%BA%BA
                     * desc :
                     * bgPicture : http://img.kaiyanapp.com/e2b82549f60051d85ffb552d2efe8c07.jpeg?imageMogr2/quality/60/format/jpg
                     * headerImage : http://img.kaiyanapp.com/e2b82549f60051d85ffb552d2efe8c07.jpeg?imageMogr2/quality/60/format/jpg
                     * tagRecType : NORMAL
                     * haveReward : false
                     * ifNewest : false
                     * communityIndex : 0
                     */

                    private int id;
                    private String name;
                    private String actionUrl;
                    private String desc;
                    private String bgPicture;
                    private String headerImage;
                    private String tagRecType;
                    private boolean haveReward;
                    private boolean ifNewest;
                    private int communityIndex;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getActionUrl() {
                        return actionUrl;
                    }

                    public void setActionUrl(String actionUrl) {
                        this.actionUrl = actionUrl;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public String getBgPicture() {
                        return bgPicture;
                    }

                    public void setBgPicture(String bgPicture) {
                        this.bgPicture = bgPicture;
                    }

                    public String getHeaderImage() {
                        return headerImage;
                    }

                    public void setHeaderImage(String headerImage) {
                        this.headerImage = headerImage;
                    }

                    public String getTagRecType() {
                        return tagRecType;
                    }

                    public void setTagRecType(String tagRecType) {
                        this.tagRecType = tagRecType;
                    }

                    public boolean isHaveReward() {
                        return haveReward;
                    }

                    public void setHaveReward(boolean haveReward) {
                        this.haveReward = haveReward;
                    }

                    public boolean isIfNewest() {
                        return ifNewest;
                    }

                    public void setIfNewest(boolean ifNewest) {
                        this.ifNewest = ifNewest;
                    }

                    public int getCommunityIndex() {
                        return communityIndex;
                    }

                    public void setCommunityIndex(int communityIndex) {
                        this.communityIndex = communityIndex;
                    }
                }
            }
        }
    }
}
