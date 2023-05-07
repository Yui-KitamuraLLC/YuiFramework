package pro.eng.yui.yuiframe.utils.impl;

import pro.eng.yui.yuiframe.YuiFrame;
import pro.eng.yui.yuiframe.utils.IStringUtil;

import java.util.Iterator;
import java.util.List;

/**
 * 汎用的な文字列操作の実装
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
    public String concat(Iterable<? extends CharSequence> arg){
        for(CharSequence cs : arg){
            if(cs == null){
                cs = SPACE;
            }
        }
        return join(EMPTY, arg);
    }
    @Override
    public String concat(CharSequence... arg){
        for(int idx = 0; idx < arg.length; idx++){
            if(arg[idx] == null){
                arg[idx] = SPACE;
            }
        }
        return join(EMPTY, arg);
    }

    @Override
    public String concatWithDelimiter(CharSequence delimiter, Iterable<? extends CharSequence> arg){
        for(CharSequence cs : arg){
            if(cs == null){
                cs = SPACE;
            }
        }
        return join(delimiter, arg);
    }
    @Override
    public String concatWithDelimiter(CharSequence delimiter, CharSequence... arg){
        for(int idx = 0; idx < arg.length; idx++){
            if(arg[idx] == null){
                arg[idx] = SPACE;
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
        String delimitStr = (delimiter == null) ? SPACE : delimiter.toString();
        StringBuilder sb = new StringBuilder();

        Iterator<? extends CharSequence> itr = arg.iterator();
        while(itr.hasNext()){
            CharSequence cs = itr.next();
            if(cs == null){
                sb.append(SPACE);
            }else{
                sb.append(cs);
            }
            if(itr.hasNext()){
                sb.append(delimitStr);
            }
        }
        return sb.toString();
    }
    /** @see StringUtils#join(CharSequence, Iterable) */
    private String join(final CharSequence delimiter, final CharSequence... arg){
        List<CharSequence> argList = YuiFrame.ListUtil.toList(arg);
        return join(delimiter, argList);
    }

    @Override
    public boolean isEmpty(String value){
        return value == null || value.length() == 0;
    }
    @Override
    public boolean isEmpty(Object obj){
        return obj == null || isEmpty(obj.toString());
    }
}
