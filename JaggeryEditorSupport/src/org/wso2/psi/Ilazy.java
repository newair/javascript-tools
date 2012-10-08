package org.wso2.psi;

import com.intellij.lang.Language;
import com.intellij.psi.tree.ILazyParseableElementType;

/**
 * Created with IntelliJ IDEA.
 * User: amila
 * Date: 10/7/12
 * Time: 5:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class Ilazy extends ILazyParseableElementType {
    public Ilazy(@org.jetbrains.annotations.NotNull @org.jetbrains.annotations.NonNls String debugName, @org.jetbrains.annotations.Nullable Language language) {
        super(debugName, language);
    }
}
