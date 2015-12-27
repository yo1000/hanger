package com.yo1000.sonarqube.hanger;

import org.sonar.api.web.*;

/**
 * Created by yoichi.kikuchi on 2015/12/25.
 */
@UserRole(UserRole.USER)
@Description("Display the technical debt by authors")
@WidgetCategory({"Technical Debt"})
@WidgetProperties({
        @WidgetProperty(
                key = HangarWidget.ISSUES_PROPERTY,
                description = "The number of issues to be summarized",
                defaultValue = "1000"),
        @WidgetProperty(
                key = HangarWidget.SEVERITIES_PROPERTY,
                description = "The items of severities to be summarized",
                defaultValue = "BLOCKER,CRITICAL,MAJOR")
})
public class HangarWidget extends AbstractRubyTemplate implements RubyRailsWidget {
    public static final String ISSUES_PROPERTY = "Issues";
    public static final String SEVERITIES_PROPERTY = "Severities";

    @Override
    protected String getTemplatePath() {
        return "/com/yo1000/sonarqube/hanger/hanger_widget.html.erb";
    }

    public String getId() {
        return "hanger";
    }

    public String getTitle() {
        return "Technical Debt Authors";
    }
}
