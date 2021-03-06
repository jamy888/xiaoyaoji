package cn.xiaoyaoji.core.plugin.doc;

import cn.xiaoyaoji.core.plugin.Plugin;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhoujingjie
 *         created on 2017/7/1
 */
public abstract class DocExportPlugin extends Plugin {


   public abstract void doExport(String projectId, HttpServletResponse response) throws IOException;

}
