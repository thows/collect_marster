package com.master.model;

import android.support.annotation.NonNull;
import android.view.View;

import com.master.app.Manager.FieldWordsDirs;
import com.master.bean.Fields;
import com.master.bean.TableContext;

import java.util.List;

/**
 * <p>Title:${type_inName}<p/>
 * <p>Description:<p/>
 * <p>Company: </p>
 *
 * @author litao
 * @mail llsmpsvn@gmail.com
 * @date on 2016/12/8
 */
public class MainModelImpl implements MainModel{

    @Override
    public List<Fields> getArgsParms(String tname, @NonNull List<Fields> list) {
        list.clear();
        // fname 获取里面的字段
        TableContext tableContext = FieldWordsDirs.get().tableFormFName(tname);
        if (tableContext == null) return null;
        List<Fields> fields = tableContext.getFields();
        for (Fields f : fields) {
            String fName = f.getFName();
            Fields fields1 = FieldWordsDirs.get().fieldsFormFName(fName);
            list.add(fields1);
        }
        return list;
    }

    @Override
    public void parseViewValue(List<View> views) {

    }
}
