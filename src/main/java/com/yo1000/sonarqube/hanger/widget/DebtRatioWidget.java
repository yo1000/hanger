package com.yo1000.sonarqube.hanger.widget;

import org.sonar.api.web.*;

/**
 * Display the technical debt ratio by authors
 *
 * @author yo1000
 */
@UserRole(UserRole.USER)
@Description("Display the technical debt ratio by authors")
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
                defaultValue = "BLOCKER,CRITICAL,MAJOR"),
        @WidgetProperty(
                key = "SeveritiesDisplay",
                description = "Display the commits",
                type = WidgetPropertyType.BOOLEAN,
                defaultValue = "false"),
        @WidgetProperty(
                key = "CommitsDisplay",
                description = "Display the commits",
                type = WidgetPropertyType.BOOLEAN,
                defaultValue = "true"),
        @WidgetProperty(
                key = "DebtDisplay",
                description = "Display the debt",
                type = WidgetPropertyType.BOOLEAN,
                defaultValue = "true"),
        @WidgetProperty(
                key = "FirstCommitDisplay",
                description = "Display the first commit",
                type = WidgetPropertyType.BOOLEAN,
                defaultValue = "false"),
        @WidgetProperty(
                key = "LastCommitDisplay",
                description = "Display the last commit",
                type = WidgetPropertyType.BOOLEAN,
                defaultValue = "false")
})
public class DebtRatioWidget extends AbstractRubyTemplate implements RubyRailsWidget {
    @Override
    protected String getTemplatePath() {
        return "/com/yo1000/sonarqube/hanger/widget/debt_ratio_widget.html.erb";
    }

    public String getId() {
        return "hanger.debtRatio";
    }

    public String getTitle() {
        return "Technical Debt Ratio Authors";
    }
}
