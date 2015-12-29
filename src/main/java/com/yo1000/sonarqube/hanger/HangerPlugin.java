package com.yo1000.sonarqube.hanger;

import com.yo1000.sonarqube.hanger.widget.CommitsWidget;
import com.yo1000.sonarqube.hanger.widget.DebtRatioWidget;
import com.yo1000.sonarqube.hanger.widget.DebtWidget;
import org.sonar.api.SonarPlugin;

import java.util.Arrays;
import java.util.List;

/**
 * @author yo1000
 */
public class HangerPlugin extends SonarPlugin {
    @Override
    public List getExtensions() {
        return Arrays.asList(
                CommitsWidget.class,
                DebtRatioWidget.class,
                DebtWidget.class
        );
    }
}
