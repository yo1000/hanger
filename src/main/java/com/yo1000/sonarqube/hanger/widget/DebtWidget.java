package com.yo1000.sonarqube.hanger.widget;

import org.sonar.api.web.*;

/**
 * Display the technical debt by authors
 *
 * @author yo1000
 */
@UserRole(UserRole.USER)
@Description("Display the technical debt by authors")
@WidgetCategory({"Technical Debt"})
@WidgetProperties({
        @WidgetProperty(
                key = "Issues",
                description = "The number of issues to be summarized",
                type = WidgetPropertyType.INTEGER,
                defaultValue = "10000"),
        @WidgetProperty(
                key = "Severities",
                description = "The items of severities to be summarized",
                defaultValue = "BLOCKER,CRITICAL,MAJOR")
})
public class DebtWidget extends AbstractRubyTemplate implements RubyRailsWidget {
    @Override
    protected String getTemplatePath() {
        return "/com/yo1000/sonarqube/hanger/widget/debt_widget.html.erb";
    }

    public String getId() {
        return "hanger.debt";
    }

    public String getTitle() {
        return "Technical Debt Authors";
    }
}
