package io.qameta.allure.bamboo.info;

import java.util.HashMap;

/**
 * Add executor info to reports
 */
public class AddExecutorInfo extends AbstractAddInfo {

    private static final String EXECUTOR_JSON = "executor.json";

    private final String url;

    private final String buildId;

    private final String buildUrl;

    private final String buildName;

    private final String reportUrl;

    public AddExecutorInfo(String url, String buildId, String buildName, String buildUrl, String reportUrl) {
        this.url = url;
        this.buildId = buildId;
        this.buildUrl = buildUrl;
        this.buildName = buildName;
        this.reportUrl = reportUrl;
    }

    @Override
    protected Object getData() {
        HashMap<String, Object> data = new HashMap<>();
        data.put("name", "Bamboo");
        data.put("type", "bamboo");
        data.put("url", url);
        data.put("buildOrder", buildId);
        data.put("buildName", buildName);
        data.put("buildUrl", buildUrl);
        data.put("reportUrl", reportUrl);
        return data;
    }

    @Override
    protected String getFileName() {
        return EXECUTOR_JSON;
    }
}
