package com.admin.mall.mbg;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lyy
 * @date 2020/12/18 22:26
 **/
public class Generator {
    public static void main(String[] args) throws Exception {
        //MBG 执行过程中的警告信息
        List<String> warrings = new ArrayList<>();
        //当生成重复代码时 覆盖原来代码
        boolean overwrite = true;
        //读取我们的mbg文件
        InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser cp =  new ConfigurationParser(warrings);
        Configuration config =  cp.parseConfiguration(is);
        is.close();

        //是否覆盖
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        //创建mbg
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback,warrings);
        //执行生成代码
        myBatisGenerator.generate(null);

        //循环输出警告信息
        for (String waring : warrings){
            System.out.println(waring);
        }




    }
}
