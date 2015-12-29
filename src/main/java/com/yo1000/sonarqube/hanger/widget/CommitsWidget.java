package com.yo1000.sonarqube.hanger.widget;

import org.sonar.api.web.AbstractRubyTemplate;
import org.sonar.api.web.Description;
import org.sonar.api.web.RubyRailsWidget;
import org.sonar.api.web.UserRole;

/**
 * Display the authors commits
 *
 * @author yo1000
 */
@UserRole(UserRole.USER)
@Description("Display the authors commits")
public class CommitsWidget extends AbstractRubyTemplate implements RubyRailsWidget {
    @Override
    protected String getTemplatePath() {
        return "/com/yo1000/sonarqube/hanger/widget/commits_widget.html.erb";
    }

    public String getId() {
        return "hanger.commits";
    }

    public String getTitle() {
        return "Authors Commits";
    }
}
