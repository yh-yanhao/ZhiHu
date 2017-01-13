package com.zh.zhihuxiangmu.bean;

import java.util.List;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class MyBean {

    /**
     * date : 20170106
     * stories : [{"images":["http://pic1.zhimg.com/dba8c1abb28290d615bd7e782ef3925c.jpg"],"type":0,"id":9124063,"ga_prefix":"010619","title":"可口可乐为什么不涨价？"},{"images":["http://pic3.zhimg.com/979bb8d21324f96290c9ad0bee62a1b6.jpg"],"type":0,"id":9128086,"ga_prefix":"010618","title":"别指望猪血能清理肺里的雾霾，鸡血鸭血也不行"},{"images":["http://pic3.zhimg.com/3a7cb393a09ed230bb41482cc5938cc6.jpg"],"type":0,"id":9128265,"ga_prefix":"010617","title":"知乎好问题 · 怎么做好吃的牛角面包？"},{"images":["http://pic2.zhimg.com/b42cd380b5817b3abc5f769747485031.jpg"],"type":0,"id":9127923,"ga_prefix":"010616","title":"看天气、美颜、上网的工具型 app，到底要怎样才能赚钱？"},{"images":["http://pic4.zhimg.com/76e74ef5f630984c76dcf95614c76157.jpg"],"type":0,"id":9127631,"ga_prefix":"010615","title":"在资本里打了几个滚，天天快递这次归了苏宁"},{"images":["http://pic3.zhimg.com/29f7efdd99f3a541d2daf90814b5d172.jpg"],"type":0,"id":9127649,"ga_prefix":"010614","title":"为什么中国专家不研究穿山甲？因为，早被吃没了\u2026\u2026"},{"images":["http://pic2.zhimg.com/bbb6b227cc6c582f0f0b70af11ae0cb9.jpg"],"type":0,"id":9127478,"ga_prefix":"010613","title":"我们和聂卫平聊了聊，关于那场比赛，关于 AlphaGo"},{"images":["http://pic3.zhimg.com/133ba43f50c610e8902f3730061f7c42.jpg"],"type":0,"id":9127212,"ga_prefix":"010612","title":"大误 · 和我男神谈恋爱"},{"title":"「我会一直开下去」，这是赛车运动最大的魅力","ga_prefix":"010611","images":["http://pic1.zhimg.com/3f8f72f8900101643bcaca50ca057db8.jpg"],"multipic":true,"type":0,"id":9126432},{"images":["http://pic1.zhimg.com/1e00818bda6f2f17e02177d86a2e275c.jpg"],"type":0,"id":9126426,"ga_prefix":"010610","title":"「现在的农村不行了，到处是白瓷砖，没有美感了」"},{"images":["http://pic2.zhimg.com/2bdef1a70a0ae549c5fe6c5ab4d957e9.jpg"],"type":0,"id":9124077,"ga_prefix":"010609","title":"接下来，让我们欢迎今天的 DJ\u2014\u2014统治棋坛的 AlphaGo"},{"images":["http://pic4.zhimg.com/24af70bd47b2051e58f851a68f2726d3.jpg"],"type":0,"id":9124149,"ga_prefix":"010608","title":"作为一名财务，我算了算为什么自己工资低"},{"images":["http://pic3.zhimg.com/4964c7020a9e1a436f5d9fbddb24b2de.jpg"],"type":0,"id":9125547,"ga_prefix":"010607","title":"为什么微软逐步退出了曾经大力砸钱的手机市场？"},{"images":["http://pic3.zhimg.com/daa7f13f87ecd634a68f0ad171ed8766.jpg"],"type":0,"id":9125526,"ga_prefix":"010607","title":"外管局限制个人购汇，还能愉快地投资美股吗？"},{"images":["http://pic3.zhimg.com/479228a0c770bde45cc8e88752d818ba.jpg"],"type":0,"id":9126402,"ga_prefix":"010607","title":"电商刷单为什么屡禁不止？"},{"images":["http://pic4.zhimg.com/db3de7067b586f917f97caa28e2b1773.jpg"],"type":0,"id":9126401,"ga_prefix":"010606","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"http://pic4.zhimg.com/356253a50a13e954d95f563663bb7fcf.jpg","type":0,"id":9128265,"ga_prefix":"010617","title":"知乎好问题 · 怎么做好吃的牛角面包？"},{"image":"http://pic3.zhimg.com/ef8d684d00a5278e0a55c007d4859a8e.jpg","type":0,"id":9128086,"ga_prefix":"010618","title":"别指望猪血能清理肺里的雾霾，鸡血鸭血也不行"},{"image":"http://pic3.zhimg.com/2250682998d2658197c0f1cb1078a97a.jpg","type":0,"id":9126426,"ga_prefix":"010610","title":"「现在的农村不行了，到处是白瓷砖，没有美感了」"},{"image":"http://pic1.zhimg.com/ebf88ad0b2a67f1c1c64da5d11bfdc84.jpg","type":0,"id":9127478,"ga_prefix":"010613","title":"我们和聂卫平聊了聊，关于那场比赛，关于 AlphaGo"},{"image":"http://pic4.zhimg.com/c7eed9e5628299875a7750db615b8947.jpg","type":0,"id":9125547,"ga_prefix":"010607","title":"为什么微软逐步退出了曾经大力砸钱的手机市场？"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * images : ["http://pic1.zhimg.com/dba8c1abb28290d615bd7e782ef3925c.jpg"]
         * type : 0
         * id : 9124063
         * ga_prefix : 010619
         * title : 可口可乐为什么不涨价？
         * multipic : true
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private boolean multipic;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public boolean isMultipic() {
            return multipic;
        }

        public void setMultipic(boolean multipic) {
            this.multipic = multipic;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : http://pic4.zhimg.com/356253a50a13e954d95f563663bb7fcf.jpg
         * type : 0
         * id : 9128265
         * ga_prefix : 010617
         * title : 知乎好问题 · 怎么做好吃的牛角面包？
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
