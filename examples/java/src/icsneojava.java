/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class icsneojava implements icsneojavaConstants {
  public static void icsneo_findAllDevices(neodevice_t devices, int[] count) {
    icsneojavaJNI.icsneo_findAllDevices(neodevice_t.getCPtr(devices), devices, count);
  }

  public static void icsneo_freeUnconnectedDevices() {
    icsneojavaJNI.icsneo_freeUnconnectedDevices();
  }

  public static boolean icsneo_serialNumToString(long num, StringBuffer str, int[] count) {
    return icsneojavaJNI.icsneo_serialNumToString(num, str, count);
  }

  public static long icsneo_serialStringToNum(StringBuffer str) {
    return icsneojavaJNI.icsneo_serialStringToNum(str);
  }

  public static boolean icsneo_isValidNeoDevice(neodevice_t device) {
    return icsneojavaJNI.icsneo_isValidNeoDevice(neodevice_t.getCPtr(device), device);
  }

  public static boolean icsneo_openDevice(neodevice_t device) {
    return icsneojavaJNI.icsneo_openDevice(neodevice_t.getCPtr(device), device);
  }

  public static boolean icsneo_closeDevice(neodevice_t device) {
    return icsneojavaJNI.icsneo_closeDevice(neodevice_t.getCPtr(device), device);
  }

  public static boolean icsneo_isOpen(neodevice_t device) {
    return icsneojavaJNI.icsneo_isOpen(neodevice_t.getCPtr(device), device);
  }

  public static boolean icsneo_goOnline(neodevice_t device) {
    return icsneojavaJNI.icsneo_goOnline(neodevice_t.getCPtr(device), device);
  }

  public static boolean icsneo_goOffline(neodevice_t device) {
    return icsneojavaJNI.icsneo_goOffline(neodevice_t.getCPtr(device), device);
  }

  public static boolean icsneo_isOnline(neodevice_t device) {
    return icsneojavaJNI.icsneo_isOnline(neodevice_t.getCPtr(device), device);
  }

  public static boolean icsneo_enableMessagePolling(neodevice_t device) {
    return icsneojavaJNI.icsneo_enableMessagePolling(neodevice_t.getCPtr(device), device);
  }

  public static boolean icsneo_disableMessagePolling(neodevice_t device) {
    return icsneojavaJNI.icsneo_disableMessagePolling(neodevice_t.getCPtr(device), device);
  }

  public static boolean icsneo_isMessagePollingEnabled(neodevice_t device) {
    return icsneojavaJNI.icsneo_isMessagePollingEnabled(neodevice_t.getCPtr(device), device);
  }

  public static boolean icsneo_getMessages(neodevice_t device, neomessage_t messages, int[] items, java.math.BigInteger timeout) {
    return icsneojavaJNI.icsneo_getMessages(neodevice_t.getCPtr(device), device, neomessage_t.getCPtr(messages), messages, items, timeout);
  }

  public static long icsneo_getPollingMessageLimit(neodevice_t device) {
    return icsneojavaJNI.icsneo_getPollingMessageLimit(neodevice_t.getCPtr(device), device);
  }

  public static boolean icsneo_setPollingMessageLimit(neodevice_t device, long newLimit) {
    return icsneojavaJNI.icsneo_setPollingMessageLimit(neodevice_t.getCPtr(device), device, newLimit);
  }

  public static boolean icsneo_getProductName(neodevice_t device, StringBuffer str, int[] maxLength) {
    return icsneojavaJNI.icsneo_getProductName(neodevice_t.getCPtr(device), device, str, maxLength);
  }

  public static boolean icsneo_getProductNameForType(long type, StringBuffer str, int[] maxLength) {
    return icsneojavaJNI.icsneo_getProductNameForType(type, str, maxLength);
  }

  public static boolean icsneo_settingsRefresh(neodevice_t device) {
    return icsneojavaJNI.icsneo_settingsRefresh(neodevice_t.getCPtr(device), device);
  }

  public static boolean icsneo_settingsApply(neodevice_t device) {
    return icsneojavaJNI.icsneo_settingsApply(neodevice_t.getCPtr(device), device);
  }

  public static boolean icsneo_settingsApplyTemporary(neodevice_t device) {
    return icsneojavaJNI.icsneo_settingsApplyTemporary(neodevice_t.getCPtr(device), device);
  }

  public static boolean icsneo_settingsApplyDefaults(neodevice_t device) {
    return icsneojavaJNI.icsneo_settingsApplyDefaults(neodevice_t.getCPtr(device), device);
  }

  public static boolean icsneo_settingsApplyDefaultsTemporary(neodevice_t device) {
    return icsneojavaJNI.icsneo_settingsApplyDefaultsTemporary(neodevice_t.getCPtr(device), device);
  }

  public static int icsneo_settingsReadStructure(neodevice_t device, SWIGTYPE_p_void structure, long structureSize) {
    return icsneojavaJNI.icsneo_settingsReadStructure(neodevice_t.getCPtr(device), device, SWIGTYPE_p_void.getCPtr(structure), structureSize);
  }

  public static boolean icsneo_settingsApplyStructure(neodevice_t device, SWIGTYPE_p_void structure, long structureSize) {
    return icsneojavaJNI.icsneo_settingsApplyStructure(neodevice_t.getCPtr(device), device, SWIGTYPE_p_void.getCPtr(structure), structureSize);
  }

  public static boolean icsneo_settingsApplyStructureTemporary(neodevice_t device, SWIGTYPE_p_void structure, long structureSize) {
    return icsneojavaJNI.icsneo_settingsApplyStructureTemporary(neodevice_t.getCPtr(device), device, SWIGTYPE_p_void.getCPtr(structure), structureSize);
  }

  public static long icsneo_getBaudrate(neodevice_t device, int netid) {
    return icsneojavaJNI.icsneo_getBaudrate(neodevice_t.getCPtr(device), device, netid);
  }

  public static boolean icsneo_setBaudrate(neodevice_t device, int netid, long newBaudrate) {
    return icsneojavaJNI.icsneo_setBaudrate(neodevice_t.getCPtr(device), device, netid, newBaudrate);
  }

  public static long icsneo_getFDBaudrate(neodevice_t device, int netid) {
    return icsneojavaJNI.icsneo_getFDBaudrate(neodevice_t.getCPtr(device), device, netid);
  }

  public static boolean icsneo_setFDBaudrate(neodevice_t device, int netid, long newBaudrate) {
    return icsneojavaJNI.icsneo_setFDBaudrate(neodevice_t.getCPtr(device), device, netid, newBaudrate);
  }

  public static boolean icsneo_transmit(neodevice_t device, neomessage_t message) {
    return icsneojavaJNI.icsneo_transmit(neodevice_t.getCPtr(device), device, neomessage_t.getCPtr(message), message);
  }

  public static boolean icsneo_transmitMessages(neodevice_t device, neomessage_t messages, long count) {
    return icsneojavaJNI.icsneo_transmitMessages(neodevice_t.getCPtr(device), device, neomessage_t.getCPtr(messages), messages, count);
  }

  public static void icsneo_setWriteBlocks(neodevice_t device, boolean blocks) {
    icsneojavaJNI.icsneo_setWriteBlocks(neodevice_t.getCPtr(device), device, blocks);
  }

  public static boolean icsneo_describeDevice(neodevice_t device, StringBuffer str, int[] maxLength) {
    return icsneojavaJNI.icsneo_describeDevice(neodevice_t.getCPtr(device), device, str, maxLength);
  }

  public static neoversion_t icsneo_getVersion() {
    return new neoversion_t(icsneojavaJNI.icsneo_getVersion(), true);
  }

  public static boolean icsneo_getEvents(neoevent_t events, int[] size) {
    return icsneojavaJNI.icsneo_getEvents(neoevent_t.getCPtr(events), events, size);
  }

  public static boolean icsneo_getDeviceEvents(neodevice_t device, neoevent_t events, int[] size) {
    return icsneojavaJNI.icsneo_getDeviceEvents(neodevice_t.getCPtr(device), device, neoevent_t.getCPtr(events), events, size);
  }

  public static boolean icsneo_getLastError(neoevent_t error) {
    return icsneojavaJNI.icsneo_getLastError(neoevent_t.getCPtr(error), error);
  }

  public static void icsneo_discardAllEvents() {
    icsneojavaJNI.icsneo_discardAllEvents();
  }

  public static void icsneo_discardDeviceEvents(neodevice_t device) {
    icsneojavaJNI.icsneo_discardDeviceEvents(neodevice_t.getCPtr(device), device);
  }

  public static void icsneo_setEventLimit(long newLimit) {
    icsneojavaJNI.icsneo_setEventLimit(newLimit);
  }

  public static long icsneo_getEventLimit() {
    return icsneojavaJNI.icsneo_getEventLimit();
  }

  public static boolean icsneo_getSupportedDevices(SWIGTYPE_p_unsigned_int devices, int[] count) {
    return icsneojavaJNI.icsneo_getSupportedDevices(SWIGTYPE_p_unsigned_int.getCPtr(devices), count);
  }

  public static boolean icsneo_getTimestampResolution(neodevice_t device, SWIGTYPE_p_unsigned_short resolution) {
    return icsneojavaJNI.icsneo_getTimestampResolution(neodevice_t.getCPtr(device), device, SWIGTYPE_p_unsigned_short.getCPtr(resolution));
  }

  public static neomessage_can_t neomessage_can_t_cast(neomessage_t msg) {
    long cPtr = icsneojavaJNI.neomessage_can_t_cast(neomessage_t.getCPtr(msg), msg);
    return (cPtr == 0) ? null : new neomessage_can_t(cPtr, false);
  }

  public static neomessage_eth_t neomessage_eth_t_cast(neomessage_t msg) {
    long cPtr = icsneojavaJNI.neomessage_eth_t_cast(neomessage_t.getCPtr(msg), msg);
    return (cPtr == 0) ? null : new neomessage_eth_t(cPtr, false);
  }

  public static neomessage_t from_can_neomessage_t_cast(neomessage_can_t msg) {
    long cPtr = icsneojavaJNI.from_can_neomessage_t_cast(neomessage_can_t.getCPtr(msg), msg);
    return (cPtr == 0) ? null : new neomessage_t(cPtr, false);
  }

  public static neomessage_t from_eth_neomessage_t_cast(neomessage_eth_t msg) {
    long cPtr = icsneojavaJNI.from_eth_neomessage_t_cast(neomessage_eth_t.getCPtr(msg), msg);
    return (cPtr == 0) ? null : new neomessage_t(cPtr, false);
  }

  public static neodevice_t new_neodevice_t_array(int nelements) {
    long cPtr = icsneojavaJNI.new_neodevice_t_array(nelements);
    return (cPtr == 0) ? null : new neodevice_t(cPtr, false);
  }

  public static void delete_neodevice_t_array(neodevice_t ary) {
    icsneojavaJNI.delete_neodevice_t_array(neodevice_t.getCPtr(ary), ary);
  }

  public static neodevice_t neodevice_t_array_getitem(neodevice_t ary, int index) {
    return new neodevice_t(icsneojavaJNI.neodevice_t_array_getitem(neodevice_t.getCPtr(ary), ary, index), true);
  }

  public static void neodevice_t_array_setitem(neodevice_t ary, int index, neodevice_t value) {
    icsneojavaJNI.neodevice_t_array_setitem(neodevice_t.getCPtr(ary), ary, index, neodevice_t.getCPtr(value), value);
  }

  public static neoevent_t new_neoevent_t_array(int nelements) {
    long cPtr = icsneojavaJNI.new_neoevent_t_array(nelements);
    return (cPtr == 0) ? null : new neoevent_t(cPtr, false);
  }

  public static void delete_neoevent_t_array(neoevent_t ary) {
    icsneojavaJNI.delete_neoevent_t_array(neoevent_t.getCPtr(ary), ary);
  }

  public static neoevent_t neoevent_t_array_getitem(neoevent_t ary, int index) {
    return new neoevent_t(icsneojavaJNI.neoevent_t_array_getitem(neoevent_t.getCPtr(ary), ary, index), true);
  }

  public static void neoevent_t_array_setitem(neoevent_t ary, int index, neoevent_t value) {
    icsneojavaJNI.neoevent_t_array_setitem(neoevent_t.getCPtr(ary), ary, index, neoevent_t.getCPtr(value), value);
  }

  public static neomessage_t new_neomessage_t_array(int nelements) {
    long cPtr = icsneojavaJNI.new_neomessage_t_array(nelements);
    return (cPtr == 0) ? null : new neomessage_t(cPtr, false);
  }

  public static void delete_neomessage_t_array(neomessage_t ary) {
    icsneojavaJNI.delete_neomessage_t_array(neomessage_t.getCPtr(ary), ary);
  }

  public static neomessage_t neomessage_t_array_getitem(neomessage_t ary, int index) {
    return new neomessage_t(icsneojavaJNI.neomessage_t_array_getitem(neomessage_t.getCPtr(ary), ary, index), true);
  }

  public static void neomessage_t_array_setitem(neomessage_t ary, int index, neomessage_t value) {
    icsneojavaJNI.neomessage_t_array_setitem(neomessage_t.getCPtr(ary), ary, index, neomessage_t.getCPtr(value), value);
  }

}
