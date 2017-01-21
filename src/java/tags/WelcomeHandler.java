package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;

public class WelcomeHandler extends BodyTagSupport {

    private String name;

    private String body;

    /**
     * Set name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int doStartTag() throws JspException {

        JspWriter out = pageContext.getOut();
        try {
            out.print("Hello " + name + " ");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return EVAL_BODY_BUFFERED;
    }

    @Override
    public void doInitBody() throws JspException {
        super.doInitBody();
    }

    @Override
    public int doAfterBody() throws JspException {
        BodyContent content = getBodyContent();
        body = content.getString();

        return super.doAfterBody();
    }

    @Override
    public int doEndTag() throws JspException {

        JspWriter out = pageContext.getOut();
        try {
            out.print(body);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return EVAL_PAGE;
    }
}