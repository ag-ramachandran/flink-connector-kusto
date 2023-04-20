package com.microsoft.azure.kusto.writer.serializer;

public class KustoRow {
    private final String blobName;

    private final Object[] values;

    public KustoRow(String blobName, Object[] values) {
        this.blobName = blobName;
        this.values = values;
    }
}