package com.newer.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.OracleTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @author Administrator
 * @CopyRight(C), 2009-2023,牛耳教育有限公司
 * @FileName: MPGenerator
 * @projectName test_mybatisplus_oracle_0516
 * @description: TODO
 * @date 2023/5/229:08
 */
public class MPGenerator {
    public static void main(String[] args) {
        // 1.创建代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 2.全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        System.out.println("项目路径为："+projectPath);
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("newer");
        gc.setFileOverride(true);// 是否覆盖
        gc.setActiveRecord(true);
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        /**
         * mp生成service层代码，默认接口名称第一个字母有 I
         *
         */
        gc.setIdType(IdType.AUTO);//主键策略,IdType.AUTO对应的策略为主键自增
        gc.setDateType(DateType.ONLY_DATE);//定义生成的实体类中日期类型

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sDAO");
        gc.setXmlName("%sDAOMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");


//        gc.setSwagger2(true); // 实体属性 Swagger2 注解
        mpg.setGlobalConfig(gc);

        //3. 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
        dsc.setDbType(DbType.ORACLE);
        dsc.setTypeConvert(new OracleTypeConvert());
        dsc.setDriverName("oracle.jdbc.OracleDriver");
        dsc.setUsername("scott");
        dsc.setPassword("123");
        mpg.setDataSource(dsc);

        // 4.包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("dept");
        pc.setParent("com.newer");
        pc.setController("controller");
        pc.setEntity("bean");
        pc.setService("service");
        pc.setMapper("mapper");
        mpg.setPackageInfo(pc);

        // 5.策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude(new String[]{"TB_USER"}); // 表名字，注意一定要大写！大写！否则识别不出来！
        strategy.setNaming(NamingStrategy.underline_to_camel);//数据库表映射到实体的命名策略
        strategy.setTablePrefix(pc.getModuleName() + "_"); //生成实体时去掉表前缀
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);;//数据库表字段映射到实体的命名策略
        strategy.setEntityLombokModel(true);// lombok 模型 @Accessors(chain true) setter链式操作
        strategy.setRestControllerStyle(true); //restful api风格控制器
        strategy.setControllerMappingHyphenStyle(true); //url中驼峰转连字符

        mpg.setStrategy(strategy);
        mpg.execute();
    }
}
