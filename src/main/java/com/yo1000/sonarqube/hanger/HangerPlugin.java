package com.yo1000.sonarqube.hanger;

import org.sonar.api.SonarPlugin;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yoichi.kikuchi on 2015/12/25.
 */
public class HangerPlugin extends SonarPlugin {
    @Override
    public List getExtensions() {
        return Arrays.asList(HangarWidget.class);
    }
}
