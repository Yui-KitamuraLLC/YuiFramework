package pro.eng.yui.yuiframe.utils.impl;

import pro.eng.yui.yuiframe.YuiFrame;
import pro.eng.yui.yuiframe.utils.IStringUtil;

import java.util.Iterator;
import java.util.List;

import static pro.eng.yui.yuiframe.YuiFrame.StrConst;

/**
 * Implement of common operation for Strings
 * @since 1.0.0
 * @author yui-KITAMURA
 * @version 1.0.0
 */
public class StringUtils implements IStringUtil {

    /* *** singleton *** */
    private static final StringUtils instance;
    static{
        instance = new StringUtils();
    }
    /* project */ public static StringUtils getInstance(){
        return instance;
    }
    private StringUtils(){
        // private constructor
    }

    // fields

    // methods
    @Override
    public boolean eq(final String first, final String second){
        if(first == null && second == null){
            return true;
        }
        if( first == null /* && second != null */ ||
                /* first != null && */ second == null ){ //片方がnull
            return false;
        }
        return first.equalsIgnoreCase(second);
    }
    @Override
    public boolean eqCase(final String first, final String second){
        if(first == null && second == null){
            return true;
        }
        if( first == null /* && second != null */ ||
                /* first != null && */ second == null ){ //片方がnull
            return false;
        }
        return first.equals(second);
    }

    @Override
    public boolean eq(Object first, Object second) {
        if(first == null && second == null){
            return true;
        }
        if( first == null /* && second != null */ ||
                /* first != null && */ second == null ){ //片方がnull
            return false;
        }
        return first.toString().equalsIgnoreCase(second.toString());
    }
    @Override
    public boolean eqCase(Object first, Object second) {
        if(first == null && second == null){
            return true;
        }
        if( first == null /* && second != null */ ||
                /* first != null && */ second == null ){ //片方がnull
            return false;
        }
        return first.toString().equals(second.toString());
    }

    @SuppressWarnings("UnusedAssignment")
    @Override
    public String concat(Iterable<? extends CharSequence> arg){
        for(CharSequence cs : arg){
            if(cs == null){
                cs = StrConst.SPACE;
            }
        }
        return join(StrConst.EMPTY, arg);
    }
    @Override
    public String concat(CharSequence... arg){
        for(int idx = 0; idx < arg.length; idx++){
            if(arg[idx] == null){
                arg[idx] = StrConst.SPACE;
            }
        }
        return join(StrConst.EMPTY, arg);
    }

    @SuppressWarnings("UnusedAssignment")
    @Override
    public String concatWithDelimiter(CharSequence delimiter, Iterable<? extends CharSequence> arg){
        for(CharSequence cs : arg){
            if(cs == null){
                cs = StrConst.SPACE;
            }
        }
        return join(delimiter, arg);
    }
    @Override
    public String concatWithDelimiter(CharSequence delimiter, CharSequence... arg){
        for(int idx = 0; idx < arg.length; idx++){
            if(arg[idx] == null){
                arg[idx] = StrConst.SPACE;
            }
        }
        return join(delimiter, arg);
    }

    /**
     * join the arguments with delimiter
     * @param delimiter value that separates each argument. If <code>null</code> then replaced to one space.
     * @param arg list of value that to be joined. if the value is <code>null</code> then replaced to one space.
     * @return one string value that joins all arguments each separated by delimiter
     */
    private String join(final CharSequence delimiter, final Iterable<? extends CharSequence> arg){
        final String delimitStr = (delimiter == null) ? StrConst.SPACE : delimiter.toString();
        StringBuilder resultBuilder = new StringBuilder();

        Iterator<? extends CharSequence> itr = arg.iterator();
        while(itr.hasNext()){
            CharSequence currentArg = itr.next();
            if(currentArg == null){
                resultBuilder.append(StrConst.SPACE);
            }else{
                resultBuilder.append(currentArg);
            }
            if(itr.hasNext()){
                resultBuilder.append(delimitStr);
            }
        }
        return resultBuilder.toString();
    }
    /** @see StringUtils#join(CharSequence, Iterable) */
    private String join(final CharSequence delimiter, final CharSequence... arg){
        List<CharSequence> argList = YuiFrame.CollectionUtil.toList(arg);
        return join(delimiter, argList);
    }

    @Override
    public boolean isEmpty(String value){
        return value == null || value.isEmpty();
    }
    @Override
    public boolean isEmpty(Object obj){
        return obj == null || isEmpty(obj.toString());
    }

    @Override
    public String nullToEmpty(String value) {
        return value == null ? StrConst.EMPTY : value;
    }
}
