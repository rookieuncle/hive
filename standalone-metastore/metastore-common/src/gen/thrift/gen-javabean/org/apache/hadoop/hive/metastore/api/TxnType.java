/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
public enum TxnType implements org.apache.thrift.TEnum {
  DEFAULT(0),
  REPL_CREATED(1),
  READ_ONLY(2),
  COMPACTION(3),
  MATER_VIEW_REBUILD(4),
  SOFT_DELETE(5);

  private final int value;

  private TxnType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static TxnType findByValue(int value) { 
    switch (value) {
      case 0:
        return DEFAULT;
      case 1:
        return REPL_CREATED;
      case 2:
        return READ_ONLY;
      case 3:
        return COMPACTION;
      case 4:
        return MATER_VIEW_REBUILD;
      case 5:
        return SOFT_DELETE;
      default:
        return null;
    }
  }
}
