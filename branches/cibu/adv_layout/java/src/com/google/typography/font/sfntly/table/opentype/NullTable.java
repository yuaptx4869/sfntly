package com.google.typography.font.sfntly.table.opentype;

import com.google.typography.font.sfntly.data.ReadableFontData;
import com.google.typography.font.sfntly.data.WritableFontData;
import com.google.typography.font.sfntly.table.opentype.component.VisibleBuilder;

public final class NullTable extends SubstSubtable {
  public static final int RECORD_SIZE = 0;

  public NullTable(ReadableFontData data, int base, boolean dataIsCanonical) {
    super(data, base, dataIsCanonical);
  }

  public NullTable(ReadableFontData data) {
    super(data, 0, false);
  }

  public NullTable() {
    super(null, 0, false);
  }

  public int writeTo(WritableFontData newData, int base) {
    return RECORD_SIZE;
  }

  public static class Builder extends VisibleBuilder<NullTable> {
    public Builder() {
    }

    public Builder(ReadableFontData data, boolean dataIsCanonical) {
    }

    public Builder(NullTable table) {
    }

    public void set(NullTable header) {
      setModelChanged();
    }

    @Override
    public int subDataSizeToSerialize() {
      return NullTable.RECORD_SIZE;
    }

    public int subSerialize(WritableFontData newData, int subTableOffset) {
      return NullTable.RECORD_SIZE;
    }

    @Override
    public int subSerialize(WritableFontData newData) {
      return NullTable.RECORD_SIZE;
    }

    @Override
    public NullTable subBuildTable(ReadableFontData data) {
      return new NullTable(data);
    }

    @Override
    public void subDataSet() {
    }

    @Override
    protected boolean subReadyToSerialize() {
      return true;
    }
  }
}
