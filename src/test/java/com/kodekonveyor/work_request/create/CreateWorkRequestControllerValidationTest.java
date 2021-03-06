package com.kodekonveyor.work_request.create;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import com.kodekonveyor.annotations.TestedBehaviour;
import com.kodekonveyor.annotations.TestedService;
import com.kodekonveyor.exception.ThrowableTester;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
@RunWith(MockitoJUnitRunner.class)
@TestedBehaviour("input validation")
@TestedService("CreateWorkRequestController")

public class CreateWorkRequestControllerValidationTest
    extends CreateWorkRequestControllerTestBase {

  @Test
  @DisplayName("Work type cannot be null")
  public void testCreateWorkRequestWorkType() {

    ThrowableTester.assertThrows(
        () -> createWorkRequestController
            .call(createWorkRequestTestData.CREATE_WORK_REQUEST_NULL_WORKTYPE)
    )
        .assertMessageIs(createWorkRequestTestData.NULL_WORKTYPE);

  }

  @Test
  @DisplayName("Description cannot be null")
  public void testCreateWorkRequestDescription() {

    ThrowableTester.assertThrows(
        () -> createWorkRequestController.call(
            createWorkRequestTestData.CREATE_WORK_REQUEST_NULL_DESCRIPTION
        )
    )
        .assertMessageIs(createWorkRequestTestData.NULL_DESCRIPTION);

  }

  @Test
  @DisplayName("Customer Id cannot be null")
  public void testCreateWorkRequestCustomerId() {

    ThrowableTester.assertThrows(
        () -> createWorkRequestController
            .call(createWorkRequestTestData.CREATE_WORK_REQUEST_NULL_CUSTOMERID)
    )
        .assertMessageIs(createWorkRequestTestData.NULL_CUSTOMERID);

  }

  @Test
  @DisplayName("Address String cannot be null")
  public void testCreateWorkRequestAddressString() {

    ThrowableTester
        .assertThrows(
            () -> createWorkRequestController
                .call(
                    createWorkRequestTestData.CREATE_WORK_REQUEST_NULL_ADDRESS_STRING
                )
        )
        .assertMessageIs(createWorkRequestTestData.NULL_ADDRESS_STRING);

  }

  @Test
  @DisplayName("City cannot be null")
  public void testCreateWorkRequestNullCity() {

    ThrowableTester
        .assertThrows(
            () -> createWorkRequestController
                .call(createWorkRequestTestData.CREATE_WORK_REQUEST_NULL_CITY)
        )
        .assertMessageIs(addressTestData.NULL_CITY);

  }

  @Test
  @DisplayName("Country cannot be null")
  public void testCreateWorkRequestNullCountry() {

    ThrowableTester.assertThrows(
        () -> createWorkRequestController
            .call(createWorkRequestTestData.CREATE_WORK_REQUEST_NULL_COUNTRY)
    )
        .assertMessageIs(addressTestData.NULL_COUNTRY);

  }

}
