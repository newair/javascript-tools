package org.wso2.psi;

import com.intellij.lang.*;
import com.intellij.openapi.fileTypes.StdFileTypes;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.ILightLazyParseableElementType;
import org.jetbrains.annotations.NotNull;
import org.wso2.JaggeryTokenTypes;
import org.wso2.fileType.JaggeryLanguage;

/*Basic parsing is done for the base language*/


public class JaggeryParser implements PsiParser {


    public JaggeryParser() {

    }

    @NotNull
    @Override
    public ASTNode parse(IElementType root, PsiBuilder builder) {

        PsiBuilder.Marker marker = builder.mark();

        // Process all tokens
        while (!builder.eof()) {

            IElementType type = builder.getTokenType();


            if (type == JaggeryTokenTypes.JAVASCRIPT_TEXT) {


            }

            builder.advanceLexer(); // move to next token
        }

        marker.done(root);
        return builder.getTreeBuilt();

    }
}
