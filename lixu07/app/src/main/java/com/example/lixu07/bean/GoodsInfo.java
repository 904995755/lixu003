package com.example.lixu07.bean;

import com.example.lixu07.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "阿尔法罗密欧", "阿斯顿 马丁DB", "保时捷 玛莎拉蒂", "保时捷718",
            "maserlidi 玛莎拉蒂GUIBIL", "月光白 阿斯顿", "迈凯伦 Whilt","阿尔法罗密欧 stelio"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "秉持意式设计美学,传承竞速血脉.2020款Giulia及Stelvio全新上市,为您带来纯粹而澎湃的驾驶体验!",
            "经典奢华英伦跑车制造商.百年经典传承,手工打造成就非凡.阿斯顿·马丁Aston Martin为客户带来尊贵个性服务,打造您的专属座驾.",
            "保时捷是享誉全球的跑车品牌，始终秉承卓越运动血统与赛道精神.融合动力科学与唯美个性的设计,缔造全新驾驭境界.",
            "车身轮廓和比例总能让人一眼就认出这是一辆不折不扣的保时捷。流线型的动感身姿，轮廓分明的肌肉线条。",
            "玛莎拉蒂SUV Levante,Ghibli轿车,为您打造非凡驾乘体验.百年辉煌,卓尔不凡.每一辆玛莎拉蒂,无不彰显匠心典范,只为您提供非凡驾乘体验.",
            "阿斯顿汽车:经典奢华英伦跑车制造商.美学与工程的完美融合.发现阿斯顿·马丁首款奢华SUV DBX及DBS.Vantage.DB11在内的车型系列. ",
            "搭载全新升级EA888 TSI发动机，动力操控更澎湃，畅想自由.10.25吋全液晶数字仪表，体验越级的科技配置及驾驶感受，数字座舱更科技。 ",
            "车源丰富,价格超底,可私人订制,19款阿尔法淋漓精致的车身线条设计提升了车辆控制的稳定性和驾乘的舒服性, "


    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {599999, 399999, 2999999, 499900, 169000, 259000,580000,990000};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.aerfa_s, R.drawable.ashitun_s, R.drawable.baoshijie_s, R.drawable.baoshijie718_s,R.drawable.luomiou_s ,
            R.drawable.mading_s, R.drawable.maikail_s, R.drawable.stelio_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.aerfa, R.drawable.ashitun,R.drawable.baoshijie, R.drawable.baoshijie718, R.drawable.luomiou,
            R.drawable.mading, R.drawable.maikail, R.drawable.stelio

    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
