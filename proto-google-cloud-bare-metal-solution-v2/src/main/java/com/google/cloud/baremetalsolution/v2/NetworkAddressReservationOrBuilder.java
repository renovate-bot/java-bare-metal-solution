/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/baremetalsolution/v2/network.proto

package com.google.cloud.baremetalsolution.v2;

public interface NetworkAddressReservationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.baremetalsolution.v2.NetworkAddressReservation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The first address of this reservation block.
   * Must be specified as a single IPv4 address, e.g. 10.1.2.2.
   * </pre>
   *
   * <code>string start_address = 1;</code>
   *
   * @return The startAddress.
   */
  java.lang.String getStartAddress();
  /**
   *
   *
   * <pre>
   * The first address of this reservation block.
   * Must be specified as a single IPv4 address, e.g. 10.1.2.2.
   * </pre>
   *
   * <code>string start_address = 1;</code>
   *
   * @return The bytes for startAddress.
   */
  com.google.protobuf.ByteString getStartAddressBytes();

  /**
   *
   *
   * <pre>
   * The last address of this reservation block, inclusive. I.e., for cases when
   * reservations are only single addresses, end_address and start_address will
   * be the same.
   * Must be specified as a single IPv4 address, e.g. 10.1.2.2.
   * </pre>
   *
   * <code>string end_address = 2;</code>
   *
   * @return The endAddress.
   */
  java.lang.String getEndAddress();
  /**
   *
   *
   * <pre>
   * The last address of this reservation block, inclusive. I.e., for cases when
   * reservations are only single addresses, end_address and start_address will
   * be the same.
   * Must be specified as a single IPv4 address, e.g. 10.1.2.2.
   * </pre>
   *
   * <code>string end_address = 2;</code>
   *
   * @return The bytes for endAddress.
   */
  com.google.protobuf.ByteString getEndAddressBytes();

  /**
   *
   *
   * <pre>
   * A note about this reservation, intended for human consumption.
   * </pre>
   *
   * <code>string note = 3;</code>
   *
   * @return The note.
   */
  java.lang.String getNote();
  /**
   *
   *
   * <pre>
   * A note about this reservation, intended for human consumption.
   * </pre>
   *
   * <code>string note = 3;</code>
   *
   * @return The bytes for note.
   */
  com.google.protobuf.ByteString getNoteBytes();
}
