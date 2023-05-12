package pro.eng.yui.yuiframe.utils.impl;

import pro.eng.yui.yuiframe.YuiFrame;
import pro.eng.yui.yuiframe.utils.ICollectionUtil;

import java.util.*;

/**
 * Implement of common operation for Collections
 * @since 1.0.0
 * @author yui-KITAMURA
 * @version 1.0.0
 */
public class CollectionUtils implements ICollectionUtil {

    /* *** singleton *** */
    private static final CollectionUtils instance;
    static{
        instance = new CollectionUtils();
    }
    public static CollectionUtils getInstance(){
        return instance;
    }
    private CollectionUtils(){
        // private constructor
    }

    // fields

    // methods
    @Override
    public <T> List<T> toList(final T... aryObj) {
        if(YuiFrame.ObjectUtil.isNull(aryObj)){
            return null;
        }
        return Arrays.asList(aryObj);
    }

    @Override
    public <T> ArrayList<T> toArrayList(final T... aryObj) {
        if(YuiFrame.ObjectUtil.isNull(aryObj)){
            return null;
        }
        return new ArrayList<>(Arrays.asList(aryObj));
    }

    @Override
    public boolean isEmpty(final Object[] array) {
        if(YuiFrame.ObjectUtil.isNull(array)){
            return true;
        }
        return array.length == 0;
    }

    @Override
    public boolean isEmpty(final Collection<?> list) {
        if(YuiFrame.ObjectUtil.isNull(list)){
            return true;
        }
        return list.isEmpty();
    }

    @Override
    public String toString(final Collection<?> collection) {
        return collection2Str(collection, false, false);
    }

    @Override
    public String toString(Object[] array) {
        return array2Str(array, false, false);
    }

    @Override
    public String toStrMeta(final Collection<?> collection) {
        return collection2Str(collection, true, false);
    }
    @Override
    public String toStrMeta(Object[] array) {
        return array2Str(array, true, false);
    }

    @Override
    public String toStringBr(final Collection<?> collection) {
        return collection2Str(collection, false, true);
    }
    @Override
    public String toStringBr(Object[] array) {
        return array2Str(array, false, true);
    }

    @Override
    public String toStrMetaBr(final Collection<?> collection) {
        return collection2Str(collection, true, true);
    }
    @Override
    public String toStrMetaBr(Object[] array) {
        return array2Str(array, true, true);
    }

    private String array2Str(final Object[] array, boolean meta, boolean br){
        return collection2Str(YuiFrame.CollectionUtil.toArrayList(array), meta, br);
    }

    private <E> String collection2Str(final Collection<E> collection, boolean meta, boolean br){
        if(YuiFrame.ObjectUtil.isNull(collection)){
            return "null";
        }

        StringBuilder sb = new StringBuilder();
        if(meta){
            sb.append("{");
            if(br){ sb.append(System.lineSeparator()); }
            sb.append("size:").append(YuiFrame.ObjectUtil.isNull(collection)? "0":collection.size()).append(",");
            if(br){ sb.append(System.lineSeparator()); }
            sb.append("data:");
        }
        boolean isObjCollection;
        try{
            E obj = collection.stream().toList().get(collection.size()-1);
            isObjCollection = YuiFrame.ObjectUtil.isTypeOf(obj, Collection.class) || obj.getClass().isArray();
        } catch (IndexOutOfBoundsException|NullPointerException e){
            isObjCollection = false;
        }

        sb.append("[");
        if(br){ sb.append(System.lineSeparator()); }

        List<E> colStream = collection.stream().toList();
        for(int idx=0; idx<collection.size(); idx++){
            try {
                if (isObjCollection) {
                    if(colStream.get(idx).getClass().isArray()){
                        sb.append(array2Str((Object[])colStream.get(idx),meta, br));
                    }else {
                        sb.append(collection2Str((Collection<?>) colStream.get(idx), meta, br));
                    }
                } else {
                    sb.append(colStream.get(idx).toString());
                }
            }catch(NullPointerException npe){
                sb.append((String) null);
            }
            if(idx < collection.size()-1){
                sb.append(",");
            }
            if(br){ sb.append(System.lineSeparator()); }
        }
        sb.append("]");
        if(meta){
            sb.append("}");
        }
        return sb.toString();
    }

}
